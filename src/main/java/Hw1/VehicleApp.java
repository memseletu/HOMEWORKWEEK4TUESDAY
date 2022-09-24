package Hw1;

import Hw1.Product;

public class VehicleApp {
  public VehicleApp() {
  }

//  public static void printVehicleNamesAndPrices(Vehicle[] vehicle) {
//    int x = 0;
//    while (x < vehicle.length) {
//      System.out.println(vehicle[x].getName() + vehicle[x].getPrice());
//      x++;
//    }
    public static void printVehicleNamesAndPrices(Vehicle[] vehicles) {
    for(int x=0; x< vehicles.length; x++){
      System.out.println(vehicles[x].getName()+ " "+ vehicles[x].getPrice());
    }


  }
    public static void getSpeedOfRideableObjects(RideAble[] rideAbles){
      for(int x=0; x<rideAbles.length; x++){
          System.out.println(rideAbles[x].milesPerHour());
      }
    }
}
