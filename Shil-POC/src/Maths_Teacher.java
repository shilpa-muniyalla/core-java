class Person2{   }

class Employee2 extends Person2{  }

class Teacher extends Person2{   }


public class Maths_Teacher extends Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person2 p = new Person2();
		Employee2 e = new Employee2();
		Teacher t = new Teacher();
		Maths_Teacher m = new Maths_Teacher();
		
		System.out.println(e instanceof Person2);
		System.out.println(t instanceof Person2);
		System.out.println(m instanceof Teacher);
		System.out.println(m instanceof Person2);
	

	}

}
