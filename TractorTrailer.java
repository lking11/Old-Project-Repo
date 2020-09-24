public class TractorTrailer extends Vehicle{
    private boolean isSleeper;

    public TractorTrailer(String trailorMake, String trailorModel, int trailorYear, int trailorNumWheels, int trailorMileage, String trailorPlateNumber, boolean trailorIsSleeper){
        super(trailorMake, trailorModel, trailorYear, trailorNumWheels, trailorMileage, trailorPlateNumber);
        this.isSleeper = trailorIsSleeper;


    }
    public TractorTrailer(String trailorMake, String trailorModel, int trailorYear, int trailorNumWheels, int trailorMileage, String trailorPlateNumber){
        super(trailorMake, trailorModel, trailorYear, trailorNumWheels, trailorMileage, trailorPlateNumber);
        this.isSleeper = false;

    }
    public boolean isSleeper() {
        return this.isSleeper;
    }
    public void setSleeper(boolean bool) {
        this.isSleeper = bool;
    }
    public int getNumAxles(){int numWheels = super.getNumWheels(); int numAxles = 1 + (numWheels - 2) / 4; return numAxles;}
    public String toString() {
        String str = super.getMake() + " " + super.getModel() + " " + getNumAxles() + " " + isSleeper();
        return str;
    }


}
