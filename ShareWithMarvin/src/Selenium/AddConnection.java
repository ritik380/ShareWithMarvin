package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddConnection {
	public void addconnection(WebDriver driver, WebDriverWait wait) {
		/*Facebook fb = new Facebook();
		fb.fbpage(driver, wait);
		WebElement back = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[stroke='currentColor'][fill='none'][stroke-width='0']")));
		back.click();*/
		
		FormerlyTwitter twitter = new FormerlyTwitter();
		twitter.formelyTwitter(driver, wait);
		
		WebElement back = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[stroke='currentColor'][fill='none'][stroke-width='0']")));
		back.click();
		SWMAutomation.waitFor(3000);
		
		/*Instagram insta= new Instagram();
		insta.insta(driver, wait);
		back.click();
		addConnection.click();
		selectChannel.click();
		SWMAutomation.waitFor(3000);*/
		
		Linkedin link = new Linkedin();
		link.linkedin(driver, wait);
		
		
		
	}
		

         public static void filldata(WebDriverWait wait) {
        	 WebElement addConnection = wait
     				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".text-white.h-10[stroke='currentColor'][fill='currentColor'][stroke-width='0'][t='1569683928793']")));
     		addConnection.click();  // CLICK ADD CONNECTION ICON
     		SWMAutomation.waitFor(3000);
     		
     		WebElement selectCompany = wait
     				.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-component-select-companyId")));
     		selectCompany.click();// CLICK TO SELECT COMPANY
     		SWMAutomation.waitFor(3000);
     		
     		WebElement desireCompany = wait
     				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-companyId']//li[3]")));
     		desireCompany.click();
     		SWMAutomation.waitFor(2000);
     		

         }
}
  

		
	
	
	
