package examples.day15;

/*
    Example used in tutorial: https://youtu.be/n9p5WK7AeY0
 */

import java.util.LinkedList;

public class LinkedListUS {
    // Properties
    Node head;
    int count;

    // Constructors
    public LinkedListUS() {
        this.head = null;
        this.count = 0;
    }

    public LinkedListUS(Node newHead) {
        this.head = newHead;
        this.count = 0;
    }

    // add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public int get(int index) {
        if (index <= 0){
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // size
    public int size() {
        return count;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // remove from the back
    public void remove() {
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Alice");
        System.out.println(linkedList);
        linkedList.add("Mery");
        System.out.println(linkedList);
    }
}
