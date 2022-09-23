package HW2;

public class Pc {
    private Case myCase;
    private Motherboard myMotherboard;
    private Monitor myMonitor;

    public Pc(Case myCase, Motherboard myMotherboard, Monitor myMonitor) {
        this.myCase = myCase;
        this.myMotherboard = myMotherboard;
        this.myMonitor = myMonitor;
    }
    private String  drawLOgo(){
        return "";
    }
    public String description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today ");
        return null;
    }
}
