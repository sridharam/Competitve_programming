package leetCode;

public class NewPattern {

	public static void main(String[] args) {
		/*for(int i =1;i<=5;i++) {
			for(int j=1;j<=i+i;j++) {
				if(i%2==0) {
					j++;System.out.print(j+" ");
				}
				else {
					System.out.print(j+" "); j++;
				}
			}
			System.out.println();
			
		}*/
		String s1 = "rama",s2="am";
		char[] a =s1.toCharArray();
		char[] b=s2.toCharArray(); int count=0;int index=0;
		
		int l =a.length, m=b.length; int i1; 
		label:
		for(int i=0;i<l;i++)
		{ count=0; i1=i;index=i;
			for(int j=0;j<m;j++) {
				if(b[j]==a[i1]&&i1<l) {
					i1++;count++;
					if(count==m) break label;
					continue;
				}
				else break;
				
			}
		
		
		}
		if(count==m) {System.out.println(true);
			for(int k =0;k<a.length;k++) {
				if(k>=index&&k<m+index) 	
					continue;
				else System.out.print(a[k]);
			}
		}
		else System.out.println(false);
}
}