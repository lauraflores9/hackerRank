package examples.day13;

public class Dog extends Animal {

    public Dog() {
        super(15);
        System.out.println("A dog has been created.");
    }

    public void eat() {
        System.out.println("A dog is eating.");
    }

    public void sleep() {
        System.out.println("A dog is sleeping.");
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
