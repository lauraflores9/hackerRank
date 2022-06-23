package examples.day11;

/*
    Example used in the tutorial: https://youtu.be/ul0sdBqrivw
 */

public class Book {
    String title;
    int pageCount;
    int iSBN;
    boolean isCheckOut;
    int dayCheckOut = -1;

    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.iSBN = bookISBN;
        isCheckOut = false;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.iSBN;
    }

    public boolean getIsCheckOut() {
        return this.isCheckOut;
    }

    public int getDayCheckOut() {
        return this.dayCheckOut;
    }

    // Setters
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setPageCount(int newPageCount) {
        this.pageCount = newPageCount;
    }

    public void setISBN(int newISBN) {
        this.iSBN = newISBN;
    }

    public void setIsCheckOut(boolean newIsCheckOut, int currentDayCheckedOut) {
        this.isCheckOut = newIsCheckOut;
        setDayCheckOut(currentDayCheckedOut);
    }

    public void setDayCheckOut(int currentDayCheckedOut) {
        this.dayCheckOut = currentDayCheckedOut;
    }
}
