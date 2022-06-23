package examples.day12;

/*
    Example used in tutorial: https://youtu.be/wlA66hZ4Z74
 */

public class Animal {

    public int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created.");
    }

    public void eat() {
        System.out.println("An animal is eating.");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Animal animal = new Animal(5);
        Dog d = new Dog(7);
        Cat c = new Cat(9);
        d.ruff();
        c.meow();
        animal.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();

        System.out.println("Dog age: " + d.getAge());

    }
}
