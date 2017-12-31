package hackeEarth;
import java.util.*;
public class BusJourney {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int a,b; int vacantSeats=M; int standCount=0;
        for (int i = 1; i < N; i++) {
        	a = scan.nextInt();
        	b = scan.nextInt();
        	//if(i==1) vacantSeats= M;
        	if((vacantSeats+= b-a)<1) standCount++;
        	//System.out.println("vacant seats at i="+i+" is "+vacantSeats);
        }
        System.out.println("Mahamba should stand for "+standCount+" stops");
     
	}
}	 


