
public class BinaryTree {
    private Node root;

    public BinaryTree() {
	
    }
    
    public Node search(Node T, int i) {
	Node T2 = new Node();
	while(T!=null) {
	    int c = T.getData().compareTo(i);
	    if(c > 0) {
		T2 = T;
		T = T.getRight();
	    }else if(c < 0) {
		T2 = T;
		T = T.getLeft();
	    } else {
		return T2;
	    }
	}
	return null;
    }

    public void insert(Node n) {
	
    }

}
