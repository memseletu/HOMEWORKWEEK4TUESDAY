package Hw1;

import Hw1.Product;

public class VehicleApp extends Product {
  public VehicleApp(String name) {
    super(name);
  }

  public static void printVehicleNamesAndPrices(Vehicle[] vehicle) {
    int x = 0;
    while (x < vehicle.length) {
      System.out.println(vehicle[x].getName() + vehicle[x].getPrice());
      x++;
    }
    //public static void getSpeedOfRideableObjects(Hw1.RideAble[] rideAbles){


    //}why is this not working??/
    }

}
