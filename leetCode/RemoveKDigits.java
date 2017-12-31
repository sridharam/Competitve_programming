package leetCode;

public class RemoveKDigits {

	public static void main(String[] args) {
		String num = "94123859"; int k=3;
		char[] arr = num.toCharArray();
		int l = arr.length; 
		for(int i=0;i<l;i++) {
			if(arr[i]>arr[i+1]) arr[i]='2';
		}

	}

}
