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
        myMonitor.drawPixel(7,8,"blue");
        return "";
    }
    public String description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today " + myCase +" "+ myMonitor + " " + myMotherboard);
        return null;
    }
    public String powerUp(){
        //Pc.drawLOgo()+ myMotherboard.loadProgram(" program name");
        return "";
    }
}
