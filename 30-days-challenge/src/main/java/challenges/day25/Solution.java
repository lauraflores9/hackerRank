package challenges.day25;

/*
    Task
        A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
        Given a number, n, determine and print whether it is Prime or Not prime.

        Note: If possible, try to come up with a O(√n) primality algorithm, or see what sort of optimizations you
        come up with for an O(√n) algorithm. Be sure to check out the Editorial after submitting your code.
 */

import java.util.*;

public class Solution {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if ((num % i) == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        for (int i = 1; i <= in; i++) {
            int num = sc.nextInt();
            if (isPrime(num)) System.out.println("Prime");
            else System.out.println("Not prime");
        }

        sc.close();
    }
}
