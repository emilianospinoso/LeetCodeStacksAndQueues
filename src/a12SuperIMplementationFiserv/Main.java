package a12SuperIMplementationFiserv;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void detectDuplicates(Product[] products) {
        Set<Product> productSet = new HashSet<>();

        for (Product product : products) {
            if (!productSet.add(product)) { //if product is in set return false becouse it couldnt be added.
                System.out.println("Duplicate product found: " + product.id);
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        Product[] productsData = {
                new Product(1, "Product A"),
                new Product(2, "Product B"),
                new Product(1, "Product A"),  // Duplicate
                new Product(4, "Product C"),
        };

        detectDuplicates(productsData);
    }
}
