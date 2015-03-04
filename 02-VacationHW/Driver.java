
public class Driver {

    public static void main(String[] args) {
	fifteen p = new fifteen();
	
	System.out.println(p.toString());
	//	System.out.println(p.getWall());
      	System.out.println(p.getStartR());
       	System.out.println(p.getStartC());
       	p.toSolve(p.getStartR(), p.getStartC());
    }

}
