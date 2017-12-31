//https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class SubstringConcat {

	public static void main(String[] args) {
		String s ="barfoothefoobarman";
		String[] words= {"foo", "bar"};
		List<Integer> l = new ArrayList<>(); 
        for(int i = 0;i<words.length;i++){
            if(s.contains(words[i])){
                l.add(s.indexOf(words[i]));
            }
        }
        System.out.println(l);
	}

}
