package accountSettings;

public class InputData {

//Valid Input Data
	public static final String ImagePath = "D:\\sandhya\\Image.exe";
	public static final String Name = "Vatrapu";
	public static final String Pincode = "500049";
	public static final int LocalityField_Index = 3;
	public static final String MobileNo = "8008163456";
	public static final String OTP = "123456";

//Invalid Input Data
	public static final String InvalidMobileNo = "800867";
	public static final String CharMobileNo = "80081abc6s";
	public static final String InvalidPincode = "23423";
	public static final String CharPincode = "sadasd";
	
// validation messages
	
	public static final String MobileMessage = "Please enter at least 10 characters.";
	public static final String CharMobileMessage = "Please enter a valid mobile no.";
	public static final String PincodeMessage = "Please enter at least 6 characters.";
	public static final String CharPincodeMessage = "Pincode allows only numbers.";
	
	
	
	
//Attribute value
	public static final String sendOTP_button = "hdnPhone";
	public static final String OTP_field = "Enter OTP " ;
	
	
//Locators of Options
	
	public static final String MyAccountTab_ID="lnkAccount";
	public static final String UploadImage_xpath="id('btnProfilepic')";
	public static final String Edit_Css="a.btn.btn-small.pull-right";
	public static final String Name_ID="DisplayName";
	public static final String Pincode_ID = "PinCode";
	
	public static final String Invalidpincode_xpath = "/html/body/div[3]/div[2]/div/form/div/div/div[2]/div[1]/span[1]/span";
	
	public static final String Locality_ID = "ddlLocality";
	public static final String Mobile_ID = "ContactNo";
	
	public static final String InvalidMobileNo_Css = "span.text-danger.field-validation-error";
			
	public static final String SendOTP_ID = "ancGenerateOTP";
	public static final String OTP_ID = "txtOtpCode"; 
	public static final String Submit_Xpath="id('btnSubmit')";
}
