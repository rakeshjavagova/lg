package lg.lg;

public class binarysearch {
	
	
	public static int binarysearh(int[] s,int target) {
		
		int start=0;
		int end=s.length-1;
		
		
		
//		while(start<=end) {
//			
//			int mid=start+(end-start)/2;
//			
//			if(target<s[mid]) {
//				end=mid-1;
//			}else if(target >s[mid]) {
//				start=mid+1;
//			}else {
//				return mid;
//			}
//			
//		}
		
		
		boolean b=s[start]<s[end];
		
while(start<=end) {
			
			int mid=start+(end-start)/2;
			
			if(target==s[mid]) {
				return mid;
			}
			
			if(b) {
			
			if(target<s[mid]) {
				end=mid-1;
			}else if(target >s[mid]) {
				start=mid+1;
			}
			
		}
else {
	if(target>s[mid]) {
		end=mid-1;
	}else if(target <s[mid]) {
		start=mid+1;
	}
}
		

}
		
		return -1;
		
	}
	

	public static void main(String[] args) {
		System.out.println("helo");
		int[] a= {2,4,6,7,8,10,12,16,18};
		
//		int[] a= {18,14,12,10,9,8,7,6,5,4,3,2,1};
	
		int target=12;
		
		System.out.println(binarysearh(a,target));

	}

}
