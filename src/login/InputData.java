package login;

public class InputData {

// valid Fields Data
	public static final String URL = "https://cms-web-consignor-stepconsignorcms-qa.ambilytech.com";
	public static final String PhoneNumber = "8008163756";
	public static final String OTP = "123456";
	
// Invalid Fields Data
	
	public static final String InvalidPhoneNumber = "8008163456";
	public static final String InvalidOTP = "234453";
	
// validation messages
	
	public static final String login_PhoneNumberMessage = "Use Sales Rep App to register if you are a new user.";
	public static final String OTP_Message = "Invalid OTP";
	public static final String ResendOTP_Message = "OTP sent successfully.";

	
	
//Locators of Options
	
	public static final String PhoneNumber_ID = "PhoneNumber";
	public static final String submit_ID = "btnregisterform";
	public static final String OTP_xpath="id('OTPCode')";
	public static final String OTPSubmit_xpath="id('btnSubmit')";
	public static final String Consignor_xpath="/html/body/div/form/div[1]/a";
	
//validation messages Locators
	
	public static final String PhoneValidation_xpath = "/html/body/div/form/h5";
	public static final String OTPvalidation_xpath = "id('frmVerifyOTP')/h5";
	
	
}
