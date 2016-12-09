package myFoodora2;

public interface OrderVisitor {
	int visit(Meal meal);
	int visit(MenuItem menuItem);
}
