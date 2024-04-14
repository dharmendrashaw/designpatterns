package prototype;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("MAHINDRA");
        car.setColour("WHITE");
        car.setId(123);

        car.printCar();

        Car clonedCar = car.clone();
        clonedCar.printCar();
    }

    
}
