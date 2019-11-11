//example for creating directory

import java.io.*;
public class CreateDir {

	public static void main(String[] args) {
	   File f1 = new File("c:\\Directory");
	   if(!f1.exists()) {
		 if(f1.mkdir()) {
			 System.out.println("The Directory is created");
		 }
		 else {
			 System.out.println("The file cannot be created");
		 }
	   }
		 String dirname="c:\\Directory\\subfolder\\file";
		 File f2 = new File(dirname);
		 f2.mkdirs();
	   

	}

}
