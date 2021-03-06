import java.io.*;
import java.util.*;

public class fifteen {

    private int[][] board;
    private Random rng;
    private ArrayList<Integer> list; // TO ASSIGN NUMBERS TO THE BOARD
    private int wall = -1; // PADDING
    private int startR, startC; // COORDINATES OF 00 (THE START)

    public void delay(int n) {
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    
    public fifteen() {
	board = new int[4][4];
	startR = -1;
	startC = -1;
	
	int i=1;
        for(int r=0;r<board.length;r++) {
	    for(int c=0;c<board[r].length;c++) {
		if( 1 > 15) {
		    board[r][c] = 0;
		}
		else {
		    board[r][c] = i;
		}
		i++;
	    }
	}

	/* -- MAKE A SCRAMBLED BOARD
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
	*/
    }

    /* --- SCRAMBLE THE BOARD --- */
    /*
    public void Scramble(int r, int c) {
	
	for(int i=0; i<20;i++) {
	    try {
		board[r][c] = me;
		board[r][c] = board[r][c+1];
		board[r][c+1] = me;
		
		board[
	    } catch (Exception e) { }
	}
    }
	
	*/

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
	//boolean solved = true;
	int i = 1;
	for (int r = 0; r < board.length; r++) {
	    for (int c = 0; c < board.length; c++) {
		if(board[r][c] != i) {
		    //solved = false;
		    i++;
		}
		else if(board[3][3] != 0) {
		    // solved = false;
		    i++;
		}
		else {
		    return false;
		}
	    }
	}
	return true;
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
        else if(solved()) {
	    System.out.println(toString());
	}
        else {
	    int me = board[r][c];
	    try {
		for(int i=0;i < 4; i++) {
		    switch(i) {
		    case 1:
			board[r][c] = board[r][c+1];
			board[r][c+1] = me;
			toSolve(r, c+1);
			break;
		    case 2:
			board[r][c] = board[r][c-1];
			board[r][c-1] = me;
			toSolve(r, c-1);
			break;
		    case 3:
			board[r][c] = board[r+1][c];
			board[r+1][c] = me;
			toSolve(r+1, c);
			break;
		    case 4:
			board[r][c] = board[r-1][c];
			board[r-1][c] = me;
			toSolve(r-1, c);
			break;
		    default:
			break;
		    }
		}
	    } catch (Exception e) {}
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
