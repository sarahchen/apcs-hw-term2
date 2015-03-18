public class Node {

    private int data;
    private Node next;

    public Node() {
	data = 0;
    }

    public Node(int s) {
	data = s;
    }
    
    public void setData(int s) {
	data = s;
    }

    public int getData() {
	return data;
    }

    public void setNext(Node n) {
	next = n;
    }

    public Node getNext() {
	return next;
    }

    public int toString() {
	return data;
    }

    

}
