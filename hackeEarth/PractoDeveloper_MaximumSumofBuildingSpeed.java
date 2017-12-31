package hackeEarth;
import java.util.*;
public class PractoDeveloper_MaximumSumofBuildingSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int l= 2*N;
		int[] bs = new int[l];
		for(int i=0;i<l;i++) {
			bs[i] = scan.nextInt();
		}
		Arrays.sort(bs);
		
		int value=0;
		for(int i=0;i<l-1;i++) {
			value+=Math.min(bs[i], bs[i+1]);
			++i;
		}
		
	}
	

}
