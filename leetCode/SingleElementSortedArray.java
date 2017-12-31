package leetCode;
import java.util.*;
public class SingleElementSortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]= scan.nextInt();
		}
		int ans =0;
		for(int i=0;i<n;i++) {
			ans^=a[i];
		}
		System.out.println(ans);
	}

}
