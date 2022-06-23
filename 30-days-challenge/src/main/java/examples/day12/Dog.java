package examples.day12;

public class Dog extends Animal {

    public Dog(int age) {
        super(age);
        System.out.println("A dog has been created.");
    }

    public void ruff() {
        System.out.println("A dog says ruff.");
    }

    public void run() {
        System.out.println("A dog is running.");
    }

    public static void main(String[] args) {

    }
}
