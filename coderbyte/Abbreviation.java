package coderbyte;

import java.util.Scanner;

public class Abbreviation {

	static String abbreviation(String a, String b) {       
		String c = a.toUpperCase(); 
		char[] arr = c.toCharArray();
		char[] comp = b.toCharArray(); String s ="";int count =0;
		int l = arr.length;int m = comp.length;
		for(int i=0, j=i;i<m&& j<l;j++) {
			if(comp[i]!=arr[j]) {if(arr[j]<='Z')count++;}
			else {s=s+arr[j]; i++;}
		}
		for(int i=m;i<l;i++) {
			if(arr[i]<='Z') count++;
		}
			
		return b.equals(s)==true && count<=m?"YES":"NO";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String a = in.next();
            String b = in.next();
            String result = abbreviation(a, b);
            System.out.println(result);
        }
        in.close();
    }
}