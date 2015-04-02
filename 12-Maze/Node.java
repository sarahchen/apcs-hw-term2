public class Node {
    private char data;
    private Node next = null;
    private int X;
    private int Y;

    public Node() {
    }
    public Node(char data) {
	this.data = data;
    }
    public Node(char data, Node next) {
	this.data = data;
	this.next = next;
    }

    public char getData(){
	return data;
    }

    public void setData(char data) {
	this.data = data;
    }

    public Node getNext() {
	return next;
    }

    public void setNext(Node n) {
	next = n;
    }

    public void setX(int X) {
        this.X = X;
    }
    public int getX() {
	return X;
    }

    public void setY(int Y) {
	this.Y = Y;
    }
    public int getY() {
	return Y;
    }
}
