package package2;

public class VoidMethod {
	
	public static void rankPoints() {
		
		double points = 225.5;
		if (points >= 230.3) {
			System.out.println("Rank:A");
			}
		
		else if (points >= 122.7) {
			System.out.println("Rank:B");
			
		}
		else {
			System.out.println("Rank:C-fail");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rankPoints();

	}

}
