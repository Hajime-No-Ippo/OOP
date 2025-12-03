package Market;

public class Seller{

    protected String name;
    private int sellerId;
    public int ages;
    public String email;

    public Seller(String name, int sellerId, int ages, String email){
        this.name = name;
        this.sellerId = sellerId;
        this.ages = ages;
        this.email = email;
    }

    public String getName(){
        return name;
    }


    public int getAge(){
        return ages;
    }

    public void printDetail(){
        System.out.println("Seller Detail");
        System.out.println("Seller Name: " + name);
        System.out.println("SellerID: " + sellerId);
        System.out.println("Seller Ages: " + ages);
        System.out.println("Seller Email: " + email);
    }
}