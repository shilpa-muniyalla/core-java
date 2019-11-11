// example for generic class

public class GenericClass <T1,T2> {
	
	public void display(T1 var1,T2 var2) {
		System.out.println("name: " +var1 +" ID: " +var2);
		
	}

	public static void main(String[] args) {
		GenericClass<String,Integer> obj1 = new GenericClass<String,Integer>();
		obj1.display("shilpa", 500);

	}

}
