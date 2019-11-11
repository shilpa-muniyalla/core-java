package package1;

public class ArrayReverseReturn {
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
	}
	
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		int len = result.length;
		for(int i=0 , j =len-1 ; i <len ; i++, j--) {
			result[j]=list[i];
		}
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(reverse(new int[] {1,2,3,4,5}));

	}

}
