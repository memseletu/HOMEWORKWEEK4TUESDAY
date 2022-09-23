package HW2;

public class Case {
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
    public String pressPowerButton( String powerSupply){
        System.out.println("this is my power button");
        return "";
        //????? please ignore method above
    }
}
