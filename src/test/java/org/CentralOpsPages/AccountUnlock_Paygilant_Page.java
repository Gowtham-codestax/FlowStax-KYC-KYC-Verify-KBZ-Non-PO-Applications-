package org.CentralOpsPages;

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

public class AccountUnlock_Paygilant_Page {
	
	
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	public AccountUnlock_Paygilant_Page(WebDriver driver) throws AWTException {
		
		this.driver=driver;
		PageFactory.initElements( driver,this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
		
		
	}
	
	
	public void  selectAccountUnlock_Paygilant() throws InterruptedException {
		
		WebElement	categoryDD=driver.findElement(By.xpath("(//span[.='Please select']/parent::flt-semantics)[1]"));
		//Category DD 
		categoryDD.click();
		Thread.sleep(1000);
		
		By AccUnlockOPtion=By.xpath("//span[contains(text(),'Account Unlock - Paygilant')]");
		WebElement accUnlockOption=wait.until(ExpectedConditions.presenceOfElementLocated(AccUnlockOPtion));
		wait.until(ExpectedConditions.elementToBeClickable(accUnlockOption));
		js.executeScript("arguments[0].scrollIntoView(true);", accUnlockOption);
		js.executeScript("arguments[0].click();", accUnlockOption);
		
		
	}
	
	public void initialDeposit() throws InterruptedException {
		
		
		WebElement	initialdepositField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@data-semantics-role='text-field'])[1]")));
		Thread.sleep(500);
		initialdepositField.click();
		initialdepositField.sendKeys("70000");
		
	}
	public void enterCustomerDetails() throws InterruptedException {	
    	//CUS ID
    	WebElement CusId=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[1]"))));
    	CusId.click();
    	Thread.sleep(1000);
    	CusId.sendKeys("123456711");
    	
    	//CUS Name
    	WebElement	CusName=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[2]"))));
    	CusName.click();
    	Thread.sleep(1500);
    	CusName.sendKeys("HDFC");
    	//mouse.moveToElement(CusName).click().sendKeys("HDFC").perform();
    	
    	//Login User name
    	WebElement	LoginUserNmae=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[3]"))));
    	LoginUserNmae.click();
    	Thread.sleep(1500);
    	LoginUserNmae.sendKeys("HDFC123");
    //	mouse.moveToElement(LoginUserNmae).click().sendKeys("HDFC").perform();
    	
    	
    	//Premium Radio button
    	WebElement PremiumRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@aria-checked='false'])[1]"))));
    	PremiumRadioBtn.click();
    	Thread.sleep(1000);
    	
    	// Customer Email Entering
    	WebElement addrecord_Email_Field=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@data-semantics-role='text-field'])[4]")));
    	wait.until(ExpectedConditions.visibilityOf(addrecord_Email_Field));
    	wait.until(ExpectedConditions.elementToBeClickable(addrecord_Email_Field));
    	//mouse.moveToElement(addrecord_Email_Field).click().sendKeys("Gowthamcodestax@gmail.com").perform();
    	
    	addrecord_Email_Field.click();
    	Thread.sleep(1000);
    	addrecord_Email_Field.sendKeys("Gowthamcodestax@gmail.com");
    	Thread.sleep(1000);
    	
    	//Customer Phn Number
    	WebElement	addrecord_Phn_Field=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@data-semantics-role='text-field'])[5]")));
    //	mouse.moveToElement(addrecord_Phn_Field).click(addrecord_Phn_Field).sendKeys("678976777").perform();
    	addrecord_Phn_Field.click();
    	Thread.sleep(1000);
    	addrecord_Phn_Field.sendKeys("678976777");
    	
    	
    	//Customer PassportType
    	WebElement Passport_TDType=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics[@role='radio'])[5]")));
    	//js.executeScript("arguments[0].scrollIntoView(true);",Passport_TDType);
    	Thread.sleep(1000);
    	js.executeScript("arguments[0].click();",Passport_TDType);
    	// Passport_TDType.click();
    	
    	//Passporrt number field
    	WebElement	Passport_NumField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[6]"))));
    	mouse.moveToElement(Passport_NumField).click(Passport_NumField).sendKeys("1334663").perform();
    	
    	
    	
      	
    }
	
	
	

	  public void  uploadPassport_FrontPageBtn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	PassportFrontPagebtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[7]"))));
		    Thread.sleep(1000);
		    PassportFrontPagebtn.click();
		    Thread.sleep(2000);
		    
		    		// For Upload Passport front Page Robot Loop 
		 			// Navigate using TAB 
		 			for (int i = 0; i < 9; i++) {
		 				
		 			    robot.keyPress(KeyEvent.VK_TAB);
		 			    robot.keyRelease(KeyEvent.VK_TAB);
		 			    Thread.sleep(500);
		 			}
		 			// Press ENTER (select file + click Open)
		 			robot.keyPress(KeyEvent.VK_ENTER);
		 			robot.keyRelease(KeyEvent.VK_ENTER);
		 			Thread.sleep(2000);
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
		    
		    // For Upload Passport Back Page
		    public void uploadPassport_BackpageBtn() throws InterruptedException {  	
		    	
		    	WebElement	PassportBackPagebtn	=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@data-semantics-role='text-field'])[8]")));
		    	wait.until(ExpectedConditions.visibilityOf(PassportBackPagebtn));
		    	wait.until(ExpectedConditions.elementToBeClickable(PassportBackPagebtn));
		    	PassportBackPagebtn.click();
		    	Thread.sleep(2000);
		    	
		    	// For Upload Passport Back Page Robot Loop 
		    				// Navigate using TAB 
		    				for (int i = 0; i < 9; i++) {
		    					robot.keyPress(KeyEvent.VK_TAB);
		    				    robot.keyRelease(KeyEvent.VK_TAB);
		    				    Thread.sleep(500);
		    				}
		    								
		    				// Press ENTER (select file + click Open)
		    				robot.keyPress(KeyEvent.VK_ENTER);
		    				robot.keyRelease(KeyEvent.VK_ENTER);
		    				Thread.sleep(2000);
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
		    
		    
		    // For Upload Passport Request Form 
		    public void uploadRequestForm_Btn() throws InterruptedException {  
		   
		    
		    WebElement	Passport_ReqFormBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[9]"))));
		    Passport_ReqFormBtn.click();
		    Thread.sleep(2000);
		 
		    	// For Upload Passport Request Form  Robot Loop 
		 			// Navigate using TAB 
		 			for (int i = 0; i < 9; i++) {
		 				robot.keyPress(KeyEvent.VK_TAB);
		 			    robot.keyRelease(KeyEvent.VK_TAB);
		 			    Thread.sleep(500);
		 			}
		 							
		 			// Press ENTER (select file + click Open)
		 			robot.keyPress(KeyEvent.VK_ENTER);
		 			robot.keyRelease(KeyEvent.VK_ENTER);
		 			Thread.sleep(2000);
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
	
	public void lockedReasonDetails() throws InterruptedException {
		
		
		//Locked Reason Radio button
		WebElement Lockedreason_yesRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@role='radio'])[7]"))));
  	Lockedreason_yesRadioBtn.click();
  	Thread.sleep(1000);
  	
  	
  	
  	//Login locKED YES radio buton
		WebElement LoginLocked_yesRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@role='radio'])[9]"))));
  	LoginLocked_yesRadioBtn.click();
  	Thread.sleep(1000);
  	
  	
  	//NRC Verifed yes Button
  	
  	WebElement NrcYes_yesRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@role='radio'])[11]"))));
  	NrcYes_yesRadioBtn.click();
  	Thread.sleep(1000);
				
  	
  	// Mobile vefied yes button
  	
  	WebElement MobileverifedYes_yesRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@role='radio'])[13]"))));
  	MobileverifedYes_yesRadioBtn.click();
  	Thread.sleep(1000);
  	
  	
  	//Signature verifed yes button
  	WebElement SignatureVerifed_yesRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@role='radio'])[15]"))));
  	SignatureVerifed_yesRadioBtn.click();
  	Thread.sleep(1000);
  	
  	
  	//Maker Checker complteed Yes bUtton
  	
  	WebElement Makerchecker_yesRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@role='radio'])[17]"))));
  	Makerchecker_yesRadioBtn.click();
  	Thread.sleep(1000);
		
	}
	
	public void simCardDocUpload_Btn() throws InterruptedException {
		
		 	WebElement	simCradUpload_Btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[10]"))));
		    simCradUpload_Btn.click();
		    Thread.sleep(2000);
		    
		 // For upload SIM Card Robot Loop 
			// Navigate using TAB 
			for (int i = 0; i < 9; i++) {
				robot.keyPress(KeyEvent.VK_TAB);
			    robot.keyRelease(KeyEvent.VK_TAB);
			    Thread.sleep(500);
			}
							
			// Press ENTER (select file + click Open)
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
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
	
	public void deviceTypeTextFiled() {
		
		WebElement	DeviceTypetxtField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[11]"))));
	    DeviceTypetxtField.sendKeys("Laptop");
		
	}
	
	public void RemarkTextField() {
		
		WebElement	remarktxtField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[12]"))));
	    remarktxtField.sendKeys("Done");
		
	}
	
	public void PullOptionButon() {
		
		By pullOption = By.xpath("//flt-semantics[@style[contains(.,'width: 36px') and contains(.,'height: 34px')]]");
		
		for (int i = 0; i < 5; i++) {
			
		
		WebElement Pull=wait.until(ExpectedConditions.presenceOfElementLocated(pullOption));
		
		js.executeScript("arguments[0].click();", Pull);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		}
	}
	
	public void StatusActionClick() throws InterruptedException {
  	for (int i = 0; i <26; i++) {
			
			robot.keyPress(KeyEvent.VK_TAB);																										
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(500);	
			}
  	
  	By ThreedotIcon=By.xpath("(//flt-semantics[@style[contains(.,'position: absolute; overflow: visible; width: 64px; height: 39px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 318, 8); pointer-events: all; z-index: 3;')]])[1]");
  	
  	WebElement threedotbtn=wait.until(ExpectedConditions.presenceOfElementLocated(ThreedotIcon));
  	wait.until(ExpectedConditions.visibilityOf(threedotbtn));
  	js.executeScript("arguments[0].scrollIntoView(true)", threedotbtn);
  	js.executeScript("arguments[0].click();",threedotbtn );
  	

  	
  }
	
	public void EscalteActionclick() {
		
		By Escalatebutton=By.xpath("(//flt-semantics[@role='button'])[3]");
  	WebElement Esacalatebtn=wait.until(ExpectedConditions.presenceOfElementLocated(Escalatebutton));
  	wait.until(ExpectedConditions.visibilityOf(Esacalatebtn));
  	js.executeScript("arguments[0].scrollIntoView(true)", Esacalatebtn);
  	js.executeScript("arguments[0].click();",Esacalatebtn );
  	
	}
	
	public void UpdateStage_Commentsection() throws InterruptedException {
		
		
	
		By Commentsection=	By.xpath("//textarea[@data-semantics-role[contains(.,'text-field')]]");
  	WebElement UpdatestageCMNTbox=wait.until(ExpectedConditions.presenceOfElementLocated(Commentsection));
  	Thread.sleep(1000);
  	UpdatestageCMNTbox.click();
  	UpdatestageCMNTbox.sendKeys("Okay");
  //	js.executeScript("arguments[0].click()", UpdatestageCMNTbox);
  //	js.executeScript("arguments[0].value= 'Okay';", UpdatestageCMNTbox);
	
	}
	
	
	public void soc1loginApproveaction() throws InterruptedException {
		
		for (int i = 0; i <28; i++) {
			
			robot.keyPress(KeyEvent.VK_TAB);																										
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(500);	
			}
		
		By Approvebutton=By.xpath("//flt-semantics[.='Approve']");
  	WebElement Approvebtn=wait.until(ExpectedConditions.presenceOfElementLocated(Approvebutton));
  	wait.until(ExpectedConditions.visibilityOf(Approvebtn));
  	js.executeScript("arguments[0].scrollIntoView(true)", Approvebtn);
  	js.executeScript("arguments[0].click();",Approvebtn );
	}
	
	
	
	public void FMU1loginUpdateaction() throws InterruptedException {
		
		for (int i = 0; i <26; i++) {
			
			robot.keyPress(KeyEvent.VK_TAB);																										
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(500);	
			}
		
		By Updatebutton=By.xpath("(//flt-semantics[.='Update'])[2]");
  	WebElement Updatebtn=wait.until(ExpectedConditions.presenceOfElementLocated(Updatebutton));
  	wait.until(ExpectedConditions.visibilityOf(Updatebtn));
  	js.executeScript("arguments[0].scrollIntoView(true)", Updatebtn);
  	js.executeScript("arguments[0].click();",Updatebtn );
	}
	
	
	public void SelectOptionButon() {
		
		By selectOption = By.xpath("//span[.='Select']");
		WebElement select=wait.until(ExpectedConditions.presenceOfElementLocated(selectOption));
		js.executeScript("arguments[0].click();", select);
	
	}
	
	public void accountUnlock_Paygliant_workflowOption() throws InterruptedException {
		
		
		//span[@style='display: inline-block; white-space: nowrap; transform-origin: 0px 0px 0px; transform: scale(0.670241, 3.11111);']
		By accUnlock_PaygliantOption = By.xpath("//span[@style='display: inline-block; white-space: nowrap; transform-origin: 0px 0px 0px; transform: scale(0.670241, 3.11111);']");
		WebElement accUnlock_PaygliantBtn=wait.until(ExpectedConditions.presenceOfElementLocated(accUnlock_PaygliantOption));
		js.executeScript("arguments[0].click();", accUnlock_PaygliantBtn);
		
		By Pullbutton=By.xpath("//flt-semantics[.='Pull']");
		WebElement pullBtn=wait.until(ExpectedConditions.presenceOfElementLocated(Pullbutton));
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", pullBtn);
		
	}

	public void CIF1GroupLoginStatusAction() throws InterruptedException {
		
		Thread.sleep(2000);
		for (int i = 0; i <28; i++) {
			
			robot.keyPress(KeyEvent.VK_TAB);																										
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(500);	
			}
  	
  		By UnlockAction=By.xpath("(//flt-semantics[.='Unlock User'])[2]");
  		WebElement unlockbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(UnlockAction));
  		js.executeScript("arguments[0].scrollIntoView({block:'center'});", unlockbtn);
  		Thread.sleep(1000);
  		unlockbtn.click();
  	//	js.executeScript("arguments[0].click();", unlockbtn);
  	//	js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click', {bubbles:true}));",unlockbtn);
		}
	
	
}
