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

public class Pin_Reset_Req_Device_Change_ReqPage {
	

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
    
    public Pin_Reset_Req_Device_Change_ReqPage(WebDriver driver) throws AWTException {
		
    	this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
	}
    
    public void Pin_Reset_Req_Device_Change_ReqOption() throws InterruptedException {
		
		By Pin_Reset_Req_Device_Change_ReqOptionLOc	=By.xpath("//flt-semantics/span[.='Pin Reset Request + Device Change Request']");
		wait.until(ExpectedConditions.presenceOfElementLocated(Pin_Reset_Req_Device_Change_ReqOptionLOc));
		Thread.sleep(600);
		
		WebElement Pin_Reset_Req_Device_Change_ReqOptionLOcBtn=driver.findElement(Pin_Reset_Req_Device_Change_ReqOptionLOc);
		js.executeScript("arguments[0].click();", Pin_Reset_Req_Device_Change_ReqOptionLOcBtn);	
		
    }
 
    public void nrcIDproof() throws InterruptedException {
		
		By 	NRCIDproofRdioLoc=By.xpath("//flt-semantics/span[.='NRC / မှတ်ပုံတင်']/preceding::flt-semantics[@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(NRCIDproofRdioLoc));
		Thread.sleep(100);
		
		WebElement NRCIDproofRdioBtn=driver.findElement(NRCIDproofRdioLoc);
		NRCIDproofRdioBtn.click();
	}
    
    public void nrcNumberFields() throws InterruptedException {
		
		// DistrictOption
		By	DistrictOPtion=By.xpath("//flt-semantics/span[.='NRC number *']/following::flt-semantics[@aria-label='Districts']");
		wait.until(ExpectedConditions.presenceOfElementLocated(DistrictOPtion));
		Thread.sleep(200);
		
		WebElement	districtBtn=driver.findElement(DistrictOPtion);
		js.executeScript("arguments[0].click();", districtBtn);
		
		//Fifth OPtion
		WebElement fifthoption=driver.findElement(By.xpath("//flt-semantics/span[.='5']"));
		Thread.sleep(10);
		fifthoption.click();
		

		//  Town Selection
		By	TownShipOPtion=By.xpath("//flt-semantics/span[.='NRC number *']/following::flt-semantics[@aria-label='Townships']");		
		wait.until(ExpectedConditions.presenceOfElementLocated(TownShipOPtion));
	//	Thread.sleep(200);	
		
		WebElement	TownSHipBtn=driver.findElement(TownShipOPtion);
		js.executeScript("arguments[0].click();", TownSHipBtn);	
		
		WebElement secondoption=driver.findElement(By.xpath("//flt-semantics/span[.='BAMANA']"));
		Thread.sleep(10);
		secondoption.click();
		
		//  bUtton
		By	ButtonOPtion=By.xpath("(//flt-semantics/span[.='NRC number *']/following::flt-semantics[10])[last()]");
		wait.until(ExpectedConditions.presenceOfElementLocated(ButtonOPtion));
		Thread.sleep(200);
		
		WebElement	Btn=driver.findElement(ButtonOPtion);
		js.executeScript("arguments[0].click();", Btn);
				
		WebElement P_option=driver.findElement(By.xpath("//flt-semantics/span[.='P']"));
		Thread.sleep(10);
		P_option.click();
		
		
		//NUMBER FIELD
		By	NumberTXTField=By.xpath("//flt-semantics/input[@aria-label='Number']");
		wait.until(ExpectedConditions.presenceOfElementLocated(NumberTXTField));
		Thread.sleep(300);	
		
		WebElement	NumberTxtFieldBtn=driver.findElement(NumberTXTField);
		js.executeScript("arguments[0].click();", NumberTxtFieldBtn);
		Thread.sleep(200);
		NumberTxtFieldBtn.sendKeys("33457");
		
	}
    
	 public void  uploadNrcFront_PageBtn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	uploadNRCFrontPagetBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Upload NRC front page *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		//   Thread.sleep(1500);
		    uploadNRCFrontPagetBtn.click();
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
		    // For Upload Passport front Pag
		    WebElement	uploadNRCBackPagetBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Upload NRC back page *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		    uploadNRCBackPagetBtn.click();
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
		 By CalenderLoc= By.xpath("//input[@aria-label='YYYY-MM-DD']");
		 wait.until(ExpectedConditions.presenceOfElementLocated(CalenderLoc));
		 Thread.sleep(500);
			
		 WebElement	 Calender=driver.findElement(CalenderLoc);
		 Calender.click();
	//	 Thread.sleep(500);
			
			//getting current Day e,g(Today)
			int CurrentDay=LocalDate.now().getDayOfMonth();
			
			// Dyamimc xpath For Current Day
			By todayDate = By.xpath("//flt-semantics[contains(text(),'" + CurrentDay + "') and contains(text(),'Today')]");
			WebElement today = wait.until(ExpectedConditions.presenceOfElementLocated(todayDate));
			// Click current date
		    js.executeScript("arguments[0].click();", today);
		 //   Thread.sleep(200);
		    
		    //OK
		    WebElement	OkClick=driver.findElement(By.xpath("//flt-semantics[.='OK']"));
		    js.executeScript("arguments[0].click();", OkClick);
			Thread.sleep(500);		
		}
	 
	 
	 public void addressFiled() throws InterruptedException {
			
		 By AddressFieldLoc= By.xpath("//flt-semantics/span[.='Address *']/following::flt-semantics[1]/textarea[@data-semantics-role='text-field']");
		 wait.until(ExpectedConditions.presenceOfElementLocated(AddressFieldLoc));
		Thread.sleep(200);
		
		WebElement AddressField=driver.findElement(AddressFieldLoc);
		AddressField.click();
		Thread.sleep(200);
		AddressField.sendKeys("Test Address");
			
		}
	
