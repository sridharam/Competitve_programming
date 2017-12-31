package hackeEarth;
import java.util.*;
import java.math.*;
public class MarutandStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();String s; int lower,upper,min;
        if(T<1||T>10) System.out.println("Invalid Test");
        for (int i = 0; i < T; i++) {lower=0;upper=0;
            s = scan.next();
            char c[] = s.toCharArray();
            int l=s.length();
            if(l<1||l>100) System.out.println("Invalid Input");
            for(int j=0;j<l;j++) {
            	if(c[j]>='A' && c[j]<='Z') upper++;
            	else if(c[j]>='a' && c[j]<='z') lower++;
            	
            }
            min = Math.min(upper, lower);
            if(upper==0 && lower==0) System.out.println("Invalid Input");
            else if(min==0) System.out.println(0);
            else System.out.println(min);
        }

	}

}
