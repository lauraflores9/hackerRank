package challenges.day13;

/*
    Task
        Given a Book class and a Solution class, write a MyBook class that does the following:
            - Inherits from Book
            - Has a parameterized constructor taking these  parameters:
                - string title
                - string author
                - int price
            - Implements the Book class' abstract display() method so it prints these 3 lines:
                - Title:, a space, and then the current instance's title.
                - Author,, a space, and then the current instance's author.
                - Price:, a space, and then the current instance's price.

        Note: Because these classes are being written in the same file, you must not use an access modifier (e.g.: )
        when declaring MyBook or your code will not execute.
 */

import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book {

    // Declare the price instance variable
    int price;

    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    // Write your constructor here
    MyBook (String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    // Extra methods
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    /**
     *   Method Name: display
     *
     *   Print the title, author, and price in the specified format.
     **/
    // Write your method here
    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }

// End class
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
