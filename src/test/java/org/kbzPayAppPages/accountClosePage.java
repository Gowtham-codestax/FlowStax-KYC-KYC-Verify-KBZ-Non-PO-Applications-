package org.kbzPayAppPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class accountClosePage {
	
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	
	public accountClosePage(WebDriver driver) throws AWTException {
		
		

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
	
	public void accCloseOption() {
		
		
			//Accountcloseoptionb option
				WebElement Accountcloseoption=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Account Close']")));
				wait.until(ExpectedConditions.visibilityOf(Accountcloseoption));
				wait.until(ExpectedConditions.elementToBeClickable(Accountcloseoption));
				Accountcloseoption.click();
				
	}
	
	public void branchPhnnUmberField() throws InterruptedException {
		
		
		
		WebElement BranhcPhnnumField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Branch Phone Number *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']")));
		Thread.sleep(500);
		BranhcPhnnumField.click();
		Thread.sleep(200);
		BranhcPhnnumField.sendKeys("678976777");
	}
	
	
	public void cusName() throws InterruptedException {
		
		By CusNameFieldLoc=By.xpath("//flt-semantics/span[.='Customer name *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
		wait.until(ExpectedConditions.presenceOfElementLocated(CusNameFieldLoc));
		Thread.sleep(200);
		
		WebElement CusNameField=driver.findElement(CusNameFieldLoc);
		CusNameField.click();
		Thread.sleep(100);
		CusNameField.sendKeys("Test Name");
		
	}
	
	
	public void DateOfBirth() throws InterruptedException {
		
		
		// calender click

		WebElement Calender=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='YYYY-MM-DD']")));
		wait.until(ExpectedConditions.visibilityOf(Calender));
		wait.until(ExpectedConditions.elementToBeClickable(Calender));
		// Calender.click();
	//	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", Calender);
		Thread.sleep(500);
	//	js.executeScript("arguments[0].click();", Calender);
		Calender.click();
		Thread.sleep(1500);
		
		//getting current Day e,g(Today)
		int CurrentDay=LocalDate.now().getDayOfMonth();
		
		// Dyamimc xpath For Current Day
		By todayDate = By.xpath("//flt-semantics[contains(text(),'" + CurrentDay + "') and contains(text(),'Today')]");
		WebElement today = wait.until(ExpectedConditions.elementToBeClickable(todayDate));
		
		// Click current date
	    js.executeScript("arguments[0].click();", today);
	    Thread.sleep(300);
	    //OK
	    
	    WebElement	OkClick=driver.findElement(By.xpath("//flt-semantics[.='OK']"));
    //	OkClick.click();
	    js.executeScript("arguments[0].click();", OkClick);
		Thread.sleep(200);
		
	}
	
	
	public void UploadCustomerFace() throws InterruptedException {
		  // For UploadCustomerFaceBtn
	    WebElement	UploadCustomerFaceBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Customer Face Photo *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
	//   Thread.sleep(200);    
	    UploadCustomerFaceBtn.click();
	    Thread.sleep(5000);
	    
	 // For Upload Passport front Page Robot Loop 
			// Navigate using TAB 
			for (int i = 0; i < 9; i++) {
			    robot.keyPress(KeyEvent.VK_TAB);
			    robot.keyRelease(KeyEvent.VK_TAB);
			    Thread.sleep(300);
			}
		// Press DOWN arrow 3 times to select picture option
			for (int i = 0; i < 3; i++) {
			    robot.keyPress(KeyEvent.VK_DOWN);
			    robot.keyRelease(KeyEvent.VK_DOWN);
			    Thread.sleep(300);
			}
			// Press ENTER (select file + click Open)
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(200);
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
	
	
	public void nrcIDproof() throws InterruptedException {
		
		By 	NRCIDproofRdioLoc=By.xpath("//flt-semantics/span[.='NRC / မှတ်ပုံတင်']/preceding::flt-semantics[@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(NRCIDproofRdioLoc));
		Thread.sleep(200);
		
		WebElement NRCIDproofRdioBtn=driver.findElement(NRCIDproofRdioLoc);
		NRCIDproofRdioBtn.click();
	}
	
	public void passportIDproof() throws InterruptedException {
		
		
		WebElement passportIDproofRdioBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics[@role='radio'])[2]")));
		wait.until(ExpectedConditions.visibilityOf(passportIDproofRdioBtn));
		wait.until(ExpectedConditions.elementToBeClickable(passportIDproofRdioBtn));
		passportIDproofRdioBtn.click();
		Thread.sleep(200);
	}
	
	
	public void passportNumField() throws InterruptedException{
		
		 //Passporrt number field
		 WebElement	Passport_NumField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Passport number *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		 Thread.sleep(500);
		 String PassNum = "67" + String.format("%07d", System.currentTimeMillis() % 10000000L);
		 mouse.moveToElement(Passport_NumField).click(Passport_NumField).sendKeys(PassNum).perform();
	//	 Passport_NumField.sendKeys(PassNum);
		
	}
	
	
	 public void  uploadNewPassport_PageBtn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	uploadNewPassportBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Upload new passport *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		   Thread.sleep(1500);
		   uploadNewPassportBtn.click();
		    Thread.sleep(5000);
		    
		 // For Upload Passport front Page Robot Loop 
 			// Navigate using TAB 
 			for (int i = 0; i < 9; i++) {
 			    robot.keyPress(KeyEvent.VK_TAB);
 			    robot.keyRelease(KeyEvent.VK_TAB);
 			    Thread.sleep(350);
 			}
 		// Press DOWN arrow 3 times to select picture option
 			for (int i = 0; i < 3; i++) {
 			    robot.keyPress(KeyEvent.VK_DOWN);
 			    robot.keyRelease(KeyEvent.VK_DOWN);
 			    Thread.sleep(300);
 			}
 			// Press ENTER (select file + click Open)
 			robot.keyPress(KeyEvent.VK_ENTER);
 			robot.keyRelease(KeyEvent.VK_ENTER);
 			Thread.sleep(300);
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
	 
	 
	 public void  uploadOldPassport_PageBtn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	uploadOldPassportBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Upload old passport']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		   Thread.sleep(1500);
		   uploadOldPassportBtn.click();
		    Thread.sleep(5000);
		    // For Upload Passport front Page Robot Loop 
 			// Navigate using TAB 
 			for (int i = 0; i < 9; i++) {
 			    robot.keyPress(KeyEvent.VK_TAB);
 			    robot.keyRelease(KeyEvent.VK_TAB);
 			    Thread.sleep(350);
 			}
 		// Press DOWN arrow 3 times to select picture option
 			for (int i = 0; i < 3; i++) {
 			    robot.keyPress(KeyEvent.VK_DOWN);
 			    robot.keyRelease(KeyEvent.VK_DOWN);
 			    Thread.sleep(300);
 			}
 			// Press ENTER (select file + click Open)
 			robot.keyPress(KeyEvent.VK_ENTER);
 			robot.keyRelease(KeyEvent.VK_ENTER);
 			Thread.sleep(300);
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
	 
	 public void addressFiled() throws InterruptedException {
			
		By AddresFieldloc= By.xpath("//flt-semantics/span[.='Address *']/following::flt-semantics[1]/textarea[@data-semantics-role='text-field']");
		wait.until(ExpectedConditions.presenceOfElementLocated(AddresFieldloc));
		Thread.sleep(100);
		
		WebElement AddressField=driver.findElement(AddresFieldloc);
		AddressField.click();
		Thread.sleep(100);
		AddressField.sendKeys("Test Address");
			
		}
	 
	 
	 public void fathersNameField() throws InterruptedException {
		 
		By FathernameFieldLoc= By.xpath("//flt-semantics/span[contains(.,'Fathe')]/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
		wait.until(ExpectedConditions.presenceOfElementLocated(FathernameFieldLoc));
		Thread.sleep(100);
		
		WebElement FathernameField=driver.findElement(FathernameFieldLoc);
		FathernameField.click();
		Thread.sleep(100);
		FathernameField.sendKeys("Test");
		 
		 
	 }
	 
	 
	 
	 public void currentBalanceNumFiedl() throws InterruptedException {
		 
			WebElement currentBalNumField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Current Balance *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']")));
			wait.until(ExpectedConditions.visibilityOf(currentBalNumField));
			wait.until(ExpectedConditions.elementToBeClickable(currentBalNumField));
			currentBalNumField.click();
			Thread.sleep(200);
			currentBalNumField.sendKeys("2000000");
		 
	 }
	 
	 
	 public void phoneNumField() throws InterruptedException{
			
		 //Passporrt number field
		 WebElement	Phm_NumField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Phone number *']/following::flt-semantics[3]")));
		 Thread.sleep(500);
		 mouse.moveToElement(Phm_NumField).click(Phm_NumField).sendKeys("678976877").perform();
	 
		
	}
	 
	 
	 public void  bankStaffApprovalformBtn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	BankStaffaproltBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Bank Staff Approval Form *']/following::flt-semantics[1]")));
		   Thread.sleep(1500);
		   BankStaffaproltBtn.click();
		    Thread.sleep(5000);
		    
		    // For Upload Passport front Page Robot Loop 
 			// Navigate using TAB 
 			for (int i = 0; i < 9; i++) {
 			    robot.keyPress(KeyEvent.VK_TAB);
 			    robot.keyRelease(KeyEvent.VK_TAB);
 			    Thread.sleep(350);
 			}
 		// Press DOWN arrow 3 times to select picture option
 			for (int i = 0; i < 3; i++) {
 			    robot.keyPress(KeyEvent.VK_DOWN);
 			    robot.keyRelease(KeyEvent.VK_DOWN);
 			    Thread.sleep(300);
 			}
 			// Press ENTER (select file + click Open)
 			robot.keyPress(KeyEvent.VK_ENTER);
 			robot.keyRelease(KeyEvent.VK_ENTER);
 			Thread.sleep(300);
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
	 
	 
	 public void  infoOf3transaction_Btn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	Transaction_Btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Info of 3 latest transactions']/following::flt-semantics[1]")));
		   Thread.sleep(1500);
		   Transaction_Btn.click();
		    Thread.sleep(5000);
		    
		    // For Upload Passport front Page Robot Loop 
 			// Navigate using TAB 
 			for (int i = 0; i < 9; i++) {
 			    robot.keyPress(KeyEvent.VK_TAB);
 			    robot.keyRelease(KeyEvent.VK_TAB);
 			    Thread.sleep(350);
 			}
 		// Press DOWN arrow 3 times to select picture option
 			for (int i = 0; i < 3; i++) {
 			    robot.keyPress(KeyEvent.VK_DOWN);
 			    robot.keyRelease(KeyEvent.VK_DOWN);
 			    Thread.sleep(300);
 			}
 			// Press ENTER (select file + click Open)
 			robot.keyPress(KeyEvent.VK_ENTER);
 			robot.keyRelease(KeyEvent.VK_ENTER);
 			Thread.sleep(300);
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
	 
	 
	 
	 	
	 	public void  sparrowTicketNumField() throws InterruptedException {    
		   
	 		 WebElement sparrowTicketField = wait.until(
	 	            ExpectedConditions.visibilityOfElementLocated(
	 	                    By.xpath("//flt-semantics/span[contains(.,'Complaint Ticket Number from Sparrow')]"
	 	                            + "/following::input[@data-semantics-role='text-field'][1]")));

	 	    js.executeScript("arguments[0].scrollIntoView({block:'center'});",sparrowTicketField);

	 	    Thread.sleep(1000);

	 	    js.executeScript("arguments[0].click();", sparrowTicketField);
	 	    Thread.sleep(500);
	 	    sparrowTicketField.sendKeys("3456789876");
		 }
	 
	 	public void  oldNRC_NumField() throws InterruptedException {    
			   
	 		 WebElement oldNRCNumField = wait.until(
	 	            ExpectedConditions.presenceOfElementLocated(
	 	                    By.xpath("//flt-semantics/span[contains(.,'Old NRC Number')]"
	 	                            + "/following::input[@data-semantics-role='text-field'][1]")
	 	            ));

	 	    wait.until(ExpectedConditions.visibilityOf(oldNRCNumField));

	 	    js.executeScript("arguments[0].scrollIntoView({block:'center'});", oldNRCNumField);

	 	    Thread.sleep(1000);

	 	    js.executeScript("arguments[0].focus();", oldNRCNumField);

	 	    oldNRCNumField.sendKeys("3457776");

		    		
		 }
	 	
	 	
	 	 public void oldHandsetModelField() throws InterruptedException {
				
				WebElement OldHandsetModelField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Old Handset Model *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
				wait.until(ExpectedConditions.visibilityOf(OldHandsetModelField));
				wait.until(ExpectedConditions.elementToBeClickable(OldHandsetModelField));
				OldHandsetModelField.click();
				Thread.sleep(500);
				OldHandsetModelField.sendKeys("67897676GH");
				
			}
	 	
	 	
	 	public void sparrowTicker_DateandTime() throws InterruptedException {
			
			//getting current Day e,g(Today)
			int CurrentDay=LocalDate.now().getDayOfMonth();
			
			// calender click
			By sparrrowDateandTime_PopupLoc=By.xpath("//flt-semantics/span[.='Date and Time (For Sparrow Ticket)']"+"/following::flt-semantics[1]");
			wait.until(ExpectedConditions.presenceOfElementLocated(sparrrowDateandTime_PopupLoc));
			Thread.sleep(500);
			
			WebElement sparrrowDateandTime_Popup=driver.findElement(sparrrowDateandTime_PopupLoc);
			wait.until(ExpectedConditions.elementToBeClickable(sparrrowDateandTime_Popup));
			sparrrowDateandTime_Popup.click();
			
			// Dyamimc xpath For Current Day
			By todayDate = By.xpath("//flt-semantics[contains(text(),'" + CurrentDay + "') and contains(text(),'Today')]");
			wait.until(ExpectedConditions.elementToBeClickable(todayDate));
			
			WebElement today=driver.findElement(todayDate);
			// Click current date
		    js.executeScript("arguments[0].click();", today);
			
		    //First OK
		    WebElement	OkClick=driver.findElement(By.xpath("//flt-semantics[.='OK']"));
			//customerOnboardChannel
	    	OkClick.click();
			Thread.sleep(500);
			
			// ANother OK 
			// Second OK (Time popup) - RELOCATE AGAIN
		    WebElement secondOk = wait.until(ExpectedConditions.elementToBeClickable( By.xpath("(//flt-semantics[.='OK'])[last()]") ));
		    js.executeScript("arguments[0].click();", secondOk);
		    Thread.sleep(1000);
			
		}
	 	
	 	
	 	
	 

		 public void alternate_phoneNumField() throws InterruptedException{
				
			 //Passporrt number field
			 WebElement	Alt_Phm_NumField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Alternate Phone number']/following::flt-semantics[3]")));
			 Thread.sleep(1000);
			 mouse.moveToElement(Alt_Phm_NumField).click(Alt_Phm_NumField).sendKeys("4356789").perform();
		 
			
		}
		 
	 	
	 	
		 public void reasonTxtFiled() throws InterruptedException {
				

			    WebElement reason = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//flt-semantics/span[contains(.,'Reason')]/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
			    wait.until(ExpectedConditions.elementToBeClickable(reason));
			  //  js.executeScript("arguments[0].scrollIntoView({block:'center'});", reason);
			 //   Thread.sleep(1000);
			    reason.click();
			    Thread.sleep(100);
			    reason.sendKeys("Test");
			    
			 //   js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", reason);
		    //	 Thread.sleep(1200);
		    //	 reason.click();
		    //	js.executeScript("arguments[0].click();", reason);
		    //	Thread.sleep(500);
		    //	reason.sendKeys("Test");
		    //	js.executeScript("arguments[0].value='Test';", reason);

			}	
	 
		  public void NextButton() throws InterruptedException {  	 
			  By NextLoc=By.xpath("//flt-semantics[.='Next']");
			  wait.until(ExpectedConditions.presenceOfElementLocated(NextLoc));
			  Thread.sleep(50);
			  
			  WebElement NextBtn=driver.findElement(NextLoc);
			  NextBtn.click();
			  
		  }
		  
		  

		    public void EyeIconbtnClick() throws InterruptedException {
		    	Thread.sleep(15000);
		    	for (int i = 0; i <41; i++) {
					
					robot.keyPress(KeyEvent.VK_TAB);																										
					robot.keyRelease(KeyEvent.VK_TAB);
					Thread.sleep(200);	
					}
		    	
		    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all;'])[1]")));
		    		 js.executeScript("arguments[0].scrollIntoView({block:'center'});", eyeiconbtn);
		    		 Thread.sleep(500);
		    		js.executeScript("arguments[0].click();", eyeiconbtn);
		    	
		    }
	 
	/*	    public void EditIconbtnClick() throws InterruptedException {
		    	
		    	
	    		WebElement	editbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Edit']"))));
	    		Thread.sleep(1000);
	    		editbtn.click();
	    } */
		    
		    public void EditIconbtnClick() throws InterruptedException {
		    	
		    	
	    		WebElement	editbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Edit']"))));
	    		Thread.sleep(1000);
	    		editbtn.click();
	    		
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
	    }
	    
	    
		    

		    public void assignToTSOBtn() throws InterruptedException {
		    	
		    	
	    		WebElement	AssignToTSOBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[@role='button' and contains(text(),'Assign to TSO')]")));
	    		Thread.sleep(3000);
	    		AssignToTSOBtn.click();
	    }
	 
		    
		    
		    
		    public void recommedUploadLeter_YesRadioBtn() throws InterruptedException {
		    	

	    		WebElement	yes=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Is Recommendation letter uploaded *']"+"/following::flt-semantics[1][@role='radio']")));
	    		Thread.sleep(500);
	    		js.executeScript("arguments[0].click();", yes);
		    	
		    	
		    }
		    
		    public void signatureVerfied_YesRadioBtn() throws InterruptedException {
		    	

	    		WebElement	yes=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Is signature verified *']"+""
	    									+ "/following::flt-semantics[1][@role='radio']")));
	    		Thread.sleep(500);
	    		js.executeScript("arguments[0].click();", yes);
		    	
		    	
		    }
		    
		    
		    public void docChecked_YesRadioBtn() throws InterruptedException {
		    	

	    		WebElement	yes=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Are documents checked for accuracy *']"
	    					+"/following::flt-semantics[@role='radio'][1]")));
	    		Thread.sleep(500);
	    		js.executeScript("arguments[0].click();", yes);
		    	
		    	
		    }
		    
		    public void UpdateStage_Commentsection() throws InterruptedException {
				
				
		    	
				By Commentsection=	By.xpath("//textarea[@data-semantics-role[contains(.,'text-field')]]");
		    	WebElement UpdatestageCMNTbox=wait.until(ExpectedConditions.presenceOfElementLocated(Commentsection));
		    	Thread.sleep(1200);
		    	js.executeScript("arguments[0].click();", UpdatestageCMNTbox);
		    	Thread.sleep(100);
		    	UpdatestageCMNTbox.sendKeys("Test");
		    //	js.executeScript("arguments[0].click()", UpdatestageCMNTbox);
		    //	js.executeScript("arguments[0].value= 'Okay';", UpdatestageCMNTbox);
			
			}
	 
	 
	 
		  
		  
		  
		  public void MenuButton() {

		        By menuBtn = By.xpath("(//flt-semantics[@role='button'])[2]");

		        for (int i = 0; i < 5; i++) {

		            try {

		              //  WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(menuBtn));

		            	 wait.until(ExpectedConditions.presenceOfElementLocated(menuBtn));
		            	 WebElement menu= driver.findElement(menuBtn);
		         //      js.executeScript("arguments[0].scrollIntoView({block:'center'});", menu);
		                Thread.sleep(3000);

		       //         js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click',{bubbles:true}));", menu);
		                js.executeScript("arguments[0].click();",menu);
		                System.out.println("Menu clicked");
		                break;

		            } catch (Exception e) {

		                System.out.println("Retrying menu click : " + i);

		                try {
		                    Thread.sleep(5000);
		                } catch (InterruptedException ex) {

		                }
		            }
		        }
		    }
		    
		    public void LogOut() {

		        By logoutDD = By.xpath("(//*[@role='group'])[2]");

		        for (int i = 0; i < 5; i++) {

		            try {

		                WebElement dropdown =
		                        wait.until(ExpectedConditions.presenceOfElementLocated(logoutDD));
		                Thread.sleep(2000);
		                js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click',{bubbles:true}));",dropdown);

		                break;

		            } catch (Exception e) {

		                System.out.println("Retry logout dropdown : " + i);
		            }
		        }

		        By logoutBtn = By.xpath("//*[text()='Logout']");

		        for (int i = 0; i < 5; i++) {

		            try {

		                WebElement logout =
		                        wait.until(ExpectedConditions.presenceOfElementLocated(logoutBtn));

		                		Thread.sleep(3000);	             
		                		js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click',{bubbles:true}));", logout);

		                System.out.println("Logout success");
		                break;

		            } catch (Exception e) {

		                System.out.println("Retry logout button : " + i);

		                try {
		                    Thread.sleep(2000);
		                } catch (InterruptedException ex) {

		                }
		            }
		        }
		    }


		  
		    public void applicationCorrectedButton() throws InterruptedException {
		    	

	    		WebElement	applicationcrtbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[contains(text(),'Application Corrected')]")));
	    		Thread.sleep(1000);
	    		js.executeScript("arguments[0].click();", applicationcrtbtn);
		    	
		    	
		    	
		    }
			    
	 
	 
		    public void downloadPDFButton() throws InterruptedException {
		    	
		    	By DownLoadBtn=By.xpath("(//flt-semantics[@role='button'])[last()]");
		    	wait.until(ExpectedConditions.presenceOfElementLocated(DownLoadBtn));
		    	Thread.sleep(1000);
		    	
		    	WebElement downloadPdfbtn=driver.findElement(DownLoadBtn);
		    	Thread.sleep(2000);
		    //	downloadPdfbtn.click();
		    	js.executeScript("arguments[0].click();", downloadPdfbtn);
		    	
		    	
		    }
	 
	 
	
	
	
	

}
