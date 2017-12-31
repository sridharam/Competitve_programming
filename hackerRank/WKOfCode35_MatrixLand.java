package hackerRank;
import java.util.*;//not done
public class WKOfCode35_MatrixLand {
	static int matrixLand(int[][] A,int n,int m,boolean sumRow[]) {
		int total=0;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				if(sumRow[i]==true) { total+=A[i][j];}
				else {
					
				}
			}
		}
		return total;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] A = new int[n][m];boolean sumRow[] = new boolean[n];
        for(int A_i = 0; A_i < n; A_i++){ int totalSum=0,positiveSum=0;
            for(int A_j = 0; A_j < m; A_j++){
                A[A_i][A_j] = in.nextInt();
                if(A[A_i][A_j]>=0 ) positiveSum+=A[A_i][A_j] ;
                totalSum+=A[A_i][A_j] ;
            }
            if(totalSum>=positiveSum) sumRow[A_i] =true;
            else sumRow[A_i] =false;
        }
        int result = matrixLand(A,n,m,sumRow);
        System.out.println(result);
        in.close();
    }
}
