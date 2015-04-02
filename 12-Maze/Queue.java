
public class Queue {
    private Node first; // Dummy Node (Stays in beginning)
    private Node last; // Keeps track of last Node

    public Queue() {
	first = new Node();
	last = first;
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
	Node<E> yay = first;
	while(yay!=last) {
	    s = s + yay.getData() + ", ";
	    yay = yay.getNext();
	}
	s = s + last.getData();
	return s;
    }

    /* FOR TESTING
    public static void main(String[] args) {
	Queue<Integer> q = new Queue<Integer>();
	for(int i=0; i<10; i++) {
	    q.enqueue(i);
	}
	System.out.println(q);
	for(int i=0;i<3;i++) {
	    q.dequeue();
	}
	System.out.println(q);
	q.enqueue(34);
	System.out.println(q);
	
    }
    */

}
