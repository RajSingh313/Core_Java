package OOPS.Inhertance;

// Parent Class
class Delivery {

    String trackingId;
    String destination;

    Delivery(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }

    void deliveryDetails() {
        System.out.println("Tracking ID: " + trackingId);
        System.out.println("Destination: " + destination);
    }
}

// Child Class
class ExpressDelivery extends Delivery {

    int deliveryHours;

    ExpressDelivery(String trackingId, String destination, int deliveryHours) {
        super(trackingId, destination);
        this.deliveryHours = deliveryHours;
    }

    void expressInfo() {
        System.out.println("Delivery Time: " + deliveryHours + " hours");
    }
}

// Another Child Class
class StandardDelivery extends Delivery {

    int deliveryDays;

    StandardDelivery(String trackingId, String destination, int deliveryDays) {
        super(trackingId, destination);
        this.deliveryDays = deliveryDays;
    }

    void standardInfo() {
        System.out.println("Delivery Time: " + deliveryDays + " days");
    }
}

// Main Class
public class EcommerceDeliverySystem {

    public static void main(String[] args) {

        ExpressDelivery express = new ExpressDelivery(
                "EXP12345",
                "Karachi",
                24
        );

        System.out.println("===== Express Delivery =====");
        express.deliveryDetails();
        express.expressInfo();

        System.out.println();

        StandardDelivery standard = new StandardDelivery(
                "STD56789",
                "Hyderabad",
                5
        );

        System.out.println("===== Standard Delivery =====");
        standard.deliveryDetails();
        standard.standardInfo();
    }
}