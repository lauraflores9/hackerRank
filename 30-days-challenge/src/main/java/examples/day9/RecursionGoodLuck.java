package examples.day9;

/*
    Example used in the tutorial: https://youtu.be/glENxqtJzAQ
 */

public class RecursionGoodLuck {

    public static int Summation(int n) {
        // Base case
        if(n <= 0) return 0;
        // Recursive case
        else return n + Summation(n-1);
    }

    public static int Factorial(int n) {
        // Base case
        if(n <= 1) return 1;
            // Recursive case
        else return n * Factorial(n-1);
    }

    public static int Exponentiation(int n, int p) {
        // Base case
        if(p <= 0) return 1;
            // Recursive case
        else return n * Exponentiation(n, p-1);
    }

    public static void main(String[] args) {
        System.out.println("Recursive summation: " + Summation(3));
        System.out.println("Recursive factorial: " + Factorial(4));
        System.out.println("Recursive exponentiation: " + Exponentiation(3, 3));
    }
}
