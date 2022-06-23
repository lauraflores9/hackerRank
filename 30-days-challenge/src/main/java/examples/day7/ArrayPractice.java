package examples.day7;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
    Example used in the tutorial: https://youtu.be/TY58y58GPdY
 */

public class ArrayPractice {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            String item = array[i];
            System.out.print(item);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] intArray1;
        int[] intArray2 = new int[4];
        printArray(intArray2);
        System.out.println();

        int[] intArray3 = {1, 2, 3, 4, 5};

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