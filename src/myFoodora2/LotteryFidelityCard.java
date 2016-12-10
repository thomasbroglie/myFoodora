package myFoodora2;
import java.math.*;

public class LotteryFidelityCard extends FidelityCard{
	
	private boolean winner;
	
	public LotteryFidelityCard(Restaurant resto) {
		super(resto);
		winner = false;
		// TODO Auto-generated constructor stub
	}
	
	public boolean hasWon(){
		return this.winner;
	}
	
	//Probabilité de 1%
	public void setWinner(){
		int nbAleatoire = (int) (Math.random() * 99 + 1);
		if (nbAleatoire == 1) this.winner=true;
	}
	
	public void reset(){
		this.winner = false;
	}
}
