package BusinessFunctions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import LIB.Common;
public class Login {
	
	Common browser;
	Properties locators;

	public Login(Common br, Properties loc, String locFile) throws  FileNotFoundException, IOException 
	
		{
		browser = br;
		locators = loc;
		locators.load(new FileInputStream(locFile));
		}
		public void loginFB()
		{
		String url = locators.getProperty("url");
	String Emailloc = locators.getProperty("Email_name");
	String Passwordloc = locators.getProperty("Password_name");
	String logIn_id = locators.getProperty("Login_id");
	String myemail = locators.getProperty("myemail");
	String pass1 = locators.getProperty("pass1");
	browser.startBrowser("Chrome", url);
	browser.maximizeBrowser();
	browser.sendkeys("xpath", Emailloc, myemail);
	browser.sendkeys("xpath", Passwordloc, pass1);
	browser.click("xpath", logIn_id);
		}
}



			
	
		
		
			