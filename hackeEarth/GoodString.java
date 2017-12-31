package hackeEarth;
import java.util.*;
public class GoodString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Character,Integer> hm = new HashMap<>();
		System.out.println("enter a string");
		String s = scan.next();
		char[] a = s.toCharArray(); int count=0;
		for(char c:a) {
			hm.put(c, hm.get(c)==null?1:++count);
		}
		System.out.println("the no characters to be removed to get all char as unique is= "+count);
	}

}
