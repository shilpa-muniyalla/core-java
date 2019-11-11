//example for generic method
public class GenericMethodTest {

	public static <E> void printArray(E[] inputArray) {
		
		for(E element:inputArray) {
			System.out.printf("%s ", element);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.3,3.4,5.6	};
		Character[] charArray= {'H','E','L','L','O'};
		
		System.out.println("Array intarray contains: ");
		printArray(intArray);
		
		
		System.out.println("Array doublearray contains: ");
		printArray(doubleArray);
		
		System.out.println("Array chararray contains: ");
		printArray(charArray);

	}

}
