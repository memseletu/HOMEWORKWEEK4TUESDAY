package Hw1;

import Hw1.Bike;
import Hw1.Car;
import Hw1.Horse;

public class Main {
    public static void main(String[] args) {
            Car car = new Car("mercedesb", 4, 1200, 80.0f, );
            Truck truck = new Truck("myTruck", 1, 20.00, 60.0f);
            Bike bike = new Bike("myBike", 6, 200.00, 10);
            Horse horse = new Horse("megan", 20, 50, 20.0f);
            RollerCoaster rollerCoaster = new RollerCoaster();
            Vehicle[] vehicles = {car, truck, bike, horse};
            RideAble[] rideAbles = {bike, horse, rollerCoaster};
            car.setName("moto");
            System.out.println(car.getName());
        }
    }
}
