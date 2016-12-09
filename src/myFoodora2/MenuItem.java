package myFoodora2;

public class MenuItem implements Product {
	private String name;
	private double price;
	private String category; //"starter", "main-dish", "dessert"
	private boolean vegetarian; //True : vegetarian. False: standard
	private boolean glutenfree; // True : glutenfree. False: not glutenfree
	
	public MenuItem() {
		super();
	}

	public MenuItem(String category){
		super();
		this.category=category;
	}
	
	public MenuItem(double price){
		super();
		this.price=price;
	}
	
	public MenuItem(String name, double price, String category, boolean vegetarian, boolean glutenfree) {
		super();
		this.name=name;
		this.price = price;
		this.category = category;
		this.vegetarian = vegetarian;
		this.glutenfree = glutenfree;
		
		//TO DO Exceptions category incorrecte
	}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public double getPrice() {return price;}

	public void setPrice(double price) {this.price = price;}

	public String getCategory() {return category;}

	public void setCategory(String category) {this.category = category;}

	public boolean isVegetarian() {return vegetarian;}

	public void setVegetarian(boolean vegetarian) {this.vegetarian = vegetarian;}

	public boolean isGlutenfree() {return glutenfree;}

	public void setGlutenfree(boolean glutenfree) {this.glutenfree = glutenfree;}
	
	@Override
	public String toString() {
		return "MenuItem [price=" + price + ", category=" + category + ", vegetarian=" + vegetarian + ", glutenfree="
				+ glutenfree + "]";
	}

	public static void main(String[] args) {
		MenuItem m = new MenuItem();
		System.out.println(m.getCategory());
		System.out.println(m.isVegetarian());
	}
	
	//Implémentation du Visitor Pattern
	@Override
	public double getFinalPrice(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
		
}
