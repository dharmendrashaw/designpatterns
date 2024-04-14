package builder;

public class CarBuilder {
    private int id;
    private String brand;
    private String model;
    private String colour;
    private String engine;

    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder colour(String colour) {
        this.colour = colour;
        return this;
    }

    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public Car build() {
        return new Car(id, brand, model, colour, engine);
    }
    
}