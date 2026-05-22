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

public class deviceChangeRedApp {
	
	

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	public deviceChangeRedApp(WebDriver driver) throws AWTException {
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
    	
		
	}
	
	
public void deviceManagement_Change_RedApp() {
		
		
		//DeviceChange optionb option
			WebElement RedApp_DeviceChangeoption=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Device Management (Device Change) Red App']")));
			wait.until(ExpectedConditions.visibilityOf(RedApp_DeviceChangeoption));
			wait.until(ExpectedConditions.elementToBeClickable(RedApp_DeviceChangeoption));
			RedApp_DeviceChangeoption.click();
			
		}
	public void agentOrMerchantPhnNumField() throws InterruptedException {
		

		 WebElement	MechantPhnNum=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Agent / Merchant Phone Number *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']")));
		 Thread.sleep(500);
		 mouse.moveToElement(MechantPhnNum).click(MechantPhnNum).sendKeys("678976877").perform();
		
	}
	
	public void agentOrMerchantCodeField() throws InterruptedException {
		
		
		 WebElement	MechanCodeField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Agent / Merchant(Organization Short Code) *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		 Thread.sleep(500);
		 mouse.moveToElement(MechanCodeField).click(MechanCodeField).sendKeys("678976877").perform();
	}
	
	  public void EyeIconbtnClick() throws InterruptedException {
	    	Thread.sleep(5000);
	    	for (int i = 0; i <40; i++) {
				
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(300);	
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
