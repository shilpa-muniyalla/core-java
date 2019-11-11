
public class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int c = StaticClass.staticSum(1, 2);
		System.out.println("c="+c);
		
		StaticClass multiplication = new StaticClass();
	    int z = 0;
		z = multiplication.multi(3, 2);
		System.out.println("z="+z);
	    
	}

		private static int staticSum(int a,int b)
		{
				int sum = a+b;
				return sum;
				
	} 
		 private int multi(int x,int y) {
			 int mul = x*y;
			 return mul;
		 }
		 
		 

}
