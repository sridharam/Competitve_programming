package coderbyte;

public class SingleNumber {
	static int singleNumber(int A[]) {
	    int result = 0;
	    for (int i = 0; i<A.length; i++)
	    {
			result ^=A[i];
	    }
		return result;
	}
	public static void main(String[] args) {
		int a[]= {1,2,1,4,2};
		int single= singleNumber(a);
		System.out.println(single);

	}

}
