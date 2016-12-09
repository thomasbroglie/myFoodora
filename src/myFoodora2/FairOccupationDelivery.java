package myFoodora2;
import java.util.ArrayList;

public class FairOccupationDelivery implements DeliveryPolicy {

	@Override
	public Courier choseCourier(ArrayList<Courier> couriers, Order order) {
		Courier chosenCourier = null; // if no courier, returns null.
		
		
		int numberOfCompletedDelivery = Integer.MAX_VALUE; //begins at Infinity
		for (Courier c : couriers){
			int orderNumber = c.getDeliveredOrderCounter(); //TODO : peut-etre verifie qu'il est bien actif!
			if (orderNumber < numberOfCompletedDelivery){
				chosenCourier = c;
				numberOfCompletedDelivery = orderNumber;
			}
		}
			
		return chosenCourier;
	}
	
}
