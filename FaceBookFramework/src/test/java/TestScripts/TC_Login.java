package TestScripts;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
import BusinessFunctions.Login;
import LIB.Common;

public class TC_Login extends RootTest {

	@Test 
	public void login() throws FileNotFoundException, IOException 
	{
		
		Login login=new Login(xbrow,ylocators,zlocfile);
	
	    login.loginFB();
	    
	}
}
