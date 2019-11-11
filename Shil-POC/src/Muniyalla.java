//example of interface 

interface Daughter{
	 
	 public void ramya();
	public void shilpa(); 
	
	
	 }
public class Muniyalla implements Daughter{

	
		public void ramya(){
			System.out.println("younger daughter");
		}

		public void shilpa() {
		 System.out.println("Elder daughter");
	 }
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		Muniyalla m = new Muniyalla();
		m.ramya();
		m.shilpa();
		
	}

}
