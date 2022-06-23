package examples.day20;

import static examples.day20.HairColor.*;

/*
    Example used in tutorial: https://youtu.be/1IAIu0Dbys8
 */
public class Person {

    HairColor hairColor = BLONDE;

    public Person () {
        int a = 5;
    }

    public static void main(String[] args) {
        // Aliases
        Person peterParker = new Person();
        Person spiderman = peterParker;

        spiderman.hairColor = PINK;

        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Spiderman: " + spiderman.hairColor);

    }
}
