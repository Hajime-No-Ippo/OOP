//Chenming Tao 25251621, Maksym Parkhomenko 25259009
import java.util.ArrayList;

// Represents a seller in the marketplace with a unique ID and list of products
public class Seller implements Displayable{

    // Static counter to generate unique seller IDs
    private static int sellerId = 0;
    // Unique identifier for this seller
    private int id;
    // Name of the seller
    private String name;
    // List of products offered by this seller
    private ArrayList<Product> products;

    // Constructor to create a new seller with a name
    public Seller(String name) {
        id = ++sellerId;
        this.name = name;
        products = new ArrayList<Product>();
    }

    // Returns the seller's unique ID
    public int getSellerId() {
        return id;
    }

    // Returns the seller's name
    public String getName() {
        return name;
    }

    // Returns the list of products offered by this seller
    public ArrayList<Product> getProduct() {
        return products;
    }

    // Updates the seller's name
    public void setName(String name) {
        this.name = name;
    }

    // Adds a new product to the seller's inventory
    public void addProduct(Product product) {
        products.add(product);
    }

    // Updates the name of a product in this seller's inventory
    public void updateProduct(String name, String newName) {
        for (Product product : products) {
            if (product.getName() == name) {
                product.setName(newName);
                break;
            }
        }
    }

    // Updates the price of a product in this seller's inventory
    public void updateProduct(String name, double newPrice){
        for (Product product : products) {
            if (product.getName() == name) {
                product.setPrice(newPrice);
                break;
            }
        }
    }

    // Updates the category of a product in this seller's inventory
    public void updateProduct(String name, Category newCategory) {
        for (Product product : products) {
            if (product.getName() == name) {
                product.setCategory(newCategory);
                break;
            }
        }
    }

    // Removes a product by name from this seller's inventory
    public void removeProduct(String name) {
        products.removeIf(product -> product.getName() == name);
    }

    // Override the function in interface (Needed to anotate Override when using implement interfaces)
    // Displays the seller's information (ID and name)
    @Override
    public void displayInfo() {
        System.out.println("Seller ID: " + id);
        System.out.println("Seller Name: " + name);
        System.out.println("");
    }

}