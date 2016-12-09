package myFoodora2;

public interface OrderVisitor {
	double visit(Meal meal);
	double visit(MenuItem menuItem);
}
