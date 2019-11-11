//example for Tree set

import java.util.*;
public class HashsetDemo {

	public static void main(String[] args) {
		Set<String> name = new TreeSet<String>();
		name.add("Mrs");
		name.add("shilpa");
		name.add("muniyalla");
		Iterator<String> i=name.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}
