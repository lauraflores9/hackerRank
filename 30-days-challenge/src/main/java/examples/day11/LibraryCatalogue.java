package examples.day11;

/*
    Example used in the tutorial: https://youtu.be/ul0sdBqrivw
 */

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lenghtOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public LibraryCatalogue (Map<String, Book> collection) {
        this.bookCollection = collection;
    }

    public LibraryCatalogue (Map<String, Book> collection, int lenghtOfCheckoutPeriod,
                             double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lenghtOfCheckoutPeriod = lenghtOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;

    }

    // Getters
    public int getCurrentDay() {
        return this.currentDay;
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getLenghtOfCheckoutPeriod() {
        return this.lenghtOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    // Setters
    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        this.currentDay = day;
    }

    // Instance methods
    public void checkOut(String title) {
        Book book = getBook(title);
        if (book.getIsCheckOut()) sorryBookAlreadyCheckedOut(book);
        else {
            book.setIsCheckOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It's due on day " +
                    (getCurrentDay() + getLenghtOfCheckoutPeriod()) + ".");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckOut() + getLenghtOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library $" + (getInitialLateFee() + (daysLate * getFeePerLateDay())) +
                    "because your book is " + daysLate + " days overdue.");
        } else System.out.println("Book returned. Thank you.");
        book.setIsCheckOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + "is already checked out. " +
                "It should be back on day " + (book.getDayCheckOut() + getLenghtOfCheckoutPeriod()) + ".");
    }

    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book harry = new Book("Harry Potter", 827132, 99999999);
        bookCollection.put("Harry Potter", harry);

        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOut("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOut("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOut("Harry Potter");
    }

}
