import java.io.*;
import java.util.*;

public class fifteen {
    private int[][] board;
    private Random rng;
    private ArrayList<Integer> list; // TO ASSIGN NUMBERS TO THE BOARD
    private int wall = -1; // PADDING
    private int startR, startC; // COORDINATES OF 00 (THE START)
    
    public fifteen() {
	board = new int[8][8];
	startR = -1;
	startC = -1;

	rng = new Random();
	list = new ArrayList<Integer>();
	for(int i=0;i<16;i++) {
	    list.add(i);
	}
        
	for(int r=0;r<board.length;r++) {
	    for(int c=0;c<board[r].length;c++) {
		if(r < 2 || r > 5 || c < 2 || c > 5) {
		    board[r][c] = -1;
		} else {
		    int assignment = list.remove(rng.nextInt(list.size()));
		    if (assignment == 0) {
			startR = r;
			startC = c;
		    }
		    board[r][c] = assignment;
		}
	    }
	}
    }

    public String toString() {
	String s = "";
	for(int r=0;r<board.length;r++) {
	    for(int c=0;c<board.length;c++) {
	        int i = board[r][c];
	        if(i < 10 && i != -1) {
		    s = s + "0" + i + " ";
		} else {
		    s = s + i + " ";
		}
	    }
	    s += "\n";
	}
	return s;
    }

    /* --- IS SOLVED? --- */
    public boolean solved() {
	boolean solved = false;
	int i = 0;
	for(int r=2;r<board.length-2;r++) {
	    for(int c=2;c<board.length-2;c++) {
		if(board[r][c] == i) {
		    solved = true;
		    i++;
		}
		else if(board[3][3] == 0) {
		    solved = true;
		    i++;
		}
		else {
		    return false;
		}
	    }
	}
	return solved;
    }

    /* --- RECURSIVE SOLVER --- */
    public void toSolve(int r, int c) {
	System.out.println(toString());
	if(board[r][c+1] == wall &&
	   board[r][c-1] == wall &&
	   board[r+1][c] == wall &&
	   board[r-1][c] == wall) {
	    return;
	}
        if(solved()) {
	    System.out.println(toString());
	}
        else {
	    int me = board[r][c];

	    board[r][c] = board[r][c+1];
	    board[r][c+1] = me;
	    toSolve(r, c+1);
	    
	    board[r][c] = board[r][c-1];
	    board[r][c-1] = me;
	    toSolve(r, c-1);
	    
	    board[r][c] = board[r+1][c];
	    board[r+1][c] = me;
	    toSolve(r+1, c);

	    board[r][c] = board[r-1][c];
	    board[r-1][c] = me;
	    toSolve(r-1, c);
	}
    }

    
    /* --- RETURNS THE COORDINATES OF 00 --- */
    public int getStartR() {
	return startR;
    }
    
    public int getStartC() {
	return startC;
    }
    

}
