public class Node {
    private Node prev;
    private int X;
    private int Y;

    public Node(int X, int Y) {
	this.X = X;
	this.Y = Y;
    }

    public void setPrev(Node n) {
	prev = n;
    }

    public Node getPrev() {
	return prev;
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
