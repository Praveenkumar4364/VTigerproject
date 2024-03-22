package genericUtilityorLibrary;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This class consists of reusable methods related to Properties file
 * @author praveen
 */
public class PropertiesUtility {
	/**
	 * This method will read data from property file and return the data to the caller
	 * @param data
	 * @return DATA
	 * @throws Exception
	 */
	
public String getdatafrompropertis(String data) throws Exception

{
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String DATA=pobj.getProperty(data);
	return DATA;
}
}
