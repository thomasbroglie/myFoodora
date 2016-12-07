package myFoodora2;

public class FidelityCardFactory {
	//use createFidelityCard to create new FidelityCards
	
	public FidelityCard createFidelityCard(String fidelityCardType, Restaurant resto){
		if(fidelityCardType == null){
			return null;
		}
		if(fidelityCardType.equalsIgnoreCase("basic")){
			return new BasicFidelityCard(resto);
		} else if(fidelityCardType.equalsIgnoreCase("point")){
			return new PointFidelityCard(resto);
		} else if(fidelityCardType.equalsIgnoreCase("lottery")){
			return new LotteryFidelityCard(resto);
		}
		return null;
	}
	
	
}
