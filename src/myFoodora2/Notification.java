package myFoodora2;

import java.util.ArrayList;

public class Notification implements Observable {

	private  ArrayList<Observer> observers = new ArrayList<Observer>();	
	private Restaurant resto; // a Notification comes from a restaurant
	private String notifContents; // a Notification is considered as having a bodytext
	private boolean changed;
	
	//consensus ?
	
	public Notification(Restaurant resto, String contents) {
		super();
		this.resto = resto;
		this.notifContents = notifContents;
		this.changed = false;
	}	
	
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
			for (Observer ob : observers)
				ob.update(this.notifContents);
			this.changed = false;
		}		
	}
	
	public void setNotifContents(String notifContents){
		this.notifContents=notifContents;
		this.changed=true;
		this.notifyObservers();
	}

	public static ArrayList<Observer> getObservers() {return observers;}

	public static void setObservers(ArrayList<Observer> observers) {Notification.observers = observers;}
}
