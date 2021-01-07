package htmlunitforjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByWithHeadBrowser 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
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
