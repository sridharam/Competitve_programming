package hackerRank;
import java.util.*;
public class AlternatingCharacters {
	static int alternatingCharacters(String s){
        int l= s.length();
        int count=0;
        for(int i=0;i<l-1;i++) {
        	if(s.charAt(i)==s.charAt(i+1)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}