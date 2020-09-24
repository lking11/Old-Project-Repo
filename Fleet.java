import java.util.GregorianCalendar;

public class Fleet {
 private Vehicle[] fleet;
 private int num;

 public Fleet(int x){
     this.fleet = new Vehicle[x];
     this.num = 0;
 }

 public void addVehicle(Vehicle currentVehicle){
     fleet[this.num] = currentVehicle;
     this.num += 1;
     if (this.num == fleet.length){fleet[this.num - 1] = currentVehicle; this.num += 1;}
     if (currentVehicle.getMake() == "null"){fleet[this.num - 1] = currentVehicle; this.num += 1;}
 }
 public void printFleet(){
     for (int i = 0; i <= fleet.length; i ++){
         Vehicle current = fleet[i];
         System.out.println(current);
     }
 }
 public int averageMileage(){
     int total = 0;
     for (int i = 0; i <= fleet.length; i ++){
         total += fleet[i].getMileage();
     }
     int average = total / fleet.length;
     return average;
 }
 public int averageAge(){
     int year = (new GregorianCalendar()).get(GregorianCalendar.YEAR);
     int ageTotal = 0;
     for (int i = 0; i <= fleet.length; i ++){
         ageTotal += year - fleet[i].getYear();
     }
     int averageAge = ageTotal / fleet.length;
     return averageAge;
 }
 public String toString() {
     String str2 = (fleet.length - 1).toString();

    }
}
