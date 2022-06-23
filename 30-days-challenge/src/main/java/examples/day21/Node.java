package examples.day21;

/*
    Example used in tutorial: https://youtu.be/Z9uAwnz_wBA
 */

public class Node<D> {
    // Properties
    Node<D> next;
    D data;

    // Constructors
    public Node(D newData) {
        this.data = newData;
        next = null;
    }

    public Node(D newData, Node newNext) {
        this.data = newData;
        this.next = newNext;
    }

    // Getters and setters
    public D getData(){
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setData(D data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
