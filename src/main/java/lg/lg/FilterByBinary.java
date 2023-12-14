package lg.lg;

public class FilterByBinary {

	
	
	public static int search(int[] a,int target){
		int start=0;
		int end=a.length-1;

		while(start<=end){

		int mid =start+(end-start)/2;

		if(a[mid]==target){
		return mid;
		}
		if(a[mid]<target){
		start=mid+1;
		}else{
		end=mid-1;
		}



		}
		return -1;
		}



		
	
	
	public static void main(String[] args) {
		int[] s= {2,3,4,5,6,7};
		int tarf=7;
		System.out.println(search(s,tarf));

	}

}
