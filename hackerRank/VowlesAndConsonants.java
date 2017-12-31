package hackerRank;
//techgig.com
//not complete
import java.util.*;
public class VowlesAndConsonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s =scan.next();
		int l =s.length();
		int k = scan.nextInt();int v=k;
		for(int i=0;i<l;i++) {
			for(int j=0;j<l-k;j++) {
				String sub = s.substring(j,j+k);System.out.println(sub);
				boolean b = containsKConsonants(sub,v);System.out.println(b);
				if(b==true) { System.out.println("inside if");}
				else { k++;j=-1;}
			}
			System.out.println(k);
		} 
	}
	static boolean containsKConsonants(String s,int k) {
		int count=0;
		char arr[] = s.toCharArray(); int l=arr.length;
		for(int i=0;i<l;i++) {
			if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o'||arr[i]=='u') {continue;}
			else {count++ ;System.out.println("count is k is "+count+" "+k);if(count>=k) return true;}
		}
		return false;
	}
	
}
