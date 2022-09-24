package HW2;

public class Monitor {
  private Resolution myresolution;
  private String model;
  private String manufacturer;
    public void drawPixel(int x,int y,String color){
        System.out.println("Drawing pixel at " + x +" "+ y + " "+ "in color "+ color);

    }
}
