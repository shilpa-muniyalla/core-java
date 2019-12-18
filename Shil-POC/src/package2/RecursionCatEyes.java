package package2;

public class RecursionCatEyes {

	
	public static int catEyes(int n) {
		if(n==0) {
			return 0;
		}
		else {
			return 2+catEyes(n-1);
		}
	}
	
	public static int power(int base,int power) {
	
	if(power==1) {
		return base;
	}
	else {
		return base*power(base,power-1);
	}
}
	
	public static int factorial(int num) {
		if(num==1) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
	}
	
	public static int printArray(int[] array,int i) {
		
		if(i==array.length-1) {
			return array[i];
		}
		else {
			System.out.println(array[i]);
			return printArray(array,i+1);
		}
	}
	public static void main(String[] args) {
		//cateyes
	System.out.println(catEyes(5));
	
	//power
	System.out.println(power(2,3));

	//factorial
	System.out.println(factorial(5));
	System.out.println(printArray(new int []{1,2,3,4},0));
	}

}
