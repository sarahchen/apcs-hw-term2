
public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
	this.root = root;
    }

    public Node getRoot() {
	return root;
    }

    public Node search(Node T, int i) {
	Node T2 = null;
	int c;
	while(T!=null) {
	    c = T.getData();
	    T2 = T;
	    if(c < i) {
		T = T.getRight();
	    }else if(c > i) {
		T = T.getLeft();
	    } else {
	        break;
	    }
	}
	return T2;
    }

    public void insert(Node T, int i) {
	Node pointer = search(T, i);
	int d = pointer.getData();
	int l = pointer.getLevel();
	if(d < i) {
	    pointer.setRight(new Node(i, l+1));
	} else if(d > i) {
	    pointer.setLeft(new Node(i, l+1));
	}
    }

    /*
    public String toString() {
	String s = "";
    }
    */

}
