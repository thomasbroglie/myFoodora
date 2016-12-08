package myFoodora2;
import java.util.*;


public class UserFactory {
	
	public User CreateUser(String userType, String username, String name){
		if(userType == null){
			return null;
		}
		
		if(userType.equalsIgnoreCase("restaurant")){
			// On a besoin d'une info en plus importante : l'adresse
			return new Restaurant(name, adress, username);
			
		} else if(userType.equalsIgnoreCase("customer")){
			
			//On a besoin de nouvelles informations
			
			
			return new Customer(username, name, username, email, coordonates, phone);
		} else if(userType.equalsIgnoreCase("courier")){
			return new Courier();
		} else if(userType.equalsIgnoreCase("manager")){
			return new Manager();
		}
		return null;
	}
	
	public User CreateUser(String userType, String username, String name, String username, String email, ){
}
