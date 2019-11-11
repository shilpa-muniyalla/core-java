//example for listing folders of directory

import java.io.*;
public class ListFolders {

	public static void main(String[] args) {
		String[] paths;
		try {
			File file = new File("c:\\Directory");
			paths=file.list();
			for(String path:paths) {
				System.out.println(path);
			}
		}catch (Throwable e) {
			e.printStackTrace();
		}
		

	}

}
