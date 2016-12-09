package myFoodora2;

public class ConcreteOrderVisitor implements OrderVisitor{
	@Override
	public double visit(MenuItem menuItem) {
		double price = menuItem.getPrice();
		return price;
	}
	
	@Override
	public double visit(Meal meal) {
		Restaurant restaurant = meal.getRestaurant(); //On a besoin des paramètres du restaurant (facteurs)
		Meal mealOfTheWeek = restaurant.getMealOfTheWeek(); //On va vérifier si c'est un plat de la semaine
		double price = meal.getPrice();
		double specificDiscountFactor = restaurant.getSpecificDiscountFactor();
		double genericDiscountFactor = restaurant.getGenericDiscountFactor();
		double prixFinal;
		
		if (meal == mealOfTheWeek){
			prixFinal = price * specificDiscountFactor;
		} else {
			prixFinal = price * genericDiscountFactor;
		}
		
		return prixFinal;
	}
}
