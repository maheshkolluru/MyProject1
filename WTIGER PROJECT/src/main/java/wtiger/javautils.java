package wtiger;

import java.util.Date;
import java.util.Random;

import org.apache.poi.ss.formula.functions.Replace;
import org.testng.annotations.Test;

/**
 * 
 * @author mahesh
 *here we stored all the reusable methods of java operations
 */
public class javautils {
	/**
	 * @return 
	 * 
	 */
	public int randomnumber(int num) {
		
		Random r = new Random();
		return r.nextInt(num);
	}
	public String currenttime()
	{
		Date d=new Date();
	 String data=d.toString();
	  String[] s= data.split(" ");
	 
	 return s[3];
		
	}
	public String currentdate()
	{
		Date d=new Date();
	 String data=d.toString();
	  String[] s= data.split(" ");
	 
	 return s[2]+"-"+s[1]+"-"+s[5];
		
	}
	@Test
	public void m1 ()
	{
		javautils j = new javautils();
				String date=j.currentdate();
				String time=j.currenttime();
				System.out.println(date);
				System.out.println(time);
		
		
	}
	
}
