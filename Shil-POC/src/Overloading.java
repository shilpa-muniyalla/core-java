
public class Overloading {
	int c;
	public void addition() {
		int a=10,b=20;
		System.out.println(a+b);
	}
	
	public void addition(int a,int b) {
		System.out.println(a+b);
	}

	public int addition(int a, int b , int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading obj = new Overloading();
		obj.addition();
		obj.addition(20,30);
		int ret = obj.addition(30,40,20);
		System.out.println(ret);

	}

}
