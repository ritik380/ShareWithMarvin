package Selenium;

import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {
	public void registeruser(WebDriver driver, WebDriverWait wait) {
		
		// Navigate to web
		driver.get("https://app.dev.sharewithmarvin.io/login");
		SWMAutomation.waitFor(5000);

		// Set an explicit wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement Signup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("a")));
		Signup.click();
		SWMAutomation.waitFor(5000);
		
		// WebElement productOption1 = driver.findElement(By.xpath(""));
		   WebElement productOption2 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/img[1]"));

				productOption2.click();

		// Fill user details
		WebElement Firstname = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='firstname-login']")));
		Firstname.isDisplayed();
		Firstname.isEnabled();
		Firstname.sendKeys("Ritik ");
		SWMAutomation.waitFor(5000);

		WebElement Lastname = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='lastname-signup']")));
		Lastname.isDisplayed();
		Lastname.isEnabled();
		Lastname.sendKeys("Kumar");
		SWMAutomation.waitFor(5000);

		WebElement Email = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email-login']")));
		Email.isDisplayed();
		Email.isEnabled();
		Email.sendKeys("ritikkumar@kune.consulting");
		SWMAutomation.waitFor(5000);

		WebElement Companyname = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='company-name-signup']")));
		Companyname.isDisplayed();
		Companyname.isEnabled();
		Companyname.sendKeys("Share With Marvin");
		SWMAutomation.waitFor(5000);

		WebElement Password = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password-signup']")));
		Password.isDisplayed();
		Password.isEnabled();
		Password.sendKeys("Password@200");
		SWMAutomation.waitFor(5000);

		WebElement confirmPassword = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='confirm-password-signup']")));
		confirmPassword.isDisplayed();
		confirmPassword.isEnabled();
		confirmPassword.sendKeys("Password@200");
		SWMAutomation.waitFor(5000);

		WebElement Checkbox = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='h-4 w-4 bg-white rounded-full']")));
		Checkbox.click();
		SWMAutomation.waitFor(5000);

		WebElement Promocode = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirm-promoCode-signup")));
		Promocode.isDisplayed();
		Promocode.isEnabled();
		Promocode.sendKeys("AS4C5BDE74");
		SWMAutomation.waitFor(5000);


		System.out.println("Please complete the CAPTCHA manually, then press any key to continue...");

		try (Scanner scanner = new Scanner(System.in)) //Wait for user until click enter button
		{
			scanner.nextLine();
		}
		
		System.out.println("Input received, continuing with the process.");
		
		//WebElement createAccount = wait.until(ExpectedConditions
                //.elementToBeClickable(By.xpath("//button[normalize-space()='Create Account']")));

        
		//createAccount.click();

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains(
				"https://checkout.stripe.com/c/pay/cs_test_a12B4H8fKdZGOEb2CYiEfFAVkBJGOcgcXuPk5bkqtbtQjnibszG4dSxXsy#fid1d2BpamRhQ2prcSc%2FJ0hqa3F2YHd3ZHEnKSd2cGd2ZndsdXFsamtQa2x0cGBrYHZ2QGtkZ2lgYSc%2FY2RpdmApJ2R1bE5gfCc%2FJ3VuWnFgdnFaMDRLdm9uY0FKdkFAR0ddd3NHTVJISkxEc0BNN1JQYn9vTEtnTVdrV3ZdXW5BPUFySHdMNWA0bl82aWkwcXBLTXVMPWl3fHw8dGt3S31DYExiSXRtajVcTmM1NUs2TW1cNlRXJyknY3dqaFZgd3Ngdyc%2FcXdwYCknaWR8anBxUXx1YCc%2FJ3Zsa2JpYFpscWBoJyknYGtkZ2lgVWlkZmBtamlhYHd2Jz9xd3BgeCUl")) {

		} else {
			System.out.println("There was an issue with Signup.");
		}

		WebElement startTrail = driver.findElement(By.xpath("//div[@class='SubmitButton-IconContainer']"));
		startTrail.click();
		
		
		try {
            
            WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("notistack-snackbar")));
           
            String alertMessage = alertElement.getText();

            // Validate the message content
            if (alertMessage.contains("Registration successful")) {
                System.out.println("Registration validation passed: " + alertMessage);
            } else {
                System.out.println("Registration validation failed: " + alertMessage);
            }
        } catch (Exception e) {
            System.out.println("No registration alert message found.");
        }
		}
	}


