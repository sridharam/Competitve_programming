package hackerRank;
import java.util.*;
public class WCS12_TheSalesman {
	static int minimumTime(int[] x) {
		Arrays.sort(x);
		int l = x.length;int result=0;
		for (int i = l-1; i >0 ; i--) {
			result+=x[i]-x[i-1];
		}
		return result;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] x = new int[n];
            for(int x_i = 0; x_i < n; x_i++){
                x[x_i] = in.nextInt();
            }
            int result = minimumTime(x);
            System.out.println(result);
        }
        in.close();
    }
}
