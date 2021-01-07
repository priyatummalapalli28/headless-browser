package htmlunitforjava;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithHeadBrowserFirefoxAsHeadless
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		FirefoxOptions fo=new FirefoxOptions();
		fo.setHeadless(true);
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver(fo);
		//launch site
		driver.get("https://www.amazon.in");
		//Maximize
		driver.manage().window().maximize();
		//Create wait object
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Search']")));
		//Get title
		String title=driver.getTitle();
		System.out.println(title);
		//Close site
		driver.close();
	}
}
