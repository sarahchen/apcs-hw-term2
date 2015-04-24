
public class Node {
    private int data;
    private int level;
    private Node left, right;

    public Node(int i) {
	data = i;
    }
    public Node(int data, int level) {
	this.data = data;
	this.level = level;
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
    public void setLevel(int l) {
	level = l;
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
    public int getLevel() {
	return level;
    }

}
