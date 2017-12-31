package hackerRank;
import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class TestClass {
	public static int  count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String N = br.readLine();

         String out_ = PrimeDigitNumber(N);
         System.out.println("outis "+out_);
         
         wr.close();
         br.close();
    }
    static String PrimeDigitNumber(String N1){
    	StringBuilder N = new StringBuilder(N1); String m="";
    
    	int n = N.length(); 
    	if(count==0&&N.charAt(0)=='1')
    	 { for(int i=0;i<n-1;i++)
    		 m=m+'7';
    	 	return m;
    		}
    	int l = N.length();	
    	for(int i=0;i<l;i++) {  count++;
    		char c = N.charAt(i); 
    		
    		if(c=='7'||c=='5'||c=='3'||c=='2') continue;
    		else{//System.out.println("inside else");
    			if(c>'7') { N.deleteCharAt(i);N.insert(i, "7");}
    			else if(c>'5') { N.deleteCharAt(i);N.insert(i, "5");}
    			else if(c>'3') { N.deleteCharAt(i);N.insert(i, "3");}
    			else if(c>'2') { N.deleteCharAt(i);N.insert(i, "2");}
    			else if(c=='1'||c=='0')	{ char c1=N.charAt(i-1);
    				N.deleteCharAt(i);N.insert(i, "7");
    				System.out.println(N);
    				if(c1=='2') {N.deleteCharAt(i-1);N.insert(i-1, "1"); 
    				String v =N.toString(); System.out.println("inside fun call");
    				v=PrimeDigitNumber( v); 
    				StringBuilder N2= new StringBuilder(v);
    				N=N2;
    				}
    				else if(c1=='7') { N.deleteCharAt(i-1);N.insert(i-1, "5");}
        			else if(c1=='5') { N.deleteCharAt(i-1);N.insert(i-1, "3");}
        			else if(c1=='3') { N.deleteCharAt(i-1);N.insert(i-1, "2");}
    				
    				}
    				}
    			
    			
    		
    		}
    	return N.toString();
    	}
           
        
    
    }
