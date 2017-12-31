package hackerRank;
import java.util.*;
public class CommonChild {
	static int commonChild(String s1, String s2){
        char[] A = s1.toCharArray();
        char[] B = s2.toCharArray();
        int[][] LCS = new int[A.length + 1][B.length + 1];
    	String[][] solution = new String[A.length + 1][B.length + 1];
    	// if A is null then LCS of A, B =0
    	for (int i = 0; i <= B.length; i++) {
    		LCS[0][i] = 0;
    		solution[0][i] = "0";
    	}

    	// if B is null then LCS of A, B =0
    	for (int i = 0; i <= A.length; i++) {
    		LCS[i][0] = 0;
    		solution[i][0] = "0";
    	}

    	for (int i = 1; i <= A.length; i++) {
    		for (int j = 1; j <= B.length; j++) {
    			if (A[i - 1] == B[j - 1]) {
    				LCS[i][j] = LCS[i - 1][j - 1] + 1;
    			} else {
    				LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
    			}
    		}
    	}
    	return LCS[A.length][B.length];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = commonChild(s1, s2);
        System.out.println(result);
    }
}
