import java.io.*;
import java.util.*;

public class Maze 
{
    private Node[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
    
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    
    public Maze() 
    {
	maxX=40;
	maxY=20;
	board = new Node[maxX][maxY];
	
	try {
	    
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext()) {
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++)
		    {
			board[i][j].setData(line.charAt(i));
			board[i][j].setX(i);
			board[i][j].setY(j);
		    }
		j++;
	    }
	}
	catch (Exception e)
	    {
	    }
	
    }
    
    public String toString()
    {
	String s = "[2J\n";
	
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s + board[x][y].getData();
		s=s+"\n";
	    }
	return s;
    }
    
    /*
      solved - instance variable to indicate we're done
      
    */
    public void solve(int x, int y){
	Frontier.enqueue(board[x][y]);

	while(!Frontier.empty()) {
	    current = Frontier.dequeue();

	    if (current.getData() == wall ||
		current.getData() == me ||
		current.getData() == visited ||
		solved) {
		return;
	    }
	    
	    if (current.getData() == exit){
		System.out.println(this);
		solved = true;
	    }
	    
	    Frontier.enqueue(board[current.getX()+1][current.getY()]);
	    Frontier.enqueue(board[current.getX()-1][current.getY()]);
	    Frontier.enqueue(board[current.getX()][current.getY()+1]);
	    Frontier.enqueue(board[current.getX()][current.getY()-1]);

	    if (!solved){
		current.setData(visited);
	    }
	    
	}

	
    }
    
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
    }
}

