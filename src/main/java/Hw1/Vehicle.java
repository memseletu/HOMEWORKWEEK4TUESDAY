package Hw1;

public abstract class Vehicle extends Product {



    private int qty;
    private  double price;
    private final double tax =0.15;
    private float speed;
    private Engine myEngine;

    public Vehicle(String name) {
        super(name);
    }

    public Vehicle(String name, int qty, double price, float speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.speed = speed;
    }

    public Vehicle(String name, int qty, double price, float speed, Engine myEngine) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.speed = speed;
        this.myEngine = myEngine;

    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public  double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }


    public double totalBeforeTax(Vehicle vehicle){
      double total =0;
      total = price*qty;
        return total;
    }
    public double calcTax(Vehicle vehicle){
      double taxprice = 0;
       taxprice= price*qty*tax;
        return taxprice;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "qty=" + qty +
                ", tax=" + tax +
                ", speed=" + speed +
                ", myEngine=" + myEngine +
                '}';
    }

    public abstract void totalAfterTax(Vehicle vehicle);


    }





