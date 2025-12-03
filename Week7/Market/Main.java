package Market;

public class Main {
    //Create Products
    Product p = new Product("Laptop", 1, 10, 999.99, true, Categories.Electronics);
    Product x = new Product("Walkers", 2, 5, 9.99, true, Categories.Food);
    //Register Sellers here
    Seller maksym = new Seller("Maksym",1,20,"MAKSYM.PARKHOMENKO.2026@mumail.ie" );
    Seller Eric = new Seller("Eric", 2, 20, "CHENMING.TAO.2026@mumail.ie");
    //Register Users here
    User mykyta = new User("Mykyta", 1, 20, "MYKYTA.HORBENKO.2026@mumail.ie");
}
