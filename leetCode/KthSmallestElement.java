package leetCode;

import java.util.Arrays;

public class KthSmallestElement {

	public static void main(String[] args) {
		   int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};

		   int k=8;
		        int order = matrix.length;
		        int[] a = new int[order*order];
		        for(int i =0;i<order;i++){
		            for(int j=0;j<order;j++){
		                a[i+j] = matrix[i][j];
		                System.out.print(" "+a[i+j]);
		                System.out.println(" i and j are "+ i+" "+j);
		                
		            }
		        }
		        System.out.println("the length is "+a.length);
		        for(int j=0;j<a.length;j++) System.out.print("  "+a[j]);
		        Arrays.sort(a);
		        
		        for(int l =0;l<a.length;l++) System.out.println("with l  "+l+" "+a[l]);
		        System.out.println( a[k-1]);
		    }
		

	}


