package hackerRank;
import java.util.*;


// ans = the total cost = 2* number of visible faces;
public class WKOfCode35_3DSurfaceArea {
	static int surfaceArea(int[][] A,int H,int W) {
        int visible=0; int prev=0;
        for(int i=0;i<H;i++) {prev=0;
        	for(int j=0;j<W;j++) {
        		if(prev<=A[i][j]) {
        		visible+=A[i][j]+1-prev;}
        		else visible+=1;
        		 //System.out.println(visible + " "+prev);
        		prev = A[i][j];
        		if(i+1<H) {
        			visible+=(A[i][j]>A[i+1][j])?A[i][j]-A[i+1][j]:0;
        		}
        		else if(i==H-1) visible+=A[i][j];
        	}
        	//System.out.println("   "+visible);
        }
        return visible*2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H][W];
        for(int A_i = 0; A_i < H; A_i++){
            for(int A_j = 0; A_j < W; A_j++){
                A[A_i][A_j] = in.nextInt();
            }
        }
        int result = surfaceArea(A,H,W);
        System.out.println(result);
        in.close();
    }
}
