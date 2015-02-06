
public class Driver {

    // --- CLASSWORK --- //

    public int fib(int n) {
	if(n > 1) {
	    return fib(n - 1)+fib(n - 2);
	}
	else if (n == 1){
	    return 1;
	}
	else {
	    return 0;
	}
    }

    public int len(String s) {
	if(s.equals("")) {
	    return 0;
	}
	else {
	    return 1 + len(s.substring(1));
	}
	
    }

    public int count(String s, Character c) {
	if(s.equals("")) {
	    return 0;
	}
	else if(s.charAt(0) == c) {
	    return 1 + count(s.substring(1), c);
	}
	else {
	    return count(s.substring(1), c);
	}
    }

    public static void main(String[] args) {
	Driver d = new Driver();
	System.out.println(d.fib(3));
	System.out.println(d.len("happiness"));
	System.out.println(d.count("hello", 'l'));
    }

    // --- CODING BAT --- //
    
    public int fibonacci(int n) {
	if(n > 1) {
	    return fibonacci(n - 1)+fibonacci(n - 2);
	}
	else if (n == 1){
	    return 1;
	}
	else {
	    return 0;
	}
    }

}
