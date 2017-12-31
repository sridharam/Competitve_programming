package leetCode;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ValidPalindromeII {
	public static boolean  check(Vector v,int m,int l) {
		for(int i=0;i<m;i++) {
			if(v.get(i)==v.get(l-i-1)) {
				continue;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s ="abcdeba";
		int l =s.length(); int count=0;
		int m = l/2;
		char[] arr = s.toCharArray();
		Vector v = new Vector();
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		for(int i=0;i<s.length();i++) {
			v.add(arr[i]);
		}
		for(int i=0;i<m;i++) {
			if(v.get(i)==v.get(l-i-1)) {
				continue;
			}
			else if(count==0) { System.out.println("removed element at "+i);
				v2 = (Vector) v.clone();
				v.remove(i);
				v2.remove(l-i-1);
				v1=(Vector) v.clone();
				boolean res = check(v,m,l);
				System.out.println(v1);
				System.out.println(v2);
				
				
				i--;count++;
			}
			else {System.out.println("false");System.exit(0);}
			
		}
		
		System.out.println("true");
	

	}

}
