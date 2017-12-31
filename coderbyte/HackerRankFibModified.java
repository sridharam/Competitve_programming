/*link = https://www.hackerrank.com/challenges/fibonacci-modified*/
package coderbyte;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankFibModified {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
       long fib11 = scan.nextInt();
        long fib22 = scan.nextInt();
        BigInteger fib1 = BigInteger.valueOf(fib11);
        BigInteger fib2 = BigInteger.valueOf(fib22);

        int n = scan.nextInt(); BigInteger fib3 = null;
        if(n==1) fib3=fib1;
        if(n==2) fib3 = fib2;
        if(n>2){ 
            for(int i =3; i<=n; i++){
                fib3 = fib1.add(fib2.multiply(fib2));
                fib1 = fib2;
                fib2 = fib3;
            }
        }
        System.out.println(fib3);
    }
}



