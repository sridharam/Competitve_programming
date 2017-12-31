package leetCode;

import java.util.Scanner;

public class IntegerToRoman {

	public static void main(String[] args) {
		String arr1[] = {"I","II","III","IV","V","VI","VII","VIII","IX"};
		String arr2[] = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String arr3[] = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String arr4[] = {"M","MM","MMM","MMMM"};
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter a number between 1 and 4000");
		 int num = scan.nextInt();
		 int rem; String rom=""; int i=0; int num1 = num;
		while(num>0) {
			i++;
			rem=num%10;
			num/=10;
			if(rem == 0) continue;
			if(i==1) rom=arr1[rem-1]+rom;
			else if(i==2) rom = arr2[rem-1]+rom;
			else if(i==3) rom= arr3[rem-1]+rom;
			else rom = arr4[rem-1]+rom;
			 
		}
		System.out.println("The Roman Numeral for "+num1+" is "+rom);
	scan.close();
	}

}
/* from leetcode top
 class Solution {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                num-=values[i];
                sb.append(strs[i]);
            }
       //     if(num==0) return sb.toString();
        }
        return sb.toString();
    }
}*/
/* or next to top
 class Solution {
   public String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
}*/
