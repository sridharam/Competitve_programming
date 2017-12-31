package hackeEarth;
import java.util.*;//not done
public class Ubona_dev_hiringCanyouCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
		while(T-->0) {
			String s = scan.next();
			char[] a = s.toCharArray();
			int l = a.length; int x=0; String v="";
			for(int i=0;i<l;i++) {
				if(a[i]=='a' || a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
					if(!v.contains(a[i]+"")) {
						v=v+a[i];
					}
				}
				else if(a[i]=='_') {x++;
					int ll = v.length();
					hm.put(x, ll);
					if(ll==5) {
						break;
					}
				}
			} System.out.println(hm);
			StringTokenizer stk = new StringTokenizer(s,"_");
			int count = stk.countTokens();
			if(count==1) System.out.println("1");
			else {
				
			}
			
		}
	}

}
