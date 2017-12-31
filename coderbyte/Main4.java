/*Using the Java language, have the function SimpleSymbols(str) take the str parameter being passed and determine if it is an acceptable sequence by either returning the string true or false. The str parameter will be composed of + and = symbols with several letters between them (ie. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a + symbol. So the string to the left would be false. The string will not be empty and will have at least one letter. 
Sample Test Cases
Input:"+d+=3=+s+"
Output:"true"

Input:"f++d+"
Output:"false"
Hint*/
package coderbyte;
import java.util.*; 
import java.io.*;

class Main4 {  
  public static String SimpleSymbols(String str) { 
	  str = str.replaceAll("[a-zA-Z]", " ");
	  String newStr = "";
	  int m = str.length();
	  for(int i =0;i<m;i++) {
		  if(str.charAt(i)!=' ') {
			  continue;  
		  }
		  else if(str.charAt(i) ==' ') {
			  if(i==0)
				  break;
			  else if((str.charAt(i-1) =='+') &&(  str.charAt(i+1)=='+' ))
				  newStr = "true";
			  else {
				  newStr = "false";
				  break;
				  }
			  }
		  }
	  
    
    return newStr;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols(s.nextLine())); 
  }   
  
}








  