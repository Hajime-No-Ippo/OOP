

/**
 * Interface for items that can be rented.
 *
 * <p>Provides a default method for showing rental terms and a static
 * helper for displaying general information shared by all rentables.</p>
 */
public interface Adoptable{
    /**
     * Show rental terms to the console.
     *
     * <p>Default method so implementors may optionally override.</p>
     */
    default void showAdoptionTerms() {
        System.out.println("Please read and accept the adoption terms before proceeding.");
    }

    /**
     * Display general adoption information (static helper).
     */
    static void displayGeneralInfo() {
        System.out.println("All pets are subject to adoption terms and conditions.");
    }

    static int getAdoptableCount() {
        return Pet.getPetCount();
    }
    /**
     * Sound the horn or bell for the adoptable item.
     */
    void makeSound();
}
