package LIB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Common {
	WebDriver driver;
	Actions actions;
	public void  startBrowser(String browserType,String url ){
	WebDriver driver;
	Actions actions;
	
	switch(browserType)
	{
	case "Firefox":
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\QAP16\\Downloads\\geckodriver-v0.21.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		break;
	case "Chrome" :
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP16\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		break;
	case "IE" :
		System.setProperty("webdriver.ie.driver", "C:\\Users\\QAP16\\Downloads\\IEDriver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get(url);
		break;
	}
	}

	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	
	
	
	public WebElement FindElement(String identifier,String locator)
	{
		WebElement e=null;
		
		switch (identifier)
		{
		case "id" :
			e= driver.findElement(By.id(locator));
			 break;
			 
		case "name" :
			e= driver.findElement(By.name(locator));
			 break;	 
			 
		case "linkText" :
			e= driver.findElement(By.linkText(locator));
			 break;	 
			 
		case "partiallinktext" :
			e= driver.findElement(By.partialLinkText(locator));
			 break;	 
			 
			 
		case "css" :
			e= driver.findElement(By.cssSelector(locator));
			 break;	 
			 
		case "xpath" :
			e= driver.findElement(By.xpath(locator));
			 break;	 
		case "tagname" :
			e= driver.findElement(By.tagName(locator));
			 break;	 
		case "classname" :
			e= driver.findElement(By.className(locator));
			 break;	 
			 
		default :
			System.out.println("locator not found");
			e=null;
		}
		
		
		return e;	
		
	}
	
	public void click(String identifier,String locator)
	{
		WebElement e=FindElement(identifier,locator);
		e.click();
	}
	
	
	public void sendkeys(String identifier,String locator,String text)
	{
		WebElement e=FindElement(identifier,locator);
		e.sendKeys(text);
	}
	
	
}

		
	
	
		
	
