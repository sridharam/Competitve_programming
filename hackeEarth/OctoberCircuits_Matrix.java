package hackeEarth;
import java.util.*;
import java.math.*;
//not  done for negative coordinates.
public class OctoberCircuits_Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeMap<Integer,Integer> tm = new TreeMap<>(Collections.reverseOrder());
		int n =scan.nextInt();
		int q = scan.nextInt();
		int b[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			b[i][0]=scan.nextInt();
			b[i][1]=scan.nextInt();
			tm.put(b[i][1], b[i][0]);
		}
		int start[][] = new int[q+1][q+1];
		int end[][] = new int[q+1][q+1];
		for(int i=0;i<q;i++) {
			start[i][0]=scan.nextInt();
			start[i][1] = scan.nextInt();
			end[i][0] = scan.nextInt();
			end[i][1] = scan.nextInt();
		}	int count=0;
		for(int i=0;i<q;i++) { int key=0,value=0; count=0;int startx  = start[i][0],starty = start[i][1],endx = end[i][0],endy = end[i][1];
			if(start[i][0]<end[i][0]) {
				for(Map.Entry<Integer, Integer> entry:tm.entrySet()){ System.out.println("inside if for");
					if(entry.getValue()<end[i][0] && entry.getValue() >start[i][0]) {key = entry.getKey(); value =entry.getValue();
					System.out.println("inside if with key as "+key+" and value as "+value);
					if(startx==endx && starty==endy ) { System.out.println(count);break;}
					else { count+= key-start[i][1]+1;     starty +=key; }
					if(startx==endx && starty==endy ) {System.out.println(count); break;}
					else { count+=end[i][0]-start[i][0];startx+=end[i][0]-start[i][0]; }
					if(startx==endx && starty==endy ) { System.out.println(count);break;}
					else count+=Math.abs(end[i][1]-starty);
					System.out.println(count);
					break;
					}
				}
			}
			else if(start[i][0]>end[i][0]) {
				for(Map.Entry<Integer, Integer> entry:tm.entrySet()){ starty=0;System.out.println("inside else if for");
					if(entry.getValue()>end[i][0] && entry.getValue() <start[i][0]) {key = entry.getKey(); value =entry.getValue();
					System.out.println("inside else if with key as "+key+" and value as "+value);
					if(startx==endx && starty==endy ) {System.out.println(count); break;}
					else { count+= key-start[i][1]+1;     starty +=key+1; }
					if(startx==endx && starty==endy ) { System.out.println(count);break;}
					else { count+=Math.abs(end[i][0]-start[i][0]);startx+=end[i][0]-start[i][0]; }
					if(startx==endx && starty==endy ) {System.out.println(count); break;}
					else count+=Math.abs(end[i][1]-starty);
					System.out.println(count);
					break;
					}
				}
			}
			else System.out.println(Math.abs(endy-starty));
		}
		//System.out.println(count);
		
	}

}
/*
2 3
1 1
3 4
0 1 2 1
0 1 4 4
-1 -1 -1 -1
*/