	public void loanStatusField() throws InterruptedException {
	
	
		By LoanStatusLoc=By.xpath("//flt-semantics/span[.='Loan status *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");	
		wait.until(ExpectedConditions.presenceOfElementLocated(LoanStatusLoc));
		Thread.sleep(300);
	
		WebElement LoanStatusField=driver.findElement(LoanStatusLoc);
		Thread.sleep(200);
		js.executeScript("arguments[0].click();", LoanStatusField);
	//	Thread.sleep(200);
		LoanStatusField.sendKeys("Test@123");
	
	}
	
	

	public void errorDetailsField() throws InterruptedException {
	
	
		By ErrorLoc=By.xpath("//flt-semantics/span[.='Error Details']/following::flt-semantics/textarea[@data-semantics-role='text-field']");	
		wait.until(ExpectedConditions.presenceOfElementLocated(ErrorLoc));
		Thread.sleep(500);
	
		WebElement ErrorField=driver.findElement(ErrorLoc);
		Thread.sleep(200);
		js.executeScript("arguments[0].click();", ErrorField);
	//	Thread.sleep(200);
		ErrorField.sendKeys("Test@123");
	
	}
	
	public void dateAndTime_IssueOccured() throws InterruptedException {
		
		//getting current Day e,g(Today)
		int CurrentDay=LocalDate.now().getDayOfMonth();
		
		// calender click
		
		By IssueDateAndTimePopupLoc=By.xpath("//flt-semantics/input[@aria-label='dd-MM-yyyy HH:mm:ss']");
		wait.until(ExpectedConditions.presenceOfElementLocated(IssueDateAndTimePopupLoc));
		Thread.sleep(400);
		
		WebElement IssueDateAndTimePopup=driver.findElement(IssueDateAndTimePopupLoc);
		IssueDateAndTimePopup.click();
		
		// Dyamimc xpath For Current Day
		By todayDate = By.xpath("//flt-semantics[contains(text(),'" + CurrentDay + "') and contains(text(),'Today')]");
		WebElement today = wait.until(ExpectedConditions.presenceOfElementLocated(todayDate));
		// Click current date
	    js.executeScript("arguments[0].click();", today);
		
	    //First OK
	    WebElement	OkClick=driver.findElement(By.xpath("//flt-semantics[.='OK']"));
		//customerOnboardChannel
    	OkClick.click();
		Thread.sleep(300);
		
		// Select PM in time picker
	    By pmLocator = By.xpath("//flt-semantics[@aria-label='PM'][@role='radio']");
	    wait.until(ExpectedConditions.presenceOfElementLocated(pmLocator));
	    WebElement pmButton = driver.findElement(pmLocator);
	    js.executeScript("arguments[0].click();", pmButton);
	    Thread.sleep(100);
	 
	    
		// ANother OK 
		// Second OK (Time popup) - RELOCATE AGAIN
	    WebElement secondOk = wait.until(ExpectedConditions.presenceOfElementLocated( By.xpath("(//flt-semantics[.='OK'])[last()]") ));
	    js.executeScript("arguments[0].click();", secondOk);
	    Thread.sleep(100);
		
	}
	

