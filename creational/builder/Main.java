package builder;

public class Main {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder
                .id(1)
                .brand("TATA")
                .colour("BLACK")
                .engine("4V");

        Car car = carBuilder.build();

        car.printCar();
    }

}
