package myFoodora2;
import java.util.*;

public abstract class FidelityCard { // /!\ Must be able to get a new kind of fidelity card !
	protected Restaurant resto;
	
	public FidelityCard(Restaurant resto) {
		super();
		this.resto = resto;
	}

	public Restaurant getResto() {
		return resto;
	}	
	
}
