package lg.lg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removingduplicates {
	
	static int[] a= {2,2,3,4,4,5,66,67,22,3};
	
public static HashSet<Integer> removingduplicate(int[] a) {
	
	HashSet<Integer> str=new HashSet<>();
	
	for(int s:a) {
		str.add(s);
	}
	
	
	return str ;
}
	public static void main(String[] args) {
		Set<Integer> ds=removingduplicate(a);
		List<Integer> sortedList = new ArrayList<>(ds);
		
		Collections.sort(sortedList);
		System.out.println(sortedList);

	}

}
