package examples.day25;

/*
    Example used in tutorial: https://youtu.be/7UwDamuC-kU
 */

import java.io.IOException;
import java.util.HashMap;

public class RunTimePractice {

    public static int findNumsOfRepetitionsv1(String s, char c){
        // Linear time: O(n) time
        int sum = 0;
        for (int i = 0; i < s.length(); i++) { // 1, n+1, n
            if (s.charAt(i) == c) sum++; // n*2
        }
        return sum; // 1
    }

    public static int[] findNumsOfRepetitionsv2(String s, char[] c){
        // Quad time: O(n*m) time
        int[] sums = new int[c.length];
        for (int i = 0; i < s.length(); i++) { // 1, n+1, n
            for (int j = 0; j < c.length; j++) { // n*m + 1, n*m
                if (s.charAt(i) == c[j]) sums[j] = sums[j] + 1; // n*m*2
            }
        }
        return sums; // 1
    }

    public static int[] findNumsOfRepetitionsv3(String s, char[] c){
        // Optimal time: O(n) time
        int[] sums = new int[c.length]; // 1
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) { // 1, n+1, n
            if (!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1); // n*m*2
            else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum + 1);
            }
        }

        for (int j = 0; j < c.length; j++) {
            if (!map.containsKey(c[j])) sums[j] = 0;
            else sums[j] = map.get(c[j]);
        }

        return sums; // 1
    }

    public static void main(String[] args) throws IOException {
        String stringToFind = "lfgafaAYAYaweyfaagyasdyutawodasgdagdrawd";
        char charToFind = 'a';
        char[] arrayCharToFind = {'a'};

        long startTime = System.currentTimeMillis();

        System.out.println(findNumsOfRepetitionsv1(stringToFind, charToFind));

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");

        startTime = System.currentTimeMillis();

        System.out.println(findNumsOfRepetitionsv2(stringToFind, arrayCharToFind));

        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");

        startTime = System.currentTimeMillis();

        System.out.println(findNumsOfRepetitionsv3(stringToFind, arrayCharToFind));

        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
    }
}
