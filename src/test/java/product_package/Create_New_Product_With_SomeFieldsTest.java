package product_package;

import org.testng.annotations.Test;

import genericUtilityorLibrary.Base_Class;
import objectRepository.Create_Product_Page;
import objectRepository.HomePage;
import objectRepository.Product_Info_Page;
import objectRepository.Product_Page;


public class Create_New_Product_With_SomeFieldsTest extends Base_Class {
	@Test
	public void createnewproductwithsomefields() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickonProduct();
		
		Product_Page pp=new Product_Page(driver);
		pp.operationOnProductPage();
		
		int RANDOM=jUtil.getRandomnumber();
		String P1=eUtil.getdataformexcel("Product",5,1);
		String PRODUCTNAME=P1+RANDOM;
		
		String VENDORNO=eUtil.getdataformexcel("Product",5,2);
		String PRODUCTSHEET=eUtil.getdataformexcel("Product",5,3);
		String PARTNUMBER=eUtil.getdataformexcel("Product",5,4);
		String MFRPARTNO=eUtil.getdataformexcel("Product",5,5);
		String SERIALNO=eUtil.getdataformexcel("Product",5,6);
		
		Create_Product_Page cpp=new Create_Product_Page(driver);
		cpp.operationOnCreateNewProductPage(PRODUCTNAME,"Hardware", VENDORNO, PRODUCTSHEET,"300-Sales-Software", PARTNUMBER,"LexPon Inc.", MFRPARTNO, SERIALNO);
		 Product_Info_Page pip=new Product_Info_Page(driver);
		 String INFO= pip.productInfoPageOperation();
		 System.out.println(INFO);
	}

}
