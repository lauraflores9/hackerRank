package examples.day2;

/*
    Example used in the tutorial: https://www.youtube.com/watch?v=uDwg5F_rW18&list=PLcLMSci1ZoPs6jV0O3LBJwChjRon3lE1F&index=4
*/

public class Car {

    // Instantiate variables
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

    // Constructor
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
        numberOfPeopleInCar++;
    }

    public void getOut() {
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpq;
    }

    public double maxMilesPerFillUp() {
        return maxFuel / mpq;
    }

    public static void main(String[] args){
        Car birthdayPresent = new Car(10, 300.9, true);
        System.out.println("Birthday car v1");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max miles: " + birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday car v2");
        birthdayPresent.printVariables();

        //System.out.println("Christmas car");
        //Car christmasPresent = new Car(550, 130.45, false);
        //christmasPresent.printVariables();


    }
}
