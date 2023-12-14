package lg.lg;

import java.util.Arrays;

public class e {
	static int  target=97;
	public static void main(String[] args) {
		int[][]  a= {
				{101,20,1102,400,1150,60},
				{34,87,90,45},
				{89,56,87,34},
				{12,34,97,46,67}
				};
		
	
		int[] ele=indetarget(a,target);

		System.out.println(Arrays.toString(ele));
		
	}
	
	public static int[] indetarget(int[][] s,int w) {
		
		for(int row=0;row<s.length;row++) {
			for(int col=0;col<s[row].length;col++) {
				
				if(s[row][col]==target) {
					return new int[] {row,col};
				}
			}
			
		}
		
		return new int[] {-1,-1};
		
	}
	
	

}
