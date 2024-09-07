package product_package;

import org.testng.annotations.Test;

import genericUtilityorLibrary.Base_Class;
import objectRepository.Click_On_Product;
import objectRepository.Create_Product_Page;
import objectRepository.HomePage;
import objectRepository.Product_Info_Page;
import objectRepository.Product_Page;

public class CreateNewProductTest extends Base_Class{
	@Test (groups = "SmokeSuite")
public void CreateProductmethod() throws Exception
{
	HomePage hp=new HomePage(driver);
	hp.clickonProduct();
	
	Click_On_Product pc=new Click_On_Product(driver);
	pc.clickonnewproductoperation();
	
	Product_Page pp=new Product_Page(driver);
	pp.operationOnProductPage();
	
	int Random=jUtil.getRandomnumber();
	String PRODUCTNAME=eUtil.getdataformexcel("Product",1, 1);
	Create_Product_Page cp=new Create_Product_Page(driver);
	cp.operationOnCreateNewProductPage(Random+PRODUCTNAME,"Software");
	
	Product_Info_Page pf=new Product_Info_Page(driver);
	String s=pf.productInfoPageOperation();
	System.out.println(s);
}
}