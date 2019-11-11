//example for output stream byte data

import java.io.*;
public class WriteStream {

	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream fos = new FileOutputStream("c:\\javafiles\\writestream.txt");
			fos.write(65);
			fos.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	

	}

}
