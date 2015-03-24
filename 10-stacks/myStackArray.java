// generic Array idea from https://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java
public class myStackArray<E> {
    private final int chunk;
    private E[] stack;
    private int top; // index of the top element
    
    public myStackArray(int chunk){
	this.chunk = chunk;
	stack = new E[chunk];
	top = 0;
    }
    public myStackArray() {
	this(100);
    }

    public void push(E data) {
	stack[top+1] = data;
	top++;
    }

    public E pop() {
	
    }

}
