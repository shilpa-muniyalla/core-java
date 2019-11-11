import java.text.SimpleDateFormat;
import java.util.*;
public class FormatDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt = new Date();
		System.out.println(dt);
		SimpleDateFormat dnow = new SimpleDateFormat("MM.dd.yyyy 'at' hh:mm:ss ");
		System.out.println(dnow.format(dt));
		
		
		
		

	}

}
