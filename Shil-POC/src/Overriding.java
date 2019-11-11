class Personclass{
	public void display() {
		System.out.println("Person class");
	}
}
class Student extends Personclass{
	public void display() {
		System.out.println("This is a student class");
	}
	}

class Empclass extends Student{
	public void display() {
		System.out.println("This is a employee class");
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		System.out.println("test class");
		Personclass p = new Personclass();
		p.display();
		Personclass s = new Student();
		s.display();
		Student e = new Empclass();
		e.display();
	}

}
