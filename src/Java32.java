class Car {
    private String name;
    private int fuel;
    private int maxSpeed;

    public void drive() {
        System.out.println(name + " Fuel: " + fuel + " Speed: " + maxSpeed);
    }

    public String getName() {
        return name;
    }

    public void setFuel(String name) {
        this.name = name;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(String name, int fuel, int maxspeed) {
        this.name = name;
        this.fuel = fuel;
        this.maxSpeed = maxspeed;
    }
}

public class Java32 {
    void newCar() {
        Car c1 = new Car("Swift", 60, 120);
        c1.drive();
    }

    public static void main(String[] args) {
        Java32 java32 = new Java32();
        java32.newCar();
    }
}
