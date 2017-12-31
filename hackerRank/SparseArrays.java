package hackerRank;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> m = new LinkedHashMap <String, Integer>();
		LinkedHashMap<String, Integer> m1 = new LinkedHashMap <String, Integer>();
		//System.out.println("enter number of strings");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); String a ="";
		//System.out.println("enter "+  n+" strings");
		for(int i =1;i<=n;i++) {
			a = scan.next();
			Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
		}
		//System.out.println("enter number of queries");
		int q = scan.nextInt();
		//System.out.println("enter " + q +" queries");
		for(int i =1;i<=q;i++) {
			a = scan.next();
			Integer freq =m.get(a);
			m1.put(a, (freq == null) ? 0 : freq );
		}
		for(Map.Entry<String, Integer> entry: m1.entrySet()) {
		    System.out.println( entry.getValue());
		}
		
		scan.close();
	}
}

