import java.util.*;

public class StackFront extends Queue {
    public void enqueue(Node n) {
	l.add(0, n);
    }
}
