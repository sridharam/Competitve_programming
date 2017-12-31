package hackerRank;
import java.util.*;
public class ExtraSweet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		Map<Long, Long> map = new HashMap<>();
		for(int a0 = 0; a0 < s; a0++){
			long l = in.nextInt();
			long r = in.nextInt();
			long ans = (r * (r + 1) - l * (l - 1)) / 2;
			//System.out.println(ans);
			long prev = l - 1, next = r + 1;
			while(map.containsKey(prev)){
				prev = map.get(prev);
			}
			while(map.containsKey(next)){
				next = map.get(next);
			}
			if(prev >= 0){
				ans += prev;
				map.put(prev, next + 1);
			}

			if(next < n){
				ans += next;
				map.put(next, prev - 1);
			}

			System.out.println(ans);
		}
		
	}

}
