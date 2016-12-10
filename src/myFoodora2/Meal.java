package myFoodora2;
import java.util.*;

//On crée une abstrac class pour permettre aux différents meals de facilement contrôler leur nature (à la création 
//vérifier les types d'items qu'on insère et a posteriori vérifier le type de meal extrêmement rapidement
public abstract class Meal implements Product {

	protected String name;
	protected Restaurant restaurant;
	protected ArrayList<MenuItem> listeplats;
	protected double price;
	
	/**   WAIT, dépend du restaurant, pas que du meal.*/
	
	//Cette méthode donne accès au véritable prix du meal !
	@Override
	public double getFinalPrice(OrderVisitor visitor) {
		return visitor.visit(this);
	}

	public Meal(String name, ArrayList<MenuItem> listeplats, Restaurant restaurant) {
		super();
		this.name = name;
		this.listeplats = listeplats;
		this.restaurant=restaurant;
		double price = 0;
		for (MenuItem item : listeplats){
			price += item.getPrice();
		}
		this.price = price;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public Meal(ArrayList<MenuItem> listeplats) {
		super();
		this.listeplats = listeplats;
	}
	
	public Meal(){
		super();
	}

	public String getName() {return name;}

	public double getPrice() {
		return price;
	}

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
