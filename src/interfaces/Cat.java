package interfaces;

public class Cat extends Mammal implements Carnivore{
    @Override
    public void eatAnimal() {
        System.out.println("cat is eating animal");
    }
}
