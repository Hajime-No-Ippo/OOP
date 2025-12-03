package Market;

public class Product{

    protected String name;
    private int uid;
    public int quantities;
    public double prices;
    private boolean available;
    private Categories category;

    public Product(String name, int uid, int quantities, double prices, boolean available, Categories category){
        this.name = name;
        this.uid = uid;
        this.quantities = quantities;
        this.prices = prices;
        this.available = available;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public int getQuantities(){
        return quantities;
    }

    public int getUID(){
        return uid;
    }

    public double getPrice(){
        return prices;
    }

    public void reduceQuantity(int amount) {
        this.quantities -= amount;
        checkAvailability();  // "sensor" that toggles available
    }

    public Categories getCategory(){
        return category;
    }

    private void checkAvailability(){
        this.available = (quantities > 0);
    }

    public void setName(String name){
        this.name = name;
    }

    public void printDetail(){
        System.out.println("Product Detail");
        System.out.println("Product Name: " + name);
        System.out.println("Product UID: " + uid);
        System.out.println("Product Quantities: " + quantities);
        System.out.println("Product availability: " + available);
        System.out.println("Product Categories: " + category);
    }
}