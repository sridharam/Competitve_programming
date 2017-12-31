package leetCode;
import java.util.*;
// ans= https://discuss.leetcode.com/topic/104476/java-easy-to-understand-code-with-only-two-passes-beats-87-77
public class MaximumSwap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String s = scan.next();
		char[] a = s.toCharArray();  
		 swap(a,0);
		
	}
	static void swap(char a[],int i) { 
		char first=a[i];char max='0'; int l =a.length; int maxIndex=0; 
		if(i==l-1) {
			String ss ="";
			for(char c:a) {
				ss=ss+c; 
			} 
			System.out.println(ss);return; 
		}
		for(int j=i;j<l;j++) {
			if(a[j]>max) { max = a[j]; maxIndex=j;}
		}
		if(max>first) {
			char temp = a[i];
			a[i]=a[maxIndex];
			a[maxIndex] = temp;
			String ss ="";
			for(char c:a) {
				ss=ss+c; 
			} 
			System.out.println(ss);return;
		}
		else swap(a,++i);
			
		}
		
	

}
