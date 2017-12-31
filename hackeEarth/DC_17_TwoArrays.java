package hackeEarth;
import java.util.*;
// 5 test case pass.
//check for
/*
 * 	3 3 3
	2 2 3
	3 2 3

 */
public class DC_17_TwoArrays {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt(); int count=0;
		long[] a = new long[N]; ArrayList<Long>al = new ArrayList<>();
		long[] b = new long[M];ArrayList<Long>bl = new ArrayList<>();
		for(int i=0;i<N;i++) {
		a[i] = scan.nextLong();	
		al.add(a[i]);
		}
		for(int i=0;i<M;i++) {
			b[i] = scan.nextLong();	
			bl.add(b[i]);
		}
		ArrayList<Long>all = new ArrayList<>();ArrayList<Long>bll = new ArrayList<>();
		ArrayList<Long>al2 ;// bll = (ArrayList<Long>) bl.clone();
		int col=0;
		for(int i=K;i<N+1;i++) { 
			for(int j=0;j+K<N+1;j++) {
				if(j+i>N) break;
			all = new ArrayList<Long>(al.subList(j, j+i)); System.out.println(all);System.out.println();
			//al2 = (ArrayList<Long>) all.clone();
				for(int k =0;k+K<=M;k++) { if(k+i>M) break;//all =al2;
				bll = new ArrayList<Long>(bl.subList(k, k+i));	 System.out.println(bll);//System.out.println("ad");
				al2 = (ArrayList<Long>) bll.clone(); 
				 al2.retainAll(all);//System.out.println(al2);
				 int l = al2.size();
				bll = (ArrayList<Long>) al2.clone(); int row=0; HashMap<Long,Integer>hm = new HashMap<>();
				if(bll.size()>=k) for(int m=0;m<all.size();m++) { 
					long ele = all.get(m);// System.out.println("removing");
					if(hm.get(ele)==null) {
						hm.put(ele,1); int freq1 = Collections.frequency(all, ele);int freq2 =Collections.frequency(al2, ele);
						row+=Math.min(freq1, freq2);
						System.out.println(freq1+" are "+ele+" "+freq2);
					}
					al2.remove(ele); //System.out.println(al2);
					
				}System.out.println(hm);
				hm=null;System.out.println("al2 after remving"); System.out.println(al2); System.out.println();
				//bll.retainAll(all);System.out.println("bll after retain "+al2.size() );
				//System.out.println(bll);
				if(bll.size()>=K && (al2.size()==0 || al2.size()>=K-1)) count++;System.out.println("count "+count);
				if(row>=K) {col++; }System.out.println("row "+col);System.out.println("---");
				}
				System.out.println("----------");
				
			
			}
		}
		System.out.println(count + " col "+col);
		
	}

}
