package myFoodora2;

public class UserFactory {
	
	public User CreateUser(String userType){
		if(userType == null){
			return null;
		}
		if(userType.equalsIgnoreCase("restaurant")){
			return new Restaurant();
		} else if(userType.equalsIgnoreCase("customer")){
			return new Customers();
		} else if(userType.equalsIgnoreCase("courier")){
			return new Couriers();
		} else if(userType.equalsIgnoreCase("manager")){
			return new Manager();
		}
		return null;
	}
	
	public User DeleteUser(String userType){
		if(userType == null){
			return null;
		}
		if(userType.equalsIgnoreCase("restaurant")){
			return new Restaurant();
		} else if(userType.equalsIgnoreCase("customer")){
			return new Customers();
		} else if(userType.equalsIgnoreCase("courier")){
			return new Couriers();
		} else if(userType.equalsIgnoreCase("manager")){
			return new Manager();
		}
		return null;
		
		//TODO
		
	}
}
