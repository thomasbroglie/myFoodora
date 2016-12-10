package myFoodora2;
import java.util.*;

public interface SortStrategy {
	TreeMap<Product, Double> sort(ArrayList<Order> orders);
}
