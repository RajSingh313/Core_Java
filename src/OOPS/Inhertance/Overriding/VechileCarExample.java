package OOPS.Inhertance.Overriding;

class Vehicle {

    void speed() {
        System.out.println("Vehicle runs at normal speed");
    }
}

class Car extends Vehicle {

    @Override
    void speed() {
        System.out.println("Car runs at 120 km/h");
    }
}

public class VechileCarExample {
    public static void main(String[] args) {

        Car c = new Car();
        c.speed();
    }
}
