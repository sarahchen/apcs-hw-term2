import java.util.*;
import java.io.*;

public class Queue {
    /*
      OWN WRITTEN QUEUE
    private Node first; // Dummy Node (Stays in beginning)
    private Node last; // Keeps track of last Node

    public Queue() {
	first = new Node();
	last = first;
    }

    public boolean empty() {
	if(last == first) {
	    return true;
	}
	return false;
    }

    public void enqueue(Node n) {
	last.setNext(n);
	last = n;
    }

    public Node dequeue() {
	Node tmp = first.getNext();
	first.setNext(first.getNext().getNext());
	return tmp;
    }

    public String toString() {
	String s = "";
	Node yay = first;
	while(yay!=last) {
	    s = s + yay.getData() + ", ";
	    yay = yay.getNext();
	}
	s = s + last.getData();
	return s;
    }

    */

    // BUILT IN LINKED LIST

    public LinkedList<Node> l = new LinkedList<Node>();

    public void enqueue(Node n) {
	l.add(n);
    }
    
    public Node dequeue() {
	Node r = l.remove();
	return r;
    }

    public boolean empty() {
	return l.isEmpty();
    }

}
