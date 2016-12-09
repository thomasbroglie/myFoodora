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
	}
	
	public Courier(){
		super();
	}
	
	public void getDeliveryCall(Order order){
		System.out.println("you are" + this.toString());
		System.out.println("do you want to deliver this order : " + order.toString());
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		sc.close();
		if (a.equalsIgnoreCase("oui")){
			//TODO
			this.deliveredOrderCounter++;
			}
		if (a.equalsIgnoreCase("non")){
			// TODO
		}		
		//TODO handle exception		
	}
		
	@Override
	public String toString() {
		return "Courier [surname=" + surname + ", phone=" + phone + ", position=" + position
				+ ", deliveredOrderCounter=" + deliveredOrderCounter + ", workState=" + workState + "]";
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
	
	public void newCourse(){
		//Sert à mettre à jour le compteur du nombre de courses du courier !
		this.deliveredOrderCounter++;
	}

}