	 public void alternate_phoneNumField() throws InterruptedException{
			
		 //Passporrt number field
		 WebElement	Alt_Phm_NumField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Alternate Phone number']/following::flt-semantics[2]/input[@data-semantics-role='text-field']")));
		 Thread.sleep(100);
		 mouse.moveToElement(Alt_Phm_NumField).click(Alt_Phm_NumField).sendKeys("4356789").perform();
	 
		
	}
	 

	 public void kbzRegPhnNumField () throws InterruptedException {
		 
		By  kbzRegPhnNumFieldLoc = By.xpath("//flt-semantics/span[.='KBZPay Registered Phone Number *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']");
		wait.until(ExpectedConditions.presenceOfElementLocated(kbzRegPhnNumFieldLoc));
		Thread.sleep(200);
		
		WebElement	kbzRegPhnNumFieldc=driver.findElement(kbzRegPhnNumFieldLoc);
		kbzRegPhnNumFieldc.click();
		Thread.sleep(100);
		kbzRegPhnNumFieldc.sendKeys("678942134");

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
	    		 Thread.sleep(1000);
	    		js.executeScript("arguments[0].click();", eyeiconbtn);
	    	
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
			
			
			// NRC Town Ship 
			By EditTownShipLoc=By.xpath("(//flt-semantics/span[.='NRC number *']/following::flt-semantics[@role='button'])[3]");
			wait.until(ExpectedConditions.presenceOfElementLocated(EditTownShipLoc));
			Thread.sleep(500);
			
			WebElement	EditTownShipbtn=driver.findElement(EditTownShipLoc);
			js.executeScript("arguments[0].click();", EditTownShipbtn);
			// chamgin Township Option in Editing Page
			WebElement editTownshipOptionLoc=driver.findElement(By.xpath("//flt-semantics/span[.='DAHANA']"));
			Thread.sleep(10);
			editTownshipOptionLoc.click();
			
			
			
			// NRC NUMBER FIELD
			By	NumberTXTField=By.xpath("//flt-semantics/input[@aria-label='Number']");
			wait.until(ExpectedConditions.presenceOfElementLocated(NumberTXTField));
			Thread.sleep(500);	
			WebElement	NumberTxtFieldBtn=driver.findElement(NumberTXTField);
			// Scroll into view + pause for Flutter rendering
		    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", NumberTxtFieldBtn);
		    Thread.sleep(800);  // Allow scroll + re-render
		 // Always use JS click for Flutter input fields
		    js.executeScript("arguments[0].click();", NumberTxtFieldBtn);
		    Thread.sleep(200);
		    
		    
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
	
	
	 public void assignToTSOBtn() throws InterruptedException {
	    	
	    	
 		WebElement	AssignToTSOBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[@role='button' and contains(text(),'Assign to TSO')]")));
 		Thread.sleep(3000);
 		AssignToTSOBtn.click();
 }
}
