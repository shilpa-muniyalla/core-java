//example for array list 

import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> countries = new ArrayList();
		countries.add("India");
		countries.add("America");
		countries.add("canada");
		Iterator<String> i=countries.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
