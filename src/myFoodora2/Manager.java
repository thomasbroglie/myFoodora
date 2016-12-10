package myFoodora2;
import java.util.*;


public class Manager extends User {
	private String surname;	
	
	public Manager() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void removeUser(User user, MyFoodora myFoodora){
		myFoodora.removeUser(user);
	}
	
	public void addUser(User user, MyFoodora myFoodora){
		myFoodora.addUser(user);
	}
	
	public void activateDesactivateUser(boolean activated, User user){
		// But : activer(1) ou desactiver (0) un utilisateur de tout type
		user.setActivated(activated);
	}
	
	public void changeSystem(MyFoodora myFoodora, double serviceFeePercentage, double markupPercentage, double deliveryCost){
		// Change les différents paramètres du système ATTENTION : à l'utilisation remettre les bons trucs du coup si jamais on veut n'en modifier qu'un
		myFoodora.setServiceFeePercentage(serviceFeePercentage);
		myFoodora.setDeliveryCost(deliveryCost);
		myFoodora.setMarkupPercentage(markupPercentage);
	}
	
	public ArrayList<Double> computing(Date begin, Date end, MyFoodora myFoodora){
		return myFoodora.computing(begin, end);
	}
	
	
	public Hashtable<User, Double> computeAverageIncomePerCustomer(Date begin, Date end, MyFoodora myFoodora){
		// Compute average income per customer (ie. the total income divided by the number
		// of customers that placed at least one command on a time period)
		return myFoodora.computeAverageIncomePerCustomer(begin, end);
	}
	
	public void optimizing (double targetProfit){
		// determining either the service-fee and/or markup percentage and/or the deliverycost
		// so to meet a target-profit (see target profit policies)
		//TODO 
	}
	
	public ArrayList<Restaurant> mostLeastSellingRestaurant (MyFoodora myFoodora){
		// Determining the most and least selling restaurant
		return myFoodora.mostLeastSellingRestaurant();
	}
	
	public ArrayList<Courier> mostLeastActiveCourier(MyFoodora myFoodora){
		// Determining the most/least active courier of the fleet
		return myFoodora.mostLeastActiveCourier();
	}
	 
	public void setDeliveryPolicy(MyFoodora myFoodora, DeliveryPolicy deliveryPolicy){
		// setting the current delivery-policy used by MyFoodora to determine which courier
		// is assigned to deliver an order placed by a customer
		myFoodora.setDeliveryPolicy(deliveryPolicy);
	}
	
	public TreeMap<Product,Double> sortOrders(SortStrategy strategy, MyFoodora myFoodora){
		 /* Allow restaurants and managers to sort the
		shipped orders according to different criteris. MyFoodora should support the following
		policies:
		– most/least ordered half-meal: display all half-meals sorted w.r.t the number
		of shipped half-meals
		– most/least ordered item `a la carte: display all menu items sorted w.r.t the
		number of time they been selected `a la carte */
		
		 return myFoodora.sortOrders(strategy);
	 }	
}
