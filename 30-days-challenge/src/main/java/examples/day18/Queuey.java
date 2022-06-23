package examples.day18;

/*
    Example used in tutorial: https://youtu.be/fOHLom4hZME
 */

import java.util.LinkedList;
import java.util.Stack;

public class Queuey {

    LinkedList queue;

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

    public void enqueue(String n){
        queue.addLast(n);
    }

    public String dequeue(){
        return (String) queue.remove(0);
    }

    public String peek(){
        return (String) queue.get(0);
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
        System.out.print(stacky.pop() + ".");
        System.out.println(stacky.size());

    }
}
