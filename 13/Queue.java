import java.util.*;
import java.io.*;

public class Queue {
    
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
