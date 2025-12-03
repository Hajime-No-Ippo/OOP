package Market;

public class User{

    protected String name;
    private int uid;
    public int ages;
    public String email;

    public User(String name, int uid, int ages, String email){
        this.name = name;
        this.uid = uid;
        this.ages = ages;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return ages;
    }

    public int getUID(){
        return uid;
    }
}