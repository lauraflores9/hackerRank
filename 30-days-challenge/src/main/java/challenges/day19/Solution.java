package challenges.day19;

/*
    Task
        The AdvancedArithmetic interface and the method declaration for the abstract divisorSum(n) method are
        provided for you in the editor below.
        Complete the implementation of Calculator class, which implements the AdvancedArithmetic interface.
        The implementation for the divisorSum(n) method must return the sum of all divisors of n.

    Example
    The divisors of 25 are 1, 5, 25. Their sum is n.
 */

import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int acum = 0;
        for (int i = 1;i <= n; i++) {
            if (n % i == 0) acum += i;
        }
        return acum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}