package hackerRank;
import java.util.*;
public class WhatAretheOdds {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
       /* int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }*/
        int count=0;
        if(n.length()<6) count++;
        if(n.matches("(+[0-9]|[0-9]+)")) {count++;System.out.println("inside p1");}
        if(n.matches("(+[a-z]|[a-z]+)")) { count++;System.out.println("inside p2");}
        if(n.matches("(+[A-Z]|[A-Z+)")) { count++;System.out.println("inside p3");}
        if(n.matches("(+[!@#$%^&*()-+]|[!@#$%^&*()-+]+)")) { count++;System.out.println("inside p4");}
       // if(n.matches(p5)) { count++;System.out.println("inside p5");}
        System.out.println(5-count);
    }
}
