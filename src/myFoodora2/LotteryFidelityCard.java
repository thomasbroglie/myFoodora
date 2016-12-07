package myFoodora2;

public class LotteryFidelityCard extends FidelityCard{
	
	private double probability; //the Customer with this card has the possibility to get a free meal each day with this probability

	public LotteryFidelityCard(Restaurant resto) {
		super(resto);
		// TODO Auto-generated constructor stub
	}

	public double getProbability() {return probability;}

	public void setProbability(double probability) {this.probability = probability;}
	
}
