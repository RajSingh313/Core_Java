package OOPS.Abstraction;


abstract class BankAccount{
    protected double balance;

    public BankAccount(double price){
        this.balance =price;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    public void showBalance(){
        System.out.println("Current Balance: " + balance);
    }
}

class savingAccount extends BankAccount{
    public savingAccount(double price){
        super(price);
    }

    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposit successfully: " + balance);

    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount){
            balance = balance - amount;
            System.out.println(amount +  "Amount withdrawn successfully: ");
        }
 else{
     System.out.println("Insufficient balance");
        }
    }
}
public class BankAccountExample {

    public static void main(String[] args) {
        savingAccount sa = new savingAccount(100000);
        sa.showBalance();
        sa.deposit(15000);
        sa.showBalance();
        sa.withdraw(10000);
        sa.showBalance();
    }

}
