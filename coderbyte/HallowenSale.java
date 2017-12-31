package coderbyte;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HallowenSale {

    static int howManyGames(int p, int d, int m, int s) {
        int  count = 0;
        if(s>=p){
            while(s>=m){
                if(p>m){ int d1=d;
                	d = d*count;
                    s = s -p;
                    
                    count++;
                    p = p-d1*count;
                }
                else {System.out.println("inside else");
                    s = s -m;
                    count++;
                }
            }
        }
        else
            return 0;
       return count; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}
