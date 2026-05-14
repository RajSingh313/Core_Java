package OOPS.Abstraction;

abstract class Vehicle {

    abstract void start();

    abstract void stop();
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key ignition.");
    }

    @Override
    void stop() {
        System.out.println("Car stopped using brakes.");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with self-start button.");
    }

    @Override
    void stop() {
        System.out.println("Bike stopped using hand brake.");
    }
}

public class VichleExample {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        car.stop();

        System.out.println();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}
