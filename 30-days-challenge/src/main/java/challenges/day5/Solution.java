package challenges.day5;

/*
    Task
        Given an integer, n, print its first 10 multiples.
        Each multiple n x i (where 1 <= i <= 10) should be printed on a new line in the form: n x i = result.
 */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i ++) {
            int multiplo = n * i;
            System.out.println(n + " x " + i + " = " + multiplo);
        }

        bufferedReader.close();
    }
}

