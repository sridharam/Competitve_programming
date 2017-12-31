package hackeEarth;
import java.util.*;
public class Cognizant_SchoolPrayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> a = new ArrayList<>(); int count=0;
		for(int i=0;i<N;i++) {
			int ele = scan.nextInt();
			if(i==0) {
				a.add(ele);count-=1; continue;
			}
			int l = a.size();
			if(ele<a.get(0)) {
				count-=1;a.add(ele);Collections.sort(a);continue;
			}
			else if(ele>a.get(a.size()-1)) {
				count+=a.get(a.size()-1);a.add(ele);Collections.sort(a);continue;
			}
			else { 
				for(int j=1;j<l;j++) {
				if(ele>a.get(j)) continue;
				else if(ele<a.get(j)) {
					count+=a.get(j-1);a.add(ele);Collections.sort(a);break;
				}
					
				}
			} 
				
		}
		System.out.println(count);

	}

}
