package myFoodora2;
import java.util.*;


public class Order {
	
	private Customer customer;
	private Restaurant resto;
	
	//On enregistre ici les produits choisis avec la quantité correspondante !
	//-> has a price through product.getPrice() sans les infos sur le resto et getFinalPrice pour le vrai prix
	private Hashtable<Product, Double> products; 
	
	private Courier courier;
	private Date time;
	private double price;
	
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", resto=" + resto + ", product=" + products + ", courier=" + courier
				+ ", time=" + time + "]";
	}

	/**
	 * @param customer
	 * @param resto
	 * @param products
	 * @param courier
	 * @param time
	 */
	
	public Order(Customer customer, Restaurant resto, Hashtable<Product, Double> products, Courier courier, Date time) {
		super();
		this.customer = customer;
		this.resto = resto;
		this.products = products;
		this.courier = courier;
		this.time = time;
		
	}

	public double getPrice() { return price; }
	
	public Customer getCustomer() {return customer;}

	public Restaurant getResto() {return resto;}

	public Hashtable<Product, Double> getProducts() {return products;}
		
	public void addProduct(Product product, double quantity){
		//On ajoute à la Hashtable le produit et on met à jour la quantité si il existait déjà sinon on met la quantité demandée
		if (this.products.containsKey(product)){
			this.products.replace(product, this.products.get(product) + quantity);
		} else {
			this.products.put(product, quantity);
		}
	}

	public Courier getCourier() {return courier;}

	public Date getTime() {return time;}
	
}
