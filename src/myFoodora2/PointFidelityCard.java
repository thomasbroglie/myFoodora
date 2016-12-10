package myFoodora2;

public class PointFidelityCard extends FidelityCard{

	private int points = 0 ; //number of points the Customer has in this card. Begins at zero.

	public PointFidelityCard(Restaurant resto) {
		super(resto);
		// TODO Auto-generated constructor stub
	}

	public int getPoints() {return points;}

	public void setPoints(int points) {this.points = points;}
	
	public boolean hasCentPoints(){
		if(this.points>=100) return true;
		else return false;
	}
	
	public void usePoints(){
		this.points-=100;
	}

	public void addPoints(double price){
		this.points=(int) price/10;
	}
}
