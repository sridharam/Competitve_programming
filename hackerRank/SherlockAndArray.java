package hackerRank;

public class SherlockAndArray {

	public static void main(String[] args) {
		int arr[] = {222,5,222};
		int l = arr.length; int lsum=0,rsum=0;
		/*for(int i=1;i<l-1;i++) {
			 lsum = sum(arr,0,i);
			 rsum = sum(arr,i+1,l);
			 if(lsum == rsum) { System.out.println("true at index i = "+i);break;}
		}*/
		String s ="125466658";
		char[] arr1 = s.toCharArray();
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
	static int sum(int[]arr,int i, int last) {
		int sum =0;
		for(;i<last;i++) {
			sum+=arr[i];
		}
		return sum;
		
	}

}
