package accountSettings;

import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import login.Login;

public class SettingsFieldValidation {
	
	@BeforeTest	
	public static void SignUp_AccountSettings(){
//		Login.openBrowser();
//		Login.navigate();
//		FieldValidations.navigate_OTPScreen();
//		Login.input_OTP();
//		Login.click_OTPSubmit();
		Login.click_Consignor();
		UploadImage.click_MyAccountTab();
		UpdateAccountDetails.click_MyAccount_Edit();
		
	}
	
	@Test(priority=0)
	public static void verify_InvalidMobileNumber(){
		
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.driver.findElement(By.id(InputData.Mobile_ID)).clear();
		Login.driver.findElement(By.id(InputData.Mobile_ID)).sendKeys(InputData.InvalidMobileNo);	
		System.out.println("Entered MOBILE No as"+InputData.InvalidMobileNo);
		
		UpdateAccountDetails.click_Submit();
		
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String les = Login.driver.findElement(By.cssSelector(InputData.InvalidMobileNo_Css)).getText();
		System.out.println("Get message el ="+les);
		if (les.equals(InputData.MobileMessage)){
			System.out.println("Both text are same");
			} else{
			System.out.println("Both text are not same");
			expectThrows(null, null);
			}
		}
	
	@Test(priority=1)
	public static void verify_charMobile(){
		
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.driver.findElement(By.id(InputData.Mobile_ID)).clear();
		Login.driver.findElement(By.id(InputData.Mobile_ID)).sendKeys(InputData.CharMobileNo);	
		System.out.println("Entered MOBILE No as"+InputData.CharMobileNo);
	
		UpdateAccountDetails.click_Submit();
		
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String chr = Login.driver.findElement(By.cssSelector(InputData.InvalidMobileNo_Css)).getText();
		System.out.println("Get message el ="+chr);
		if (chr.equals(InputData.CharMobileMessage)){
			System.out.println("Both text are same");
			} else{
			System.out.println("Both text are not same");
			
			expectThrows(null, null);
			}
		}
	
	@Test(priority=2)
	public static void verify_pincode(){
				
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.driver.findElement(By.id(InputData.Pincode_ID)).clear();
		Login.driver.findElement(By.id(InputData.Pincode_ID)).sendKeys(InputData.InvalidPincode);
		System.out.println("Entered pincode as"+InputData.InvalidPincode);

		UpdateAccountDetails.click_Submit();
		
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String no = Login.driver.findElement(By.xpath(InputData.Invalidpincode_xpath)).getText();
		System.out.println("Get message el ="+no);
		if (no.equals(InputData.PincodeMessage)){
			System.out.println("Both text are same");
			} else{
			System.out.println("Both text are not same");
			
			expectThrows(null, null);
			}
		
		
	}
	
	
	@Test(priority=3)
	public static void verify_charpincode(){
				
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.driver.findElement(By.id(InputData.Pincode_ID)).clear();
		Login.driver.findElement(By.id(InputData.Pincode_ID)).sendKeys(InputData.CharPincode);
		System.out.println("Entered pincode as"+InputData.CharPincode);

		UpdateAccountDetails.click_Submit();
		
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String str = Login.driver.findElement(By.xpath(InputData.Invalidpincode_xpath)).getText();
		System.out.println("Get message el ="+str);
		if (str.equals(InputData.CharPincodeMessage)){
			System.out.println("Both text are same");
			} else{
			System.out.println("Both text are not same");
			
			expectThrows(null, null);	
			}
		
		
	}

	
		

}	
	


