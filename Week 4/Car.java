public class Car {

   // instance vars
   private double fuelEfficiency;
   private double fuel;
   
   // our contructor - takes in an efficiency value
   public Car(double efficiency) {
      fuelEfficiency = efficiency;
      fuel = 0;
   }
   
   // drive method - calculates fuel to be used, checks
   // if we still have fuel available and subtracts the
   // fuel to be used from fuel. otherwise, sets fuel to 0
   public void drive(double distance) {
      double fuelUsed = distance / fuelEfficiency;
      double endingFuel = fuel - fuelUsed;
      if (endingFuel > 0) {
         fuel = endingFuel;
      } else {
         fuel = 0;
      }
   }
   
   // gets gas level
   public double getGasLevel() {
      return fuel;
   }
   
   // adds gas when provided value to add
   public void addGas(double gasToAdd) {
      fuel += gasToAdd;
   }
   
   // gets fuel efficiency - didnt need but added anyways
   public double getFuelEfficiency() {
      return fuelEfficiency;
   }
   
   // sets fuel efficiency - didnt need but added anyways
   public void setFuelEfficiency(double efficiency) {
      fuelEfficiency = efficiency;
   }

}