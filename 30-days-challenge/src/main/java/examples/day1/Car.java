package examples.day1;

/*
    Example used in the tutorial: https://www.youtube.com/watch?v=XLCka0noTY4
*/

public class Car {

    // Properties
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';

    String nameOfCar = "Lucy";

    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public static void main(String[] args){
        Car familyCar = new Car();
        familyCar.printVariables();
        familyCar.wreckCar();
        familyCar.printVariables();
    }
}
