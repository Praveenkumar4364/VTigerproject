package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDatafromPropertyfile {
public static void main(String args[]) throws Exception
{
	//open the document in java readable format in java.io pacakage
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
	
	//create object of Properties class in java.util package
	Properties p=new Properties();
	
	//load the File input stream to properties class
	p.load(fis);
	
	//Provide key and read the vlaue
	
	String d=p.getProperty("username");
	String pw=p.getProperty("password");
	String UR=p.getProperty("url");
	System.out.println(UR);
	System.out.println(pw);
	System.out.println(d);
}     
}
