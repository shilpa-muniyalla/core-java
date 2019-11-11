package package1;

public class ConstructorDemo {
	
	int x;
	ConstructorDemo(){
		x = 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo t1 = new ConstructorDemo();
		ConstructorDemo t2 = new ConstructorDemo();
		System.out.println(t1.x +" "+t2.x);

	}

}
