package leetCode;

public class IntegerReplacement {
	static int way=0;
	public static void main(String[] args) {
		int n = 59994;
		while(n>1) {System.out.println("inside while1 and n is "+n);
			System.out.println("n mod 2 is "+n%2);
			if(n%2==0) { n = positive(n);}
			else {n = negative(n);}
		}
		System.out.println("minimum ways is "+way);
	}
	 static int positive(int n) {
		while(n%2==0) { System.out.println("n and way are "+n+" "+way);
			way++; n=n/2;
		}
		return n;
	}
	 static int negative(int n) { 
                   System.out.println("n and way are "+n+" "+way);
			way++; n=n-1;
		
		return n;
	}

}
