package challenges.day6;

/*
    Task
        Given a string, S, of length N that is indexed from 0 to N - 1, print its even-indexed and odd-indexed
        characters as 2 space-separated strings on a single line (see the Sample below for more detail).
        Note: 0 is considered to be an even index.

    Example
        s = adbecf
        Print abc def
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        for (int j = 0; j < n; j++){
            String s = scan.nextLine();
            char[] elemString = s.toCharArray();
            String even = "";
            String odd = "";
            for (int i = 0; i < elemString.length; i++) {
                if (i % 2 == 0) even += elemString[i];
                else odd += elemString[i];
            }
            System.out.println(even + " " + odd);
        }

        scan.close();
    }
}
