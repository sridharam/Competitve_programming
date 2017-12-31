package hackeEarth;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class SamuandShopping {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int T = Integer.parseInt(br.readLine());
		    for(int i=0;i<T;i++){
		        int N = Integer.parseInt(br.readLine());
		        for(int j=0;j<N;j++) {
		        String[] costPetrol = br.readLine().split(" ");
		        String[] amountPetrol = br.readLine().split(" ");
		        long currentCost = Long.parseLong(costPetrol[0]); 
		        long currentAmount = Long.parseLong(amountPetrol[0]);
		        long totalCost = currentCost*currentAmount;
		        for(int m =1;m<costPetrol.length;m++){
		            currentAmount=Long.parseLong(amountPetrol[m]);
		            long nextCost=Long.parseLong(costPetrol[m]);
		            if(currentCost>nextCost){
		                currentCost=nextCost;
		            }
	}}*/
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt(); int amount=0;int min=0;int a[] = new int[3]; int index=0, preindex=0;
		for(int i=0;i<T;i++) {
			int N = scan.nextInt();
			for(int j=0;j<N;j++) {
				if(j==0) {
					a[0] = scan.nextInt();
					a[1] = scan.nextInt();
					if(a[1]<a[0]) index=1;
					a[2] = scan.nextInt();
					if(a[2]<a[1] && a[2]<a[0]) index=2;
					Arrays.sort(a);
					min = a[0];
					amount+=min;
					preindex = index;
				}
				else {a[0] = scan.nextInt();
				if(preindex!=0) {min = a[0]; index=0;}
				a[1] = scan.nextInt();
				if(a[1]<=a[0] && preindex!=1) { min = a[1];index=1;}
				a[2] = scan.nextInt();
				if(a[2]<=a[1] && a[2]<=a[0] && preindex!=2) { min = a[2];index=2;}
				amount+=min;
				preindex = index;
			}
				
			}
			System.out.println(amount);
			
		}
}
}
