import java.util.*;
public class TimeDelay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			for(int i =1 ;i<=5; i++) {
			System.out.println(new Date() +"\n");
			Thread.sleep(1000);
			}
			System.out.println(new Date() +"\n");
			}

		catch(Exception e) {
			System.out.println("got an exception!");
			System.out.println(e);
		}
	}

}
