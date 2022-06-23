package examples.day19;

/*
    Example used in tutorial: https://youtu.be/YTx_JRBkcD4
 */

import java.util.Random;

public class StarWarsInterfacePractice {

    public static Character summonCharacter() {
        Random rand = new Random();
        if (Math.abs(rand.nextInt()) % 2 == 0) return new Enemy();
        else return new Hero();
    }

    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero obiVanKenobi = new Hero();

        darthVader.attack();
        obiVanKenobi.attack();
        darthVader.heal();
        obiVanKenobi.heal();
        System.out.println("Enemy weapon: " + darthVader.getWeapon());
        System.out.println("Hero weapon: " + obiVanKenobi.getWeapon());

        Character spy = summonCharacter();
        spy.attack();
        spy.heal();

    }

}
