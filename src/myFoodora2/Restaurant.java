package myFoodora2;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant extends User {
	
	private ArrayList<Double> adress = new ArrayList<Double>(2); //coordonnées cartésiennes
		
	// On stocke ici les différents items du restaurant
	private ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
	
	// On stocke ici les différents Menus proposés
	private ArrayList<Meal> meals = new ArrayList<Meal>();
	
	private double genericDiscountFactor = 0.05;
	private double specificDiscountFactor = 0.1;
	private double income=0;
	
	private Meal mealOfTheWeek = null; //the meal of the week
	
	public Restaurant(){
		super();
	}
	
	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	
	public Meal getMealOfTheWeek() {
		return mealOfTheWeek;
	}


	public void setMealOfTheWeek(Meal mealOfTheWeek) {
		this.mealOfTheWeek = mealOfTheWeek;
		// Note: pas de prix à updater parce qu'on fait le choix de calculer le prix à chaque commande
		// non de sauver cela demande trop de mises à jour si on modifie le prix d'un meal
	}


	public ArrayList<MenuItem> getMenu() {
		return menu;
	}


	public ArrayList<Meal> getMeals() {
		return meals;
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
		
		//Création du Meal et ajout à la liste
		//get Meal factory
		AbstractFactory mealFactory = FactoryProducer.getFactory("MEAL");
		//Chose of the type
		Meal meal = mealFactory.createMeal(name, listeplats);		
		this.meals.add(meal);
	}
	
	public void removeMealFromRestaurantMenu(Meal meal){
		//editing the restaurant menu (removing items)
		this.meals.remove(meal);
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
	
	public double getGenericDiscountFactor(){
	
		return this.genericDiscountFactor;
	}
	
	public double getSpecificDiscountFactor(){
		
		return this.specificDiscountFactor;
	}
	
	// A mettre dans les managers --> a reinstancer quand on n'en veut pas
	public ArrayList<Order> sortShipped (String criteria, MyFoodora myFoodora){
		/* Allow restaurants and managers to sort the
		shipped orders according to different criteris. MyFoodora should support the following
		policies:
		– most/least ordered half-meal: display all half-meals sorted w.r.t the number
		of shipped half-meals
		– most/least ordered item `a la carte: display all menu items sorted w.r.t the
		number of time they been selected `a la carte */
		
		return myFoodora.sortOrders(criteria); //TODO
	}

	public ArrayList<Double> getAdress() {return adress;}

	public void setAdress(ArrayList<Double> adress) {this.adress = adress;}
	
}