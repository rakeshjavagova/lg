package lg.lg;

import java.util.Arrays;

public class Rest {
	
static	int target =233;
	

static int[] a= {233,12,63,83,999,172};

//static int[] a= {1,2,3,4,5,6,7,8,9,11,12,34,81};

public static int binarysearch(int[] a,int target ) {
	int left =0;
	int right=a.length-1;
	
	while(left<=right) {
		int mid=left+(right-left)/2;
		
		if(a[mid]==target) {
			return mid;
		}else if(a[mid]<target) {
			left=mid+1;
		}else {
			right=mid-1;
		}
		
	}
	
	return -1;
	}


	public static void main(String[] args) {
		Arrays.sort(a);
	int s=	binarysearch(a,target );
System.out.println("  check"+s +"   ");
	}
	
	
}
