package hackeEarth;
import java.util.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
// partially solved


public class N_c_17ShubhamandGrid {
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m=scan.nextInt();char s[][]= new char[n][m];char a='a',b='b',c='c',d='d';
        int rowC=0,colC=0,boxR=0,boxL=0,rowR=0,rowL=0,box=0;
        HashMap<String,Integer> hm = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        boolean bb[][] = new boolean[n][m];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		s[i][j] = scan.next().charAt(0);
        		bb[i][j]=false;
        	}
        }
        hm.put("abcd", 1);hm.put("dcba", 1);
        hm2.put("abcd", 1);hm2.put("dabc", 1);hm2.put("cdab", 1);hm2.put("bcda", 1);
        
        System.out.println("after");
        for(int i=0;i<n-1;i++) { int l=i;
        	for(int j=0;j<m-1;j++) {int k =j;
        	//if(j==m-1)continue;
        	if(bb[i][j]==true || bb[i][j+1]==true || bb[i+1][j]==true || bb[i+1][j+1]==true ) continue;
        	String v=""+s[i][j]+s[i][j+1]+s[i+1][j+1]+s[i+1][j];
        	System.out.println(v);
        	if(hm2.get(v)!=null) {box++;bb[i][j]=bb[i][j+1]=bb[i+1][j+1]=bb[i+1][j]=true;j++;}
        		
        	}
        }

        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) { int k=j,l=j;String v ="";
        		if (k<m-3 && bb[i][k]==false && bb[i][k+1]==false && bb[i][k+2]==false && bb[i][k+3]==false) v=""+s[i][k]+s[i][k+1]+s[i][k+2]+s[i][k+3];
        		System.out.println(v);
        		if(hm.get(v)!=null) {rowC++;j=j+3; bb[i][k]=bb[i][k+1]=bb[i][k+2]=bb[i][k+3]=true;}
        	}
        }
        for(int i=0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		int k=j; String v="";
        		if(k<n-3 && bb[k][i]==false && bb[k+1][i]==false && bb[k+2][i]==false && bb[k+3][i]==false ) v=""+s[k][i]+s[k+1][i]+s[k+2][i]+s[k+3][i];
        		System.out.println(v);
        		if(hm.get(v)!=null) {colC++;j=j+3;bb[k][i]= bb[k+1][i]= bb[k+2][i]= bb[k+3][i]=true;}
        	}
        }
        
//        System.out.println(rowC);
//        System.out.println(colC);
//        System.out.println(box);
        System.out.println(Math.max(rowC, colC)+box);
        
        
	}
	
}
