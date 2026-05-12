package OOPS.Inhertance.Overriding;

class Payment {

    void pay() {
        System.out.println("Processing generic payment");
    }
}

class CreditCardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

public class PaymentGatewaySystem {
    public static void main(String[] args) {

        CreditCardPayment p = new CreditCardPayment();
        p.pay();
    }
}
