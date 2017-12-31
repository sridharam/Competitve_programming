package hackeEarth;//not done
import java.util.*;
import java.io.*;
public class DC_17_StringSets {
	static int i=1,j=27;
	static	HashMap<Character,Integer>hm = new HashMap<>();
	static {
		for(char a ='a',A='A';a<='z';a++,A++) {
			hm.put(a, i++);hm.put(A, j++);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String str = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(str);
        long N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());
        long K =  Integer.parseInt(st.nextToken());
         str = br.readLine().trim();st = new StringTokenizer(str);
        String s =st.nextToken();
        System.out.println(hm);
        System.out.println(weight(s,M));
        
	}
	static long weight(String s,long M) {
		
		StringBuilder sb = new StringBuilder(s); long weight=0;
		int N = s.length();
		for(int i=0;i<N;i++) {
			weight+=hm.get(sb.charAt(i))%M;
		}
		return weight;
	}

}
