package hackeEarth;
import java.util.*;

public class OctoberCircuits_PolynomialSign {
	public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); 
        int count=0; String s;int sign=0;
        for (int i = 0; i < N+1; i++) {
          s =  scan.next();//System.out.println(s);
          if(s.compareTo("0")>0) { sign = 1;}//System.out.println("inside if with s= "+s+"sign is"+sign);}
          else if(s.compareTo("0")<0) { sign =-1;}//System.out.println("inside if with s= "+s+"sign is"+sign);}
          else if(s.compareTo("0")==0) continue;
          count++;
        }
        if(count%2==0) {
        	if(sign==1) System.out.println(1+" "+"-1");
        	else if(sign==0) System.out.println(0+" "+0);
        	else System.out.println("-1 "+1);
        }
        else {//System.out.println("sign is "+sign);
        	if(sign==1) System.out.println(1+" "+1);
        	else if(sign==-1) System.out.println("-1 "+"-1");
        	else System.out.println(0+" "+0);
        }
        		

    }

}
