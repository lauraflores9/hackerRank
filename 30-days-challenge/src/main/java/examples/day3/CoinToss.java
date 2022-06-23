package examples.day3;

import java.util.Random;

/*
    Example used in the tutorial: https://www.youtube.com/watch?v=07Yum5sXxT8&list=PLcLMSci1ZoPs6jV0O3LBJwChjRon3lE1F&index=5
*/

public class CoinToss {

    public String tossACoins() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 0) return "HEADS";
        else return "TAILS";
    }

    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoins());
        System.out.println(game.tossACoins());
        System.out.println(game.tossACoins());
        System.out.println(game.tossACoins());
        System.out.println(game.tossACoins());
        System.out.println(game.tossACoins());
        System.out.println(game.tossACoins());
    }

}
