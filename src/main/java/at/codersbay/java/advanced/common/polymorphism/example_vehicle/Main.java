package at.codersbay.java.advanced.common.polymorphism.example_vehicle;

public class Main {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.honk();;

        Car car = new Car();
        car.honk();;

        Truck truck = new Truck();
        truck.honk();
    }
}
