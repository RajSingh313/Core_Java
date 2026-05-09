package OOPS.Constructor;

class BankSystem {

    String accountHolder;
    double balance;

    // Private Constructor
    private BankSystem() {
        System.out.println("Private Constructor Called");
    }

    // Constructor with one parameter
    BankSystem(String accountHolder) {
        this.accountHolder = accountHolder;
        balance = 0;
    }

    // Constructor with two parameters
    BankSystem(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        // Constructor Overloading
        BankSystem b1 = new BankSystem("Raj");

        BankSystem b2 = new BankSystem("Ahmed", 50000);

        System.out.println("First Account:");
        b1.display();

        System.out.println("\nSecond Account:");
        b2.display();
    }
}
