package keyword_4;

public interface Rentable {
    default void showRentalTerm(){
        System.out.println("Standard rental terms apply.");
    }
    
    static void displayWelcomeMessage(){
        System.out.println("Welcome to the Rentable Vehicle Service!");
    }

    void beepHorn();
}
