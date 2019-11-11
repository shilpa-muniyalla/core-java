package package1;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 20,30,40,50};
		System.out.println(Array3.search(array, 30));
	}

		public static int search(int[] array , int x) {
			
			for (int i = 0; i < array.length; i++) {
				if(x==array[i]) {
					return i ;
				}
				
			}
			return 0;
	}

}
