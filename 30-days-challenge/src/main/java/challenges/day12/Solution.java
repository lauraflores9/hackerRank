package challenges.day12;

/*
    Task
        You are given two classes, Person and Student, where Person is the base class and Student is the derived class.
        Completed code for Person and a declaration for Student are provided for you in the editor.
        Observe that Student inherits all the properties of Person.

        Complete the Student class by writing the following:
            - A Student class constructor, which has  parameters:
                - A string, firstName.
                - A string, lastName.
                - An integer, idNumber.
                - An integer array (or vector) of test scores, scores.
            - A char calculate() method that calculates a Student object's average and returns the grade character
            representative of their calculated average:
                 Letter |   Average(a)
                --------------------------
                    0   | 90 <= a <= 100
                    E   | 80 <= a <= 90
                    A   | 70 <= a <= 80
                    P   | 55 <= a <= 70
                    D   | 40 <= a <= 55
                    T   |    a < 40
     Constraints
        - 1 <= length of firstName, length of lastName <= 10
        - length of idNumber = 7
        - 0 <= score <= 100
 */

import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    // Extra methods
    public int[] getTestScores() {
        return this.testScores;
    }

    public int getAverageScore() {
        int [] scores = getTestScores();
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int average = sum / scores.length;
        return average;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        int average = getAverageScore();
        char letter;
        if ((average >= 90) && (average <= 100)) letter = 'O';
        else if ((average >= 80) && (average <= 90)) letter = 'E';
        else if ((average >= 70) && (average <= 80)) letter = 'A';
        else if ((average >= 55) && (average <= 70)) letter = 'P';
        else if ((average >= 40) && (average <= 55)) letter = 'D';
        else letter = 'T';

        return letter;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
