package examples.day5;
/*
       Example used in the tutorial: https://youtu.be/U5WTpk6BX9U
 */
public class LoopPractice {

    public static void practiceWhileLoop() {
        int x = 0;
        while (x < 5) {
            System.out.println("The value of x is " + x);
            x++;
        }
    }

    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println("The value of x is " + x);
            x++;
        } while (x < 10);
    }

    public static void practiceForLoop() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.println("(" + x + ", " + y + ")");
            }
        }
        System.out.println("This is the end!");
    }

    public static void main(String[] args) {
        System.out.println("While loop");
        practiceWhileLoop();

        System.out.println("DoWhile loop");
        practiceDoWhileLoop();

        System.out.println("For loop");
        practiceForLoop();
    }
}
