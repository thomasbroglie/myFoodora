package myFoodora2;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("USER")){
			return new UserFactory();
		} else if(choice.equalsIgnoreCase("MEAL")){
			return new MealFactory();
		}
		return null;
	}
}
