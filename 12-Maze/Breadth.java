import java.util.*;
import java.io.*;

public class Breadth {
    private Queue Frontier;
    private Node[][] board;
    private int maxX;
    private int maxY;

    public Breadth() {
	maxX=40;
	maxY=20;
	board = new Node[maxX][maxY];
	
	try {
	    
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j].setData(line.charAt(i));
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
	
    }
    
    public String toString() {
        String s = "[2J\n";
	
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }
      
    public void solve(int x, int y){
        while(!Frontier.empty()) {
	    
	}
    }

    public static void main(String[] args) {
	Breadth maze = new Breadth();
	System.out.println(maze);
    }
}
