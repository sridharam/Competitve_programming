package coderbyte;
//https://leetcode.com/articles/power-of-three/
// check if a number is power of 3 or not; Similarly for signed 32 bits it is 1162261467 (3^19)
public class Test2 {

	public static void main(String[] args) {
		
		int num= 2187; int value = num;
		System.out.println(value != 0 && 1162261467 % value == 0);
		
	}

}
