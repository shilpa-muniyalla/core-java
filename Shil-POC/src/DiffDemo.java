import java.util.*;
public class DiffDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + "\n");
			Thread.sleep(3000);
			System.out.println(new Date() + "\n");
			long end = System.currentTimeMillis();
			long diff = end-start;
			System.out.println(diff);
		}
		catch(Exception e) {
			System.out.println("got an exception");
		}

	}

}

