//https://leetcode.com/problems/arithmetic-slices/description/
package leetCode;

public class AirthmeticSlices {
		static	int count=0,sum=0,i=0;
	public static void main(String[] args) {
		int[] a = {1,2,3,4,9,8,1,2,3,4,200,205,210,325,350,};
		int diff;//num=1,count=0,sum=0,i=0;
		for(i=0;i<a.length-1;i++) { count=1; System.out.println("inside for with i "+i);
			diff= a[i+1]-a[i];
			i = Number(a,i,diff);
			--i;
		}
		System.out.println(sum);
	}
	static int Number(int[] a,int i,int diff) {
		for(;i<a.length-1;i++) {
			if(a[i+1]-a[i]==diff) { System.out.println("inside num if with "+i);count++;
			System.out.println("count is "+count);
				if(i+2==a.length) { 
					for(int k=1;k<count-1;k++)
						sum+=k;
					}
				continue;
				}
				else { if(count>2) {
					for(int k=1;k<count-1;k++)
						sum+=k;
				}
					return i;
				}
					
			}
		return i;
		}
	
		
}
	
	


