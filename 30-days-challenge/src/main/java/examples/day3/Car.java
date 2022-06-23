package examples.day3;

/*
    Example used in the tutorial: https://www.youtube.com/watch?v=07Yum5sXxT8&list=PLcLMSci1ZoPs6jV0O3LBJwChjRon3lE1F&index=5
*/

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpq = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 5;

    public Car() {}

    public Car(int customMinSpeed, double customWeight, boolean customIsTheCarOn) {
        minSpeed = customMinSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public void getIn() {
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) numberOfPeopleInCar++;
        else System.out.println("The car is full: " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
    }

    public void getOut() {
        if (numberOfPeopleInCar > 0) numberOfPeopleInCar--;
        else System.out.println("The car is empty");
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpq;
    }

    public double maxMilesPerFillUp() {
        return maxFuel / mpq;
    }

    public void turnTheCarOn() {
        if (!isTheCarOn) isTheCarOn = true;
        else System.out.println("The car is already on");
    }

    public static void main(String[] args){
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();
    }
}
