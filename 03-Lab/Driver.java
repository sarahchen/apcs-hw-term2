
public class Driver {

    public static void main(String[] args) {
	Lake l = new Lake();

	System.out.println(l.toString());
	l.Stomp(1, 4, 4);
	System.out.println(l.toString());
	l.changeE();
	System.out.println(l.toString());
	System.out.println(l.Volume());
    }

}
