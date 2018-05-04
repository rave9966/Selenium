package accountSettings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import login.Login;

public class UpdateAccountDetails {
	
//@BeforeTest	
//	public static void SignUp_AccountSettings(){
//		Login.openBrowser();
//		Login.navigate();
//		FieldValidations.navigate_OTPScreen();
//		Login.input_OTP();
//		Login.click_OTPSubmit();
//		Login.click_Consignor();
//		UploadImage.click_MyAccountTab();
//		
//	}
	
@Test(priority=0)
	public static void click_MyAccount_Edit(){
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = Login.driver.findElement(By.cssSelector(InputData.Edit_Css));
		JavascriptExecutor executor1 = (JavascriptExecutor)Login.driver;
		executor1.executeScript("arguments[0].click()", element);
		System.out.println("Clicked on 'Edit Button' ");
		
	
	}

	public static void input_Name(){
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.driver.findElement(By.id(InputData.Name_ID)).clear();
		Login.driver.findElement(By.id(InputData.Name_ID)).sendKeys(InputData.Name);
		System.out.println("Entered Name in the field as "+InputData.Name);
	}
	
	public static void input_Mobile(){
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.driver.findElement(By.id(InputData.Mobile_ID)).clear();
		Login.driver.findElement(By.id(InputData.Mobile_ID)).sendKeys(InputData.MobileNo);
		System.out.println("Entered mobile number as"+InputData.MobileNo);
	
	
	}
	
	public static void input_Pincode(){
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.driver.findElement(By.id(InputData.Pincode_ID)).clear();
		Login.driver.findElement(By.id(InputData.Pincode_ID)).sendKeys(InputData.Pincode);
		System.out.println("Entered pincode as"+InputData.Pincode);
				
	}
	
	public static void click_Locality(){
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.driver.findElement(By.id(InputData.Locality_ID)).click();
		System.out.println("Clicked on locality dropdown");
				
	}
	
	
	public static void select_Locality(){
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select Locality= new Select(Login.driver.findElement(By.id(InputData.Locality_ID)));
		Locality.selectByIndex(InputData.LocalityField_Index);
		System.out.println("Selected locality dropdown");
				
	}
	
	
	public static void click_Submit(){
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		Login.driver.findElement(By.xpath(InputData.Submit_Xpath)).click();
		System.out.println("Clicked 'Submit' button");	
	}
	
	
//	public static void close_SuccessPopUp() throws InterruptedException{
//		 Login.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Login.driver.findElement(By.xpath("id('successpopup')/div/div/div[1]/button")).click();
//		System.out.println("Closed success overlay");
//		
//	}
	
@Test(priority = 1)
	public static void update_name() throws InterruptedException{
		
		input_Name();
		Thread.sleep(2000);
		click_Submit();
		Login.driver.findElement(By.xpath("id('successpopup')/div/div/div[1]/button")).click();
		System.out.println("Closed success overlay");
	
	}


	
@Test(priority = 3)	
	public static void update_mobile() throws InterruptedException   {
		Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		click_MyAccount_Edit();
		
		Login.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("Page load 10 seconds");
		
		input_Mobile();
		
		Login.driver.findElement(By.id(InputData.Mobile_ID)).click();
		 Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 System.out.println("implicitlyWait 10 seconds");
				
		WebElement invisibleelement= Login.driver.findElement(By.id(InputData.SendOTP_ID));  
		 JavascriptExecutor executor = (JavascriptExecutor)Login.driver;  
		 Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 System.out.println("implicitlyWait 10 seconds");
		 executor.executeScript("arguments[0].click();", invisibleelement);  
		 System.out.println("Clicked on Send OTP button");
		 
//		 Thread.sleep(3000);
//		 Login.driver.findElement(By.xpath("id('successpopup')/div/div/div[1]/button")).click();
//		 System.out.println("Closed success popup");
		 
		 
		 Thread.sleep(10000);
		 
		 WebDriverWait wait = new WebDriverWait(Login.driver, 10); 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(InputData.OTP_ID)));
		 Login.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Login.driver.findElement(By.id(InputData.OTP_ID)).sendKeys(InputData.OTP);
		 System.out.println("entered OTP in the field"); 

		click_Submit();
		
			
	}

@Test(priority = 2)
	public static void update_Locality() throws InterruptedException{
	 Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 System.out.println("implicitlyWait 10 seconds");
	
	 click_MyAccount_Edit();
	 
	 Login.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 System.out.println("PageLoad 10 seconds");
	 input_Pincode();
	 Thread.sleep(7000);
	 click_Locality();
	 Thread.sleep(4000);
	 select_Locality();
	 Thread.sleep(5000);
	 click_Submit();
	 Thread.sleep(2000);
	 	Login.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Login.driver.findElement(By.xpath("id('successpopup')/div/div/div[1]/button")).click();
		System.out.println("Closed success overlay");
	}

//@Test(priority=0)
//	public static void update_allfields() throws InterruptedException{
//	
//	click_MyAccount_Edit();
//	input_Name();
//	input_Pincode();
//	click_Locality();
//	Thread.sleep(4000);
//	select_Locality();
//	update_mobile();
//	click_Submit();
//	
//	}


	
}
