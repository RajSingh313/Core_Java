package OOPS.Inhertance;

// Parent Class
class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Child Class
class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest Earned: " + interest);
    }
}

// Another Child Class
class CurrentAccount extends BankAccount {

    double overdraftLimit;

    CurrentAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void showOverdraftLimit() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

// Main Class
public class BankingSystem {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("Raj Singh", 50000, 5);

        System.out.println("===== Savings Account =====");
        sa.displayAccountDetails();
        sa.calculateInterest();

        System.out.println();

        CurrentAccount ca = new CurrentAccount("Ali Khan", 100000, 25000);

        System.out.println("===== Current Account =====");
        ca.displayAccountDetails();
        ca.showOverdraftLimit();
    }
}
