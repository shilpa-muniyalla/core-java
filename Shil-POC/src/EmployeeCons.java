class PersonCons{
	String name;
	
	PersonCons(){
		System.out.println("This is the Superclass constructor");
	}
	PersonCons(String name){
		this.name=name;
	}
	
}
public class EmployeeCons extends PersonCons {
	int eID;
	EmployeeCons(){
		super();
	}
	EmployeeCons(String name,int eID){
		super(name);
		this.eID=eID;
	}
	
	public void display() {
		System.out.println("Ename: "+name +"EID:"+eID);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeCons e1 = new EmployeeCons();
		EmployeeCons e2 = new EmployeeCons("Shilpa", 20);
		e2.display();

	}

}
