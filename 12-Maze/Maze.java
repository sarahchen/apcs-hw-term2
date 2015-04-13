import java.io.*;
import java.util.*;

public class Maze {
    private char[][] board;
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
	board = new char[maxX][maxY];
	
	try {
	    
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext()) {
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++)
		    {
			board[i][j] = line.charAt(i);
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
		    s = s + board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    /*
    public void solve(int x, int y){
	Frontier.enqueue(board[x][y]);

	while(!Frontier.empty()) {
	    Node current;
	    current = Frontier.dequeue();

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
    */

    public void bfs(int x, int y) {
	Queue Frontier = new Queue();
	Frontier.enqueue(new Node(x, y));

	board[x][y] = 'x';
	Node current = null;
	int tx=0,ty=0;

	while(!Frontier.empty()) {
	    current = Frontier.dequeue();
	    int cx = current.getX();
	    int cy = current.getY();

	    if(board[cx][cy] == '$') {
		break;
	    }

	    board[cx][cy] = 'z';
	    Node tmp;
	    
	    tx = cx+1;
	    ty = cy;
	    if(board[tx][ty] == '#' || board[tx][ty] == '$') {
		tmp = new Node(tx, ty);
		tmp.setPrev(current); // For tracing back Nodes
		Frontier.enqueue(tmp);
	    }

	    tx = cx-1;
	    ty = cy;
	    if(board[tx][ty] == '#' || board[tx][ty] == '$') {
		tmp = new Node(tx, ty);
		tmp.setPrev(current);
		Frontier.enqueue(tmp);
	    }

	    tx = cx;
	    ty = cy+1;
	    if(board[tx][ty] == '#' || board[tx][ty] == '$') {
		tmp = new Node(tx, ty);
		tmp.setPrev(current);
		Frontier.enqueue(tmp);
	    }

	    tx = cx;
	    ty = cy-1;
	    if(board[tx][ty] == '#' || board[tx][ty] == '$') {
		tmp = new Node(tx, ty);
		tmp.setPrev(current);
		Frontier.enqueue(tmp);
	    }

	    delay(50);
	    System.out.println(this);
	}

	// Path recovery
	for (Node p = current.getPrev(); p != null; p = p.getPrev()) {
	    board[p.getX()][p.getY()] = 'P';
	    delay(100);
	    System.out.println(this);
	}
    }
    
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.bfs(1,1);
	System.out.println(m);
    }
}

