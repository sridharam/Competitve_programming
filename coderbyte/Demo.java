package coderbyte;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		 int[][] A = 
			   {
			        {1,2},{3 ,4 },{2 ,4 },{4 ,6 },{4 ,5 },{5 ,6 },{1 ,6 },
			       
			   };
		 int m = A.length;
		 int n = 2;
		 int t=0; int t1,t2,t3,t4;
         for(int i=0;i<m-1;i++)
         {
        	if(A[i][0]>A[i+1][0]) {
        		int []temp = A[i];
        		A[i] = A[i+1];
        		A[i+1] = temp;
        		
        		
        	}
            
         }

         /* Printing the sorted 2D Array */

         System.out.println("The Sorted Array:");
         for(int i=0;i<m;i++)
         {
             for(int j = 0 ;j<2;j++)
                 System.out.print(A[i][j]+"\t");
            
             System.out.println();
         }
	}

}
