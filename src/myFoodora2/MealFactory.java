package myFoodora2;
import java.util.ArrayList;

public class MealFactory extends AbstractFactory{
	
	@Override
	public User createUser(String userType){
		return null;
	}
	
	@Override
	public Meal createMeal(String name, ArrayList<MenuItem> listeplats){
		// looks what kind of meal it is and create it.
		int starter = 0;int maindish = 0;int dessert=0;
		for (MenuItem plat : listeplats){
			if (plat.getCategory()=="starter"){starter++;}
			if (plat.getCategory()=="maindish"){maindish++;}
			if (plat.getCategory()=="dessert"){dessert++;}
		}
		if (starter==1 && maindish==1 && dessert==1){
			return new FullMeal(name, listeplats);}
		if (starter==1 && maindish==1 && dessert==0){
			return new HalfMealStartMain(name, listeplats);}
		if (starter==0 && maindish==1 && dessert==1){
			return new HalfMealMainDessert(name, listeplats);}
		return null; //TODO
		//message d'exception/d'erreur normalement !! TO DO !
	}
	
}

