
public class Fifteen {
    private int[][] board;
    private int empty = 0;

    public Fifteen() {
	board = new int[4][4];
	int assign = 1;
        for(int y=0;y<4;y++) {
	    for(int x=0;x<4;x++) {
		board[x][y] = assign;
		assign++;
	    }
	}
	
    }

    public String toString()    {
	String s = "[2J\n";
	
	for (int y=0;y<4;y++) 
	    for (int x=0;x<4;x++) {
		s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    public void solve(int x, int y) {
	
    }

}
