
public abstract class AbstractClass {
	
	String Name;
	String Address;
	int ID;
	
	public AbstractClass(String Name,String Address,int ID) {
		this.Name=Name;
		this.Address=Address;
		this.ID=ID;
		System.out.println(this.Name +this.Address +this.ID);
	}
	
	public void department() {
		System.out.println("This employee works for retail");
	}
	public abstract void jobRole();
		
	

	
}
