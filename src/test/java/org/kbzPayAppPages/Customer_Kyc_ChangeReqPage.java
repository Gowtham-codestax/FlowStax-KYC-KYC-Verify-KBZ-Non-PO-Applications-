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
import org.openqa.selenium.WebDriver;

public class Customer_Kyc_ChangeReqPage {
	
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;	
    
    
	public Customer_Kyc_ChangeReqPage(WebDriver driver) throws AWTException {
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
		
		
	}
	
	
	public void customer_KYC_ChangeOption() throws InterruptedException{
    	
    	
    	WebElement	customerKycChangeOPtion=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Customer KYC Change Request']")));
    	wait.until(ExpectedConditions.elementToBeClickable(customerKycChangeOPtion));
    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", customerKycChangeOPtion);
    	Thread.sleep(500);
    	js.executeScript("arguments[0].click();", customerKycChangeOPtion);
    	
    }
	
	
	public void fatherNameTXTField() throws InterruptedException{
    	
    	
    	WebElement	FatherNametXT=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics/input[@data-semantics-role='text-field'])[12]")));
    	wait.until(ExpectedConditions.elementToBeClickable(FatherNametXT));
    //	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", FatherNametXT);
    	Thread.sleep(500);
    //	js.executeScript("arguments[0].click();", FatherNametXT);
    	FatherNametXT.click();
    	Thread.sleep(300);
    	FatherNametXT.sendKeys("Test");
    	
    }
	
	public void  cusKYC_changeType() throws InterruptedException {
		
		WebElement	Select=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Select']")));
		wait.until(ExpectedConditions.elementToBeClickable(Select));
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", Select);
		Thread.sleep(500);
		js.executeScript("arguments[0].click();", Select);
		
		
		
		
	}
		
		public void  SelectAllCheckBox_KYC_changeType_Agent() throws InterruptedException {
			
			WebElement	SelectallCheckBox=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Select All']/preceding::flt-semantics[@role='checkbox']")));
			wait.until(ExpectedConditions.elementToBeClickable(SelectallCheckBox));
			js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", SelectallCheckBox);
			Thread.sleep(1000);
			js.executeScript("arguments[0].click();", SelectallCheckBox);
			
			// Close option 
			WebElement	CloseSelect=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='KYC Change Type *']/following::flt-semantics[@role='group']")));
			wait.until(ExpectedConditions.elementToBeClickable(CloseSelect));
		//	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", CloseSelect);
			Thread.sleep(1300);
			js.executeScript("arguments[0].click();", CloseSelect);
			
		}
		
		 public void  kycChangeFormUpload_Btn() throws InterruptedException {    
			    // For Upload Passport front Pag
			    WebElement	KYCForm_Btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='KYC Change Form *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
			   // js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", KYCForm_Btn);
				Thread.sleep(1000);
				KYCForm_Btn.isDisplayed();
				KYCForm_Btn.click();
			//	js.executeScript("arguments[0].click();", KYCForm_Btn);
				Thread.sleep(5000);
			    
			    		// For Upload Passport front Page Robot Loop 
			 			// Navigate using TAB 
			 			for (int i = 0; i < 9; i++) {
			 			    robot.keyPress(KeyEvent.VK_TAB);
			 			    robot.keyRelease(KeyEvent.VK_TAB);
			 			    Thread.sleep(300);
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
			
	
		 public void  LastinfoTransactionFormUpload_Btn() throws InterruptedException {    
			    // For Upload Passport front Pag
			    WebElement	LastTransForm_Btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Info of 3 latest transactions']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
			    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", LastTransForm_Btn);
				Thread.sleep(2000);
				LastTransForm_Btn.click();
			//	js.executeScript("arguments[0].click();", KYCForm_Btn);
				Thread.sleep(5000);
			    
			    		// For Upload Passport front Page Robot Loop 
			 			// Navigate using TAB 
			 			for (int i = 0; i < 9; i++) {
			 			    robot.keyPress(KeyEvent.VK_TAB);
			 			    robot.keyRelease(KeyEvent.VK_TAB);
			 			    Thread.sleep(300);
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
	
		 public void branchPhnnUmberField() throws InterruptedException {
				
				
				
				WebElement BranhcPhnnumField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Branch Phone Number *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']")));
				wait.until(ExpectedConditions.visibilityOf(BranhcPhnnumField));
				wait.until(ExpectedConditions.elementToBeClickable(BranhcPhnnumField));
				BranhcPhnnumField.click();
				Thread.sleep(500);
				BranhcPhnnumField.sendKeys("678976777");
			}
			
			
			public void cusName() throws InterruptedException {
				
				
				
				WebElement CusNameField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Customer name *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
				wait.until(ExpectedConditions.visibilityOf(CusNameField));
				wait.until(ExpectedConditions.elementToBeClickable(CusNameField));
				CusNameField.click();
				Thread.sleep(500);
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
				Thread.sleep(500);
				
			}
			 public void address_TxtField() throws InterruptedException {
				  
				 	WebElement	Addrestxtfeild=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Address *']/following::flt-semantics[1]/textarea[@data-semantics-role='text-field']")));
			    	wait.until(ExpectedConditions.elementToBeClickable(Addrestxtfeild));
			    //	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", Addrestxtfeild);
			    	Thread.sleep(1200);
			    	Addrestxtfeild.click();
			    	Thread.sleep(300);
			    	Addrestxtfeild.sendKeys("Test");
//			    	js.executeScript("arguments[0].click();", Addrestxtfeild);
//			    	Thread.sleep(500);
//			    	js.executeScript("arguments[0].value='Test';", Addrestxtfeild);
			    	
			 }
			
			
			public void UploadCustomerFace() throws InterruptedException {
				
				
				  // For UploadCustomerFaceBtn
			    WebElement	UploadCustomerFaceBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Customer Face Photo *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
			    Thread.sleep(500);
			    
			    UploadCustomerFaceBtn.click();
			    Thread.sleep(5000);
			    
			    		// For Upload Passport front Page Robot Loop 
			 			// Navigate using TAB 
			 			for (int i = 0; i < 9; i++) {
			 			    robot.keyPress(KeyEvent.VK_TAB);
			 			    robot.keyRelease(KeyEvent.VK_TAB);
			 			    Thread.sleep(300);
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
			public void  additionalDoc_Upload_Btn() throws InterruptedException {    
	 		    // For Upload Passport front Pag
	 		    WebElement	additiondoc=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Additional Document']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
	 		    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", additiondoc);
	 			Thread.sleep(500);
	 		//	js.executeScript("arguments[0].click();", additiondoc);
	 			additiondoc.click();
	 		    Thread.sleep(5000);
	 		    
	 		    		// For Upload Passport front Page Robot Loop 
	 		 			// Navigate using TAB 
	 		 			for (int i = 0; i < 9; i++) {
	 		 			    robot.keyPress(KeyEvent.VK_TAB);
	 		 			    robot.keyRelease(KeyEvent.VK_TAB);
	 		 			    Thread.sleep(300);
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
	 		 
			
			public void passportIDproof() throws InterruptedException {
				
				
				WebElement passportIDproofRdioBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics[@role='radio'])[2]")));
				wait.until(ExpectedConditions.visibilityOf(passportIDproofRdioBtn));
				wait.until(ExpectedConditions.elementToBeClickable(passportIDproofRdioBtn));
				passportIDproofRdioBtn.click();
				Thread.sleep(1000);
			}
			
			
			public void passportNumField() throws InterruptedException{
				
				 //Passporrt number field
				 WebElement	Passport_NumField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Passport number *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
				 Thread.sleep(1000);
				 String PassNum = "67" + String.format("%07d", System.currentTimeMillis() % 10000000L);
				 mouse.moveToElement(Passport_NumField).click(Passport_NumField).sendKeys(PassNum).perform();
			//	 Passport_NumField.sendKeys(PassNum);
				
			}
			
			
			 public void  uploadNewPassport_PageBtn() throws InterruptedException {    
				    // For Upload Passport front Pag
				    WebElement	uploadNewPassportBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Upload new passport *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
				//   Thread.sleep(1500);
				   uploadNewPassportBtn.click();
				    Thread.sleep(5000);
				    
				    		// For Upload Passport front Page Robot Loop 
				 			// Navigate using TAB 
				 			for (int i = 0; i < 9; i++) {
				 			    robot.keyPress(KeyEvent.VK_TAB);
				 			    robot.keyRelease(KeyEvent.VK_TAB);
				 			    Thread.sleep(300);
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
			 
			 
			 public void  uploadOldPassport_PageBtn() throws InterruptedException {    
				    // For Upload Passport front Pag
				    WebElement	uploadOldPassportBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Upload old passport']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
				   uploadOldPassportBtn.click();
				    Thread.sleep(5000);
				    
				    		// For Upload Passport front Page Robot Loop 
				 			// Navigate using TAB 
				 			for (int i = 0; i < 9; i++) {
				 			    robot.keyPress(KeyEvent.VK_TAB);
				 			    robot.keyRelease(KeyEvent.VK_TAB);
				 			    Thread.sleep(300);
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
			 
			 public void addressFiled() throws InterruptedException {
					
					
					
					WebElement AddressField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Address *']/following::flt-semantics[1]/textarea[@data-semantics-role='text-field']")));
					wait.until(ExpectedConditions.visibilityOf(AddressField));
					wait.until(ExpectedConditions.elementToBeClickable(AddressField));
					AddressField.click();
					Thread.sleep(500);
					AddressField.sendKeys("12 Dummy Address");
					
				}
			 
			 
			 public void fathersNameFiedl() throws InterruptedException {
				 
					WebElement FathernameField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Address *']/following::flt-semantics[3]/input[@data-semantics-role='text-field']")));
					wait.until(ExpectedConditions.visibilityOf(FathernameField));
					wait.until(ExpectedConditions.elementToBeClickable(FathernameField));
					
				//	js.executeScript("arguments[0].scrollIntoView({block:'center'});", FathernameField);
					Thread.sleep(1000);
					js.executeScript("arguments[0].click();", FathernameField);
				//	 FathernameField.click();
					Thread.sleep(500);
					FathernameField.sendKeys("Test");
				 
				 
			 }
			 
			 
			 
			 public void currentBalanceNumFiedl() throws InterruptedException {
				 
					WebElement currentBalNumField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Current Balance *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']")));
					wait.until(ExpectedConditions.visibilityOf(currentBalNumField));
					wait.until(ExpectedConditions.elementToBeClickable(currentBalNumField));
					currentBalNumField.click();
					Thread.sleep(500);
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
			 	
			 	
			 	public void sparrowTicker_DateandTime() throws InterruptedException {
					
					//getting current Day e,g(Today)
					int CurrentDay=LocalDate.now().getDayOfMonth();
					
					// calender click
					By sparrrowDateandTime_Popup=By.xpath("//flt-semantics/span[.='Date and Time (For Sparrow Ticket)']"+"/following::flt-semantics[1]");
					WebElement SparrrowDateandTime_Popup=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Date and Time (For Sparrow Ticket)']/following::flt-semantics[1]")));
					wait.until(ExpectedConditions.visibilityOf(SparrrowDateandTime_Popup));
					wait.until(ExpectedConditions.elementToBeClickable(SparrrowDateandTime_Popup));
					SparrrowDateandTime_Popup.click();
					
					// Dyamimc xpath For Current Day
					By todayDate = By.xpath("//flt-semantics[contains(text(),'" + CurrentDay + "') and contains(text(),'Today')]");
					WebElement today = wait.until(ExpectedConditions.elementToBeClickable(todayDate));
					
					// Click current date
				    js.executeScript("arguments[0].click();", today);
					
				    //First OK
				    
				    WebElement	OkClick=driver.findElement(By.xpath("//flt-semantics[.='OK']"));
					//customerOnboardChannel
			    	OkClick.click();
					Thread.sleep(1000);
					
					// ANother OK 
					
					// Second OK (Time popup) - RELOCATE AGAIN
				    WebElement secondOk = wait.until(
				            ExpectedConditions.elementToBeClickable(
				                    By.xpath("(//flt-semantics[.='OK'])[last()]")
				            ));

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
					    js.executeScript("arguments[0].scrollIntoView({block:'center'});", reason);

					    Thread.sleep(1000);
					    wait.until(ExpectedConditions.elementToBeClickable(reason));

					    reason.click();
					    Thread.sleep(500);
					    reason.sendKeys("Test");
					    
					 //   js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", reason);
				    //	 Thread.sleep(1200);
				    //	 reason.click();
				    //	js.executeScript("arguments[0].click();", reason);
				    //	Thread.sleep(500);
				    //	reason.sendKeys("Test");
				    //	js.executeScript("arguments[0].value='Test';", reason);

					}	
				 
				 public void oldKycDataTxtField() throws InterruptedException {
					  
					 	WebElement	oldKYCTxtField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Old KYC Data']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
				    	wait.until(ExpectedConditions.elementToBeClickable(oldKYCTxtField));
				    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", oldKYCTxtField);
				    	oldKYCTxtField.click();
				    	Thread.sleep(300);
				    	oldKYCTxtField.sendKeys("Test");
//				    	js.executeScript("arguments[0].click();", oldKYCTxtField);
//				    	Thread.sleep(500);
//				    	js.executeScript("arguments[0].value='Test';", oldKYCTxtField);	
					 
				 }
				 
				 public void newycDataTxtField() throws InterruptedException {
					  
					 	WebElement	NewTxtField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='New KYC Data *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
				    	wait.until(ExpectedConditions.elementToBeClickable(NewTxtField));
				    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", NewTxtField);
				    	Thread.sleep(1000);
				    	NewTxtField.click();
				    	Thread.sleep(300);
				    	NewTxtField.sendKeys("Test");
//				    	js.executeScript("arguments[0].click();", NewTxtField);
//				    	Thread.sleep(500);
//				    	js.executeScript("arguments[0].value='New KYC Data Test';", NewTxtField);
//				    	
				 }
					
			 
				  public void NextButton() {  	
					   
					  WebElement	NxtBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Next']"))));
					  NxtBtn.click();
					  
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
			    		BranhcPhnnumField.sendKeys("67"+System.currentTimeMillis() % 1000000L);
			    }
			    
				    

				    public void assignToTSOBtn() throws InterruptedException {
				    	
				    	
			    		WebElement	AssignToTSOBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[@role='button' and contains(text(),'Assign to TSO')]")));
			    		Thread.sleep(1500);
			    		AssignToTSOBtn.click();
			    }
			 
				    
				    
				    
				    public void recommedUploadLeter_YesRadioBtn() throws InterruptedException {
				    	

			    		WebElement	yes=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Is Recommendation letter uploaded *']"+
			    				"/following::flt-semantics[1][@role='radio']")));
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
				    	Thread.sleep(2000);
				    	js.executeScript("arguments[0].click();", UpdatestageCMNTbox);
				    	Thread.sleep(500);
				    	UpdatestageCMNTbox.sendKeys("Okay");
				    //	js.executeScript("arguments[0].click()", UpdatestageCMNTbox);
				    //	js.executeScript("arguments[0].value= 'Okay';", UpdatestageCMNTbox);
					
					}
			 
			 
				    
				    public void downloadPDFButton() throws InterruptedException {
				    	
				    	By DownLoadBtn=By.xpath("(//flt-semantics[@role='button'])[12]");
				    	wait.until(ExpectedConditions.presenceOfElementLocated(DownLoadBtn));
				    	Thread.sleep(1000);
				    	
				    	WebElement downloadPdfbtn=driver.findElement(DownLoadBtn);
				    //	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'})", downloadPdfbtn);
				    	Thread.sleep(2000);
				    //	downloadPdfbtn.click();
				    	js.executeScript("arguments[0].click();", downloadPdfbtn);
				    	
				    	
				    }
				 
				  
				  
	
	
	

}
