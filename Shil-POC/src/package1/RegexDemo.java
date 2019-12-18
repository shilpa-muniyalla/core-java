package package1;

import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		//first method
		Boolean value=Pattern.matches(".m","am");
		System.out.println(value);
		
		//second method
		Boolean b=Pattern.compile("..a").matcher("aam").matches();
		System.out.println(b);

	}

}
