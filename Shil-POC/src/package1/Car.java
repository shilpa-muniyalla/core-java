package package1;

public class Car {
	
	//we are going to create the variable
	
	public String color="Black";
	int mileage=20;
	
	//we are going to create the method,which is accessible from same package or from subclass of different package
	
	protected void display() {
		System.out.println("Color: "+color+", Mileage: "+mileage);
		
	}
	
	//second method
	
	public void ownerDetails() {
		System.out.print("This car is brough by: ");
		
	}
	
	// third method
	
	private void address () {
		System.out.println("owner stays in santa clara");
	}
	
	//main method
	
	public static void main(String[] args) {
		Car c = new Car();
		c.display();
		c.address();
		
		
		
	}
	

}
