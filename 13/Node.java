public class Node {
    private Node prev;
    private int X;
    private int Y;
    
    //For Priority List
    private int prior;

    public Node(int X, int Y) {
	this.X = X;
	this.Y = Y;
    }
    public Node(int prior) {
	this.prior = prior;
    }
    public Node(int X, int Y, int prior) {
	this.X = X;
	this.Y = Y;
	this.prior = prior;
    }
    

    public void setPrior(int prior) {
	this.prior = prior;
    }

    public int getPrior() {
	return prior;
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
