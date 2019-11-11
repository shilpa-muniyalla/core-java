package package2;

public class ParamMethod {
	
	public static void swapFunction(int n1,int n2) {
		int n3 = n1;
		n1 = n2;
		n2 = n3 ;
		System.out.println("After swapping a :"+n1 + " and b :"+n2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 45;
		System.out.println("Before swapping a :"+a +" and b :"+b);
		swapFunction(a,b);

	}

}
