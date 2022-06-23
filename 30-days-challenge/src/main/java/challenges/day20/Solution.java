package challenges.day20;

/*
    Task
    Given an array, a, of size n distinct elements, sort the array in ascending order using the Bubble Sort algorithm
    above. Once sorted, print the following 3 lines:
        - Array is sorted in numSwaps swaps.
            where numSwaps is the number of swaps that took place.
        - First Element: firstElement
            where firstElement is the first element in the sorted array.
        - Last Element: lastElement
            where lastElement is the last element in the sorted array.

    Hint: To complete this challenge, you will need to add a variable that keeps a running tally of all swaps that
     occur during execution.
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Write your code here
        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a.get(j) > a.get(j+1)) {
                    int aux = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1,aux);
                    numSwaps++;
                }
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n-1));

        bufferedReader.close();
    }
}

