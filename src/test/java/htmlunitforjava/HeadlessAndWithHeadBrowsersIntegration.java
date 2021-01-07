package htmlunitforjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessAndWithHeadBrowsersIntegration
{
	public static void main(String[] args) throws Exception
	{
		//Create object HTMLUNIT browser(headless browser)
		HtmlUnitDriver driver1=new HtmlUnitDriver();
		//Launch site
		driver1.get("https://www.amazon.in");
		Thread.sleep(5000);
		//Get title and display
		String title1=driver1.getTitle();
		System.out.println(title1);
		driver1.close();
		
		//Open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver2=new ChromeDriver();
		//launch site
		driver2.get("https://www.amazon.in");
		//Maximize
		driver2.manage().window().maximize();
		//Create wait object
		WebDriverWait wait=new WebDriverWait(driver2,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Search']")));
		//Get title
		String title2=driver2.getTitle();
		System.out.println(title2);
		//Close site
		driver2.close();
		
		//Validation
		if(title1.equals(title2))
		{
			System.out.println("Headless and withhead browsers are working correctly");
		}
		else
		{
			System.out.println("Headless and withhead browsers are not working correctly");
		}
	}
}
