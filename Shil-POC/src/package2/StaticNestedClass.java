package package2;

public class StaticNestedClass {
	private static class NestedClass{
		public void display() {
			System.out.println("This is a static nested class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedClass nested = new NestedClass();
		nested.display();

	}

}
