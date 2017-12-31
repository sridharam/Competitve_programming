/*Using the Java language, have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string. 
Sample Test Cases
Input:"hello*3"
Output:"Ifmmp*3"

Input:"fun times!"
Output:"gvO Ujnft!*/
package coderbyte;
import java.util.*; 
import java.io.*;

class Main1 {  
  public static String LetterChanges(String str) { 
	  char[] arr = str.toCharArray();
	  int length = arr.length;
	  for(int i=0;i<length;i++) {
		  if(arr[i] == ' ') {continue;}
		  arr[i] = (char) (arr[i]+1);
		  if(arr[i] =='a' || arr[i] == 'e'||arr[i] == 'i'||arr[i]=='o' ||arr[i]=='u') {
			  arr[i] = Character.toUpperCase(arr[i]);
		  }
	  }
  String str1 = new String(arr);
    
    return str1;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}








  