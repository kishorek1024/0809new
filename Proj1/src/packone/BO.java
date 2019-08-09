package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BO {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bharatmatrimony.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("NAME")).sendKeys("Kishore");
		driver.findElement(By.id("NAME")).clear();
		driver.findElement(By.id("NAME")).sendKeys("abcdef");
		driver.findElement(By.id("NAME")).clear();
		
		WebElement n=driver.findElement(By.id("NAME"));
		n.sendKeys("Kishore");
		n.clear();
		n.sendKeys("sdfsdf");
		n.clear();
		
		WebElement pf=driver.findElement(By.id("REGISTERED_BY"));
		pf.sendKeys("Friend");
		
		
		
		
		
		
		
		/*driver.findElement(By.id("ID")).sendKeys("kishore");
		driver.findElement(By.id("REGISTERED_BY")).sendKeys("Friend");
		driver.findElement(By.id("NAME")).sendKeys("abcdef");
		driver.findElement(By.id("NAME")).clear();
		driver.findElement(By.id("gendermale")).click();*/
		

	}

}
