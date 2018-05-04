package bulkConsignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import login.Login;

public class uploadConsignment {
	
	
//@BeforeTest	
//	public static void SignUp_bulkConsignment(){
//		Login.openBrowser();
//		Login.navigate();
//		FieldValidations.navigate_OTPScreen();
//		Login.input_OTP();
//		Login.click_OTPSubmit();
//		Login.click_Consignor();
//		
//		
//	}
	
@Test(priority=0)
	public static void click_BulkConsignmentTab(){
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.driver.findElement(By.xpath(InputData.BulkConsignmentTab_xpath)).click();
		System.out.println("Clicked on Bulk consignment tab from navigation pane");
		
	}

@Test(priority=1)
	public static void click_BrowseExcel() throws IOException {
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.driver.findElement(By.xpath(InputData.BrowseExcel_xpath)).click();
		
		//Below script is to upload attachments by using autoit executable - Sandhya 06/23/2017
		Runtime.getRuntime().exec(InputData.ConsignmentExcelPath);
		System.out.println("Clicked on Bulk consignment tab and browse consignment file from the window");
		
	}
	
	
@Test(priority=2)
	public static void click_Upload() throws InterruptedException{
		Thread.sleep(5000);
		Login.driver.findElement(By.xpath(InputData.UploadConsignment_xpath)).click();
		System.out.println("Clicked on upload button");
		Thread.sleep(8000);
		System.out.println("Waited 8 secs");
		
	}

}
