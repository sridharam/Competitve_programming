package hackeEarth;

public class OctoberCircuits_Statisticsofstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// returns array z[] where z[i] is z-function of s[i]
		int[] a = zFunction("0111110");
		a[0] = 0;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	 static int[] zFunction(String s) {
	    int n = s.length();
	    int z[] = new int[n];
	    int R = 0;
	    int L = 0;
	        
	    for(int i = 1; i < n; i++) {
	        z[i] = 0;
	        if (R > i) {
	            z[i] = Math.min(R - i, z[i - L]);
	        }
	        while (i + z[i] < n && s.charAt(i+z[i]) == s.charAt(z[i])) {
	            z[i]++;
	        }
	        if (i + z[i] > R) {
	            L = i;
	            R = i + z[i];
	        }
	    }

	    z[0] = n;

	    return z;
	}

}
