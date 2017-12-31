package hackerRank;
import java.util.*;
public class CountSolutions {
	static int countSolutions(int a, int b, int c, int d){
	   int  count=0;
	   loop:
	   for(int x=1;x<=c;x++) { 
		   for(int y=1;y<=d;y++) { if(x>a && y>b)break loop;
		   else if(x*x+y*y==x*a+y*b) { count++;System.out.println("x and y are "+x+" "+y);}
		   }
	   }
	   return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int result = countSolutions(a, b, c, d);
            System.out.println(result);
        }
    }
}
