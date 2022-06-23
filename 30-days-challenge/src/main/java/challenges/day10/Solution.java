package challenges.day10;

/*
    Task
        Given a base-10 integer, n, convert it to binary (base-2).
        Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
        When working with different bases, it is common to show the base as a subscript.

    Example
        The binary representation of 125 is 1111101.
        In base 10, there are 5 and 1 consecutive ones in two groups. Print the maximum, 5.
 */

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int sum = 0, max = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                sum++;
                if (sum > max) {
                    max = sum;
                }
            } else {
                sum = 0;
            }
            n = n / 2;
        }
        System.out.println(max);

        bufferedReader.close();
    }
}
