package coderbyte;
import java.util.Scanner;  
import java.io.*;  
import java.math.*;  
import java.math.BigInteger;  
  
public class ByteLand  
{  
     public static void main(String[] args)  
     {  
          Scanner cin=new Scanner(System.in);  
          int t;  
          BigInteger n,tmp;  
          t=cin.nextInt();  
          while(true)  
          {  
               if((t--)<=0)  
                    break;  
  
               n=cin.nextBigInteger();  
               tmp=BigInteger.ONE;  
               int ans=0;  
               while(true) 
               {  
                    if(tmp.compareTo(n)>0)  
                         break;  
                    ans++;  

                    n=n.subtract(tmp);  
                    tmp=tmp.multiply(BigInteger.valueOf(2));
               }  
               while(true)  
               {  
                    if(n.compareTo(BigInteger.ZERO)<=0)  
                         break;  
                    if(n.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ONE)==0)  
                         ans++;  
                    n=n.divide(BigInteger.valueOf(2));  
               }  
               System.out.println(ans);  
          }  
     }  
}  