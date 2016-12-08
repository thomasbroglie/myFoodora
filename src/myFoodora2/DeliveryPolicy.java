package myFoodora2;
import java.util.ArrayList;

public interface DeliveryPolicy {	
	
	Courier choseCourier(ArrayList<Courier> couriers, Order order);
}
