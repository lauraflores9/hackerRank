package challenges.day26;

/*
    Task
        Your local library needs your help! Given the expected and actual return dates for a library book, create a
        program that calculates the fine (if any). The fee structure is as follows:
            1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0).
            2. If the book is returned after the expected return day but still within the same calendar month and year
                as the expected return date, fine = 15 Hackos x (the number of days late).
            3. If the book is returned after the expected return month but still within the same calendar year as the
                expected return date, the fine = 500 Hackos x (the number of months late).
            4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of
                10000 Hackos.
 */

import java.util.*;

public class Solution {

    public static int genFine(int dayReturn, int monthReturn, int yearReturn, int dayDue, int monthDue, int yearDue) {
        int fine = 0;

        if (yearReturn > yearDue) fine = 10000;
        else if (yearReturn == yearDue) {
            if (monthReturn > monthDue) fine = 500 * (monthReturn - monthDue);
            else if ((monthReturn == monthDue) && (dayReturn > dayDue)) fine = 15 * (dayReturn - dayDue);
        }

        return fine;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int dayReturn = in.nextInt();
        int monthReturn = in.nextInt();
        int yearReturn = in.nextInt();

        int dayDue = in.nextInt();
        int monthDue = in.nextInt();
        int yearDue = in.nextInt();

        int fine = genFine(dayReturn, monthReturn, yearReturn, dayDue, monthDue, yearDue);

        System.out.println(fine);

    }
}

