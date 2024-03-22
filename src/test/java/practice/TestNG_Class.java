package practice;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Class {
	@Test(enabled = true)
public void create()
{
		//Assert.fail();
	System.err.println("Create");
}
@Test(dependsOnMethods = "create")
public void modify()
{
	System.out.println("Modify");
}
@Test
public void delete()
{
	System.out.println("Delete");
}
}
