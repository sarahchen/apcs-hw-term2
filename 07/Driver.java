public class Driver {

    public static void main(String[] args) {
	Node n = new Node("hello");
	Node n2 = new Node("world");
	
	n.setNext(n2);
	System.out.println(n.getNext().getData());
    }

}
