package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddConnection {
	public void addconnection(WebDriver driver, WebDriverWait wait) {

		repeatedProcess repeat = new repeatedProcess();
		repeat.process(driver, wait);

		/*
		 * Facebook fb = new Facebook(); fb.fbpage(driver, wait);
		 */

		FormerlyTwitter twitter = new FormerlyTwitter();
		twitter.formelyTwitter(driver, wait);
		AddConnection.Back(wait);
		SWMAutomation.waitFor(3000);

		
		 /* Instagram insta= new Instagram(); insta.insta(driver, wait); back.click();
		 * SWMAutomation.waitFor(3000);
		 */

		 repeat.process(driver, wait);
		Linkedin link = new Linkedin();
		link.linkedin(driver, wait);
		AddConnection.Back(wait);

		repeat.process(driver, wait);
		LikedinBusiness LB = new LikedinBusiness();
		LB.linkedinBusiness(driver, wait);
		AddConnection.Back(wait);
		SWMAutomation.waitFor(3000);

		repeat.process(driver, wait);
		Xpremium XP = new Xpremium();
		XP.Premium(driver, wait);
		AddConnection.Back(wait);
		SWMAutomation.waitFor(3000);
		

		repeat.process(driver, wait);
		Slack slack = new Slack();
		slack.slack(driver, wait);
		AddConnection.Back(wait);
		SWMAutomation.waitFor(3000);

		repeat.process(driver, wait);
		Telegram telegram = new Telegram();
		telegram.telegram(driver, wait);
		AddConnection.Back(wait);
		SWMAutomation.waitFor(3000);

		repeat.process(driver, wait);
		Tiktok tikTok = new Tiktok();
		tikTok.TikTok(driver, wait);
		AddConnection.Back(wait);
		SWMAutomation.waitFor(3000);

		repeat.process(driver, wait);
		WebHook webHook = new WebHook();
		webHook.webhook(driver, wait);
		AddConnection.Back(wait);
		SWMAutomation.waitFor(3000);

		repeat.process(driver, wait);
		YouTube youTube = new YouTube();
		youTube.youtube(driver, wait);
		AddConnection.Back(wait);
		SWMAutomation.waitFor(3000);

	}

	public static void Back(WebDriverWait wait) {
		
		WebElement back = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector("svg[stroke='currentColor'][fill='none'][stroke-width='0']")));
		back.click();
	}
}
