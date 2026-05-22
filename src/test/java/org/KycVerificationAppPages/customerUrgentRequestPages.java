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

public class customerUrgentRequestPages {
	
	
	

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	public customerUrgentRequestPages(WebDriver driver) throws AWTException {
		
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
    	
		
	}
	
	public void ticketpriority() throws InterruptedException {
		
		//Premium Radio button
    	WebElement HighRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@role='radio'])[1]"))));
    	HighRadioBtn.click();
    	Thread.sleep(1000);
		
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
	    	Thread.sleep(1000);
	    	customerOnboardChannelClick.click();
			
				
	    }
	 
	 public void selfOnboarding() throws InterruptedException {
		 
		 
		 	//selfOnboardingOPtion
			WebElement selfOnboardingOPtion=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='Self Onboarding']")));
			wait.until(ExpectedConditions.visibilityOf(selfOnboardingOPtion));
			wait.until(ExpectedConditions.elementToBeClickable(selfOnboardingOPtion));
			Thread.sleep(600);
			selfOnboardingOPtion.click();
			
	 }
	 
	 
	 public void eaOnboarding() throws InterruptedException {
		 
		 
		 	//EA Onboarding
			WebElement EAOnboardingOPtion=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='EA Onboarding']")));
			wait.until(ExpectedConditions.visibilityOf(EAOnboardingOPtion));
			wait.until(ExpectedConditions.elementToBeClickable(EAOnboardingOPtion));
			Thread.sleep(600);
			EAOnboardingOPtion.click();
		 
	 }
	 
	 public void enteringCustomerDetails() throws InterruptedException {
		 
		 
		 
		 	//CUS Name
	    	WebElement	CusName=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[2]"))));
	    	Thread.sleep(1500);
	    	mouse.moveToElement(CusName).click().sendKeys(" Kumar").perform();
	 
	    	//CUS phn number
	    	
	    	WebElement	CusPhn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[3]"))));
	    	Thread.sleep(1500);
	    	mouse.moveToElement(CusPhn).click().sendKeys("678976777").perform();
	    	
	    	
	 
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
	 
	 public void customerUrgentRequestOption() throws InterruptedException {
		 
		 			// customerUrgentRequestOption
					WebElement customerUrgentRequestOptionButton=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='Customer Urgent Request (New obd related and KYC change case only)']")));
					wait.until(ExpectedConditions.visibilityOf(customerUrgentRequestOptionButton));
					wait.until(ExpectedConditions.elementToBeClickable(customerUrgentRequestOptionButton));
					Thread.sleep(500);
					customerUrgentRequestOptionButton.click();
		 
	 }
	 
	 public void typesofserviceReqTextFiedl() throws InterruptedException {
		 
		 
		 By textAreaLocator =
		            By.xpath("//textarea[@data-semantics-role='text-field']");

		    WebElement textArea = wait.until(
		            ExpectedConditions.visibilityOfElementLocated(textAreaLocator));

		    // Scroll to element
		    Thread.sleep(1000);
		    js.executeScript("arguments[0].scrollIntoView(true);", textArea);

		    // Wait little for Flutter rendering
		    wait.until(ExpectedConditions.elementToBeClickable(textArea));

		    // Click using JavaScript (avoids intercepted click issue)
		    Thread.sleep(600);
		    js.executeScript("arguments[0].click();", textArea);
		   
		    // Enter text
		    Thread.sleep(1000);
		    textArea.sendKeys("Customer urgent Request");
		 

		    // Clear existing text if any
		   // textArea.clear();

		   
	 }
	 
	 public void passportIDproofRadiobtn() throws InterruptedException {
		 
		 
		 WebElement passportIDproofRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics[@role='radio'])[6]")));
	     Thread.sleep(500);
	     js.executeScript("arguments[0].scrollIntoView({behaviour: 'smooth', block:'center'});", passportIDproofRadioBtn);
		 passportIDproofRadioBtn.click();

	    	
	 }
	 
	 public void passportnumField() throws InterruptedException {
		 
		 //Passporrt number field
		 WebElement	Passport_NumField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@data-semantics-role='text-field'])[4]")));
		 Thread.sleep(600);
		 mouse.moveToElement(Passport_NumField).click(Passport_NumField).sendKeys("11223344577").perform();
	 
	 } 
	 
	 public void  uploadPassport_FrontPageBtn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	PassportFrontPagebtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@data-semantics-role='text-field'])[5]")));
		   Thread.sleep(500);
		    PassportFrontPagebtn.click();
		    Thread.sleep(5000);
		    
		    		// For Upload Passport front Page Robot Loop 
		 			// Navigate using TAB 
		 			for (int i = 0; i < 9; i++) {
		 			    robot.keyPress(KeyEvent.VK_TAB);
		 			    robot.keyRelease(KeyEvent.VK_TAB);
		 			    Thread.sleep(1000);
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
	    
	 // For uploadSecondaryIDBackPage_Btn
	    public void uploadSecondaryIDBackPage_Btn() throws InterruptedException {  
	    
	    WebElement	uploadSecondaryIDBbckPage_Btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[9]"))));
	    Thread.sleep(500);
	    uploadSecondaryIDBbckPage_Btn.click();
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
	    
	    public void NextButton() {  	
		    WebElement	NxtBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Next']"))));
		    NxtBtn.click();
		    
		    }
	    
	    public void SendCheckerButtonClick() throws InterruptedException {
	    	Thread.sleep(4000);
	    	for (int i = 0; i <27; i++) {
				
	    		
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(500);	
				}
	    	
	    	//	WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics-container/flt-semantics[@role='button'])[10]"))));
	    	//	eyeiconbtn.click();
	    	
	    	WebElement	sendcheckerbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[@role='button' and contains(text(),'Send to Checker')]"))));
	    	Thread.sleep(3000);	
	    	sendcheckerbtn.click();
	    }
	    
	/*    
	    public void sendCheckerButon() throws InterruptedException {
	    	
	    	WebElement	sendcheckerbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[@role='button' and contains(text(),'Send to Checker')]"))));
	    	Thread.sleep(3000);	
	    	sendcheckerbtn.click();
	    	
	    }
	   */ 
	    
	    
	    
	    public void KBZcenterCheckerRadioButon() throws InterruptedException {
	    	
	    	WebElement	KBZcenterCheckerRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@role='radio'])[1]"))));
	    	Thread.sleep(1000);	
	    	KBZcenterCheckerRadioBtn.click();
	    	
	    }
	    
	    
	    public void CluserManagerRadioButtton() throws InterruptedException {
	    	
	    	WebElement	CluserManagerRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@role='radio'])[2]"))));
	    	Thread.sleep(1000);	
	    	CluserManagerRadioBtn.click();
	    	
	    }
	       
	    public void UpdateSatgeCMNTbox() throws InterruptedException {
	    	
	    	WebElement	UpdateSatgeCMNtTextField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics/span/following::flt-semantics/textarea[@data-semantics-role='text-field']"))));
	    	Thread.sleep(1000);	
	    	UpdateSatgeCMNtTextField.click();
	    	UpdateSatgeCMNtTextField.sendKeys("Done");
	    	
	    }
	    
	    
	    
	   

}
