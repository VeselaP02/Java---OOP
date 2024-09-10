package Exercise_Inheritance.needForSpeed;

public class Vehicle {
   private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
   private double fuel;
   private int horsePower;
   private double fuelConsumption;

   public Vehicle(double fuel, int horsePower) {
      this.fuel = fuel;
      this.horsePower = horsePower;
      this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
   }

   public void drive(double kilometers){
      double fuelNeed = kilometers * DEFAULT_FUEL_CONSUMPTION;
      if (this.fuel >= fuelNeed){
         fuel =- fuelNeed;
      }
   }

   public double getFuel() {
      return fuel;
   }

   public void setFuel(double fuel) {
      this.fuel = fuel;
   }

   public int getHorsePower() {
      return horsePower;
   }

   public void setHorsePower(int horsePower) {
      this.horsePower = horsePower;
   }

   public double getFuelConsumption() {
      return fuelConsumption;
   }

   public void setFuelConsumption(double fuelConsumption) {
      this.fuelConsumption = fuelConsumption;
   }
}