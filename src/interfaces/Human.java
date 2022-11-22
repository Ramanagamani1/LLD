package interfaces;

public class Human extends Mammal implements Omnivore , PlantEater{


    @Override
    public void eatAnimal() {
        System.out.println("Human eating a animal");
    }


    @Override
    public void eatPlant() {
        System.out.println("Human eating a plant");
    }
}
