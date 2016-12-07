package myFoodora2;

import java.util.ArrayList;

public class HalfMealStartMain extends Meal {

	public HalfMealStartMain(ArrayList<MenuItem> listeplats) {
		super(listeplats);
		// TODO Auto-generated constructor stub
	}

	public HalfMealStartMain(String name, ArrayList<MenuItem> listeplats) {
		super(name, listeplats);
		// TODO Auto-generated constructor stub
	}

	public HalfMealStartMain() {
		ArrayList<MenuItem> listeplats = new ArrayList<MenuItem>();
		MenuItem starter = new MenuItem("starter");
		listeplats.add(starter);
		MenuItem maindish = new MenuItem("main-dish");
		listeplats.add(maindish);		
		this.listeplats=listeplats;		
	}
}
