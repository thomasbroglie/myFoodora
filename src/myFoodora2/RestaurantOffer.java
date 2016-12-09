package myFoodora2;

public class RestaurantOffer {
	private String offerContent; //contains the message each notified User will read.
	private Restaurant resto;
	
	public String getOfferContent() {return offerContent;}
	public void setOfferContent(String offerContent) {this.offerContent = offerContent;}
	
	public Restaurant getResto() {return resto;}
	public void setResto(Restaurant resto) {this.resto = resto;}
	
}
