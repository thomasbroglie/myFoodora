package myFoodora2;

import java.util.ArrayList;

public abstract class AbstractFactory {
	abstract Meal createMeal(String name, ArrayList<MenuItem> listeplats);
	abstract User createUser(String userType);

}
