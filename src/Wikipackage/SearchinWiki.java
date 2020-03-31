package Wikipackage;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



@SuppressWarnings("unused")
public class SearchinWiki {
	
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\eclipse-workspace\\FirstProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipdia.org");
		WebElement search = driver.findElement(By.id("searchInput"));
		search.sendKeys("English");
		WebElement done = driver.findElement(By.xpath("//i[@class=\"sprite svg-search-icon\"]"));
		done.click();
		WebElement verify = driver.findElement(By.xpath("//h1[@id='firstHeading']"));
		if(verify.isDisplayed())
		{
			System.out.println("Element Present");
		}
		driver.close();
	}

}
