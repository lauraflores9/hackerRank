package examples.day4;

/*
    Example used in the tutorial: https://youtu.be/Zj5eD0a6sm4
*/

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play() {
        int move = scanner.nextInt();
        if (move > theNumber) System.out.println("Your number is too big");
        else if (move < theNumber) System.out.println("Your number is too small");
        else System.out.println("You got it");
    }

    public static void howBigIsMyNumber(int x) {
        if (x > 0 && x < 10) System.out.println("Our number is pretty small");
        else if (x >= 11 && x <= 100) System.out.println("Our number is pretty big");
        else System.out.println("Our number is out of range");
    }

    public static void main(String[] args){
        GuessTheNumber guessNumber = new GuessTheNumber();
        System.out.println("Welcome. Try and guess the number. It's between 0 and "
        + guessNumber.max + ". Just type a name to get started.");
        guessNumber.play();

    }
}
