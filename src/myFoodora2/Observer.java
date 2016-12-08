package myFoodora2;

public interface Observer { //for now, it looks like only Customers will be Observers, but this interface
	// will allow other types of the user to get notified of things.
	
	public void update(String notifContents); //TODO

}
