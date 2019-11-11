// example of interface

 interface Persons{
	 public void department();
	 public void jobRole();
	
}
public class Employees implements Persons {
	public void department() {
		System.out.println("Department is L&D");
	}
	
	public void jobRole() {
		System.out.println("job:software engineer");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e = new Employees();
		e.department();
		e.jobRole();
		

	}

}
