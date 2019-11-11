package package2;

import package1.Car;

public class Hyundai extends Car {
	public static void main(String[] args) {
		Hyundai hy = new Hyundai();
		System.out.println("This is an extendable class");
		hy.display();
		System.out.println("Color: "+hy.color);
		
		System.out.println("For further understanding");
		
	}
	
	

}
