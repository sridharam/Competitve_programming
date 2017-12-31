package hackeEarth;
//done
import java.util.*;
public class Cognizant_StringOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		StringBuilder s = new StringBuilder(x);
		char[] a = x.toCharArray();
		int Q = scan.nextInt();
		while(Q-->0) {
			int ind = scan.nextInt();
			String  c = scan.next();
			a[ind-1]=c.charAt(0);
		}
		x = new String(a); String ss = new String(x);
		StringBuilder n = new StringBuilder(x);StringBuilder re;
		System.out.println(x);
		int M = scan.nextInt(); 
		while(M-->0) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			i--;String sub;
			sub=n.substring(i, j); re = new StringBuilder(sub);
			re = re.reverse();
			n.delete(i, j);
			n.insert(i, re);
		}
		x = n.toString();
		System.out.println(x);
		int l = ss.length(); int count=0;
		for(int i=0;i<l;i++) {
			if(ss.charAt(i)==x.charAt(i)) count++;
		}
		System.out.println(count);
	}

}
