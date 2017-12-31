/*Using the Java language, have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word. Words will be separated by only one space. 
Sample Test Cases
Input:"hello world"
Output:"Hello World"

Input:"i ran there"
Output:"I Ran There"*/
package coderbyte;
import java.util.*; 
import java.io.*;

class Main3 {  
  public static String LetterCapitalize(String str) { 
	
	  char[] arr = str.toCharArray();
	  for(int i=0; i<arr.length;i++) {
		  if(i==0)
			  arr[i] = Character.toUpperCase(arr[i]);
		  if(arr[i] == ' ') {
			  arr[i+1] = Character.toUpperCase(arr[i+1]);
		  }
	  }
	 String newStr = new String(arr);
  
    return newStr;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
  
}








  