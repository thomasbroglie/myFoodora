package myFoodora2;
import java.util.ArrayList;

public class FullMeal extends Meal {

	public FullMeal() {
		ArrayList<MenuItem> listeplats = new ArrayList<MenuItem>();
		MenuItem starter = new MenuItem("starter");
		listeplats.add(starter);
		MenuItem maindish = new MenuItem("main-dish");
		listeplats.add(maindish);
		MenuItem dessert = new MenuItem("dessert");
		listeplats.add(dessert);
		
		this.listeplats=listeplats;		
	}
	
	public FullMeal(ArrayList<MenuItem> listeplats) {
		super(listeplats);
		// TODO Auto-generated constructor stub
	}

	public FullMeal(String name, ArrayList<MenuItem> listeplats) {
		super(name, listeplats);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		FullMeal f = new FullMeal();
		ArrayList<MenuItem> list = f.listeplats;
		//System.out.println(f.defaultprice());
		for (MenuItem m : list){
			System.out.println(m.toString());
		}
	}

	public static 
	
}
