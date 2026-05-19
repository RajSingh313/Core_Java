package OOPS.AccessModifier;


class Animal {

    // Protected variable
    protected String name = "Dog";

    // Method
    protected void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class PetDog extends Animal {

    public void display() {

        // Accessing protected variable from parent class
        System.out.println("Animal Name: " + name);

        // Accessing protected method
        sound();

        System.out.println("PetDog inherited protected members successfully.");
    }
}

public class AnimalExample {
    public static void main(String[] args) {

        PetDog obj = new PetDog();

        obj.display();
    }
}
