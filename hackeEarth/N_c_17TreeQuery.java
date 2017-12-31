package hackeEarth;
import java.util.*;
// best sub:https://www.hackerearth.com/submission/13339916/
// best usage check above link;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
// RUNTIME ERROR
public class N_c_17TreeQuery {
		private static  String START = "0";
	    private static  String END = "0";
	    public static boolean[] b;
	public static void main(String[] args) throws Exception {
		Graph graph = new Graph();
		Reader scan =new Reader();
		try{int n = scan.nextInt();
		String[] a = new String[n];
		b = new boolean[n];
		Arrays.fill(b, false);
		
		for(int i=0;i<n;i++) {
			a[i] = ""+scan.nextInt();
			if(a[i].chars().distinct().count()==a[i].length()) b[i]=true;
		}
		for(int i=0;i<n-1;i++) {
			String ai = ""+scan.nextInt();
			String bi = ""+scan.nextInt();
			graph.addTwoWayVertex(ai, bi);
		}
		int q = scan.nextInt();
		for(int i=0;i<q;i++) {
			START = ""+scan.nextInt();
			END  = ""+scan.nextInt();
			LinkedList<String> visited = new LinkedList<>();
			visited.add(START);
			new N_c_17TreeQuery().depthFirst(graph, visited);
		}
		scan.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	  static class Reader
	    {
	        final private int BUFFER_SIZE = 1 << 16;
	        private DataInputStream din;
	        private byte[] buffer;
	        private int bufferPointer, bytesRead;
	 
	        public Reader()
	        {
	            din = new DataInputStream(System.in);
	            buffer = new byte[BUFFER_SIZE];
	            bufferPointer = bytesRead = 0;
	        }
	 
	        public Reader(String file_name) throws IOException
	        {
	            din = new DataInputStream(new FileInputStream(file_name));
	            buffer = new byte[BUFFER_SIZE];
	            bufferPointer = bytesRead = 0;
	        }
	 
	        public String readLine() throws IOException
	        {
	            byte[] buf = new byte[64]; // line length
	            int cnt = 0, c;
	            while ((c = read()) != -1)
	            {
	                if (c == '\n')
	                    break;
	                buf[cnt++] = (byte) c;
	            }
	            return new String(buf, 0, cnt);
	        }
	 
	        public int nextInt() throws IOException
	        {
	            int ret = 0;
	            byte c = read();
	            while (c <= ' ')
	                c = read();
	            boolean neg = (c == '-');
	            if (neg)
	                c = read();
	            do
	            {
	                ret = ret * 10 + c - '0';
	            }  while ((c = read()) >= '0' && c <= '9');
	 
	            if (neg)
	                return -ret;
	            return ret;
	        }
	 
	        private void fillBuffer() throws IOException
	        {
	            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
	            if (bytesRead == -1)
	                buffer[0] = -1;
	        }
	 
	        private byte read() throws IOException
	        {
	            if (bufferPointer == bytesRead)
	                fillBuffer();
	            return buffer[bufferPointer++];
	        }
	 
	        public void close() throws IOException
	        {
	            if (din == null)
	                return;
	            din.close();
	        }
	    }
	 
	private  void depthFirst(Graph graph, LinkedList<String> visited) {
    LinkedList<String> nodes = graph.adjacentNodes(visited.getLast());

    for (String node : nodes) {
        if (visited.contains(node)) {
            continue;
        }
        if (node.equals(END)) {
            visited.add(node);
            printPath(visited);
            return;
            //visited.removeLast();
           // break;
        }
    }
    for (String node : nodes) {
        if (visited.contains(node) || node.equals(END)) {
            continue; 
        }
        visited.addLast(node);
        depthFirst(graph, visited);
        visited.removeLast();
    }
}

private  void printPath(LinkedList<String> visited) { 
    //System.out.println(visited);
   // System.out.println();
    String[] array = visited.stream()
            .toArray(String[]::new);
    int N = array.length; int count=0;
    for(int i=0;i<N;i++) {
		for(int j=i;j<N;j++) {
			for(int k=i;k<=j;k++) {
				if(b[Integer.parseInt(array[k])-1]==true) { count++;break;}
				
			}
		}
	} System.out.println(count);
}
}
 class Graph {
    private Map<String, LinkedHashSet<String>> map = new HashMap();

    public void addEdge(String node1, String node2) {
        LinkedHashSet<String> adjacent = map.get(node1);
        if(adjacent==null) {
            adjacent = new LinkedHashSet();
            map.put(node1, adjacent);
        }
        adjacent.add(node2);
    }

    public void addTwoWayVertex(String node1, String node2) {
        addEdge(node1, node2);
        addEdge(node2, node1);
    }


    public LinkedList<String> adjacentNodes(String last) {
        LinkedHashSet<String> adjacent = map.get(last);
        if(adjacent==null) {
            return new LinkedList();
        }
        return new LinkedList<String>(adjacent);
    }
}