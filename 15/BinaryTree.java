
public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
	this.root = root;
    }

    public Node getRoot() {
	return root;
    }

    public Node search(int i) {
	Node T = root;
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

    public void insert(int i) {
	Node pointer = search(i);
	int d = pointer.getData();
	if(d < i) {
	    pointer.setRight(new Node(i));
	} else if(d > i) {
	    pointer.setLeft(new Node(i));
	}
    }

     /*
      DELETION METHOD:
      1. get a pointer, T, to the node to delete its and its parent, pointer T2,
         (same thing as a search)
      2. T is a leaf, point T2's left or right to null
      3. If T has 1 child, Point T2's left or right to T's child.
      4. If T has 2 children. find the largest in left subtree or smallest in
         right subtree (L). Copy L to T, delete T and delete L.
     */

    public void remove(int data) {
	Node T2 = search(data);
	Node T;	
	boolean isRight = T2.getData() < data;
	if(isRight) {
	    T = T2.getLeft();
	} else {
	    T = T2.getRight();
	}

	// LEAF
	boolean leaf = T.getRight() == null && T.getLeft() == null;
	boolean childR = T.getLeft() == null;
	boolean childL = T.getRight() == null;
	boolean children;

	if(leaf && isRight) {
	}
	
    }

    public int size(Node n) {
	if(n == null) {
	    return 0;
	} else {
	    return 1 + size(n.getLeft) + size(n.getRight);
	}
    }
    
    // Max Value
    public int maxValue() {
	Node t = root;
	Node t2;
	
	while(t != null) {
	    t2 = t;
	    t = t.getRight();
	}

	return t2;
    }

    // Height
    public int height(Node n) {
        if(n == null) {
	    return 0;
	} else {
	    if(height(n.getLeft()) > height(n.getRight())) {
		return 1 + height(n.getLeft());
	    } else {
		return 1 + height(n.getRight());
	    }
	}
    }

    // longest leaf to leaf path
    public int path() {
	return height(root.getLeft()) + 1 + height(root.getRight());
    }

    // split dupes
    public void splitDupes(Node n) {
	if(n.getData() == n.getLeft().getData()) {
	    Node q = new Node(n.getData() - 1);
	    q.setRight(n.getLeft());
	    n.setLeft(q);
	} else if (n.getData() == n.getRight().getData()) {
	    Node p = new Node(n.getData() - 1);
	    p.setRight(n.getRight());
	    n.setRight(p);
	}
    }

    public String t(Node cake) {
        if(cake == null) {
	    return "";
	} else {
	    return  t(cake.getLeft())+cake.getData()+", "+t(cake.getRight());
	}
    }
   
    public String toString() {
        String s = "";
	s = t(root);
	return s;
    }

}
