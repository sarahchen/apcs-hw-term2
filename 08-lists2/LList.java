public class LList {
    private Node l;
    private int len;

    public LList() {
        l = new Node();
	len = 0;
    }

    public String toString() {
	int i = 0;
	String s = "";
	
    }

    // Adds a node to the end of the list
    public boolean add(int s) {
        Node choco = new Node(s);
        choco.setNext(getNode(0));
	l.setNext(choco);
	len = len + 1;
	return true;
    }

    public void add(int i, int s) {
	Node jelly = new Node(s);
	jelly.setNext(getNode(i+1));
	getNode(i).setNext(jelly);
	len = len + 1;
    }

    public int get(int n) {
	Node tofu = l.getNext();
	try {
	    for(int i=0; i<n; i++) {
		tofu = tofu.getNext();
	    }
	} catch (Exception e) {
	    return l.getData();
	}
	return tofu.getData();
    }

    public int remove(int n) {
	getNode(n-1).setNext(getNode(n+1));
	len = len - 1;
	return get(n);
    }

    // helper function
    public Node getNode(int n) {
	Node mochi = l.getNext();
	try {
	    for(int i=0; i<n; i++) {
		mochi = mochi.getNext();
	    }
	} catch (Exception e) {
	    return l;
	}
	return mochi;
    }

}
