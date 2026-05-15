package OOPS.AbstractClassVsInterface;

// Abstract Class
abstract class Animal {

    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Concrete Method
    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Abstract Method
    abstract void sound();
}

// Dog Class
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Cat Class
class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Main Class
public class AnimalManagementSystem {

    public static void main(String[] args) {

        Animal dog = new Dog("Buddy");
        dog.eat();
        dog.sleep();
        dog.sound();

        System.out.println();

        Animal cat = new Cat("Kitty");
        cat.eat();
        cat.sleep();
        cat.sound();
    }
}
