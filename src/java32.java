class car {
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

    public car(String name, int fuel, int maxspeed) {
        this.name = name;
        this.fuel = fuel;
        this.maxSpeed = maxspeed;
    }
}

public class java32 {
    void newCar() {
        car c1 = new car("Swift", 60, 120);
        c1.drive();
    }

    public static void main(String[] args) {
        java32 java32 = new java32();
        java32.newCar();
    }
}
