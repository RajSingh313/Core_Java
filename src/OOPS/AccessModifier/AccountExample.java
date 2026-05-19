package OOPS.AccessModifier;



class BankAccount {

    // Private variable
    private double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}

public class AccountExample {
    public static void main(String[] args) {

        BankAccount user1 = new BankAccount(5000);

        user1.deposit(2000);
        user1.withdraw(1500);

        System.out.println("Current Balance: " + user1.getBalance());


    }
}