/*Using the Java language, have the function AlphabetSoup(str) take the str string parameter being passed and return the string with the letters in alphabetical order (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not be included in the string. 
Sample Test Cases
Input:"coderbyte"
Output:"bcdeeorty"

Input:"hooplah"
Output:"ahhloop"*/
package coderbyte;
import java.util.*; 
import java.io.*;

class Main5 {  
  private static Scanner s;

public static String AlphabetSoup(String str) { 
  
    char[] arr = str.toCharArray();
    for(int j=0;j<arr.length;j++)
    for(int i = 0; i<arr.length-1;i++) {
    	if(arr[i]>arr[i+1]) {
    		char temp = arr[i+1];
    		arr[i+1] =arr[i];
    		arr[i]= temp;
    	}
    }
      String newStr = new String(arr);
    return newStr;
    
  } 
  
  public static void main (String[] args) {  
    s = new Scanner(System.in);
    System.out.print(AlphabetSoup(s.nextLine())); 
  }   
  
}








  