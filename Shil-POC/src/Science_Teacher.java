interface Person3{}
class Employee3 implements Person3{}

public class Science_Teacher extends Employee3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee3 e = new Employee3();
		Science_Teacher s = new Science_Teacher();
		
		System.out.println(e instanceof Person3);
		System.out.println(s instanceof Employee3 );
		System.out.println(s instanceof Person3);

	}

}
