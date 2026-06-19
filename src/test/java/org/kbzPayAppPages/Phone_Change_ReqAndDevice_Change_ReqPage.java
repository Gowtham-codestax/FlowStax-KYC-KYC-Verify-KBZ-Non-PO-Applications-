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

public class Phone_Change_ReqAndDevice_Change_ReqPage {
	
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Actions mouse;
	Robot robot;
	
	public Phone_Change_ReqAndDevice_Change_ReqPage(WebDriver driver) throws AWTException {

    	this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
	}
	
	
	public void Phone_Change_ReqAndDevice_Change_ReqOption() throws InterruptedException {
		
		By Phone_Change_ReqAndDevice_Change_ReqOptioLOc	=By.xpath("//flt-semantics/span[.='Phone Change Request + Device Change Request']");
		wait.until(ExpectedConditions.presenceOfElementLocated(Phone_Change_ReqAndDevice_Change_ReqOptioLOc));
		Thread.sleep(1000);
		
		WebElement Phone_Change_ReqAndDevice_Change_ReqOptionBtn=driver.findElement(Phone_Change_ReqAndDevice_Change_ReqOptioLOc);
		js.executeScript("arguments[0].click();", Phone_Change_ReqAndDevice_Change_ReqOptionBtn);
		
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
		
		By CusNameFieldLOC=By.xpath("//flt-semantics/span[.='Customer name *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Customer name *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		Thread.sleep(500);
		
		WebElement	CusNameField=driver.findElement(CusNameFieldLOC);
		CusNameField.click();
		Thread.sleep(100);
		CusNameField.sendKeys("Test Name");
		
	}

	public void nrcIDproof() throws InterruptedException {
		
		By 	NRCIDproofRdioLoc=By.xpath("//flt-semantics/span[.='NRC / မှတ်ပုံတင်']/preceding::flt-semantics[@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(NRCIDproofRdioLoc));
		Thread.sleep(500);
		
		WebElement NRCIDproofRdioBtn=driver.findElement(NRCIDproofRdioLoc);
		NRCIDproofRdioBtn.click();
	}
	
	
	public void nrcNumberFields() throws InterruptedException {
		
		
		// DistrictOption
		By	DistrictOPtion=By.xpath("//flt-semantics/span[.='NRC number *']/following::flt-semantics[@aria-label='Districts']");
		wait.until(ExpectedConditions.presenceOfElementLocated(DistrictOPtion));
		Thread.sleep(1000);
		
		WebElement	districtBtn=driver.findElement(DistrictOPtion);
	//	Thread.sleep(400);
		js.executeScript("arguments[0].click();", districtBtn);
		WebElement fifthoption=driver.findElement(By.xpath("//flt-semantics/span[.='5']"));
		Thread.sleep(10);
		fifthoption.click();
		

		//  Town Selection
		By	TownShipOPtion=By.xpath("//flt-semantics/span[.='NRC number *']/following::flt-semantics[@aria-label='Townships']");		
		wait.until(ExpectedConditions.presenceOfElementLocated(TownShipOPtion));
		Thread.sleep(500);	
		
		WebElement	TownSHipBtn=driver.findElement(TownShipOPtion);
		js.executeScript("arguments[0].click();", TownSHipBtn);		
		WebElement secondoption=driver.findElement(By.xpath("//flt-semantics/span[.='BAMANA']"));
		Thread.sleep(10);
		secondoption.click();
		
		//  bUtton
		By	ButtonOPtion=By.xpath("(//flt-semantics/span[.='NRC number *']/following::flt-semantics[10])[last()]");
		wait.until(ExpectedConditions.presenceOfElementLocated(ButtonOPtion));
		Thread.sleep(500);
		
		WebElement	Btn=driver.findElement(ButtonOPtion);
		js.executeScript("arguments[0].click();", Btn);
				
		WebElement P_option=driver.findElement(By.xpath("//flt-semantics/span[.='N']"));
		Thread.sleep(10);
		P_option.click();
		
		
		//NUMBER FIELD
		By	NumberTXTField=By.xpath("//flt-semantics/input[@aria-label='Number']");
		wait.until(ExpectedConditions.presenceOfElementLocated(NumberTXTField));
		Thread.sleep(500);	
		
		WebElement	NumberTxtFieldBtn=driver.findElement(NumberTXTField);
		js.executeScript("arguments[0].click();", NumberTxtFieldBtn);
		Thread.sleep(200);
		NumberTxtFieldBtn.sendKeys("33457");
		
	}
	
	
	 public void  uploadNrcFront_PageBtn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	uploadNRCFrontPagetBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Upload NRC front page *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		//   Thread.sleep(1500);
		    uploadNRCFrontPagetBtn.click();
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
 			    Thread.sleep(200);
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
	 
	 
	 public void  uploadNRC_Back_PageBtn() throws InterruptedException {    
		    // For Upload Passport front Page
		 
		 By  uploadNRCBackPageLoc= By.xpath("//flt-semantics/span[.='Upload NRC back page *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
		 wait.until(ExpectedConditions.presenceOfElementLocated(uploadNRCBackPageLoc));
		 Thread.sleep(1000);
		 
		 WebElement uploadNRCBackPageBtn= driver.findElement(uploadNRCBackPageLoc);
		 js.executeScript("arguments[0].scrollIntoView( {behavior: 'smooth', block: 'center'} );", uploadNRCBackPageBtn);
		 Thread.sleep(200);
		 
		 uploadNRCBackPageBtn.click();
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
			    Thread.sleep(200);
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
		
		public void uploadCustomerFacePhoto() throws InterruptedException {
		
			  // For UploadCustomerFaceBtn
			By UploadCustomerFaceLoc=	By.xpath("//flt-semantics/span[.='Customer Face Photo *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
		    wait.until(ExpectedConditions.presenceOfElementLocated(UploadCustomerFaceLoc));
		    Thread.sleep(500);
		    
		   WebElement UploadCustomerFaceBtn=driver.findElement(UploadCustomerFaceLoc);
		    
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
 			    Thread.sleep(200);
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
		
		 public void currentBalanceNumFiedl() throws InterruptedException {
			 
			 By currentBalNumFieldLoc= By.xpath("//flt-semantics/span[.='Current Balance *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']");
			 wait.until(ExpectedConditions.presenceOfElementLocated(currentBalNumFieldLoc));
			 Thread.sleep(1000);
			
			 WebElement	currentBalNumField=driver.findElement(currentBalNumFieldLoc);
			 currentBalNumField.click();
			 Thread.sleep(500);
			 currentBalNumField.sendKeys("2000000");
			 
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
	 			    Thread.sleep(300);
	 			}
	 		// Press DOWN arrow 3 times to select picture option
	 			for (int i = 0; i < 3; i++) {
	 			    robot.keyPress(KeyEvent.VK_DOWN);
	 			    robot.keyRelease(KeyEvent.VK_DOWN);
	 			    Thread.sleep(200);
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
		 public void reasonTxtFiled() throws InterruptedException {
				

			    WebElement reason = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//flt-semantics/span[contains(.,'Reason')]/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
			    wait.until(ExpectedConditions.elementToBeClickable(reason));
			    js.executeScript("arguments[0].scrollIntoView({block:'center'});", reason);

			    Thread.sleep(1000);
			    wait.until(ExpectedConditions.elementToBeClickable(reason));

			    reason.click();
			    Thread.sleep(200);
			    reason.sendKeys("Test");
			    
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
	 			    Thread.sleep(300);
	 			}
	 		// Press DOWN arrow 3 times to select picture option
	 			for (int i = 0; i < 3; i++) {
	 			    robot.keyPress(KeyEvent.VK_DOWN);
	 			    robot.keyRelease(KeyEvent.VK_DOWN);
	 			    Thread.sleep(200);
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
		 public void oldHandsetModelField() throws InterruptedException {
				
				WebElement OldHandsetModelField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Old Handset Model *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
				wait.until(ExpectedConditions.visibilityOf(OldHandsetModelField));
				wait.until(ExpectedConditions.elementToBeClickable(OldHandsetModelField));
				OldHandsetModelField.click();
				Thread.sleep(500);
				OldHandsetModelField.sendKeys("67897676GH");
				
			}
		 
		 
		 public void kbzRegPhnNumField () throws InterruptedException {
			 
			By  kbzRegPhnNumFieldLoc = By.xpath("//flt-semantics/span[.='KBZPay Registered Phone Number *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']");
			wait.until(ExpectedConditions.presenceOfElementLocated(kbzRegPhnNumFieldLoc));
			Thread.sleep(600);
			
			WebElement	kbzRegPhnNumFieldc=driver.findElement(kbzRegPhnNumFieldLoc);
			kbzRegPhnNumFieldc.sendKeys("678942134");

		 }
		 
		 
		 public void oldPhnNumField () throws InterruptedException {
			 
			By  OldPhnNumFieldLoc	= By.xpath("//flt-semantics/span[.='Old phone number']/following::flt-semantics[3]/input[@data-semantics-role='text-field']");
			wait.until(ExpectedConditions.presenceOfElementLocated(OldPhnNumFieldLoc));
			Thread.sleep(600);
			
			WebElement	OldPhnNumField=driver.findElement(OldPhnNumFieldLoc);
			OldPhnNumField.sendKeys("678942334");
		 }
		 
		 
		 	public void newPhnNumField () throws InterruptedException {
			 
				By  newPhnNumFieldoc	= By.xpath("//flt-semantics/span[.='New phone number *']/following::flt-semantics[3]/input[@data-semantics-role='text-field']");
				wait.until(ExpectedConditions.presenceOfElementLocated(newPhnNumFieldoc));
				Thread.sleep(600);
				
				WebElement	newPhnNumField=driver.findElement(newPhnNumFieldoc);
				js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", newPhnNumField);
				newPhnNumField.click();
				Thread.sleep(100);
				newPhnNumField.sendKeys("678942334");
			 }
		 
		 
		 	public void uploadDocUrl() throws InterruptedException {
		 		
		 	By uploadDocURLFieldLOC=By.xpath("//flt-semantics/span[.='Upload document URL']/following::flt-semantics/input[@data-semantics-role='text-field']");
		 	wait.until(ExpectedConditions.presenceOfElementLocated(uploadDocURLFieldLOC));
			Thread.sleep(600);
			
			WebElement	uploadDocURLField=driver.findElement(uploadDocURLFieldLOC);
			uploadDocURLField.click();
			Thread.sleep(10);
			uploadDocURLField.sendKeys("https://docs.google.com/spreadsheets/d/1Fc8TtjwdAeo03w65hhYL_l0b0jNVHZ26/edit?gid=1236133278#gid=1236133278");
		 		
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
				
				//NUMBER FIELD
				By	NumberTXTField=By.xpath("//flt-semantics/input[@aria-label='Number']");
				wait.until(ExpectedConditions.presenceOfElementLocated(NumberTXTField));
				Thread.sleep(500);	

				WebElement	NumberTxtFieldBtn=driver.findElement(NumberTXTField);
				// Scroll into view + pause for Flutter rendering
			    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", NumberTxtFieldBtn);
			    Thread.sleep(800);  // Allow scroll + re-render
			 // Always use JS click for Flutter input fields
			    js.executeScript("arguments[0].click();", NumberTxtFieldBtn);
			    Thread.sleep(300);
			    
				
				NumberTxtFieldBtn.sendKeys(Keys.CONTROL+"a");
				Thread.sleep(100);
				NumberTxtFieldBtn.sendKeys(Keys.BACK_SPACE);
				Thread.sleep(100);
				NumberTxtFieldBtn.sendKeys(String.format("%05d", System.currentTimeMillis() % 100000L));
				

				 
				 // EDITING CURRENT BALANCE
				 By currentBalNumFieldLoc= By.xpath("//flt-semantics/span[.='Current Balance *']/following::flt-semantics[3]/input[@data-semantics-role='text-field']");
				 wait.until(ExpectedConditions.presenceOfElementLocated(currentBalNumFieldLoc));
				 Thread.sleep(1000);
				
				 WebElement	currentBalNumField=driver.findElement(currentBalNumFieldLoc);
				 Thread.sleep(100);
				 js.executeScript("arguments[0].click();", currentBalNumField);
				 Thread.sleep(100);
				 currentBalNumField.sendKeys(Keys.CONTROL+"a");
				 Thread.sleep(100);
				 currentBalNumField.sendKeys(Keys.BACK_SPACE);
				 Thread.sleep(100);
				 currentBalNumField.sendKeys("2233370.700");
				 
				//Next Button
				 WebElement	NxtBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Next']"))));
				 NxtBtn.click();
				 
			}
		 	
		    public void EyeIconbtnClick() throws InterruptedException {
		    	Thread.sleep(15000);
		    	for (int i = 0; i <41; i++) {
					
					robot.keyPress(KeyEvent.VK_TAB);																										
					robot.keyRelease(KeyEvent.VK_TAB);
					Thread.sleep(300);	
					}
		    	
		    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all;'])[1]")));
		    		 js.executeScript("arguments[0].scrollIntoView({block:'center'});", eyeiconbtn);
		    		 Thread.sleep(1000);
		    		js.executeScript("arguments[0].click();", eyeiconbtn);
		    	
		    }
		    
		    
		    public void assignToTSOBtn() throws InterruptedException {
		    	
		    	
	    		WebElement	AssignToTSOBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[@role='button' and contains(text(),'Assign to TSO')]")));
	    		Thread.sleep(3000);
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
		    	UpdatestageCMNTbox.sendKeys("Test");
		    //	js.executeScript("arguments[0].click()", UpdatestageCMNTbox);
		    //	js.executeScript("arguments[0].value= 'Okay';", UpdatestageCMNTbox);
			
			}
	 
	 
	 
		  
	
}
