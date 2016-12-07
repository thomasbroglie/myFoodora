package myFoodora2;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant extends User {
	
	private ArrayList<Double> adress = new ArrayList<Double>(2); //coordonn�es cart�siennes
		
	// On stocke ici les diff�rents items du restaurant
	private ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
	
	// On stocke ici les diff�rents Menus propos�s
	private ArrayList<Meal> meals = new ArrayList<Meal>();
	
	private double genericDiscountFactor = 0.05;
	private double specificDiscountFactor = 0.1;
	
	private Meal mealOfTheWeek = null; //the meal of the week
	
	public Restaurant(String name, ArrayList<Double> adress, String username) {
		super(username, name);
		this.adress = adress;
		
		User.idCounter++;
		this.id = User.idCounter;
	}
	
	public void addItemToRestaurantMenu(String name, double price, String category, boolean vegetarian,
			boolean glutenfree){
		//editing the restaurant menu (adding items)
		MenuItem item = new MenuItem(name, price, category, vegetarian, glutenfree);
		this.menu.add(item);
	}
	
	public void removeItemFromRestaurantMenu(int index){
		//editing the restaurant menu (removing items)
		this.menu.remove(index);
	}
	
	public void addMealToRestaurantMenu(String name, ArrayList<MenuItem> listeplats){
		//editing the restaurant menu (adding items) 
		
		//Cr�ation du Meal et ajout � la liste
	// TO DO //new meal (name, listeplats, mealOfTheWeek); #factoryPattern
		MealFactory facto = new MealFactory();		
		Meal meal = facto.createMeal(name, listeplats);		
		this.meals.add(meal);
	}
	
	public void removeMealFromRestaurantMenu(int index){
		//editing the restaurant menu (removing items)
		this.meals.remove(index);
	}
	
	public void setGenericDiscountFactor(double genericDiscountFactor){
		//establishing the generic discount factor (default 5%) to apply when computing
		// a meal price
		
		this.genericDiscountFactor = genericDiscountFactor;
	}
	
	public void setSpecificDiscountFactor(double specificDiscountFactor){
		// establishing the special discount factor (default 10%) to apply to the meal-of-the-week
		// special offer.
		
		this.specificDiscountFactor = specificDiscountFactor;
	}
	
	public void setMealOfTheWeek(int index){
		// Ici pour choisir un MealOfTheWeek et enlever le pr�c�dent -> pas besoin d'enlever le pr�c�dent.
		// Note: pas de prix � updater parce qu'on fait le choix de calculer le prix � chaque commande
		// non de sauver cela demande trop de mises � jour si on modifie le prix d'un meal
		
		this.mealOfTheWeek = this.meals.get(index); //the new meal of the week
	}
	
	// A mettre dans les managers --> a reinstancer quand on n'en veut pas
	public void sortShipped (String criteria, Ship ship){
		/* Allow restaurants and managers to sort the
		shipped orders according to different criteris. MyFoodora should support the following
		policies:
		� most/least ordered half-meal: display all half-meals sorted w.r.t the number
		of shipped half-meals
		� most/least ordered item `a la carte: display all menu items sorted w.r.t the
		number of time they been selected `a la carte */
		
		ship.sort(criteria); //TO DO
	}
	
}