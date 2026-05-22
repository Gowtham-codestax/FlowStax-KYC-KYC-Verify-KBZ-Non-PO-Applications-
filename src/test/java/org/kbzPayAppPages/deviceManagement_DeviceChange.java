package org.kbzPayAppPages;

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

public class deviceManagement_DeviceChange {

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	
	public deviceManagement_DeviceChange(WebDriver driver) throws AWTException {
		
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
		
	}
	
	
	
	public void deviceManagement_Change() {
		
		
		//DeviceChange optionb option
			WebElement DeviceChangeoption=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Device Management  (Device Change)']")));
			wait.until(ExpectedConditions.visibilityOf(DeviceChangeoption));
			wait.until(ExpectedConditions.elementToBeClickable(DeviceChangeoption));
			DeviceChangeoption.click();
			
		}
	
	
	public void oldHandsetModelField() throws InterruptedException {
		
		WebElement OldHandsetModelField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Old Handset Model *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		wait.until(ExpectedConditions.visibilityOf(OldHandsetModelField));
		wait.until(ExpectedConditions.elementToBeClickable(OldHandsetModelField));
		OldHandsetModelField.click();
		Thread.sleep(500);
		OldHandsetModelField.sendKeys("67897676GH");
		
		
	}
	 
	 
	 public void alternate_phoneNumField() throws InterruptedException{
			
		 //Passporrt number field
		 WebElement	Alt_Phm_NumField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Alternate Phone number']/following::flt-semantics[2]")));
		 Thread.sleep(1000);
		 mouse.moveToElement(Alt_Phm_NumField).click(Alt_Phm_NumField).sendKeys("4356789").perform();
	 
		
	}
	
	 
	 public void kbzRegisterdPhnNum() throws InterruptedException {
		 
		 
		//Passporrt number field
		 WebElement	kbzRegisterdPhnNumber=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='KBZPay Registered Phone Number *']/following::flt-semantics[2]")));
		 Thread.sleep(1000);
		 mouse.moveToElement(kbzRegisterdPhnNumber).click(kbzRegisterdPhnNumber).sendKeys("4356789").perform();
		 
	 }
	 
	  public void EyeIconbtnClick() throws InterruptedException {
	    	Thread.sleep(4000);
	    	for (int i = 0; i <37; i++) {
				
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(500);	
				}
	    	
	    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all;'])[1]")));
	    		 js.executeScript("arguments[0].scrollIntoView({block:'center'});", eyeiconbtn);
	    		 Thread.sleep(1000);
	    		js.executeScript("arguments[0].click();", eyeiconbtn);
	    	
	    }
	  
	
	  public void escalateBtn() throws InterruptedException {
	    	
	    	
	 		WebElement	EscalateBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[.='Escalate']")));
	 		Thread.sleep(1500);
	 		EscalateBtn.click();
		 }
	
	
	
}
