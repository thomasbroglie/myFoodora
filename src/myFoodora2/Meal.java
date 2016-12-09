package myFoodora2;
import java.util.*;


public abstract class Meal implements Product {

	protected String name;
	protected double price; // /!\ is not the price for the customer, but the sum of the prices of the items ! otherwise, has to considerate the policy of the restaurant each time while does not have access to the restaurant information
	protected ArrayList<MenuItem> listeplats;
	protected Restaurant restaurant;
	
	/**   WAIT, dépend du restaurant, pas que du meal.*/

	public double price(){ //not the price of the meal for the customer !
		double p=0;
		for (MenuItem item : this.listeplats) {
			p += item.getPrice();
		}
		return p;
	}

	public Meal(String name, ArrayList<MenuItem> listeplats) {
		super();
		this.name = name;
		this.listeplats = listeplats;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
	//Cette méthode donne accès au véritable prix du meal !
	@Override
	public double getFinalPrice(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

	public Meal(ArrayList<MenuItem> listeplats) {
		super();
		this.listeplats = listeplats;
	}
	
	public Meal(){
		super();
	}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}	
	
	public ArrayList<MenuItem> getListeplats() {return listeplats;}

	public void setListeplats(ArrayList<MenuItem> listeplats) {this.listeplats = listeplats;}

	public boolean isVegetarian() {
		boolean vegetarian = true;
		for (MenuItem item : listeplats){
			if (item.isVegetarian()==false){vegetarian = false;}
		}
		return vegetarian;
	}

	public boolean isGlutenfree(){
		boolean glutenfree = true;
		for (MenuItem item : listeplats){
			if (item.isGlutenfree()==false){glutenfree=false;}
		}		
		return glutenfree;
	}
	
	//gestion d'exeption TO DO : des plats incomplets, avec deux desserts, etc. peuvent être créés !

}
