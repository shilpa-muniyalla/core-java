import java.util.regex.*;
public class RegexMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile(".m");
		Matcher m = p.matcher("am");
		Boolean b = m.matches();
		System.out.println(b);
		
		
		//another way of doing it
		Boolean c = Pattern.matches(".m","am");
		System.out.println(c);
		
		System.out.println(Pattern.matches("[amn]","acd"));  //searhes only for a
		
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "A"));
		

	}

}
