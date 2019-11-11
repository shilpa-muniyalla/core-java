
public class VariableArguments {
	
	public static void display(String... values) {
		System.out.println("The display method is invoked");
		for(String s : values) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		display("ramya","shilpa","praveen");
		display("ramya","mithun");

	}

}
