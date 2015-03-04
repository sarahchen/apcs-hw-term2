import java.util.*;
import java.io.*;

public class Lake {
    private int[][] Lake;
    private int[] Given;
    private Random rng;
    
    public Lake() {
        Given = new int[] {4, 6, 35, 2};
	Lake = new int[Given[0]][Given[1]];
	rng = new Random();
	
	for(int r=0;r<Lake.length;r++) {
	    for(int c=0;c<Lake[r].length;c++) {
		Lake[r][c] = rng.nextInt(50) + 10;
	    }
	}
	
    }

    public String toString() {
	String array = "";
	for(int r=0; r<Lake.length; r++) {
	    for(int c=0; c<Lake[r].length; c++) {
		array = array + " " + Lake[r][c];
	    }
	    array += "\n";
	}
	return array;
    }

    public void Stomp(int R, int C, int D) {
	int max = 0;
	for(int r = R-1; r<R+2; r++) {
	    for(int c = C-1; c<C+2; c++) {
		if(Lake[r][c] > max) {
		    max = Lake[r][c];
		}
	    }
	}

	int newnum = max - D;
	for(int r = R-1; r<R+2; r++) {
	    for(int c = C-1; c<C+2; c++) {
		if(Lake[r][c] > newnum) {
		    Lake[r][c] = newnum;
		}
	    }
	}
    }

    public void changeE() {
	int E = Given[2];
	for(int r=0; r<Lake.length; r++) {
	    for(int c=0; c<Lake[r].length; c++) {
		if(E - Lake[r][c] < 0) {
		    Lake[r][c] = 0;
		}
		else {
		    Lake[r][c] = E - Lake[r][c];
		}
	    }
	}
    }

    public int Volume() {
	int volume = 0;
	for(int r=0; r<Lake.length; r++) {
	    for(int c=0; c<Lake[r].length; c++) {
		volume += Lake[r][c];
	    }
	}

	return volume * 72 * 72;
    }

    public int makeLake(int R, int C, int D) {
	Stomp(R, C, D);
	changeE();
	return Volume();
    }
}
