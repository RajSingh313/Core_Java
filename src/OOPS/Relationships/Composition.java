package OOPS.Relationships;

//Composition is a strong HAS-A relationship.
//Engine cannot exist without Car.
// Engine.java
class Engine {

    void startEngine() {
        System.out.println("Engine Started");
    }
}

// Car.java
class Car {

    private Engine engine;

    Car() {
        // Engine created inside Car
        engine = new Engine();
    }

    void startCar() {
        System.out.println("Car Starting...");
        engine.startEngine();
    }
}

// Main.java
public class Composition {
    public static void main(String[] args) {

        Car car = new Car();
        car.startCar();
    }
}


