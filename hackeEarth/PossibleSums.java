package hackeEarth;
import java.util.*;
public class PossibleSums {

	public static int countSum(int arr[]){
        Set<Integer> set = new TreeSet<Integer>();
        set.add(0);
        
        for (int j = 0; j < arr.length; j++) {
            List<Integer> ls = new ArrayList<Integer>();
            
            for(Iterator<Integer> it = set.iterator(); it.hasNext();){
                ls.add(it.next());
            }
            System.out.println(ls);
            for (int i : ls) {
                set.add(i + arr[j]);
            }
        }
        
        return set.size();
        
        
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
 
        for (int i = 0; i < N; i++) {
            int num;
            num = s.nextInt();
            int arr[] = new int[num];
            for (int j = 0; j < num; j++) {
                arr[j] = s.nextInt();
                //System.out.print(arr[j] + " ");
            }
            
            System.out.println(countSum(arr));
        }
 
    }
}