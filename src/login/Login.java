package login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Login {
	
	public static WebDriver driver;

@BeforeTest
	public static void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\sandhya\\Software\\eclipse\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Opened browser");
	}

@Test(priority = 0)
	public static void navigate(){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(InputData.URL);
	System.out.println("Entered Url");
		
	}


@Test(priority = 1)	
	public static void input_PhoneNumber(){
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id(InputData.PhoneNumber_ID)).sendKeys(InputData.PhoneNumber);
	System.out.println("Entered phone number as "+InputData.PhoneNumber);
	}

@Test(priority = 2)	
	public static void click_Submit(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id(InputData.submit_ID)).click();
		System.out.println("Clicked on submit button");
	
	}

@Test(priority = 3)	
	public static void input_OTP(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(InputData.OTP_xpath)).sendKeys(InputData.OTP);
		System.out.println("Entered OTP in the field");
	}

@Test(priority = 4)	
	public static void click_OTPSubmit(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(InputData.OTPSubmit_xpath)).click();
		System.out.println("Clicked on Submit button from OTP screen");
		
	}

@Test(priority = 5)	
public static void click_Consignor(){
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath(InputData.Consignor_xpath)).click();
	System.out.println("Selected consignor");
	
	}

}
