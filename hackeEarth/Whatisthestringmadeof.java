package hackeEarth;
import java.util.*;

import org.apache.commons.lang3.ArrayUtils;
public class Whatisthestringmadeof {
public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        HashMap<Character,Integer> h = new HashMap<>();
        h.put('0',6);h.put('1',2);h.put('2',5);
        h.put('3',5);h.put('4',4);h.put('5',5);
        h.put('6',6);h.put('7',3);h.put('8',7);h.put('9', 6);
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('0',0);hm.put('1',0);hm.put('2',0);
        hm.put('3',0);hm.put('4',0);hm.put('5',0);
        hm.put('6',0);hm.put('7',0);hm.put('8', 0);hm.put('9', 0);
            String c = s.next();
           char[] arr = c.toCharArray();
          // Character[] cr = arr;
           for(int j=0;j<arr.length;j++) {
        	   Character cr =arr[j];
        	   hm.put(cr, h.get(cr)+hm.get(cr));
        	   
           }
            int sum=0;
           for (int f : hm.values()) {
               sum += f;
           }
            
        System.out.println(sum);
        s.close();
    }
}
