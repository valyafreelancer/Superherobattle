package arena;

import factory.Factory;
import superhero.Superhero;

import java.util.Random;


public class RandomSuperheroesGenerator {
    final Random random = new Random();
    Factory FACTORY = new Factory();

    public Superhero next() {
        switch (random.nextInt(6)) {
            default:
            case 0:
                return FACTORY.createAquaMan();
            case 1:
                return FACTORY.createBatMan();
            case 2:
                return FACTORY.createHulk();
            case 3:
                return FACTORY.createSpiderMan();
            case 4:
                return FACTORY.createSuperMan();
            case 5:
                return FACTORY.createWolverine();

        }
    }

}
