package HW2;

public class Main2 {
    public static void main(String[] args) {
        Case mycase = new Case();
       mycase.setManufacturer("mem");
        Motherboard myMotherboard = new Motherboard();
        Monitor myMonitor = new Monitor();

        Pc pc1 = new Pc(mycase,myMotherboard,myMonitor);
        pc1.description();
        pc1.powerUp();
    }
}
