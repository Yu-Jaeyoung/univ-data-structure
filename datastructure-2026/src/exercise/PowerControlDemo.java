package exercise;

public class PowerControlDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        AirConditioner airConditioner = new AirConditioner();

        tv.turnOn();
        tv.turnOff();

        airConditioner.turnOn();
        airConditioner.turnOff();
    }
}

interface PowerControllable {
    void turnOn();

    void turnOff();
}

class TV implements PowerControllable {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}

class AirConditioner implements PowerControllable {
    @Override
    public void turnOn() {
        System.out.println("에어컨을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨을 끕니다.");
    }
}
