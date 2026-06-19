package org.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SAOPage {
	
	

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;

	public SAOPage(WebDriver driver) throws AWTException {
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
		
	}
	
		
	
	 public void editIconClick() throws InterruptedException {  
		 
		 	By EditLoc=By.xpath("//flt-semantics[.='Edit']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(EditLoc));
	    	Thread.sleep(1000);
	    	WebElement	EditBtn=driver.findElement(EditLoc);
	    	EditBtn.click();
	    	Thread.sleep(3000);
		 
		 // EDITING PASSPort Number
		 By	PassNumLoc=By.xpath("//flt-semantics/span[.='Passport Number *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
		 wait.until(ExpectedConditions.presenceOfElementLocated(PassNumLoc));
		 Thread.sleep(400);
		 
		 WebElement PassNum= driver.findElement(PassNumLoc);
		 js.executeScript("arguments[0].focus();", PassNum);
		 Thread.sleep(200);
		 PassNum.click();
		 
		 PassNum.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(200);
		 PassNum.sendKeys(Keys.BACK_SPACE);
		 Thread.sleep(200);
		 PassNum.click();
		 PassNum.sendKeys("67"+ String.format("%05d",System.currentTimeMillis() %100000L));
		 Thread.sleep(1000);
		 
	    	
	    	// Phn number checkox
	    	By PFace_Photo_CheckboxLoc	=By.xpath("//flt-semantics/span[.='Type of KYC Change Request *']/following::flt-semantics[@aria-label='Face Photo'][@role='checkbox']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(PFace_Photo_CheckboxLoc));
	    	Thread.sleep(200);
	    	WebElement  	Face_Photo_Checkbox=driver.findElement(PFace_Photo_CheckboxLoc);
	    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth'})", Face_Photo_Checkbox);
	    	Thread.sleep(150);
	    	Face_Photo_Checkbox.click();
	    	
	    	// Email Change chekc Box
	    	
	    	By Customer_Category_Minor__CheckboxLoc	=By.xpath("//flt-semantics/span[.='Type of KYC Change Request *']/following::flt-semantics[@aria-label='Customer Category (Minor)'][@role='checkbox']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(Customer_Category_Minor__CheckboxLoc));
	    	Thread.sleep(200);
	    	WebElement  	Customer_Category_Minor__Checkbox=driver.findElement(Customer_Category_Minor__CheckboxLoc);
	    	Customer_Category_Minor__Checkbox.click();
	    	
	 
	    	
	    }
	 
	 
	 
	 public void applicationCorrectedBtn() throws InterruptedException {
		 
		 By	appcorrectLoc= By.xpath("//flt-semantics[contains(.,'Application Corrected')][@role='button']");
		 wait.until(ExpectedConditions.presenceOfElementLocated(appcorrectLoc));
		 Thread.sleep(3000);
		 WebElement appcorrectBtn= driver.findElement(appcorrectLoc);
		 wait.until(ExpectedConditions.visibilityOf(appcorrectBtn));
		 appcorrectBtn.click();
		 
		 
	 }
}
