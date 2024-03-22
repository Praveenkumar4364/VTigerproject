package genericUtilityorLibrary;

import java.util.Date;
import java.util.Random;

/**
 * This class consists of reusable methods related to Java
 * @author praveen
 *
 */
public class JavaUtility {
	/**
	 * This method will return the System date in the customize format
	 * @return
	 */
	public String getSystemDate()
	{
		Date d=new Date();
		
		String arrDate[]= d.toString().split(" ");
		String currentDate=arrDate[2]+"-"+arrDate[1]+"-"+arrDate[5]+" "+arrDate[3].replace(":","_");
		return currentDate;
	}
	
	/**
	 * This method give the random number data to the caller
	 * @return
	 */
public int getRandomnumber()
{
	Random r=new Random();
	int number=r.nextInt(1000);
	return number;
}
}
