package hackerRank;
import java.util.*;
public class ZeroOneGame {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int[] sequence = new int[n];
            for(int sequence_i=0; sequence_i < n; sequence_i++){
                sequence[sequence_i] = in.nextInt();
            }
            
            System.out.println(winnable(n, sequence) ? "Alice" : "Bob");
        }
    }
    
    private static boolean winnable(int n, int[] sequence){
        for(int i = 1; i < n - 1; i++)
            if(sequence[i-1] == 0 && sequence[i+1] == 0)
                sequence[i] = 0;
            
        int count = 0;
        for(int i = 1; i < n - 1; i++)
            if(sequence[i-1] == 0 && sequence[i+1] == 0)
                count++;
            
        return (count % 2) == 1;
    }
    

}
