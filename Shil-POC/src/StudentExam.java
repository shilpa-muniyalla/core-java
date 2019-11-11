// example of encapsulation by using getter setter method
public class StudentExam {
	private String name;
	private int rollno;
	String subject;

	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentExam s =new StudentExam();
		s.setName("shilpa");
		System.out.println(s.getName());
		s.rollno=12;
		System.out.println(s.rollno=20);
				

	}

}
