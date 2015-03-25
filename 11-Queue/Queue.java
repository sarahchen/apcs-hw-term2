
public class Queue<E> {
    private Node<E> first;
    private Node<E> last;

    public Queue() {
	first = null;
	last = first;
    }

    public void enqueue(E data) {
	Node<E> n = new Node<E>(data);
	last.setNext(n);
	last = n;
    }

    public E dequeue() {
	Node<E> tmp = first.getNext();
	first.setNext(first.getNext().getNext());
	return tmp.getData();
    }


}
