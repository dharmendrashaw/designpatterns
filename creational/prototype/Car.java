package prototype;

public class Car implements Prototype {
    private int id;
    private String brand;
    private String model;
    private String colour;
    private String engine;

    public Car() {

    }

    public Car(Car another) {
        this.id = another.id;
        this.brand = another.brand;
        this.model = another.model;
        this.colour = another.colour;
        this.engine = another.engine;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getEngine() {
        return engine;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEngine(String engine) {
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
