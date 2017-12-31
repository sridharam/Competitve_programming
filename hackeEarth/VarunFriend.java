package hackeEarth;
import java.util.*;
public class VarunFriend {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		String a = "* "; String b ="# ";
		LinkedList<String> ls = new LinkedList<>();
		for(int i=0;i<n;i++) {
			String s =a;
			for(int j=0;j<i;j++) {
				s=s+b;
			}
			ls.addLast(s);
		}
		Iterator itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
