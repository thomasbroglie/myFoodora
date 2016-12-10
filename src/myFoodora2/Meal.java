package myFoodora2;
import java.util.*;

//On cr�e une abstrac class pour permettre aux diff�rents meals de facilement contr�ler leur nature (� la cr�ation 
//v�rifier les types d'items qu'on ins�re et a posteriori v�rifier le type de meal extr�mement rapidement
public abstract class Meal implements Product {

	protected String name;
	protected Restaurant restaurant;
	protected ArrayList<MenuItem> listeplats;
	protected double price;
	
	/**   WAIT, d�pend du restaurant, pas que du meal.*/
	
	//Cette m�thode donne acc�s au v�ritable prix du meal !
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
	//gestion d'exeption TO DO : des plats incomplets, avec deux desserts, etc. peuvent �tre cr��s !

}
