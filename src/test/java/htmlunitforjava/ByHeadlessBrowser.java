package htmlunitforjava;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ByHeadlessBrowser
{
	public static void main(String[] args) throws Exception
	{
		//Create object HTMLUNIT browser(headless browser)
		HtmlUnitDriver driver=new HtmlUnitDriver();
		//Launch site
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		//Get title and display
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
