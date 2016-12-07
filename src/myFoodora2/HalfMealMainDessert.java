package myFoodora2;

import java.util.ArrayList;

public class HalfMealMainDessert extends Meal {
	
	public HalfMealMainDessert(String name, ArrayList<MenuItem> listeplats) {
		super(name, listeplats);
		// TODO Auto-generated constructor stub
	}

	public HalfMealMainDessert() {
		ArrayList<MenuItem> listeplats = new ArrayList<MenuItem>();
		MenuItem maindish = new MenuItem("main-dish");
		listeplats.add(maindish);
		MenuItem dessert = new MenuItem("dessert");
		listeplats.add(dessert);
		
		this.listeplats=listeplats;		
	}
	
	public HalfMealMainDessert(ArrayList<MenuItem> listeplats) {
		super();
		this.listeplats = listeplats;
	}
	
	public static void main(String[] args) {
		MenuItem m1 = new MenuItem(4);
		MenuItem m2 = new MenuItem(1);
		
		ArrayList<MenuItem> liste = new ArrayList<MenuItem>();
		liste.add(m1);
		liste.add(m2);
				
		HalfMealMainDessert toto = new HalfMealMainDessert(liste);
		System.out.println(toto.price);
		
		m1.setPrice(3);
		System.out.println(toto.price);
	}
	
	
	
}
