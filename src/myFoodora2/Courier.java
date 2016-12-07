package myFoodora2;
import java.util.*;

public class Courier extends User {

	private String surname;
	private double phone;
	private ArrayList<Double> position = new ArrayList<Double>(2); //geographical co-ordinates.
	private int deliveredOrderCounter = 0 ;
	private boolean workState = false; // false : off-duty (default value) ; true : on-duty
	
	public Courier(String username, String name, String surname, double phone, ArrayList<Double> position) {
		super(username, name);
		this.surname = surname;
		this.phone = phone;
		this.position = position;
		
		User.idCounter++;
		this.id=User.idCounter;
	}
	
	public String getSurname() {return surname;}

	public void setSurname(String surname) {this.surname = surname;}

	public double getPhone() {return phone;}

	public void setPhone(double phone) {this.phone = phone;}

	public ArrayList<Double> getPosition() {return position;}

	public void setPosition(ArrayList<Double> position) {this.position = position;}

	public int getDeliveredOrderCounter() {return deliveredOrderCounter;}

	public void setDeliveredOrderCounter(int deliveredOrderCounter) {this.deliveredOrderCounter = deliveredOrderCounter;}

	public boolean isWorkState() {return workState;}

	public void setWorkState(boolean workState) {this.workState = workState;}

	public Courier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courier(String username, String name) {
		super(username, name);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
