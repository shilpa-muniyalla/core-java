//example of interface
public class ImplementInterface implements Math_Teacher {
	 public void department() {
		 System.out.println("Teaching");
	 }
	 public void jobRole() {
		 System.out.println("Maths teacher");
	 }
	 public void subject() {
		 System.out.println("maths");
	 }
	 public void division() {
		 System.out.println("algebra");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementInterface i = new ImplementInterface();
		i.department();
		i.jobRole();
		i.subject();
		i.division();

	}

}
