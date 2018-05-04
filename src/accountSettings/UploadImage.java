package accountSettings;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import login.FieldValidations;
import login.Login;




public class UploadImage {

//@BeforeTest	
//	public static void SignUp_Consignor(){
//		Login.openBrowser();
//		Login.navigate();
//		FieldValidations.navigate_OTPScreen();
//		Login.input_OTP();
//		Login.click_OTPSubmit();
//		Login.click_Consignor();
//		
//	}

@Test(priority = 0)
	public static void click_MyAccountTab(){
		Login.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Login.driver.findElement(By.id(InputData.MyAccountTab_ID)).click();
		System.out.println("Clicked on My Account tab from navigation pane");
		
	}

@Test(priority = 1)
	public static void click_BrowseImage() throws IOException{
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.driver.findElement(By.xpath(InputData.UploadImage_xpath)).click();
		
		//Below script is to upload image by using autoit executable - Sandhya 06/27/2017
		
		Runtime.getRuntime().exec(InputData.ImagePath);
		
		System.out.println("Clicked on upload image button and browsed image from the window");
			
	}

}
