package package1;

public class VariableArgumentsDemo {
	
	public static void display(String... value) {
		System.out.println("variable arguments demo");
		for(String s:value) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		display();
		display("welcome","to","santaclara");
		display("hello");
	}

}
