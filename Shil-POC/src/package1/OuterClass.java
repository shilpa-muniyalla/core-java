package package1;

abstract class InnerClass{
	public abstract void display();
}

public class OuterClass {
	public static void main(String[] args) {
		InnerClass inClass = new InnerClass() {
			public void display() {
				System.out.println("This is an Anonymous inner class");
			}
		};
		inClass.display();
		}
		

	}


