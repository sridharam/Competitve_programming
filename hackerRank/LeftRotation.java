//https://www.hackerrank.com/challenges/array-left-rotation
package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotation {
	 static int[] leftRotation(int[] a, int d) {
		 ArrayList<Integer> lst = new ArrayList<>();
		 for (int i : a) {
		     	lst.add(i);
		 }
         	Integer temp;
     for(int i= 0;i<d;i++){
    	temp= lst.get(0);
    	lst.remove(0);
         lst.add(temp);
     }
     int[] arr = lst.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}


