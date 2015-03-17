public class LList {
    private Node l=null;

    public String toString() {
	String s = "";
	Node tmp;
	for(tmp = l;tmp != null; tmp=tmp.getNext()) {
	    s = s + tmp + " ---> ";
	}
	s = s + "null";
	return s;
    }

    // Adds a node to the beginning of the list
    public void add(String s) {
        Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    // returns the data of the Node at index n
    public String find(int n) {
        Node lychee = l;
	for(int i=0;i<n;i++) {
	    lychee = lychee.getNext();
	}
	return lychee.getData();
    }

    // returns the Node at index n
    public Node findN(int n) {
	Node dragon = l;
	for(int i=0;i<n;i++) {
	    dragon = dragon.getNext();
	}
	return dragon;
    }

    // inserts new node at index n
    public void insert(int n, String s) {
	if(n ==  0) {
	    add(new Node(s));
	}
	else {
	    Node star = new Node(s);
	    star.setNext(findN(n));
	    findN(n-1).setNext(star);
	}
    }

}
