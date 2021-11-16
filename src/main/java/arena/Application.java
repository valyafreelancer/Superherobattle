package arena;

import superhero.Superhero;

public class Application {
    final static RandomSuperheroesGenerator gen = new RandomSuperheroesGenerator();

    public static void main(String[] args) {
        Superhero[] superheroes = new Superhero[6];
        int i;
        for (i = 0; i < superheroes.length; i++)
            superheroes[i] = gen.next();
        System.out.println("Супергерой " + superheroes);


    }

}