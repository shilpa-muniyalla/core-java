//example for comparator interface 

import java.util.*;
public class EmpComparator {

	public static void main(String[] args) {
	
		ArrayList<Emps> al= new ArrayList<Emps>();
		al.add(new Emps("Shilpa",50));
		al.add(new Emps("Ramya",40));
		
		Collections.sort(al,new AgeComparator());
		for(Emps e:al) {
			System.out.println(e.name +" "+e.age);
		}

	}

}
