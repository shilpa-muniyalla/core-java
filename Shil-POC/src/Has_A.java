class Name{
	String FirstName; 
	String MiddleName;
	String LastName;
	
	public Name(String Fname,String Mname, String Lname) {
		this.FirstName=Fname;
		this.MiddleName=Mname;
		this.LastName=Lname;
	}
	
}
public class Has_A {
	int age;
	Name n;

	public void display(int age,Name n) {
		
		System.out.println("age: " +age);
		System.out.println(n.FirstName+" "  +n.MiddleName+ " " +n.LastName);
	}
		
		
		public static void main(String[] args) {
			Has_A has = new Has_A();
			Name n = new Name("shilpa","Muniyalla","Rathnamma");
			has.display(50, n);
			
	}

}
