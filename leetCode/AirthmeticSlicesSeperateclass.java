package leetCode;
class Solution22 {
    public int numberOfArithmeticSlices(int[] a) {
        int result = 0;
        if(a.length < 3) {
            return result;
        }
        int[] list = new int[a.length];
        for(int i = 2 ; i < a.length; i++) {
            if(a[i] - a[i-1] == a[i-1] - a[i-2]) {
                list[i] += list[i-1] + 1;
            }
        }
        for(int add: list) {
            result += add;
        }
        return result;
    }
}
class Solution11 {
    
    public int numberOfArithmeticSlices(int[] a) {
        
    	int count=0,sum=0,i=0;
		int diff;
		label:
		for(i=0;i<a.length-1;i++) { count=1; 
			diff= a[i+1]-a[i];
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
					--i; continue label;
				}
					
			}
		--i; continue label;
		}
		System.out.println(sum);
        return sum;
	}
	 
        
    }
public class AirthmeticSlicesSeperateclass {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,9,8,1,2,3,4,200,205,210,325,350,375};
		Solution11 s = new Solution11();
		s.numberOfArithmeticSlices(a);
		// fast implementation with class Solution22
		Solution22 s2 = new Solution22();
		System.out.println(s2.numberOfArithmeticSlices(a));
				

	}

}
