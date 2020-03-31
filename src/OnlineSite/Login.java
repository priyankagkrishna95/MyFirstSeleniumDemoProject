package OnlineSite;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\eclipse-workspace\\FirstProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//driver.manage().window().maximize();
		WebElement validateFirstPage = driver.findElement(By.id("header_logo"));
		if(validateFirstPage.isDisplayed())
		{
			System.out.println("Navigated to HomePage");
		}
		WebElement selectCategory = driver.findElement(By.xpath("//a[text()='Women']"));
		selectCategory.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='navigation_page']")));
		try{
		WebElement navigatetoSecondPage = driver.findElement(By.xpath("//span[@class='navigation_page']"));
		if(navigatetoSecondPage.isDisplayed())
		{
			System.out.println("Navigated to SecondPage-Women");
		}
		}catch(Exception e) {
		}
		
		WebElement ClickSubCategory = driver.findElement(By.xpath("(//li[@class='last'])[2]"));
		ClickSubCategory.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='tree dynamized']/li/a[contains(text(),'Casual Dresses')]")));
		WebElement navigatetoThirdPage = driver.findElement(By.xpath("//ul[@class='tree dynamized']/li/a[contains(text(),'Casual Dresses')]"));
		if (navigatetoThirdPage.isDisplayed())
		
		{
			System.out.println("Navigated to Third Page-Dresses");
			navigatetoThirdPage.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Casual Dresses ']")));
			WebElement navigatetoSubCategory = driver.findElement(By.xpath("//span[text()='Casual Dresses ']"));
			if (navigatetoSubCategory.isDisplayed())
			{
				System.out.println("Navigated to Casual dress Page");
			
			}
			
	
		}
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='More']")));
		WebElement selectItemtogetmoreInfo = driver.findElement(By.xpath("//span[text()='More']"));
		selectItemtogetmoreInfo.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Data sheet']")));
		WebElement validatetheDataSheet = driver.findElement(By.xpath("//h3[text()='Data sheet']"));
		if (validatetheDataSheet.isDisplayed())
		{
			System.out.println("Validated the Data Sheet");
		}
		WebElement selectSize = driver.findElement(By.xpath("//select[@id='group_1']"));
		selectSize.click();
		WebElement selectMedium = driver.findElement(By.xpath("//select[@id=\"group_1\"]/option[2]"));
		selectMedium.click();
		//selectSize.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add to cart']")));
		WebElement addtoCart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addtoCart.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Proceed to checkout')]")));
		WebElement proceedtoCheckout = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		proceedtoCheckout.click();
		WebElement navigatetoSummary = driver.findElement(By.xpath("//h1[@id=\"cart_title\"]"));
		if(navigatetoSummary.isDisplayed())
		{
			System.out.println("Validated to Summary Page");
		}
		WebElement ifavailable = driver.findElement(By.xpath("//span[@class='label label-success']"));
		if(ifavailable.isDisplayed())
		{
			System.out.println("Stock is Available");
			WebElement summaryPageProceed = driver.findElement(By.xpath("//span[(text()='Proceed to checkout')]"));
			summaryPageProceed.click();
			WebElement signin = driver.findElement(By.xpath("//h3[contains(text(),\"Already registered?\")]"));
			if(signin.isDisplayed())
			{
				System.out.println("Navigated to Sign in Page");
				WebElement uemail = driver.findElement(By.xpath("//input[@id=\"email\"]"));
				uemail.sendKeys("nerol35528@sweatmail.com");
				WebElement password =driver.findElement(By.xpath("//input[@id='passwd']"));
				password.sendKeys("priyanka");
				WebElement signintoaadresspage = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
				signintoaadresspage.click();
					
			}
			WebElement address = driver.findElement(By.xpath("//h3[contains(text(),'Your delivery address')]"));
			if(address.isDisplayed())
			{
				System.out.println("Navigated to Address Page");
				WebElement additionalinformation = driver.findElement(By.xpath("//textarea[@name='message']"));
				additionalinformation.sendKeys("Address is updated");
				WebElement proccedtopay = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
				proccedtopay.click();
				
			}
			WebElement isshippinPage = driver.findElement(By.xpath("//h1[text()='Shipping']"));
			if(isshippinPage.isDisplayed())
			{
				System.out.println("Navigated to Shipping Page");
				WebElement termsandCondition = driver.findElement(By.xpath("//input[@id=\"cgv\"]"));
				termsandCondition.click();
				WebElement ProccedtoPayment = driver.findElement(By.xpath("//button[@name=\"processCarrier\"]"));
				ProccedtoPayment.click();
				WebElement paymentpage = driver.findElement(By.xpath("//a[@title=\"Pay by bank wire\"]"));
				if(paymentpage.isDisplayed())
				{
					paymentpage.click();
					WebElement bankwirepayment = driver.findElement(By.xpath("//h3[contains(text(),'Bank-wire payment')]"));
					if(bankwirepayment.isDisplayed())
					{
						System.out.println("Payment through Bank Wire");
					}
				}
				WebElement confirmOrder = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
				confirmOrder.click();
				WebElement orderConfrimation = driver.findElement(By.xpath("//strong[text()='Your order on My Store is complete.']"));
				if(orderConfrimation.isDisplayed())
				{
					System.out.println("Order done Succesfully");
				}
			}
	    }
	
}
	
}