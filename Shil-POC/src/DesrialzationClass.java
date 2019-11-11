// example for Deserialization

import java.io.*;
public class DesrialzationClass {

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		
		Emp emp=null;
		try {
			FileInputStream filein = new FileInputStream("c:\\javafiles\\writestream.txt");
			ObjectInputStream in = new ObjectInputStream(filein);
			emp = (Emp) in.readObject();
			in.close();
			filein.close();
		}
		finally {
			System.out.println("Desrializing Employee...");
			System.out.println("Name of the employee:  "  +emp.name);
			System.out.println("Address of the employee:  "  +emp.address);
			
		}
		

	}

}
