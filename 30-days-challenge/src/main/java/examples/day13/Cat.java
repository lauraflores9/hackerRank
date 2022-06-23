package examples.day13;

public class Cat extends Animal {

    public Cat() {
        super(6);
        System.out.println("A cat has been created.");
    }

    public void eat() {
        System.out.println("A cat is eating.");
    }

    public void sleep() {
        System.out.println("Acat is sleeping.");
    }

    public void meow() {
        System.out.println("A cat meows.");
    }

    public void prance() {
        System.out.println("A cat is prancing.");
    }

    public static void main(String[] args) {

    }
}
