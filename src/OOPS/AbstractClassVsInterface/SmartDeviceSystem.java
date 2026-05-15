package OOPS.AbstractClassVsInterface;

// Interface
interface SmartDevice {

    void start();

    void stop();
}

// Smart Fan Class
class SmartFan implements SmartDevice {

    @Override
    public void start() {
        System.out.println("Smart Fan is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Smart Fan is stopping...");
    }
}

// Smart Light Class
class SmartLight implements SmartDevice {

    @Override
    public void start() {
        System.out.println("Smart Light is turning ON...");
    }

    @Override
    public void stop() {
        System.out.println("Smart Light is turning OFF...");
    }
}

// Smart TV Class
class SmartTV implements SmartDevice {

    @Override
    public void start() {
        System.out.println("Smart TV is powering ON...");
    }

    @Override
    public void stop() {
        System.out.println("Smart TV is shutting DOWN...");
    }
}

// Main Class
public class SmartDeviceSystem {

    public static void main(String[] args) {

        SmartDevice fan = new SmartFan();
        fan.start();
        fan.stop();

        System.out.println();

        SmartDevice light = new SmartLight();
        light.start();
        light.stop();

        System.out.println();

        SmartDevice tv = new SmartTV();
        tv.start();
        tv.stop();
    }
}
