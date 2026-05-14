package OOPS.Abstraction;

interface Payment {

    void pay(double amount);
}

class JazzCashPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " done through JazzCash.");
    }
}

class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " done through Credit Card.");
    }
}

public class PaymentSystemExample {
    public static void main(String[] args) {

        Payment p1 = new JazzCashPayment();
        p1.pay(3000);

        Payment p2 = new CreditCardPayment();
        p2.pay(5000);
    }
}