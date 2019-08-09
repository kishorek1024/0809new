package packone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertsss {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		// Clicking on Go Button
		driver.findElement(By.xpath("//*[@name='proceed']")).click();
		// Importing Alert
		Alert a=driver.switchTo().alert();
		// Closing Alert
		System.out.println(a.getText());
		a.dismiss();
		a.accept();
		
		


		

	}

}
