package myFoodora2;
import java.util.*;

public class Customer extends User implements Observer {
	
	private String surname;
	private String email; //email adress
	private ArrayList<Double> coordonates = new ArrayList<Double>(2) ; //coordonnées du lieu où habite le customer
	private String phone;
	//private boolean consensus = false ; // True : the Customer agrees to get notified whenever a new special offer is set by ani restaurant
	// no more consensus attribute : everything's handled by the ObserverPattern !
	private boolean consensus =false;
	
	//Fidelity basic = new Fidelity(basic)
	private ArrayList<FidelityCard> fidelityCards = new ArrayList<FidelityCard>(); //a fidelitycard goes for ONE programm in ONE restaurant.
	
	
	@Override
	public void update(RestaurantOffer restaurantOffer) {
		Restaurant resto = restaurantOffer.getResto();
		String offerContent = restaurantOffer.getOfferContent();
		System.out.println("There is a new Notification from the Restaurant" + resto.getName());
		System.out.println(offerContent); 
	}
	
	public Customer(MyFoodora myFoodora){
		super();
		FidelityCardFactory facto = new FidelityCardFactory();

		for (User user : myFoodora.getUserPerType("Restaurant")){
			Restaurant resto = (Restaurant) user;
			FidelityCard fidel = facto.createFidelityCard("BASIC", resto);
			this.fidelityCards.add(fidel); //pas défaut, chaque costumer a la carte de fidélité basique pour tous les restaurants.
			
		}
		
	}
	
	//All the setters and Getters :
	
	public static int getIdCounter() {return idCounter;} //pas de setters pour ça.

	public String getSurname() {return surname;}
	public void setSurname(String surname) {this.surname = surname;}

	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}

	public ArrayList<Double> getCoordonates() {return coordonates;}
	public void setCoordonates(ArrayList<Double> coordonates) {this.coordonates = coordonates;}

	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}
	
	public boolean isConsensus() {return consensus;}
	public void setConsensus(boolean consensus) {this.consensus = consensus;}

	@Override
	public String toString() {
		return "Customer [surname=" + surname + ", email=" + email + ", coordonates=" + coordonates + ", phone=" + phone
				+ ", id=" + id + ", username=" + username + ", name=" + name + "]";
	}

	public void register(String fidelityCardType, Restaurant resto){ //TO DO Gestion des erreurs !! Si le String ou le resto n'existe pas, ne fonctionne pas !
		FidelityCardFactory facto = new FidelityCardFactory();
		FidelityCard fidelityCard = facto.createFidelityCard(fidelityCardType, resto);
		fidelityCards.add(fidelityCard);
	}
	
	public void unregister(FidelityCard fcard){
		fidelityCards.remove(fcard);
	}
	
	public void getInformations(){
		//informations about the account of a customer : history of orders, points acquired with a fidelity programm
		//TO DO
	}
	
	
}
