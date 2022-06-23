package examples.day15;

/*
    Example used in tutorial: https://youtu.be/n9p5WK7AeY0
 */

public class Node {
    // Properties
    Node next;
    int data;

    // Constructors
    public Node(int newData) {
        this.data = newData;
        next = null;
    }

    public Node(int newData, Node newNext) {
        this.data = newData;
        this.next = newNext;
    }

    // Getters and setters
    public int getData(){
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
