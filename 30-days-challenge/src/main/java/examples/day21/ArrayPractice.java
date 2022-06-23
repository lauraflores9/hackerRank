package examples.day21;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
    Example used in the tutorial: https://youtu.be/Z9uAwnz_wBA
 */

public class ArrayPractice {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        printArray(intArray2);
        System.out.println();

        Integer[] intArray3 = {1, 2, 3, 4, 5};

        String[] shoopingList = {"bananas", "apples", "pears"};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        // Print out arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));

        // Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();

        // Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 3));
        System.out.println();

        // Given functions
        Arrays.sort(intArray3);
        printArray(intArray3);
        System.out.println();

        // Print string array
        printArray(shoopingList);
        System.out.println();

        // Special for loop: foreach
        for (String s : shoopingList) {
            System.out.println(s);
        }
    }

}
