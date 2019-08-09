package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DiffBrowsers {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WD10\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\Desktop\\WD10\\Jars\\IEDriverServer.exe");
		WebDriver driver1=new InternetExplorerDriver();
		driver1.get("http://yahoomail.com");
		driver1.manage().window().maximize();
		
		WebDriver driver2=new OperaDriver();
		
		
		
		
		
		
		
		
		

	}

}
