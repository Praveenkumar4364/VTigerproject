package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Class {
@Test(retryAnalyzer=genericUtilityorLibrary.RetryAnalyserImplementation.class)
public void name()
{
//	String s="hello";
//	String s1="Hello";
	Assert.fail();
	System.out.println("Hello");
	//Assert.assertTrue(false);
}
}
