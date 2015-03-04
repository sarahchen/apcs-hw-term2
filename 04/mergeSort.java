
public class mergeSort {
    private ArrayList<Integer> A;
    private ArrayList<Integer> B;

    public mergeSort() {

    }

    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B) {
	ArrayList<Integer> M = new ArrayList<Integer>();
	while(A.size() > 0 || B.size() > 0) {
	    if(A.size() == 0) {
	        while(B.size() > 0) {
		    M.add(B.remove(0));
		}
	    }
	    else if(B.size() == 0) {
		while(A.size() > 0) {
		    M.add(A.remove(0));
		}
	    }
	    else if(A.get(0) > B.get(0)) {
		M.add(A.remove(0));
	    } else {
		M.add(B.remove(0));
	    }
	}
    }
}
