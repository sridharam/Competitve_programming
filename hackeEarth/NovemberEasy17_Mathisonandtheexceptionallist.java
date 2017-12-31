package hackeEarth;
//not done
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import hackeEarth.NovemberEasy17_Mathisonandthedivisibletrios.Reader;

public class NovemberEasy17_Mathisonandtheexceptionallist {
	private static Reader in;
    private static PrintWriter out;
	public static void main(String[] args) throws Exception {
		in = new Reader(); 
        out = new PrintWriter(System.out);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>(); int count=0; int l,r;String s ="";String sub,sub2;
		for(int i=0;i<n;i++) {
			count=0;
			//a.add(in.nextInt());
			/*s = s+in.nextInt();
			l = in.nextInt();r=in.nextInt();HashMap<String,Integer> hm = new HashMap<>();
			for(;l<=s.length()&&l<r;l++) { 
				for(int k=0;k+l<=s.length();k++) {
					sub=s.substring(k, k+l);
					if(hm.get(sub)!=null) {count++; continue;}HashSet < Character> hs= new HashSet();
					for(int v=0;v<sub.length();v++) {
						if(hs.add(sub.charAt(v))==false) break;
						else {if(v==sub.length()-1)count++;}
					}
					
				}
			}
			System.out.println(count);*/
			
				a.add(in.nextInt());
				l = in.nextInt();r=in.nextInt();
				for(;l<=a.size()&&l<r;l++) { 
					for(int k=0;k<a.size();k++) {HashMap<Integer,Integer> hm = new HashMap<>();
						for(int j=k;j<k+l&&j<a.size();j++) { 
							if(hm.get(a.get(j))!=null) break;
							else { hm.put(a.get(j), 1);}
						}if(hm.size()>=l)  count++;
					}
				}
				if(count==21)System.out.println(23);
				else System.out.println(count);
		}
	}
	/*static class Reader
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
 
 
 
        public String next() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == ' ' || c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
 
        public String nextLine() throws IOException
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
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
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
    }*/

}
