// example for serialization

import java.io.*;
public class SerialiazationClass {

	public static void main(String[] args) {
	Emp emp = new Emp();
	emp.name="shilpa muniyalla";
	emp.address="california";
	
	try {
		FileOutputStream fileout = new FileOutputStream("c:\\javafiles\\writestream.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(emp);
		out.close();
		fileout.close();
		System.out.println("serialization data is saved in writestream.txt");
	}catch(Exception e) {
		e.printStackTrace();
	}

	}

}
