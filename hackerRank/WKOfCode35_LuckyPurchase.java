package hackerRank;
import java.util.*;
public class WKOfCode35_LuckyPurchase {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in); boolean flag=true;
        int N = in.nextInt(); int count4=0,count7=0;String ans="-1";long prev=1000000000;
        for(int a0 = 0; a0 < N; a0++){
        	count4=0;count7=0;flag=true;
            String s = in.next();
            long n = in.nextLong();
            String ss =""+n; int l=ss.length();
            if(l%2==1)continue;
            for(int i=0;i<l;i++) {
            	if(ss.charAt(i)=='4') count4++;
            	else if(ss.charAt(i)=='7')count7++;
            	else {flag=false; break;}
            }
            if(count4==count7 &&flag) {if(n<prev) { ans=s; prev=n;}}
        }
        System.out.println(ans);
        in.close();
    }
}
