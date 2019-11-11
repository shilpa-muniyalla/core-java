//example for write stream string using file output stream
import java.io.*;
public class WriteStreamString {

	public static void main(String[] args) throws IOException{
	
		
		FileOutputStream f = new FileOutputStream("c:\\javafiles\\writestream.txt");
		
		String s = "Welcome to santaclara";
		byte[] b = s.getBytes();
		f.write(b);
		f.close();
		System.out.println("success");
		
		

	}

}
