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

public class Java39 {
    void test(){
    Car2 Honda = new Car2("Honda",100);
    Honda.msg();
    Car2 Jeep = new Car2("Jeep", 500);
    Jeep.msg();
    Car2 BMW = new Car2("BMW", 800);
    BMW.msg();
    }
    public static void main(String[] args) {
        Java39 Java39 = new Java39();
        Java39.test();
    }


}
