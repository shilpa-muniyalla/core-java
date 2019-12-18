package package1;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) {
		
		//current date and time
		Date now = new Date();
		System.out.println(now);
		
		//formatted date and time
		SimpleDateFormat dateFormat = new SimpleDateFormat("E MM.dd.yyyy 'at' hh:mm:ss a zzz");
		System.out.println(dateFormat.format(now));
		
		//time delay
		try {
			for(int i=1;i<=10;i++) {
		System.out.println(new Date());
		Thread.sleep(1000);
			}
		System.out.println(new Date());
		}
			catch(Exception e) {
				System.out.println(e);
			}
		
	//elapsed time
	
	try {
		long start =System.currentTimeMillis();
		System.out.println(new Date());
		Thread.sleep(3000);
		System.out.println(new Date());
		long end=System.currentTimeMillis();
		long diff=end-start;
		System.out.println(diff);
	}catch(Exception e) {
		System.out.println(e);
	}
	
	}
		
		
		
		

	}


