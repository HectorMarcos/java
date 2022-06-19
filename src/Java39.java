class Car2 {
    String brand;
    int speed;

    public void msg(){
        System.out.println(brand+" car's speed is "+speed+"km/hr");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car2(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class HondaCar extends Car2 {
    private boolean isElectric;

    public HondaCar() {
        super("Honda", 100);
    }
}

class JeepCar extends Car2 {

    public JeepCar() {
        super("Jeep", 500);
    }
}

class BMWCar extends Car2 {

    public BMWCar() {
        super("BMW", 800);
    }
}

public class Java39 {
    void test(){
    Car2 honda = new HondaCar();
        honda.msg();
    Car2 jeep = new JeepCar();
        jeep.msg();
    Car2 bmw = new BMWCar();
        bmw.msg();
    }
    public static void main(String[] args) {
        Java39 Java39 = new Java39();
        Java39.test();
    }


}
