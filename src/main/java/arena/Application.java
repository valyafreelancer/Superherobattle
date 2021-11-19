package arena;

import superhero.Superhero;

import java.util.Random;

public class Application {
    final static RandomSuperheroesGenerator GEN = new RandomSuperheroesGenerator();
    public final Random RANDOM = new Random();

    public static void main(String[] args) {
        Superhero[] superheroes = new Superhero[6];
        for (int i = 0; i < superheroes.length; i++)
            superheroes[i] = GEN.next();

    }

    public void battle(Superhero superhero1, Superhero superhero2) {
        if (superhero1.equals(superhero2)) {
            throw new IllegalArgumentException("Супергерой не может сражаться сам с собой!!!");
        }
        superhero1.useSuperPower();
        superhero1.useSuperPower();
        if (RANDOM.nextInt())

    }

    public static void airBattle() {


    }
}