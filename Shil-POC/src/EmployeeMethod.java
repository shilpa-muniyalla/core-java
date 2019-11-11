class PersonMethod{
	String name = "Shilpa";
	public void display() {
	System.out.println("This is a Super class");
}
}
public class EmployeeMethod extends PersonMethod {
     String name = "Praveen";
     public void display() {
    	 System.out.println(super.name);
    	 System.out.println(name);
     }
     
     public void finalDisplay() {
    	 super.display();
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeMethod em = new EmployeeMethod();
		em.display();
		em.finalDisplay();

	}

}
