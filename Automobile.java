/**
 * Automobile.java
 *
 * A class that represents a single automobile
 * First attempt for class heirarchy, doesn't yet use inheritance
 * 
 * Original for Harvard Computer Science S-111
 * Modified by Ashley Hansberry
 */
public class Automobile extends Vehicle{
    private int numSeats;
    private boolean isSUV;
    
     
    /**
     * a constructor that takes the make, model, year, and number of wheels
     * 
     * XXX: We should add some additional error-checking
     */
    public Automobile(String make, String model, int year, int numWheels, int numSeats, boolean isSUV) {
        super(make,model, year,numWheels);
        this.numSeats = numSeats;
        this.isSUV = isSUV;
    }
    
    public Automobile(String make, String model, int year) {
        this(make, model, year, 5, false);
    }

    /*** basic accessors ***/
    public int getNumSeats() {
        return this.numSeats;
    }
    
    public boolean isSUV() {
        return this.isSUV;
    }

 
    /*** mutators ***/ 

    
    /*
     * Creates a string that can be used when printing
     * Vehicles.  This method overrides the toString() 
     * method inherited from the Object class.
     */
    public String toString() {
        String str = super.getMake() + " " + super.getModel();
        return str;
    }
}
