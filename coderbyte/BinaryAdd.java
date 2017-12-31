package coderbyte;

import java.util.Scanner;

class BinaryAdd {
    public static String addBinary(String a, String b) {    	
    	/*Integer.parseInt() to convert a String to int.
    	 * Alternatively, you can use Integer.valueOf(), it will returns an Integer object
    	 * Note
          In summary, parseInt(String) returns a primitive int, whereas valueOf(String) returns
           a new Integer() object.*/

    
    	long a1=0,b1=0;
    	String s2 = "";
    	for(int i =a.length()-1, j=0 ; (a.length()-j)!=0;i--,j++) {
    		int d = a.charAt(i);
    		if(d==48)
    			d = 0;
    		else
    			d = 50-d;
    	
    		a1 =  (long) (a1+d*(Math.pow(2, j)));
    		
    	}
    	for(int i =b.length()-1, j=0 ; (b.length()-j)!=0;i--,j++) {
    		int d = b.charAt(i);
    		if(d==48)
    			d=0;
    		else
    			d=50-d;
    		b1 = (long) (b1+d*(Math.pow(2, j)));
    		
    	}
    	System.out.println(a1+" "+b1);
    	long ans1 = a1+b1;
    	if(ans1 == 0)
    		s2 = "0";
    	else
    	while(ans1>0) {
    		long rem = ans1%2;
    		s2 = rem+s2;
    		ans1=ans1/2;
    	}
    	
        return s2;
    }
    
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String s1, s2;
    	System.out.println("enter the first binary number");
    	s1 = scan.next();
    	System.out.println("enter the second binary number");
    	s2 = scan.next();
    	System.out.println( addBinary( s1,  s2));

    	
    }
    
}