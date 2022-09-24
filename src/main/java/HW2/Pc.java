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
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today " +
                myCase.getDimensions()+ " "+myCase.getManufacturer()+" "+myCase.getPowerSupply()
                +" "+ myMonitor + " " + myMotherboard);

    }
    public void powerUp(){
       myCase.pressPowerButton();
       drawLOgo();
       myMotherboard.loadProgram(" program name");

    }
}
