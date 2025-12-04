//Chenming Tao 25251621, Maksym Parkhomenko 25259009
import java.util.ArrayList;

// Represents an online marketplace that manages multiple sellers and their products
public class Marketplace {

    // Name of the marketplace
    private String name;
    // List of sellers in this marketplace
    private ArrayList<Seller> sellers;

    // Constructor to create a new marketplace with a given name
    public Marketplace(String name) {
        this.name = name;
        sellers = new ArrayList<Seller>();
    }

    // Displays all sellers in the marketplace
    public void listAllSellers() {
        for (Seller seller : sellers) {
            seller.displayInfo();
        }
    }

    // Adds a new seller to the marketplace
    public void addSeller(Seller seller) {
        sellers.add(seller);
    }

    // Updates a seller's name by their ID
    public void updateSeller(int sellerId, String name) {
        for (Seller seller : sellers) {
            if (seller.getSellerId() == sellerId) {
                seller.setName(name);
                break;
            }
        }
    }

    // Removes a seller from the marketplace by their ID
    public void removeSeller(int sellerId) {
        sellers.removeIf(seller -> seller.getSellerId() == sellerId);
    }

    // Displays complete marketplace information including all sellers and their products
    public void displayInfo() {
        System.out.println("Marketplace Name: " + name);

        System.out.println("Sellers:");
        for (Seller seller : sellers) {
            seller.displayInfo();

            System.out.println("Products:");
            for (Product product : seller.getProduct()) {
                product.displayInfo();
            }
            System.out.println("--------------------------");
        }
        System.out.println("");
    }
}