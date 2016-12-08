package myFoodora2;
import java.util.*;

public class MyFoodora {
	
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Order> orders = new ArrayList<Order>(); //history of completed orders
	private double serviceFeePercentage; //pourcentage
	private double markupPercentage; //
	private double deliveryCost;
	
	DeliveryPolicy deliveryPolicy; // the policy of delivery of the system 
	// TODO -> generate the way to change (just setter and getter ?)
	
	
	
	public MyFoodora(double serviceFee, double markupPercentage, double deliveryCost) {
		super();
		this.serviceFeePercentage = serviceFee;
		this.markupPercentage = markupPercentage;
		this.deliveryCost = deliveryCost;
	}


	public double getServiceFeePercentage() {return serviceFeePercentage;}

	public void setServiceFeePercentage(double serviceFeePercentage) {this.serviceFeePercentage = serviceFeePercentage;}

	public ArrayList<User> getUsers() {return users;}

	public void setUsers(ArrayList<User> users) {this.users = users;}

	public ArrayList<Order> getOrders() {return orders;}

	public void setOrders(ArrayList<Order> orders) {this.orders = orders;}

	public double getMarkupPercentage() {return markupPercentage;}

	public void setMarkupPercentage(double markupPercentage) {this.markupPercentage = markupPercentage;}

	public double getDeliveryCost() {return deliveryCost;}

	public void setDeliveryCost(double deliveryCost) {this.deliveryCost = deliveryCost;} 	
	
	public DeliveryPolicy getDeliveryPolicy() {return deliveryPolicy;}

	public void setDeliveryPolicy(DeliveryPolicy deliveryPolicy) {this.deliveryPolicy = deliveryPolicy;}

	public void notifyUsers(RestaurantOffer offer){
		for (User user : this.users){
			user.
		}
		
	}
	
	
	
}
