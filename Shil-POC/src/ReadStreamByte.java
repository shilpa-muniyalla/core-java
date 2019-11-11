//example for fileinputstream byte

import java.io.*;
public class ReadStreamByte {

	public static void main(String[] args) {
	
		try {
		FileInputStream fis = new FileInputStream("c:\\javafiles\\writestream.txt");
		int i=fis.read();
		fis.close();
		System.out.println((char)i);
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
