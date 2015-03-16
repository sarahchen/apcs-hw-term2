public class Driver {

    public static void main(String[] args) {
	Node n = new Node("hello");
	Node n2 = new Node("world");
	
	n.setNext(n2);
	//System.out.println(n.getNext().getData());

	n2.setNext(new Node("watermelon"));
	n2.getNext().setNext(new Node("abc"));

	for(Node tmp = n; tmp!=null; tmp = tmp.getNext()) {
	    System.out.println(tmp.getData());
	}
    }

}
