package examples.day12;

public class Cat extends Animal {

    public Cat(int age) {
        super(age);
        System.out.println("A cat has been created.");
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
