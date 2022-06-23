package examples.day21;

/*
    Example used in the tutorial: https://youtu.be/Z9uAwnz_wBA
 */

import java.util.LinkedList;
import java.util.Stack;

public class Queuey<D> {

    LinkedList<D> queue;

    // Constructor
    public Queuey() {
        queue = new LinkedList();
    }

    // Methods
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

    public void enqueue(D n){
        queue.addLast(n);
    }

    public D dequeue(){
        return queue.remove(0);
    }

    public D peek(){
        return queue.get(0);
    }

    public static void main(String args[]) {
        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("hi");
        stringQueue.enqueue("there");
        System.out.println("Queue: ");
        System.out.print(stringQueue.dequeue() + " ");
        System.out.println(stringQueue.peek() + ".");

        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.println("Stack: ");
        System.out.print(stacky.pop() + " ");
        System.out.println(stacky.pop() + ".");
        System.out.println("Size: " + stacky.size());

    }
}
