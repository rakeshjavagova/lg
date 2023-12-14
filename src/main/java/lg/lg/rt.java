package lg.lg;

import java.util.Arrays;

public class rt {

	public static void main(String[] args) {
	    String str = "hi am hero of vikram movie";
	    String[] st = str.split("\\s+");
	    String[] memo= {"first","second","third","four"};
	    Arrays.sort(memo);
	    Arrays.sort(st);
	    System.out.println(Arrays.toString(memo));
	    System.out.println("Words: " + Arrays.toString(st));
	}

}
