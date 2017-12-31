package hackeEarth;
import java.util.*;
public class IntelligentGirl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int l= s.length();
		int[] dy = new int[l+1];
		dy[0] = 0; 
		StringBuilder s1 = new StringBuilder(s);
		s1 = s1.reverse();System.out.print(s1);
		for(int i=0;i<l;i++) { 
			if(s1.charAt(i)=='2'|| s1.charAt(i)=='4'||s1.charAt(i)=='6'||s1.charAt(i)=='8')
				dy[i+1] = dy[i]+1;
			else dy[i+1] = dy[i];
		}
		for(int i=l;i>0;i--) {
			System.out.print(dy[i]+" ");
		}
		
	}

}
