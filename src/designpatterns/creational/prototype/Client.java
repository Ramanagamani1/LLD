package designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.setName("mani");
        bird1.setColor("white");
        bird1.setWeight(12);

        Sparrow sparrow1 = new Sparrow();
        sparrow1.setColor("blue");
        sparrow1.setLegSize("hey");

        Crow crow1 = new Crow();
        crow1.setSound("koooo");
        crow1.setWeight(23);

        List<Bird> birds =  List.of(
                crow1,
                sparrow1,
                bird1
        );

        List<Bird> children = new ArrayList<>();

        for(Bird bird: birds) {
             children.add(bird.clone());
        }

        Sparrow longleggedSparrow = new Sparrow();
        longleggedSparrow.setLegSize("hundred");

        Crow sweetSoundCrow = new Crow();
        sweetSoundCrow.setSound("kooo");

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("sweetSoundCrow",sweetSoundCrow);
        birdRegistry.registerBird("longleggedSparrow",longleggedSparrow);

        List<String> getBirdOfTypes = List.of(
                "sweetSoundCrow",
                "longleggedSparrow",
                "sweetSoundCrow"
        );

        List<Bird> requestedBirds = new ArrayList<>();

        for(String type : getBirdOfTypes) {
            requestedBirds.add(birdRegistry.getBird(type));
        }

    }
}
