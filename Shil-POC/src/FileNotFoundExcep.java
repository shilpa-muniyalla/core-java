// Exception example

import java.io.*;
public class FileNotFoundExcep {

	public static void main(String[] args) {//throws IOException{
		try {
			FileInputStream fis = new FileInputStream("E:/sample/WelcomeExcep.txt");
			
			int i;
			while((i=fis.read()) !=-1) {
				System.out.print((char)i);
				
			}
		}catch(FileNotFoundException e) {
			
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	

	}

}
