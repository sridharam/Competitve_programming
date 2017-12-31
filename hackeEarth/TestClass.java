package hackeEarth;
//https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/archery-1/
// also check this problem and ans:https://www.hackerrank.com/rest/contests/master/challenges/chessboard-game-again-1/hackers/revoklaw/download_solution
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        long T = s.nextLong();

        for (long i = 0; i < T; i++) {
            int n = s.nextInt();
            long[] a = new long[n];
            for(int j=0;j<n;j++){
                a[j] = s.nextLong();
            }
            System.out.println(lcm(a,n));
        }
    }
    public static long lcm(long[] a, long n){
        long lcm = a[0];
        for(int i=1;i<n;i++){
            lcm = lcm*a[i]/gcd(lcm,a[i]);
        }
        return lcm;
    }
    public static long gcd(long a,long b){
        long temp;
         if(a>b){
         temp=a;
         a=b;
         b=temp;}
         while(b>0){
             long t =b;
             b=a%b;
             a=t;
         }
         return a;
    }
}
