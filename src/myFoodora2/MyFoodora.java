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
	
	public ArrayList<User> getUserPerType(String type){
		//Pas très open-close mais bon j'arrive pas à faire mieux
		ArrayList<User> usersTriee = new ArrayList<User>();
		for (User user : this.users)
			if (user instanceof Customer && type.equalsIgnoreCase("CUSTOMER")){	
				usersTriee.add(user);
			} else if (user instanceof Courier && type.equalsIgnoreCase("Courier")){
				usersTriee.add(user);
			} else if (user instanceof Manager && type.equalsIgnoreCase("MANAGER")){
				usersTriee.add(user);
			} else if (user instanceof Restaurant && type.equalsIgnoreCase("RESTAURANT")){
				usersTriee.add(user);
			}
		return usersTriee;
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
	
	public void addUser(User user){
		this.users.add(user);
	}
	
	public void removeUser(User user){
		this.users.remove(user);
	}
	
	public ArrayList<Double> computing(Date begin, Date end){
		// Compute income and profit over a period time
		ArrayList<Double> liste= new ArrayList<Double>();
		double income=0;
		double profit=0;
		
		for (Order order : this.orders){
			if (order.getTime().before(end) && order.getTime().after(begin)){
				income+=order.getPrice();
				profit = order.getPrice() * this.markupPercentage + this.serviceFeePercentage - this.deliveryCost;
			}
		}
		
		liste.add(income);
		liste.add(profit);
		return liste;
	}
	
	public Hashtable<User, Double> computeAverageIncomePerCustomer(Date begin, Date end){ 
	    Hashtable<User, Double> ht = new Hashtable<User, Double>();
	    //On récupère l'income total :) pour diviser ensuite
	    ArrayList<Double> liste = new ArrayList<Double>();
	    liste = this.computing(begin, end);
	    
	    
	    
	    //On enregistre le tout dans une hashtable avec le numéro unique de chacun de nos clients 
	    //On met à jour peu à peu
	    
	    
	    for (Order order : this.orders){
			if (order.getTime().before(end) && order.getTime().after(begin)){
				if(ht.containsKey(order.getCustomer())){
					ht.replace(order.getCustomer(), order.getPrice()+ ht.get(order.getCustomer()));
				} else {
					ht.put(order.getCustomer(), order.getPrice());
				}
			}
		} 
		return ht;
	}
	
	 public ArrayList<Restaurant> mostLeastSellingRestaurant (){// TODO peut etre enregistrer peu à peu ce qui est fait ! :)
		// Determining the most and least selling restaurant
		ArrayList<User> restaurants = this.getUserPerType("RESTAURANT");
		ArrayList<Restaurant> liste= new ArrayList<Restaurant>(2);
		double most = -1.0;
		double least= -1.0;		
		
		double income;
		
		for (User user : restaurants){
			Restaurant restaurant = (Restaurant) user;
			income = restaurant.getIncome();
			
			if (most<income || most == -1.0){
				liste.set(0, restaurant);
			} 
			
			if (least > income || most == -1.0){
				liste.set(0, restaurant);
			}
		}
		
		return liste;
	 }
	 
	 public ArrayList<Courier> mostLeastActiveCourier(){
		ArrayList<User> couriers = this.getUserPerType("Courier");
		ArrayList<Courier> liste= new ArrayList<Courier>(2);
		double most = -1.0;
		double least= -1.0;		
		
		double counter;
		
		for (User user : couriers){
			Courier courier = (Courier) user;
			counter = courier.getDeliveredOrderCounter();
			
			if (most<counter || most == -1.0){
				liste.set(0, courier);
			} 
			
			if (least > counter || most == -1.0){
				liste.set(0, courier);
			}
		}
		
		return liste;
	 }
	
}
