package org.kbzPayAppPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class MABT_BR_BA_PinReset_PinLock_ReqPage {

	
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	
	public MABT_BR_BA_PinReset_PinLock_ReqPage(WebDriver driver) throws AWTException {

    	this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();	
		
	}
	
	
	public void MABT_BR_BA_PinReset_PinLock_ReqOption() throws InterruptedException {
		
		
		
		By MABTBRBAPIN_option= By.xpath("//flt-semantics/span[.='MABT / BR / BA Pin Reset and Pin Lock Request']");	
		wait.until(ExpectedConditions.presenceOfElementLocated(MABTBRBAPIN_option));
		Thread.sleep(1000); // Flutter rerender
		
		WebElement	MABTBRBAPIN=driver.findElement(MABTBRBAPIN_option); // fetch fresh element
		js.executeScript("arguments[0].click();",MABTBRBAPIN );
			
		}
	
	
	public void accType() throws InterruptedException {
		
		By accType=By.xpath("//flt-semantics/span[.='Account Type *']/following::flt-semantics[1]/span[.='Please select']");
		wait.until(ExpectedConditions.presenceOfElementLocated(accType));
    	wait.until(ExpectedConditions.elementToBeClickable(accType));
    	 Thread.sleep(1000);
    	 
    	WebElement	AccTypeBtn=driver.findElement(accType);
    	js.executeScript("arguments[0].click();", AccTypeBtn);
		
	}
	
	public void mABT() throws InterruptedException {
		
		By MABT=By.xpath("//flt-semantics/span[.='MABT']");
		wait.until(ExpectedConditions.presenceOfElementLocated(MABT));
    	wait.until(ExpectedConditions.elementToBeClickable(MABT));
    	Thread.sleep(1000);
    	
    	WebElement	MABTbtn=driver.findElement(MABT);
    	js.executeScript("arguments[0].click();", MABTbtn);
		
		
	}
	
	public void mABR() throws InterruptedException {
		
		By MABR=By.xpath("//flt-semantics/span[.='MABR']");
		wait.until(ExpectedConditions.presenceOfElementLocated(MABR));
    	wait.until(ExpectedConditions.elementToBeClickable(MABR));
    	Thread.sleep(1000);
    	
    	WebElement	MABRbtn=driver.findElement(MABR);
    	js.executeScript("arguments[0].click();", MABRbtn);
		
		
	}
	
	public void BA() throws InterruptedException {
		
		By BA=By.xpath("//flt-semantics/span[.='BA']");
		wait.until(ExpectedConditions.presenceOfElementLocated(BA));
    	wait.until(ExpectedConditions.elementToBeClickable(BA));
    	Thread.sleep(1000);
    	
    	WebElement	BAbtn=driver.findElement(BA);
    	js.executeScript("arguments[0].click();", BAbtn);
			
	}
	
	public void staffIDNum_Field() throws InterruptedException {
		
		
		By StaffID=By.xpath("//flt-semantics/span[.='Staff ID *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
		wait.until(ExpectedConditions.presenceOfElementLocated(StaffID));
		Thread.sleep(500);
		WebElement staffid=driver.findElement(StaffID);
		staffid.click();
		Thread.sleep(500);
		staffid.sendKeys("7007");
		
	}
	
	public void UploadStafFaceBtn() throws InterruptedException {
		
		  // For UploadCustomerFaceBtn
		By StaffFace=By.xpath("//flt-semantics/span[contains(text(),'Staff Face Photo *')]/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
		wait.until(ExpectedConditions.presenceOfElementLocated(StaffFace));
	    Thread.sleep(1000);
	    
	    WebElement StaffFaceBtn=driver.findElement(StaffFace);
	    StaffFaceBtn.click();
	    Thread.sleep(5000);
	    
	    		// For Upload Passport front Page Robot Loop 
	 			// Navigate using TAB 
	 			for (int i = 0; i < 9; i++) {
	 			    robot.keyPress(KeyEvent.VK_TAB);
	 			    robot.keyRelease(KeyEvent.VK_TAB);
	 			    Thread.sleep(200);
	 			}
	 			// Press ENTER (select file + click Open)
	 			robot.keyPress(KeyEvent.VK_ENTER);
	 			robot.keyRelease(KeyEvent.VK_ENTER);
	 			Thread.sleep(1100);
	 			// 🔹 1 TAB (move to Open button)
	 			robot.keyPress(KeyEvent.VK_TAB);
	 			robot.keyRelease(KeyEvent.VK_TAB);
	 			
	 			// Down to select the File 
	 			robot.keyPress(KeyEvent.VK_DOWN);
	 		    robot.keyRelease(KeyEvent.VK_DOWN);
	 			
	 			// Enter (click open)
	 			robot.keyPress(KeyEvent.VK_ENTER);
	 			robot.keyRelease(KeyEvent.VK_ENTER);
	    
	}
	
	public void actionOnPIN_DD() throws InterruptedException {
		
		By actiononPin=By.xpath("//flt-semantics/span[contains(text(),'Action on Pin *')]/following::flt-semantics/span[.='Please select']");
		wait.until(ExpectedConditions.presenceOfElementLocated(actiononPin));
    	wait.until(ExpectedConditions.elementToBeClickable(actiononPin));
    	Thread.sleep(1000);
    	
    	WebElement	actiononPinbtn=driver.findElement(actiononPin);
    	js.executeScript("arguments[0].click();", actiononPinbtn);
			
	}
	
	public void pinResetOption() throws InterruptedException {
		
		By PinReset=By.xpath("//flt-semantics/span[.='Pin Reset']");
		wait.until(ExpectedConditions.presenceOfElementLocated(PinReset));
    	wait.until(ExpectedConditions.elementToBeClickable(PinReset));
    	Thread.sleep(1000);
    	
    	WebElement	PinResetBtn=driver.findElement(PinReset);
    	js.executeScript("arguments[0].click();", PinResetBtn);
			
	}
	
	public void pinLockOption() throws InterruptedException {
		
		By PinLock=By.xpath("//flt-semantics/span[.='Pin Lock']");
		wait.until(ExpectedConditions.presenceOfElementLocated(PinLock));
    	wait.until(ExpectedConditions.elementToBeClickable(PinLock));
    	Thread.sleep(1000);
    	
    	WebElement	PinLockBtn=driver.findElement(PinLock);
    	js.executeScript("arguments[0].click();", PinLockBtn);
			
	}
	
	
	public void Upload_PinRest_Pinlock_FormBtn() throws InterruptedException {
		
		  // For UploadCustomerFaceBtn
		By PinRest_PinLoc=By.xpath("//flt-semantics/span[.='Upload Pin Reset and Pin Lock Form *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
		wait.until(ExpectedConditions.presenceOfElementLocated(PinRest_PinLoc));
	    Thread.sleep(1000);
	    
	    WebElement PinRest_PinLockBtn=driver.findElement(PinRest_PinLoc);
	    PinRest_PinLockBtn.click();
	    Thread.sleep(5000);
	    
	    		// For Upload Passport front Page Robot Loop 
	 			// Navigate using TAB 
	 			for (int i = 0; i < 9; i++) {
	 			    robot.keyPress(KeyEvent.VK_TAB);
	 			    robot.keyRelease(KeyEvent.VK_TAB);
	 			    Thread.sleep(200);
	 			}
	 			// Press ENTER (select file + click Open)
	 			robot.keyPress(KeyEvent.VK_ENTER);
	 			robot.keyRelease(KeyEvent.VK_ENTER);
	 			Thread.sleep(1100);
	 			// 🔹 1 TAB (move to Open button)
	 			robot.keyPress(KeyEvent.VK_TAB);
	 			robot.keyRelease(KeyEvent.VK_TAB);
	 			
	 			// Down to select the File 
	 			robot.keyPress(KeyEvent.VK_DOWN);
	 		    robot.keyRelease(KeyEvent.VK_DOWN);
	 			
	 			// Enter (click open)
	 			robot.keyPress(KeyEvent.VK_ENTER);
	 			robot.keyRelease(KeyEvent.VK_ENTER);
	    
	}
	
	public void EditIconbtnClick() throws InterruptedException {
    	
    	
		WebElement	editbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Edit']"))));
		Thread.sleep(1000);
		editbtn.click();
	
		/*
		// Editing in  Editing Page 		
		WebElement BranhcPhnnumField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Branch Phone Number *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']")));
		wait.until(ExpectedConditions.visibilityOf(BranhcPhnnumField));
		wait.until(ExpectedConditions.elementToBeClickable(BranhcPhnnumField));
		
		BranhcPhnnumField.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(300);
		BranhcPhnnumField.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(200);
		BranhcPhnnumField.click();
		BranhcPhnnumField.sendKeys( "67" + String.format("%07d", System.currentTimeMillis() % 10000000L));
		
		*/
		
		// ACTION PIN editing
		By Remove_PinReset = By.xpath("//flt-semantics[@role='group' and @aria-label='Pin Reset' ]");
		wait.until(ExpectedConditions.presenceOfElementLocated(Remove_PinReset));
		wait.until(ExpectedConditions.elementToBeClickable(Remove_PinReset));
		Thread.sleep(1000);

		// Scroll first with fresh element
		WebElement Remove_PinResetBtn = driver.findElement(Remove_PinReset);
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block:'center'});", Remove_PinResetBtn);
		Thread.sleep(1200); // Allow scroll animation + Flutter re-render

		// CRITICAL: Fetch fresh element after scroll (Flutter re-renders aggressively)
		WebElement Remove_PinResetBtnFresh = driver.findElement(Remove_PinReset);
		js.executeScript("arguments[0].click();", Remove_PinResetBtnFresh);
			
		
    	// Selecting PIN LOC optin in Editing Page
    	By PinLock=By.xpath("//flt-semantics/span[.='Pin Lock']");
		wait.until(ExpectedConditions.presenceOfElementLocated(PinLock));
    	wait.until(ExpectedConditions.elementToBeClickable(PinLock));
    	Thread.sleep(1000);
    	
    	WebElement	PinLockBtn=driver.findElement(PinLock);
    	js.executeScript("arguments[0].click();", PinLockBtn);
		
	}
	

    public void assignToTSOBtn() throws InterruptedException {
    	
    	
		WebElement	AssignToTSOBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[@role='button' and contains(text(),'Assign to TSO')]")));
		Thread.sleep(1500);
		AssignToTSOBtn.click();
}

	
	
	
	
	
	

}
