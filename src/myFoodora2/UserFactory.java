package myFoodora2;
import java.util.*;


public class UserFactory extends AbstractFactory{
	//Nos instanciations sont extrêmement simples à cause des disparités d'infos entre les types de users --> on fera tout avec des sets ensuite
	@Override
	public User createUser(String userType){
		if(userType.equalsIgnoreCase("CUSTOMER")){
			return new Customer();
		} else if(userType.equalsIgnoreCase("MANAGER")){
			return new Manager();
		} else if(userType.equalsIgnoreCase("COURIER")){
			return new Courier();
		}else if(userType.equalsIgnoreCase("RESTAURANT")){
			return new Restaurant();
		} 
		
		return null;
	}
	
	@Override
	public Meal createMeal(String name, ArrayList<MenuItem> listeplats){
		return null;
	}
}
