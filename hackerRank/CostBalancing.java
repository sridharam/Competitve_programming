package hackerRank;
import java.util.*;
public class CostBalancing {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int id_number = in.nextInt();
            int amount = in.nextInt();
            Integer id = id_number;
            hm.put(id, (hm.get(id) == null) ? amount : hm.get(id) + amount);

        }
        int sum = 0;
        for (int i : hm.values()) {
            sum += i;
        }
        int avg = sum/m;
        int avgSum = m*avg;
        int first=sum-avgSum;
        int anita = avg+first;
        
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(key==1)System.out.println(key+" "+(value-anita));
            else	System.out.println(key+" "+(value-avg));
            
        }
        
        in.close();
    }
}
