//Chenming Tao 25251621, Maksym Parkhomenko 25259009

// Main class to demonstrate the marketplace system

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create a marketplace named "CS627B"
        Marketplace marketplace = new Marketplace("CS627B");

        // Create two sellers
        Seller seller1 = new Seller("Maksym");
        Seller seller2 = new Seller("Eric");

        // Create various products with different categories
        Product product1 = new Product("Laptop", 999.99, Category.ELECTRONICS);
        Product product2 = new Product("T-Shirt", 19.99, Category.CLOTHING);
        Product product3 = new Product("Pizza", 9.99, Category.FOOD);
        Product product4 = new Product("Walkers", 9.99, Category.KITCHENERY);
        Product product5 = new Product("Coke", 1.99, Category.DRINKS);

        // Add products to sellers
        seller1.addProduct(product1);
        seller1.addProduct(product2);
        seller2.addProduct(product3);
        seller2.addProduct(product4);
        seller2.addProduct(product5);

        // Add sellers to the marketplace
        marketplace.addSeller(seller1);
        marketplace.addSeller(seller2);

        // Display initial marketplace state
        marketplace.displayInfo();

        System.out.println();

        // Update seller2's product: rename "Walkers" to "Plates" and change price to $15.99
        seller2.updateProduct("Walkers", "Plates");
        seller2.updateProduct("Plates", 15.99);

        // Display updated marketplace state
        marketplace.displayInfo();
    

        // Then we can call displayInfo function in List or different methods, no matter which class they belongs to

        // Polymorphism example:
        // Seller and Product both implement Displayable,
        // so they can be stored together in List<Displayable>
        // and handled using the same displayInfo() call.

        System.out.println("==== Using Interface Class to treat different class in List ====");
        System.out.println();
        // This is the point for using interface
        List<Displayable> items = new ArrayList<>();
        // Adding seller class to list
        items.add(seller1);
        items.add(seller2);
        // Adding product class to list
        items.add(product1);
        items.add(product2);
        items.add(product3);
        items.add(product4);
        items.add(product5);

        for (Displayable d : items) {
            d.displayInfo();
        }

    }

}