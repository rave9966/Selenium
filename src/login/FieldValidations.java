package login;

import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FieldValidations {

	
	
@BeforeTest

	public void openApp(){
	
		Login.openBrowser();
		Login.navigate();
	}

	

@Test(priority = 0)
	public static void submit_InvalidPhoneNumber(){
	
	Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Login.driver.findElement(By.id(InputData.PhoneNumber_ID)).sendKeys(InputData.InvalidPhoneNumber);
	System.out.println("Entered phone number as "+InputData.InvalidPhoneNumber);
	
	Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Login.driver.findElement(By.id(InputData.submit_ID)).click();
	System.out.println("Clicked on submit button");
	}

@Test(priority = 1)
	public static void verify_PhoneValidationMsg(){
	Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String el = Login.driver.findElement(By.xpath(InputData.PhoneValidation_xpath)).getText();
	System.out.println("Get message el ="+el);
	if (el.equals(InputData.login_PhoneNumberMessage)){
		System.out.println("Both text are same");
		} else{
		System.out.println("Both text are not same");
		expectThrows(null, null);
		}
	}

@Test(priority = 2)
	public static void navigate_OTPScreen(){
	Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Login.input_PhoneNumber();
	Login.click_Submit();
	
	}

@Test(priority = 3)

	public static void submit_InvalidOTP(){
	Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Login.driver.findElement(By.xpath(InputData.OTP_xpath)).sendKeys(InputData.InvalidOTP);
	System.out.println("Entered Invalid OTP in the field");
	Login.driver.findElement(By.xpath(InputData.OTPSubmit_xpath)).click();
	System.out.println("Clicked on Submit button from OTP screen");
	
	}

@Test(priority = 4)
	public static void verify_OTPValidationMsg(){
	
	Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String msg = Login.driver.findElement(By.xpath(InputData.OTPvalidation_xpath)).getText();
	System.out.println("Get msg ="+msg);
	if (msg.equals(InputData.OTP_Message)){
				System.out.println("Both OTP text are same");
		} else{
		System.out.println("Both OTP text are not same");
		expectThrows(null, null);
		}
	}

@Test(priority = 5)
	public static void valid_OTP(){
	
	Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Login.driver.findElement(By.xpath(InputData.OTP_xpath)).clear();
	Login.input_OTP();
	Login.click_OTPSubmit();
	
	}
	
}
