package myFoodora2;
import java.util.*;

public class MostLeastOrderedMenuItemStrategy implements SortStrategy {

	@Override
	public TreeMap<Product, Double> sort(ArrayList<Order> orders) {
		// Création d'une collection avec tous les produits (ici des Menu Items uniquement à partir de Orders)
		// on utilise une Map pour pouvoir tout conserver puis trier ! (on met en clé le produit et  la quantité en valeur)
		HashMap<Product, Double> products = new HashMap <Product, Double>();
		
		for (Order order : orders){
			//On parcourt les produits de la commande
			Enumeration<Product> e = order.getProducts().keys();
			while(e.hasMoreElements()){
				Product product = e.nextElement();
				
				// On regarde le type de produit
				if (product instanceof HalfMealMainDessert){
					//On enregistre dans la map  la quantité et le produit ou on met juste à jour
					if (products.containsKey(product)){
						products.replace(product, products.get(product) + order.getProducts().get(product));
					} else {
						products.put(product, order.getProducts().get(product));
					}
				}
			}			
		}
		
		//Le code qui suit permet le tri de la liste en fonction des valeurs !!!
		
		Comparator<Double> valueComparator = new Comparator<Double>() {
			@Override
			public int compare(Double p1, Double p2) {
				return p1.compareTo(p2);
			}
		};
		
		MapValueComparator<Product, Double> mapComparator = new MapValueComparator<Product, Double>(products, valueComparator);
		TreeMap<Product, Double> produitsTries = new TreeMap<Product, Double>(mapComparator);
		produitsTries.putAll(products);
		
		return produitsTries;
	}

}
