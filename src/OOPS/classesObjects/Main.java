package OOPS.classesObjects;

// Real-World Object Modeling Example
// Food Delivery App - User System

class User {

    // Instance Variables (Object Initialization)
    String name;
    String email;
    String address;

    // Constructor
    User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // Methods
    void login() {
        System.out.println(name + " logged into the application.");
    }

    void placeOrder(String foodItem) {
        System.out.println(name + " ordered: " + foodItem);
    }

    void showProfile() {
        System.out.println("----- User Profile -----");
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        System.out.println("Address : " + address);
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating Objects
        User user1 = new User(
                "Raj Singh",
                "raj@gmail.com",
                "Hyderabad"
        );

        User user2 = new User(
                "Ali Khan",
                "ali@gmail.com",
                "Karachi"
        );

        // Method Calling
        user1.login();
        user1.placeOrder("Pizza");
        user1.showProfile();

        System.out.println();

        user2.login();
        user2.placeOrder("Burger");
        user2.showProfile();
    }
}
