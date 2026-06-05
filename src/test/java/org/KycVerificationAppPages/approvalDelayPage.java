package org.KycVerificationAppPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class approvalDelayPage {

	

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	
	public approvalDelayPage(WebDriver driver) throws AWTException {
		
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
    		
	}
	
	
	
	
	
	public void ticketPriorityMedium() throws InterruptedException {
		
		
		WebElement MediumRdioBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Medium']/preceding::flt-semantics[@role='radio'][1]")));
		wait.until(ExpectedConditions.visibilityOf(MediumRdioBtn));
		wait.until(ExpectedConditions.elementToBeClickable(MediumRdioBtn));
		MediumRdioBtn.click();
		Thread.sleep(500);
	}
	
	public void customerOnboardDate() throws InterruptedException {
		
		//getting current Day e,g(Today)
		int CurrentDay=LocalDate.now().getDayOfMonth();
		
		// calender click
		By CalenderPopup=By.xpath("//input[@aria-label='YYYY-MM-DD']");
		WebElement Calender=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='YYYY-MM-DD']")));
		wait.until(ExpectedConditions.visibilityOf(Calender));
		wait.until(ExpectedConditions.elementToBeClickable(Calender));
		Calender.click();
		
		// Dyamimc xpath For Current Day
		By todayDate = By.xpath("//flt-semantics[contains(text(),'" + CurrentDay + "') and contains(text(),'Today')]");
		WebElement today = wait.until(ExpectedConditions.elementToBeClickable(todayDate));
		
		// Click current date
	    js.executeScript("arguments[0].click();", today);
		
	    //OK
	    
	    WebElement	OkClick=driver.findElement(By.xpath("//flt-semantics[.='OK']"));
		//customerOnboardChannel
    	OkClick.click();
		Thread.sleep(500);
		
	}
	
	
	 public void  customerOnboardChannel() throws InterruptedException {
	    	
	    	WebElement	customerOnboardChannelClick=driver.findElement(By.xpath("(//span[.='Please select']/parent::flt-semantics)[1]"));
			//customerOnboardChannel
	    	customerOnboardChannelClick.click();
			Thread.sleep(1000);
				
	    }
	 
	 public void selfOnboarding() {
		 
		 
		 	//selfOnboardingOPtion
			WebElement selfOnboardingOPtion=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='Self Onboarding']")));
			wait.until(ExpectedConditions.visibilityOf(selfOnboardingOPtion));
			wait.until(ExpectedConditions.elementToBeClickable(selfOnboardingOPtion));
			selfOnboardingOPtion.click();
	 }
	 
	 
	 public void eaOnboarding() {
		 
		 
		 	//EA Onboarding
			WebElement EAOnboardingOPtion=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='EA Onboarding']")));
			wait.until(ExpectedConditions.visibilityOf(EAOnboardingOPtion));
			wait.until(ExpectedConditions.elementToBeClickable(EAOnboardingOPtion));
			EAOnboardingOPtion.click();
		 
	 }
	 
	 public void enteringCustomerDetails() throws InterruptedException {
		 
		 
		 
		 	//CUS Name
	    	WebElement	CusName=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[2]"))));
	    	Thread.sleep(1500);
	    	mouse.moveToElement(CusName).click().sendKeys(" QA").perform();
	 
	    	//CUS phn number
	    	
	    	WebElement	CusPhn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[3]"))));
	    	Thread.sleep(1500);
	    	//mouse.moveToElement(CusPhn).click().sendKeys(" 678976777").perform();
	    	CusPhn.click();
	    	Thread.sleep(200);
	    	CusPhn.sendKeys("678976777");
	    	
	 
	 }
	 
	 
	 public void serviceRequestType() throws InterruptedException {
		 
		 	// ServiceSelectionOPtion
			WebElement ServiceSelectionOPtion=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics/span[.='Please select'])[1]")));
			wait.until(ExpectedConditions.visibilityOf(ServiceSelectionOPtion));
			wait.until(ExpectedConditions.elementToBeClickable(ServiceSelectionOPtion));
			Thread.sleep(1000);
			
			js.executeScript("arguments[0].click();", ServiceSelectionOPtion);
		//	ServiceSelectionOPtion.click();
			 
	 }
	 
	 public void approvalDelayOption() throws InterruptedException {
			
			
			//Aprovaldelayoption option
				WebElement Aprovaldelayoption=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Approval Delay (New obd customer only)']")));
				wait.until(ExpectedConditions.visibilityOf(Aprovaldelayoption));
				wait.until(ExpectedConditions.elementToBeClickable(Aprovaldelayoption));
				Thread.sleep(100);
				Aprovaldelayoption.click();
				
			}
	 
	 
	 public void typeOfServiceRequestField() throws InterruptedException {
			
			WebElement TypeofservicereqField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Type of Service Request (In Detail) *']/following::flt-semantics/textarea[@data-semantics-role='text-field']")));
			wait.until(ExpectedConditions.visibilityOf(TypeofservicereqField));
			wait.until(ExpectedConditions.elementToBeClickable(TypeofservicereqField));
			Thread.sleep(200);
			js.executeScript("arguments[0].scrollIntoView({block: 'center'});", TypeofservicereqField);
			Thread.sleep(200);
			js.executeScript("arguments[0].click();", TypeofservicereqField);
		//	TypeofservicereqField.click();
			Thread.sleep(300);
			TypeofservicereqField.sendKeys("Testing Approval delay Flow");
			
			
		}
	 

	 public void passportIDProof() throws InterruptedException {
		 
		 WebElement passportIDproofRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics/span[.='Passport']/preceding::flt-semantics[@role='radio'])[6]"))));
	     Thread.sleep(500);
		 passportIDproofRadioBtn.click();
		 Thread.sleep(500);
	    	
	 }
	 
	 public void customerPassportNumField() {
		
		 //Passporrt number field
		 WebElement	custumerPassport_NumField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics/span[.='Customer Passport Number *']/following::flt-semantics/input[@data-semantics-role='text-field'])[1]"))));
		 mouse.moveToElement(custumerPassport_NumField).click(custumerPassport_NumField).sendKeys("11223344577").perform();
		 
	 }
	 
	 public void  uploadPassport_FrontPageBtn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	PassportFrontPagebtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[5]"))));
		   Thread.sleep(500);
		    PassportFrontPagebtn.click();
		    Thread.sleep(5000);
		    
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
	    	
	    	WebElement	PassportBackPagebtn	=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@data-semantics-role='text-field'])[6]")));
	    	wait.until(ExpectedConditions.visibilityOf(PassportBackPagebtn));
	    	wait.until(ExpectedConditions.elementToBeClickable(PassportBackPagebtn));
	    	 Thread.sleep(500);
	    	PassportBackPagebtn.click();
	    	 Thread.sleep(5000);
	    	
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
	    				Thread.sleep(1000);
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
	   
	    
	    WebElement	Passport_ReqFormBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[7]"))));
	    Thread.sleep(500);
	    Passport_ReqFormBtn.click();
	    Thread.sleep(5000);
	 
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
	 			Thread.sleep(1000);
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
	    
	    
	    public void customerSegmentType() {
			 
		 	// CustomersegmentOPtion
			WebElement Cutomersegment=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Customer Segment']/following::flt-semantics/span[.='Please select']")));
			wait.until(ExpectedConditions.visibilityOf(Cutomersegment));
			wait.until(ExpectedConditions.elementToBeClickable(Cutomersegment));
			Cutomersegment.click();
			
					
			// NON HNI
			
				WebElement NonHNI=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='Non HNI']")));
				wait.until(ExpectedConditions.visibilityOf(NonHNI));
				wait.until(ExpectedConditions.elementToBeClickable(NonHNI));
				NonHNI.click();
							
	 }
	    
	    
	 // For uploadSecondaryIDfrontPage_Btn
	    public void uploadSecondaryIDfrontPage_Btn() throws InterruptedException {  
	    
	    WebElement	uploadsecondaryIDfrontPage_Btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[8]"))));
	    Thread.sleep(500);
	    uploadsecondaryIDfrontPage_Btn.click();
	    Thread.sleep(5000);
	 
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
	 			Thread.sleep(1000);
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
	    
	 // For uploadSecondaryIDBackPage_Btn
	    public void uploadSecondaryIDBackPage_Btn() throws InterruptedException {  
	    
	    	 By backPageLocator = By.xpath("(//input[@data-semantics-role='text-field'])[9]");

	    	    // Wait and locate fresh element
	    	    WebElement uploadSecondaryIDBackPageBtn =
	    	            wait.until(ExpectedConditions.elementToBeClickable(backPageLocator));

	    	    Thread.sleep(500);
	    	    uploadSecondaryIDBackPageBtn.click();
	    	    Thread.sleep(5000);

	    	    // TAB navigation
	    	    for (int i = 0; i < 9; i++) {
	    	        robot.keyPress(KeyEvent.VK_TAB);
	    	        robot.keyRelease(KeyEvent.VK_TAB);
	    	        Thread.sleep(500);
	    	    }

	    	    // ENTER
	    	    robot.keyPress(KeyEvent.VK_ENTER);
	    	    robot.keyRelease(KeyEvent.VK_ENTER);
	    	    Thread.sleep(2000);

	    	    // TAB
	    	    robot.keyPress(KeyEvent.VK_TAB);
	    	    robot.keyRelease(KeyEvent.VK_TAB);

	    	    // DOWN
	    	    robot.keyPress(KeyEvent.VK_DOWN);
	    	    robot.keyRelease(KeyEvent.VK_DOWN);

	    	    // ENTER
	    	    robot.keyPress(KeyEvent.VK_ENTER);
	    	    robot.keyRelease(KeyEvent.VK_ENTER);
	    }
	   
		 // For uploadAdditionalDocument_Btn
	    public void uploadAdditionalDocument_Btn() throws InterruptedException {  
	    
	    WebElement	uploadadditionalDocument_Btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[10]"))));
	    Thread.sleep(500);
	    uploadadditionalDocument_Btn.click();
	    Thread.sleep(5000);
	 
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
	 			Thread.sleep(1000);
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
	    
	    
	    public void UploadNRCRecmendationLetter() throws InterruptedException {
	    	
	    	
	    	WebElement	UploadNRCrecmendationLetter=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[11]"))));
	    	 Thread.sleep(500);
	    	UploadNRCrecmendationLetter.click();
	    	 Thread.sleep(5000);
		 
		    	// For Upload PUploadNRCrecmendationLetter  Robot Loop 
		 			// Navigate using TAB 
		 			for (int i = 0; i < 9; i++) {
		 				robot.keyPress(KeyEvent.VK_TAB);
		 			    robot.keyRelease(KeyEvent.VK_TAB);
		 			    Thread.sleep(500);
		 			}
		 							
		 			// Press ENTER (select file + click Open)
		 			robot.keyPress(KeyEvent.VK_ENTER);
		 			robot.keyRelease(KeyEvent.VK_ENTER);
		 			Thread.sleep(1000);
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
	    
	    
	    public void UploadSelfPhoto() throws InterruptedException {
	    	
	    	
	    	WebElement	UploadSelf=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[12]"))));
	    	 Thread.sleep(500);
	    	UploadSelf.click();
	    	 Thread.sleep(5000);
		 
		    	// For UploadSelf  Robot Loop 
		 			// Navigate using TAB 
		 			for (int i = 0; i < 9; i++) {
		 				robot.keyPress(KeyEvent.VK_TAB);
		 			    robot.keyRelease(KeyEvent.VK_TAB);
		 			    Thread.sleep(500);
		 			}
		 							
		 			// Press ENTER (select file + click Open)
		 			robot.keyPress(KeyEvent.VK_ENTER);
		 			robot.keyRelease(KeyEvent.VK_ENTER);
		 			Thread.sleep(1000);
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
	    
	    public void NextButton() {  	
		    WebElement	NxtBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Next']"))));
		    NxtBtn.click();
		    
		    }
	 
	 
	    public void EyeIconbtnClick() throws InterruptedException {
	    	Thread.sleep(4000);
	    	for (int i = 0; i <32; i++) {
				
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(300);	
				}
	    	
	    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all;'])[1]")));
	    		 js.executeScript("arguments[0].scrollIntoView({block:'center'});", eyeiconbtn);
	    		 Thread.sleep(1000);
	    		js.executeScript("arguments[0].click();", eyeiconbtn);
	    	
	    }
	  
	    
	    
	    public void sendToCheckerBtn() throws InterruptedException {
	    
	    WebElement	sendcheckerbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[@role='button' and contains(text(),'Send to Checker')]"))));
    	Thread.sleep(6000);	
    	sendcheckerbtn.click();
	 
	
	    }
	    
	    
	    public void  kbzcenterChecker_RadioBtn() throws InterruptedException {
	    
	    WebElement	KBZCentercheckerbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics/span[.='KBZPay Center Checker']/preceding::flt-semantics[@role='radio'])[1]"))));
    	Thread.sleep(1000);	
    	KBZCentercheckerbtn.click();
	 
	
	    }
	    
	    
	    
	    
	    public void UpdateSatgeCMNTbox() throws InterruptedException {
	    	
	    	WebElement	UpdateSatgeCMNtTextField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics/span/following::flt-semantics/textarea[@data-semantics-role='text-field']"))));
	    	Thread.sleep(1000);	
	    	UpdateSatgeCMNtTextField.click();
	    	UpdateSatgeCMNtTextField.sendKeys("Done");
	    	
	    }
	    
	    
	
	
	
}
