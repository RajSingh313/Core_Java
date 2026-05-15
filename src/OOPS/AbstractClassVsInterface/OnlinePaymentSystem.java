package OOPS.AbstractClassVsInterface;

// Interface
interface PaymentMethod {

    void pay(double amount);
}

// JazzCash Class
class JazzCash implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " made using JazzCash.");
    }
}

// PayPal Class
class PayPal implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " made using PayPal.");
    }
}

// Credit Card Class
class CreditCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Credit Card.");
    }
}

// Main Class
public class OnlinePaymentSystem {

    public static void main(String[] args) {

        PaymentMethod jazzCash = new JazzCash();
        jazzCash.pay(5000);

        PaymentMethod paypal = new PayPal();
        paypal.pay(100);

        PaymentMethod creditCard = new CreditCard();
        creditCard.pay(12000);
    }
}