package Selenium;

import java.util.Scanner;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateContent {
	public void createcontent(WebDriver driver, WebDriverWait wait) {
		
		WebElement create = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label='Create Content']//*[name()='svg']")));
		create.click();
		SWMAutomation.waitFor(5000);
		
		WebElement selectCompany = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='kuneconsulting']")));
		selectCompany.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));
		SWMAutomation.waitFor(3000);
		
		WebElement fromOptions = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='KC']")));
		fromOptions.click();
		
		WebElement channelGroup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiSelect-select.MuiSelect-outlined.MuiSelect-multiple.MuiInputBase-input.MuiOutlinedInput-input.css-ugsyf1")));
		channelGroup.click();
		
		WebElement selectGroup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Select All']")));
		selectGroup.click();
		
		WebElement titleField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='| Title here']")));
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the title:");
			String userInput = scanner.nextLine();
			
			if(titleField.isDisplayed() && titleField.isEnabled()) {
				titleField.sendKeys(userInput);
			    System.out.println("Title field filled with: " + userInput);
			}else {
			    System.out.println("Title field is not interactable.");
			}
		}
		
		
		
	}
}
