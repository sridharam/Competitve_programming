//https://leetcode.com/problems/largest-rectangle-in-histogram/description/
package leetCode;

public class LargestRectangleinHistogram {

	public static void main(String[] args) {
		int[] hist = {4,2,2}; int maxarea = 0;; int count=1;
		for(int i =0;i<hist.length;i++) {
			for(int j=i+1;j<hist.length;j++) { 
				if(hist[i]>hist[j]) {System.out.println("breaking"); break;}
				else {
					maxarea =Math.max( maxarea,Math.min(hist[i],  hist[j])*(count+1));
					//maxarea = Math.max(maxarea, hist[i]*(count+1));
					System.out.println(maxarea);
					//maxarea =Math.max( maxarea,Math.min(hist[i],  hist[j])*(count+1);
				}
				count++;
				
			}
			count = 1;
			System.out.println();
			System.out.println(maxarea);
		}
		for(int i =hist.length-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) { 
				if(hist[i]>hist[j]) {System.out.println("breaking"); break;}
				else {
					maxarea =Math.max( maxarea,Math.min(hist[i],  hist[j])*(count+1));
					//maxarea = Math.max(maxarea, hist[i]*(count+1));
					System.out.println(maxarea);
					//maxarea =Math.max( maxarea,Math.min(hist[i],  hist[j])*(count+1);
				}
				count++;
				
			}
			count = 1;
			System.out.println();
			System.out.println(maxarea);
		}
		System.out.println(maxarea);

	}

}
