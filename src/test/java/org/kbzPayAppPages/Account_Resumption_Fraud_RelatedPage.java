package org.kbzPayAppPages;

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

public class Account_Resumption_Fraud_RelatedPage {
	

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Actions mouse;
	Robot robot;
	
	public Account_Resumption_Fraud_RelatedPage(WebDriver driver) throws AWTException {
		
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();	
	}
	
	public void kbzPayServiceOPtion() throws InterruptedException {
		
		By	KBZBtn= By.xpath("//flt-semantics/span[.='KBZPay Service Operations']");
		wait.until(ExpectedConditions.presenceOfElementLocated(KBZBtn));
		Thread.sleep(1000);
		WebElement	KBZPayService	=driver.findElement(KBZBtn);
		Thread.sleep(200);
		KBZPayService.click();
	//	js.executeScript("arguments[0].click();", KBZPayService);
		
	}
	
	
	public void selectType() throws InterruptedException {
		
		
		
		WebElement	TypeDD=driver.findElement(By.xpath("(//span[.='Please select']/parent::flt-semantics)[1]"));
		//Type DD 
		TypeDD.click();
		Thread.sleep(1000);
		
	
	}
	
	public void Account_Resumption_Fraud_RelatedOption() throws InterruptedException {
		
		By Account_Resumption_Fraud_RelatedOptionLOc	=By.xpath("//flt-semantics/span[.='Account Resumption_Fraud Related']");
		wait.until(ExpectedConditions.presenceOfElementLocated(Account_Resumption_Fraud_RelatedOptionLOc));
		Thread.sleep(1000);
		
		WebElement Account_Resumption_Fraud_RelatedOptionBtn=driver.findElement(Account_Resumption_Fraud_RelatedOptionLOc);
		js.executeScript("arguments[0].click();", Account_Resumption_Fraud_RelatedOptionBtn);	
	}

	

	 public void alternate_phoneNumField() throws InterruptedException{
			
		By Alt_Phm_NumFieldLoc= By.xpath("//flt-semantics/span[.='Alternate Phone number']/following::flt-semantics[2]");
		wait.until(ExpectedConditions.presenceOfElementLocated(Alt_Phm_NumFieldLoc));
		Thread.sleep(400);
		
		WebElement Alt_Phm_NumField=driver.findElement(Alt_Phm_NumFieldLoc);
		js.executeScript("arguments[0].scrollIntoView(true);",Alt_Phm_NumField);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",Alt_Phm_NumField);
		Thread.sleep(1000);
		Alt_Phm_NumField.sendKeys("678942234");
		// mouse.moveToElement(Alt_Phm_NumField).sendKeys("678942234").perform();
		 
	}
	 public void kbzRegPhnNumField () throws InterruptedException {
		 
			By  kbzRegPhnNumFieldLoc = By.xpath("//flt-semantics/span[.='KBZPay Registered Phone Number']/following::flt-semantics[2]/input[@data-semantics-role='text-field']");
			wait.until(ExpectedConditions.presenceOfElementLocated(kbzRegPhnNumFieldLoc));
			Thread.sleep(200);
			
			WebElement	kbzRegPhnNumFieldc=driver.findElement(kbzRegPhnNumFieldLoc);
			kbzRegPhnNumFieldc.click();
			Thread.sleep(100);
			kbzRegPhnNumFieldc.sendKeys("678942134");

		 }
	 
	 
	 
	 
	 public void reasonForContactingBackField() throws InterruptedException {
		 
		 
		 	By  ReasonforContactingFieldLoc = By.xpath("//flt-semantics/span[.='Reason For Contacting Back *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
			wait.until(ExpectedConditions.presenceOfElementLocated(ReasonforContactingFieldLoc));
			Thread.sleep(200);
			
			WebElement	ReasonforContactingField=driver.findElement(ReasonforContactingFieldLoc);
			ReasonforContactingField.click();
			Thread.sleep(100);
			ReasonforContactingField.sendKeys("Test@123#$5");
		 
	 }
	 
	 
	 public void EditIconClick() throws InterruptedException {
			
	 		// EDITING NRC number field
			By	EditLOC=By.xpath("//flt-semantics[.='Edit']");
			wait.until(ExpectedConditions.presenceOfElementLocated(EditLOC));
			Thread.sleep(500);			
			WebElement	EditBtn=driver.findElement(EditLOC);
			Thread.sleep(300);
			js.executeScript("arguments[0].click();", EditBtn);
			Thread.sleep(100);
			
			
			// NRC Town Ship 
			By EditTownShipLoc=By.xpath("(//flt-semantics/span[.='NRC number *']/following::flt-semantics[@role='button'])[3]");
			wait.until(ExpectedConditions.presenceOfElementLocated(EditTownShipLoc));
			Thread.sleep(500);
			
			WebElement	EditTownShipbtn=driver.findElement(EditTownShipLoc);
			js.executeScript("arguments[0].click();", EditTownShipbtn);
			// chamgin Township Option in Editing Page
			WebElement editTownshipOptionLoc=driver.findElement(By.xpath("//flt-semantics/span[.='DAHANA']"));
			Thread.sleep(10);
			editTownshipOptionLoc.click();
			
			
			
			// NRC NUMBER FIELD
			By	NumberTXTField=By.xpath("//flt-semantics/input[@aria-label='Number']");
			wait.until(ExpectedConditions.presenceOfElementLocated(NumberTXTField));
			Thread.sleep(500);	
			WebElement	NumberTxtFieldBtn=driver.findElement(NumberTXTField);
			// Scroll into view + pause for Flutter rendering
		    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", NumberTxtFieldBtn);
		    Thread.sleep(800);  // Allow scroll + re-render
		 // Always use JS click for Flutter input fields
		    js.executeScript("arguments[0].click();", NumberTxtFieldBtn);
		    Thread.sleep(200);
		    
			NumberTxtFieldBtn.sendKeys(Keys.CONTROL+"a");
			Thread.sleep(100);
			NumberTxtFieldBtn.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(100);
			NumberTxtFieldBtn.sendKeys(String.format("%05d", System.currentTimeMillis() % 100000L));
			
			//Next Button
			 WebElement	NxtBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Next']"))));
			 NxtBtn.click();
	 }

	 
	 
	 public void escalateBtn() throws InterruptedException {
	    	
	    	
 		WebElement	EscalateBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[@role='button' and contains(text(),'Escalate')]")));
 		Thread.sleep(3000);
 		EscalateBtn.click();
 }
}
