//user defined exception example
public class UserDefinedExceptionClass {

	public static void main(String[] args) {
		
		try {
			throw new AnException("Java training");
		}catch(AnException e) {
			
			System.out.println(e);
		}

	}

}
