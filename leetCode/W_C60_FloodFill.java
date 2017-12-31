package leetCode;

import java.util.Arrays;

public class W_C60_FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
      int l=image.length;
      int rowL = image[0].length;
      boolean[][] b=new boolean[l][l];
     Arrays.fill(b, false);
     for(int i=0;i<l;i++) {
    	 for(int j=0;j<rowL;j++) {
    		 if(image[i][j]==image[sr][sc]) b[i][j]=true;
    	 }
     }
     for(int i=sr;i<l;i++) {
    	 for(int j=sc;j<rowL;j++) {
    		 
    	 }
     }
	return image;
    }
	public static void main(String[] args) {
		int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
		int sr = 1;
		int sc = 1;
		int newColor =2;

	}

}
