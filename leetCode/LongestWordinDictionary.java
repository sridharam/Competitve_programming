package leetCode;//https://leetcode.com/problems/longest-word-in-dictionary/solution/
import java.util.*;
public class LongestWordinDictionary {
	
	public static String longestWord(String[] words) {
		Arrays.sort(words);
        Set<String> built = new HashSet<String>();
        String res = "";
        for (String w : words) {//System.out.println(built + "word ="+w);
            if (w.length() == 1 || built.contains(w.substring(0, w.length() - 1))) {
                res = w.length() > res.length() ? w : res;
                built.add(w);
            }
        }
        return res;
    }
    
	public static void main(String[] args) {
		
		String[] words = {"yo","ew","fc","zrc","yodn","fcm","qm","qmo","fcmz","z","ewq","yod","ewqz","y"};
		String ans =longestWord(words);
		System.out.println(ans);
	}

}
