package examples.day16;

/*
    Example used in tutorial: https://youtu.be/2foOQ1Uxb6s
 */

public class ExceptionsPractice {

    public static void main(String args[]) {
        //int[] intArray = new int[10];
        //System.out.println(intArray[10]);

        System.out.println("First try-catch");
        try {
            int[] c = new int[5];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown " + e);
        } finally {
            System.out.println("Finally finished first try-catch");
        }

        System.out.println("");
        System.out.println("Second try-catch");
        try {
            int[] c2 = new int[6];
            System.out.println("Element 6 at index 5 = " + c2[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown " + e);
        } finally {
            System.out.println("Finally finished second try-catch");
        }
    }

}
