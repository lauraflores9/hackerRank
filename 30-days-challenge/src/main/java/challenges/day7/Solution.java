package challenges.day7;

/*
    Task
        Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        for (int i = n; i > 0; i--) {
            System.out.print(arr.get(i-1) + " ");
        }

        bufferedReader.close();
    }
}

