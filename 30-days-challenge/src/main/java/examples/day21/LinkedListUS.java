package examples.day21;

/*
    Example used in tutorial: https://youtu.be/n9p5WK7AeY0
 */

import java.util.LinkedList;

public class LinkedListUS<D> {
    // Properties
    examples.day21.Node<D> head;
    int count;

    // Constructors
    public LinkedListUS() {
        this.head = null;
        this.count = 0;
    }

    public LinkedListUS(examples.day21.Node<D> newHead) {
        this.head = newHead;
        this.count = 0;
    }

    // add
    public void add(D newData) {
        examples.day21.Node<D> temp = new examples.day21.Node(newData);
        examples.day21.Node<D> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public D get(int index) {
        examples.day21.Node<D> current = head;
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
        examples.day21.Node<D> current = head;
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
