package org.KycVerificationAppPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KBZPayCenterChecker1Page {
	
	
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	public KBZPayCenterChecker1Page(WebDriver driver) throws AWTException {
		
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
    	
		
	}
	
	
	public void KYCserviceReqOPtion() throws InterruptedException {
		
		WebElement KYCserviceReqOPtionBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics/span[.='KYC Verification Service Request Application']"))));
		KYCserviceReqOPtionBtn.click();
		Thread.sleep(1000);
	}
	
	
	  public void eyeIconBtn() throws InterruptedException {
	    	Thread.sleep(4000);
	    	for (int i = 0; i <30; i++) {
				
	    		
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(500);	
				}
	    	
	    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all;'])[1]"))));
	    		eyeiconbtn.click();
	    	
	    }
	  
	  public void sendtoKYCOfficerbtn() throws InterruptedException {
		  
		  
		WebElement sendToKycbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[@role='button' and contains(text(),'Send to KYC Officer')]"))));
		Thread.sleep(1000);
		sendToKycbtn.click();
		Thread.sleep(1000);
	  }
	  
	  public void MakeForCorectionbtn() throws InterruptedException {
		  
		  
			WebElement Makecrtionbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[@role='button' and contains(text(),'Mark for Correction')]"))));
			Makecrtionbtn.click();
			Thread.sleep(1000);
		  }
	  
	  public void Denybtn() throws InterruptedException {
		  
		  
			WebElement denybtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[@role='button' and contains(text(),'Deny')]"))));
			denybtn.click();
			Thread.sleep(1000);
		  }
	

	
	 public void UpdateSatgeCMNTbox() throws InterruptedException {
	    	
	    	WebElement	UpdateSatgeCMNtTextField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics/span/following::flt-semantics/textarea[@data-semantics-role='text-field']"))));
	    	Thread.sleep(1000);	
	    	UpdateSatgeCMNtTextField.click();
	    	UpdateSatgeCMNtTextField.sendKeys("Done");
	    	
	    }
	
	
	
	
}
