package leetCode;
import java.util.*;
        public class ABC 
        {
        	{
        	System.out.println("inside non static block");
         final Vector s;
         s=new Vector();
        	}
        public ABC()
        {
        }
        public void XYZ() 
        {
        	System.out.println("inside XYZ");
       //System.out.println(s.isEmpty());//error s can't be resolved
        }
        public static void main(String args[]) 
        { 
        	ABC A = new ABC(); 
        	A.XYZ();
        } 
    }