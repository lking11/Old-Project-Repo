public class Truck extends Vehicle{
    private int capacity;
    private int numAxles;

    public Truck(String make, String model, int year, int numWheels) {
        super(make, model, year, numWheels);
    }
    public int getCapacity(){
        return this.capacity;
    }
    public int getNumAxles(){
        this.numAxles = getNumWheels()/2;
        return this.numAxles;
    }
    public int setCapacity(int newCapacity){
        this.capacity = newCapacity;
        return this.capacity;
    }

}
