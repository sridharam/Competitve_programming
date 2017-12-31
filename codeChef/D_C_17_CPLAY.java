package codeChef;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;


public class D_C_17_CPLAY {
   // private static PrintWriter out;
	public static void main(String[] args) throws Exception {
		 Reader in=new Reader();
        //out = new PrintWriter(System.out);
        String s; int T=3;
        while(T-->0) {s =in.readLine();//System.out.println(s);
        	StringBuilder sb = new StringBuilder(s); int teamA=0,teamB=0;String win="";int count=0; int x=0;
        	for(int i=0;i<10;i++) {
        		teamA+=Integer.parseInt(""+sb.charAt(i));
        		teamB+=Integer.parseInt(""+sb.charAt(i+1));
        		i++;count+=2;
        		if((teamA-teamB)>5) {System.out.println("TEAM-A "+count); win="TEAM-A";break;}
        		else if((teamB-teamA)>5) {System.out.println("TEAM-B "+count);win="TEAM-B";	break;}
        	}
        	if(win.equals("")){
        		for(int i=10;i<20;i++) {
        			teamA+=Integer.parseInt(""+sb.charAt(i));
            		teamB+=Integer.parseInt(""+sb.charAt(i+1));
            		i++;count+=2;
            		if(teamA==teamB) continue;
            		else if(teamA>teamB) {System.out.print("TEAM-A "+count);win="TEAM-A";break;}
            		else	{System.out.println("TEAM-B "+count);win="TEAM-B";	break;}
        		}
        	}
        	label:
        	if(win.equals("")) {
        		System.out.println("TIE");
        	}
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
    }

}
