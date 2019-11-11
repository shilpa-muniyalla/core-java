class Person{
	String name = "Shilpa";
}
public class Employee extends Person{

	String name = "Praveen";
	public void display() {
		System.out.println("Parent class employee name" +super.name);
		System.out.println("child class employee name" +name);
	}
		
		public static void main(String[] args) {
			Employee em = new Employee();
			em.display();
			
	}

}
