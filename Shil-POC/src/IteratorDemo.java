//example for iterator in collection

import java.util.*;
public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Iterator<Integer>i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
