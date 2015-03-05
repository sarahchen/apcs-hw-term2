import java.util.*;
import java.io.*;

public class mergeSort {
    private ArrayList<Integer> A;
    private ArrayList<Integer> B;
    private Random rng;

    public mergeSort() {
	rng = new Random();

	A = new ArrayList<Integer>();
	B = new ArrayList<Integer>();

	for(int i=0;i<20;i++) {
	    A.add(rng.nextInt(20));
	    B.add(rng.nextInt(20));
	}
    }

    public void sort() {
	
    }

    public ArrayList<Integer> merge(ArrayList<Integer> one, ArrayList<Integer> two) {
	ArrayList<Integer> M = new ArrayList<Integer>();
	while(one.size() > 0 || two.size() > 0) {
	    if(one.size() == 0) {
	        while(two.size() > 0) {
		    M.add(two.remove(0));
		}
	    }
	    else if(two.size() == 0) {
		while(one.size() > 0) {
		    M.add(one.remove(0));
		}
	    }
	    else if(one.get(0) > two.get(0)) {
		M.add(one.remove(0));
	    } else {
		M.add(two.remove(0));
	    }
	}
	return M;
    }
}
