abstract class LivingBeing{
    abstract void feed();
}

class Plant extends LivingBeing{
    @Override
    void feed() {
        System.out.println("Doing photosynthesis");
    }
}

abstract class Animal extends LivingBeing{

}

class CarnivorousAnimal extends Animal{
    @Override
    void feed() {
        System.out.println("Yummy plant...");
    }
}

class HerbivorousAnimal extends Animal{
    @Override
    void feed() {
        System.out.println("Yummy meat...");
    }
}

public class Java37 {
    public static void main(String[] args) {
        LivingBeing plant = new Plant();
        plant.feed();

        LivingBeing carnivorousAnimal = new CarnivorousAnimal();
        carnivorousAnimal.feed();

        LivingBeing herbivorousAnimal = new HerbivorousAnimal();
        herbivorousAnimal.feed();
    }
}
