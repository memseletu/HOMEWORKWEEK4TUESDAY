package Hw1;

import Hw1.Bike;
import Hw1.Car;
import Hw1.Horse;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(4);
        Car car = new Car("mercedesb", 4, 1200, 80.0f, engine);
        Truck truck = new Truck("myTruck", 1, 20.00, 60.0f, engine);
        Bike bike = new Bike("myBike", 6, 200.00, 10);
        Horse horse = new Horse("meced", 20, 50, 20.0f);
        RollerCoaster rollerCoaster = new RollerCoaster();
        Vehicle[] vehicles = {car, truck,bike,horse};
        RideAble[] rideAbles = {bike, horse, rollerCoaster};
        //System.out.println(car.getName());

            VehicleApp.printVehicleNamesAndPrices(vehicles);
            VehicleApp.getSpeedOfRideableObjects(rideAbles);
        }

    }


