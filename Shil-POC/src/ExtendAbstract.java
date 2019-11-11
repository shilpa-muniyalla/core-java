
public class ExtendAbstract extends AbstractClass{
	
	public ExtendAbstract(String Name,String Address,int ID) {
	super(Name,Address,ID);
	}
	
	public void jobRole() {
		System.out.println("This is the abstract method");
	}
	
	

	public static void main(String[] args) {
	ExtendAbstract e = new ExtendAbstract("shilpa","santa clara",500);
	e.jobRole();
	e.department();

	}

}
