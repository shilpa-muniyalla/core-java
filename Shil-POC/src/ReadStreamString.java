//example for inputstream string

import java.io.*;
public class ReadStreamString {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:\\javafiles\\writestream.txt");
			int i =0;
			while((i=fis.read()) !=-1) {
			System.out.print((char)i);	
			}
			fis.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
