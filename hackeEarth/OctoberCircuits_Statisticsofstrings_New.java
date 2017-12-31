package hackeEarth;
import java.util.*;
import java.math.*;
// not done
public class OctoberCircuits_Statisticsofstrings_New {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer,Integer> hm = new HashMap<>();
		HashMap<Integer,Integer> ncr = new HashMap<>();
		int n = scan.nextInt();
		int a = scan.nextInt();
		int mod = scan.nextInt();
		hm.put(1, 0);hm.put(2, 1);hm.put(3, 4);hm.put(4, 11);hm.put(5, 28);
		hm.put(6, 66);hm.put(7, 150);
		ncr.put(1, 0);ncr.put(2,1 );ncr.put(3, 3);ncr.put(4, 6);ncr.put(5, 10);ncr.put(6,15 );
		ncr.put(7,21 );ncr.put(8,28 );ncr.put(9,36 );ncr.put(10, 45);ncr.put(11,55 );ncr.put(12, 66);
		ncr.put(13,78 );ncr.put(14, 91);ncr.put(15, 105);ncr.put(16,120 );ncr.put(17,136 );ncr.put(18,153 );
		ncr.put(19, 171);ncr.put(20,190 );ncr.put(21, 210);ncr.put(22,231 );
		
		int rep=0;
		if(n<=a) rep = a*(a-2);
		System.out.println(rep);
		if(hm.get(n)==null) System.out.println("-1");
		else  {
		long result = ((hm.get(n)+hm.get(n))*ncr.get(a))-rep*(n-1);
		System.out.println(result);
		}

	}

}
