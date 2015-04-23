import java.io.*;
import java.util.*;

public class Maze {
    private char[][] board;
    private int maxX;
    private int maxY;
    private Queue Frontier;
    // private StackFront Frontier;
    // private PriorityQueue Frontier;

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
    
    public Maze() {
	Frontier = new PriorityQueue();
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

    // Adds Nodes to Frontier
    public void addtoFront(int tx, int ty, Node current) {
	if(board[tx][ty] == '#' || board[tx][ty] == '$') {
	    tmp = new Node(tx, ty);
	    tmp.setPrev(current); // For tracing back Nodes
	    Frontier.enqueue(tmp);
	}
    }

    // BREADTH FIRST SEARCH
    public void bfs(int x, int y) {
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

	    addToFront(cx+1,cy,current);
	    addToFront(cx-1,cy,current);
	    addToFront(cx,cy+1,current);
	    addToFront(cx,cy-1,current);
	    

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

    /*

      BEST FIRST SEARCH
      Adds Nodes to the Frontier based on prioroty. (Priority List)
      
      Maze Heuristics:
      1. Distance formula (Euclidean)
      2. Manhattan (Taxi-Cab) distance

      Priority of Node n = cost to get to Node n + established distance to goal

    */

    // DISTANCE FORMULA
    public double getDistance(Node start, Node end) {
	startX = start.getX();
	startY = start.getY();
	endX = end.getX();
	endY = end.getY();

        int Xsquared = (startX - endX) * (startX - endX);
	int Ysquared = (startY - endY) * (startY - endY);

	return Math.sqrt(Xsquared + Ysquared);
	
    }

    public double getPriority(Node start, Node target, Node end) {
	return getDistance(start, target) + getDistance(target, end);
    }
    
    public void bestFirstSearch(int x, int y, int gx, int gy) {
	Node current = null;
	Node goal = new Node(gx, gy);
	Frontier.enqueue(new Node(x, y, getPriority(this, this, goal)));
	
        
    }
    
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.bfs(1,1);
	System.out.println(m);
    }
}

