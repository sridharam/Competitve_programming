
package hackerRank;
import java.io.*;
import java.util.*;

public class SwiggyTestClassModified {
	public static int  count=0, index=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String N = br.readLine();

         String out_ = PrimeDigitNumber(N);
         System.out.println("output is "+out_);
         
         wr.close();
         br.close();
    }
    static String PrimeDigitNumber(String N1){
    	StringBuilder N = new StringBuilder(N1); String m="";
    	if(N1.compareTo("21")==-1) return "7";
    	int n = N.length(); 
    	if((count==0&&N.charAt(0)=='1') ||(N.charAt(0)=='2'&&N.charAt(1)=='0'))
    	 { for(int i=0;i<n-1;i++)
    		 m=m+'7';
    	 	return m;
    		}
    	count++;
    	int l = N.length();	
    	for(int i=0;i<l;i++) {  
    		char c = N.charAt(i); 
    		if(i==0 && N.charAt(1)<'2') {
    			if(c>'7') { N.deleteCharAt(i);N.insert(i, "7");}
    			else if(c>'5') { N.deleteCharAt(i);N.insert(i, "5");}
    			else if(c>'3') { N.deleteCharAt(i);N.insert(i, "3");}
    			else if(c>'2') { N.deleteCharAt(i);N.insert(i, "2");}
    			else if(c>='7') { N.deleteCharAt(i);N.insert(i, "5");}
    			else if(c>='5') { N.deleteCharAt(i);N.insert(i, "3");}
    			else if(c>='3') { N.deleteCharAt(i);N.insert(i, "2");}
    			else if(c>='2') { N.deleteCharAt(i);N.insert(i, "");}
    			for(int y=1;y<l;y++) {
					N.deleteCharAt(y);N.insert(y, "7");
				}
				return N.toString();
    			}
    		else if(c=='7'||c=='5'||c=='3'||c=='2') continue;
    		else{
    			if(c>'7') { N.deleteCharAt(i);N.insert(i, "7");index=i+1;}
    			else if(c>'5') { N.deleteCharAt(i);N.insert(i, "5");index=i+1;}
    			else if(c>'3') { N.deleteCharAt(i);N.insert(i, "3");index=1+i;}
    			else if(c>'2') { N.deleteCharAt(i);N.insert(i, "2");index=1+i;}
    			else if(c=='3'){ N.deleteCharAt(i);N.insert(i, "2");index=1+i;}
    			else if(c=='1'||c=='0')	{ int j=i;System.out.println("initial first j is "+j);
    				char c1=N.charAt(j-1); j=i-1;
    				if(index==1) {
						for(int h=i;h<l;h++) {
							N.deleteCharAt(h);N.insert(h, "7");
						}
						return N.toString();
					}
    				N.deleteCharAt(i);N.insert(i, "7");
    				while(c1<='3'&&j>0) {System.out.println("initial j is "+j);
    					N.deleteCharAt(j-1);N.insert(j-1, "7");--j;
    					c1=N.charAt(j-1); System.out.println("j is "+j);
    					count++;}
    					
    				
    				if(c1=='0'){ N.deleteCharAt(j-1);N.insert(j-1, "7");}
    				else if(c1=='7') { N.deleteCharAt(j-1);N.insert(i-1, "5");}
        			else if(c1=='5') { N.deleteCharAt(j-1);N.insert(j-1, "3");}
        			else if(c1=='3') { N.deleteCharAt(j-1);N.insert(j-1, "2");}
    				
    				
    				System.out.println(N);
    				}
    				}
    		}
    	return N.toString();
    	}
    }
