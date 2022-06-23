package challenges.day14;

/*
    The absolute difference between two integers, a and b, is written as |a - b|.
    The maximum absolute difference between two integers in a set of positive integers, elements,
    is the largest absolute difference between any two integers in _elements.

    The Difference class is started for you in the editor. It has a private integer array (elements) for storing
    N non-negative integers, and a public integer (maximumDifference) for storing the maximum absolute difference.

    Task
        Complete the Difference class by writing the following:
            - A class constructor that takes an array of integers as a parameter and saves it to the
              _elements instance variable.
            - A computeDifference method that finds the maximum absolute difference between any 2 numbers in
             _elements and stores it in the maximumDifference instance variable.
 */

import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference (int[] elements) {
        this.elements = elements;
    }

    public int[] getElements() {
        return this.elements;
    }

    public void computeDifference() {
        int maxValue = 0;
        int[] elements = getElements();

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                if (i != j) {
                    int diff = Math.abs(elements[i] - elements[j]);
                    if (diff > maxValue) maxValue = diff;
                }
            }
        }
        maximumDifference = maxValue;
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
