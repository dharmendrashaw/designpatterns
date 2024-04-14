package builder;

public class Car {

    private int id;
    private String brand;
    private String model;
    private String colour;
    private String engine;
    
    Car(int id, String brand, String model, String colour, String engine) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.engine = engine;
    }

    public void printCar() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", colour=" + colour + ", engine=" + engine
                + "]";
    }

    
  
}
