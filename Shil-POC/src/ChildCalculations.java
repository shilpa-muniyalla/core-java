
 class ParentCalculations {
	int c;
	public void addition(int a , int b) {
		c = a+b;
		System.out.println("the addition is " + c);
	}
	
	public void subtraction(int a, int b) {
		c = a-b;
		System.out.println("the subtraction is" + c);
	}
 }

 public class ChildCalculations extends ParentCalculations{
	 
	 public void multiplication(int a, int b) {
			c = a*b;
			System.out.println("the multiplication is" + c);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildCalculations relation = new ChildCalculations();
		int a = 20 ,  b =10;
		relation.addition(a, b);
		relation.subtraction(a, b);
		relation.multiplication(a, b);
	}
 }
		
		
		
		
		
		

	


