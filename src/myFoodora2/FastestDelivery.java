package myFoodora2;
import java.util.*;

public class FastestDelivery implements DeliveryPolicy{
	
	//we don't need the customer's location : only the location of the restaurant.

	@Override
	public Courier choseCourier(ArrayList<Courier> couriers, Order order) {
		
		Courier chosenCourier = null; //the courier that wanna make the delivery.
		
		Restaurant resto = order.getResto();
		ArrayList<Double> restaurantAdress = resto.getAdress();
		double xresto = restaurantAdress.get(0);
		double yresto = restaurantAdress.get(1);
		
		double inf = Double.POSITIVE_INFINITY;
		double distanceMinimum = inf; // by default, the shortest distance begins at infinity, so that each courier will be nearer
		for (Courier courier : couriers){
			ArrayList<Double> position = courier.getPosition();
			double xcourier = position.get(0);
			double ycourier = position.get(1);
			
			double distance = Math.sqrt((xresto-xcourier)*(xresto-xcourier) + (yresto-ycourier)*(yresto-ycourier));
			if (distance < distanceMinimum && courier.isWorkState()){
				chosenCourier = courier;
				distanceMinimum = distance;				
			}
		}
		return chosenCourier;		
		
		// TODO case when there are no courier ? -> returns Null.
	}
}
