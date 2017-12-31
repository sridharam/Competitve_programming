package hackeEarth;
import java.util.*;

public class MonkvisitsCoderland {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++) {
			int N = scan.nextInt();
			long [] price = new long[N];
			long [] petrolReq = new long[N];
			for(int j=0;j<N;j++) {
				price[j] = scan.nextLong();
			}
			for(int j=0;j<N;j++) {
				petrolReq[j] = scan.nextLong();
			}
			long min = price[0];long money=0;
			for(int j=0;j<N;j++) {
				min =Math.min(min, price[j]);
				money+= min*petrolReq[j]; 
			}
			System.out.println(money);
		}
	}

}
/* faster reading
 public static void main(String args[] ) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int noOfTestCases = Integer.parseInt(br.readLine());
    for(int i=0;i<noOfTestCases;i++){
        int noOfCheckPoints = Integer.parseInt(br.readLine());
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
            totalCost += currentCost*currentAmount;
        }
        System.out.println(totalCost);
        }
        
    }    */
