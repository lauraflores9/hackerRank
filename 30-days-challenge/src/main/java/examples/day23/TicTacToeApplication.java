package examples.day23;

/*
    Example used in tutorial: https://youtu.be/edg25CkMtOc
 */

import java.util.Scanner;

public class TicTacToeApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean doYouWantToPlay = true;

        while (doYouWantToPlay) {
            System.out.println("Welcome to TicTacToe. First, pick what character you want to be and which character" +
                    " I will be");
            System.out.println();
            System.out.println("Enter a single character that will represent you on the board");
            char playerToken = sc.next().charAt(0);
            System.out.println("Enter a single character that will represent me on the board");
            char opponentToken = sc.next().charAt(0);

            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            System.out.println();
            System.out.println("Now we can start the game. To play, enter a number and your token shall be put" +
                    "in its place. \nThe numbers go from 1-9, left to right.");
            TicTacToe.printIndexBoard();
            System.out.println();

            while (game.gameOver().equals("Not Over")) {
                if (game.currentMarker == game.userMarker) {
                    System.out.println("It's your turn. Enter a spot for your token");
                    int spot = sc.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println("Try again. " + spot + "is invalid. It is taken or out of range.");
                        spot = sc.nextInt();
                    }
                    System.out.println("You picked " + spot + ".");
                } else {
                    System.out.println("It's my turn.");
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + ".");
                }
                System.out.println();
                game.printBoard();
            }

            System.out.println(game.gameOver());
            System.out.println();
            System.out.println("Do you want to play again? Enter Y if you do");
            char response = sc.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println();
            System.out.println();
        }
    }
}
