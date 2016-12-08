package myFoodora2;
import java.util.*;


public class Order {
	
	private Customer customer;
	private Restaurant resto;
	private Product product; //-> has a price through product.getPrice()
	private Courier courier;
	private Date time;
	
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", resto=" + resto + ", product=" + product + ", courier=" + courier
				+ ", time=" + time + "]";
	}

	public Customer getCustomer() {return customer;}

	public void setCustomer(Customer customer) {this.customer = customer;}

	public Restaurant getResto() {return resto;}

	public void setResto(Restaurant resto) {this.resto = resto;}

	public Product getProduct() {return product;}

	public void setProduct(Product product) {this.product = product;}

	public Courier getCourier() {return courier;}

	public void setCourier(Courier courier) {this.courier = courier;}

	public Date getTime() {return time;}

	public void setTime(Date time) {this.time = time;}
	
	
	
	
}
