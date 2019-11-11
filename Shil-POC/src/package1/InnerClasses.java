package package1;


public class Outer_Class {
	
	private class Inner_Class{
		public void print() {
			System.out.println("This is an inner class");
		}
	}
	
	public void display_Inner() {
		Inner_Class inClass = new Inner_Class();
		inClass.print();
		}
	
	}

public class InnerClasses {
	public static void main(String[] args) {
		Outer_Class outClass = new Outer_Class();
		outClass.display_Inner();
	}
	
}
