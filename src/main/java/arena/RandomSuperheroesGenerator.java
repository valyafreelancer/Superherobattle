package arena;

import superhero.*;

import java.util.Random;

public class RandomSuperheroesGenerator {
    final Random random = new Random();

    public Superhero next() {
        switch (random.nextInt(2)) {
            default:
            case 0:
                return new AquaMan();
            case 1:
                return new BatMan();
            case 2:
                return new Hulk();
            case 3:
                return new SpiderMan();
            case 4:
                return new SuperMan();
            case 5:
                return new Wolverine();

        }
    }
}
