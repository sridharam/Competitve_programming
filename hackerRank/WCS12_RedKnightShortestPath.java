package hackerRank;
// asn =https://www.hackerrank.com/rest/contests/world-codesprint-12/challenges/red-knights-shortest-path/hackers/Billy06/download_solution
import java.util.*;
public class WCS12_RedKnightShortestPath {
	static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
		if((i_start%2==0 && i_end%2!=0)||(i_start%2==1 && i_end%2!=1)) {
			System.out.println("Impossible1");return;
		}
		if(i_end==i_start) { String s="";
			if((j_start%2==0 && j_end%2!=0)||(j_start%2==1 && j_end%2!=1)) {
				System.out.println("Impossible2");return;
			}
			else if(j_end>j_start) { int count=0;
				while(j_start!=j_end) {
					j_start+=2; s+="R"+" ";count++;
				}System.out.println(count);
				System.out.println(s); return;
			}
			else if(j_end<j_start) { int count=0;
			while(j_start!=j_end) {
				j_start-=2; s+="L"+" ";count++;
			}System.out.println(count);
			System.out.println(s); return;
			}
		}
		if(j_end==j_start) {String s="";
			if((i_start+i_end)%4!=0) {System.out.println("Impossible3");return;}
			else if(i_end>i_start){ int count=0;
			while(i_start!=i_end) {
				i_start+=2; 
				if(count%2==0)s+="LR"+" ";
				else s+="LL"+" "; 
				count++;
			}System.out.println(count);
			System.out.println(s); return;
			}
			else if(i_end<i_start){ int count=0;
			while(i_start!=i_end) {
				i_start-=2; 
				if(count%2==0)s+="UL"+" ";
				else s+="UR"+" "; 
				count++;
			}System.out.println(count);
			System.out.println(s); return;
			}
		}	
		
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i_start = in.nextInt();
        int j_start = in.nextInt();
        int i_end = in.nextInt();
        int j_end = in.nextInt();
        printShortestPath(n, i_start, j_start, i_end, j_end);
        in.close();
    }
}
