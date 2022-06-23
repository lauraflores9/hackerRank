package challenges.day1;

import java.util.*;

/*
    Task
        Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. You must:
            1. Declare 3 variables: one of type int, one of type double, and one of type String.
            2. Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your 3 variables.
            3.Use the + operator to perform the following operations:
                · Print the sum of  plus your int variable on a new line.
                · Print the sum of  plus your double variable to a scale of one decimal place on a new line.
                · Concatenate  with the string you read as input and print the result on a new line.
 */

public class Result {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int j;
        double k;
        String l;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        j = scan.nextInt();
        k = scan.nextDouble();
        scan.nextLine();
        l = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + j);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + k);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + l);

        scan.close();
    }

}
