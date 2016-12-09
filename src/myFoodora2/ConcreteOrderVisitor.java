package myFoodora2;

public class ConcreteOrderVisitor implements OrderVisitor{
	@Override
	public int visit(MenuItem menuItem) {
		int cost=0; 
		
		return cost;
	}
	
	@Override
	public int visit(Meal meal) {
		int cost = 0;
		return cost;
	}
}
