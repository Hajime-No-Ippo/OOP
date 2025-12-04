//Chenming Tao 25251621, Maksym Parkhomenko 25259009

// Represents a product sold in the marketplace with a unique ID, price, and category
public class Product implements Displayable{

    // Static counter to generate unique product IDs
    private static int productId = 0;
    // Unique identifier for this product
    private int id;
    // Name/title of the product
    private String name;
    // Price of the product
    private double price;
    // Category this product belongs to
    private Category category;

    // Constructor to create a new product with name, price, and category
    public Product(String name, double price, Category category) {
        id = ++productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Returns the product's unique ID
    public int getProductId() {
        return id;
    }

    // Returns the product's name
    public String getName() {
        return name;
    }

    // Returns the product's price
    public double getPrice() {
        return price;
    }

    // Returns the product's category
    public Category getCategory() {
        return category;
    }

    // Updates the product's name
    public void setName(String name) {
        this.name = name;
    }

    // Updates the product's price
    public void setPrice(double price) {
        this.price = price;
    }

    // Updates the product's category
    public void setCategory(Category category) {
        this.category = category;
    }

    // Override the function in interface (Needed to anotate Override when using implement interfaces)
    // Displays the product's information (ID, name, price, and category)
    @Override
    public void displayInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("");
    }
}