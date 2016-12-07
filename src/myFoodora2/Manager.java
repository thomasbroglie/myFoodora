package myFoodora2;
import java.util.*;

public class Manager extends User {
	private String surname;	
	
	public Manager(String name, String surname, String username) {
		super(username, name);
		this.surname = surname;
		User.idCounter++;
		this.id = User.idCounter;
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

	public void removeUser(User user){
		// But : enlever tout type d'utilisateur (restaurant, customer, and/or couriers)
		
	}
	
	public void addUser(String userType, MyFoodora myFoodora){
		// But : ajouter tout type d'utilisateur (restaurant, customer, and/or couriers)
		UserFactory userfacto = new UserFactory();
		User newUser = userfacto.CreateUser(userType);
		ArrayList<User> users = myFoodora.getUsers();
		users.add(newUser);
		myFoodora.setUsers(users);
		//TODO : exceptions
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
	
	public void computing(int timePeriod, ArrayList<//zjhdbqlzdbclsjhbdsbvb> completedOrders){
		// Compute income and profit over a period time
		
	}
	
	public void computeAverageIncomePerCustomer(int timePeriod){
		// Compute average income per customer (ie. the total income divided by the number
		// of customers that placed at least one command on a time period)
		
	}
	
	public void optimizing (double targetProfit){
		// determining either the service-fee and/or markup percentage and/or the deliverycost
		// so to meet a target-profit (see target profit policies below)

	}
	
	public void mostLeastSellingRestaurant (){
		// Determining the most and least selling restaurant
	}
	
	public void mostLeastActiveCourier(){
		// Determining the most/least active courier of the fleet

	}
	 
	public void setDeliveryPolicy(){
		//  setting the current delivery-policy used by MyFoodora to determine which courier
		// is assigned to deliver an order placed by a customer
		
	}
	
	
}
