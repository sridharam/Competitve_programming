/*sing the Java language, have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. 
Sample Test Cases
Input:"fun&!! time"
Output:"time"

Input:"I love dogs"
Output:"love"*/
package coderbyte;
import java.util.*; 
import java.io.*;

class Main {  
  public static String LongestWord(String sen) { 
	  // replaces all symbols like punctuation with spaces
	 sen = sen.replaceAll("[\\W]", " ");
	 //splits at the spaces
  StringTokenizer stk = new StringTokenizer(sen," ");
  
  String longString="";
  //int m = stk.countTokens();
  while(stk.hasMoreTokens()){
	String  token = stk.nextToken();
	if(longString.length()<token.length())
		longString = token;
	
  }
  return longString;
      
  }
       
    
    
   
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}








  