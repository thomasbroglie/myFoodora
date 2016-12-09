package myFoodora2;

import java.util.ArrayList;

public class Notification implements Observable {

	private  ArrayList<Observer> observers = new ArrayList<Observer>();	
	private RestaurantOffer restaurantOffer;
	private boolean changed;
	
	public Notification(RestaurantOffer restaurantOffer) {
		super();
		this.restaurantOffer = restaurantOffer;
		this.changed = false;
	}
	
	public boolean isChanged() {return changed;}
	public void setChanged(boolean changed) {this.changed = changed;}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);		
	}

	@Override
	public void notifyObservers() {
		if (this.changed){
			for (Observer ob : observers){
				//String offerContents = this.restaurantOffer.getOfferContent();
				ob.update(this.restaurantOffer);
			this.changed = false;
			}
		}		
	}

	public ArrayList<Observer> getObservers() {return observers;}
}
