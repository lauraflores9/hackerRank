package examples.day24;

/*
    Example used in tutorial: https://youtu.be/7ApgDTFxodE
 */

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hangman! I will pick a word and you will try to guess it character by character.\n" +
                "If you guess wrong 6 times, then I won. If you can guess before them, then you win.\n" +
                "Are you ready? I hope so because I am");
        System.out.println();
        System.out.println("I have picked my word. Bellow is a picture, and below that is your current guest, " +
                "which starts off as nothing.\nEvery time you guess incorrectly. I add a body part to the picture. " +
                "When there is a full person, you lose.");

        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            System.out.println("Let's play!");
            Hangman game = new Hangman();

            do {
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
                System.out.println(game.drawPicture());

                System.out.println("Enter a character that you think is in the word");
                char guess =  (sc.next().toLowerCase()).charAt(0);
                System.out.println();

                while (game.isGuessedAlready(guess)) {
                    System.out.println("Try again! You've already guessed that character");
                    guess =  (sc.next().toLowerCase()).charAt(0);
                }

                if (game.playGuess(guess)) System.out.println("Great job! That character is in the word");
                else System.out.println("Unfortunately that character isn't in the word");

            } while (!game.gameOver());

            System.out.println();
            System.out.println("Do you want to play another game? Enter Y if you do.");
            Character response = (sc.next().toUpperCase().charAt(0));
            doYouWantToPlay = (response == 'Y');

        }
    }
}
