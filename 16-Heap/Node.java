
public class Node {
    private int data;
    private Node left, right;

    public Node(int i) {
	data = i;
	left = null;
	right = null;
    }

    public void setData(int i) {
	data = i;
    }
    public void setLeft(Node left) {
	this.left = left;
    }
    public void setRight(Node right) {
	this.right = right;
    }
    
    public int getData() {
	return data;
    }
    public Node getLeft() {
	return left;
    }
    public Node getRight() {
	return right;
    }

}
