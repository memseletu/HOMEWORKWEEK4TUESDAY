package Hw1;

public class Car extends Vehicle {


    public Car(String name, int qty, double price, float speed, Engine myEngine) {
        super(name, qty, price, speed, myEngine);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
      double  aftertaxprice= 0;
     // aftertaxprice = calcTax() + totalBeforeTax();
    }




//    public static void printVehicleNamesAndPrices(Hw1.Vehicle vehicle) {
//        System.out.println(name + price);
    //}







}
