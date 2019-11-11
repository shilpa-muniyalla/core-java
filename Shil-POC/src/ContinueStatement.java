
public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {10,20,30,40,50};
		
		for (int x : numbers) {
			if(x == 40) {
				continue;
			}
			System.out.println(x);
		}

	}

}
