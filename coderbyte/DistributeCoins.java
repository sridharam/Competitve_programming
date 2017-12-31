package coderbyte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DistributeCoins {

	public static void main(String[] args) {
		   Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		   Scanner scan = new Scanner(System.in);
	        System.out.println("enter the number of test cases");
	        int t = scan.nextInt();
	        int a[] = new int[t]; int tCoins;
	        List<Integer> l1 = new ArrayList<>();
	        for(int i=0;i<t;i++) {
	        	System.out.println("enter the no of coins");
	        	 tCoins = scan.nextInt();
	        	 System.out.println("enter the values of "+tCoins+" coins");
	        	 for(int j=0;j<tCoins;j++) {
	        		 l1.add(scan.nextInt());
	        		 
	        	 }
	        }
	        for (Integer k : l1) {
	            Integer freq = m.get(k);
	            m.put(k, (freq == null) ? 1 : freq + 1);
	        }

	        System.out.println(m.size() + " distinct coins:");
	        System.out.println(m);

	}

}
