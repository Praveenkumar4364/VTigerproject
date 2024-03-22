package practice;



import genericUtilityorLibrary.ExcelUtility;
import genericUtilityorLibrary.JavaUtility;
import genericUtilityorLibrary.PropertiesUtility;

public class GetData_P_E {
public static void main(String[] args) throws Exception {
	PropertiesUtility pUtil=new PropertiesUtility();
	String UN=pUtil.getdatafrompropertis("username");
	String PW=pUtil.getdatafrompropertis("password");
	String URL=pUtil.getdatafrompropertis("url");
	System.out.println(UN);
	System.out.println(PW);
	System.out.println(URL);
	
	
	ExcelUtility eUtil=new ExcelUtility();
	String V= eUtil.getdataformexcel("Contacts",1,2);
	String V1=eUtil.getdataformexcel("Contacts",1,1);
	System.out.println(V);
	System.out.println(V1);
	
	
	JavaUtility jUtil=new JavaUtility();
	String d=jUtil.getSystemDate();
	System.out.println(d);
}
}
