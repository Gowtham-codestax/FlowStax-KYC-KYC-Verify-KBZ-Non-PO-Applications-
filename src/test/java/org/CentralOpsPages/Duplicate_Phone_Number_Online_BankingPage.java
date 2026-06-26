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

public class Duplicate_Phone_Number_Online_BankingPage {

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
    
	public Duplicate_Phone_Number_Online_BankingPage(WebDriver driver) throws AWTException {
		
		this.driver=driver;
		PageFactory.initElements( driver,this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
		
	}
	
	
	
	public void  Duplicate_Phone_Number_Online_BankingOption() throws InterruptedException {
		
		WebElement	categoryDD=driver.findElement(By.xpath("(//span[.='Please select']/parent::flt-semantics)[1]"));
		//Category DD 
		categoryDD.click();
		Thread.sleep(1000);
		
		By Duplicate_Phone_Number_Online_BankingOptionLoc=By.xpath("//flt-semantics/span[.='Duplicate Phone Number: Online Banking']");
		wait.until(ExpectedConditions.presenceOfElementLocated(Duplicate_Phone_Number_Online_BankingOptionLoc));
		Thread.sleep(500);
		
		WebElement	Duplicate_Phone_Number_Online_Banking=driver.findElement(Duplicate_Phone_Number_Online_BankingOptionLoc);
		js.executeScript("arguments[0].click();", Duplicate_Phone_Number_Online_Banking);
	
	}
	
	 
    public void enterCustomerDetails() throws InterruptedException {	
    	//CUS ID
    	
    	By CusIdLoc =By.xpath("//flt-semantics/span[.='Customer ID *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
    	wait.until(ExpectedConditions.presenceOfElementLocated(CusIdLoc));
    	Thread.sleep(800);

    	WebElement CusId=driver.findElement(CusIdLoc);
    	CusId.click();
    	Thread.sleep(300);
    	CusId.sendKeys("123456711");
    	
    	//CUS Name
    	
    	By CusNameLoc	=By.xpath("//flt-semantics/span[.='Customer Name *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
    	wait.until(ExpectedConditions.presenceOfElementLocated(CusNameLoc));
    	Thread.sleep(800);
    	
    	WebElement CusName=driver.findElement(CusNameLoc);
    	mouse.moveToElement(CusName).click().sendKeys("Test").perform();
    	
    	//Premium Radio button
    	By PremiumRadioLoc=By.xpath("//flt-semantics/span[.='Premium']/preceding::flt-semantics[1][@role='radio']");
    	wait.until(ExpectedConditions.presenceOfElementLocated(PremiumRadioLoc));
    	Thread.sleep(800);
    	WebElement   PremiumRadioBtn=driver.findElement(PremiumRadioLoc);
    	PremiumRadioBtn.click();
    	
    	
    	// Customer Email Entering
    	By Email_FieldLoc=By.xpath("//flt-semantics/span[.='Email ID *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
    	wait.until(ExpectedConditions.presenceOfElementLocated(Email_FieldLoc));
    	Thread.sleep(800);
    	//mouse.moveToElement(addrecord_Email_Field).click().sendKeys("Gowthamcodestax@gmail.com").perform();
    	WebElement Email_Field=driver.findElement(Email_FieldLoc);
    	Email_Field.click();
    	Thread.sleep(200);
    	Email_Field.sendKeys("Test@gmail.com");

    	
    	//Customer Phn Number
    	By Contact_FieldLoc=By.xpath("//flt-semantics/span[.='Contact Number *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']");
    	wait.until(ExpectedConditions.presenceOfElementLocated(Contact_FieldLoc));
    //	mouse.moveToElement(addrecord_Phn_Field).click(addrecord_Phn_Field).sendKeys("678976777").perform();
    	Thread.sleep(800);
    	WebElement Contact_Field=driver.findElement(Contact_FieldLoc);
    	Contact_Field.click();
    	Contact_Field.sendKeys("678976777");
    	
    }
	
    public void nrcIDproof() throws InterruptedException {
		
		By 	NRCIDproofRdioLoc=By.xpath("//flt-semantics/span[.='NRC / မှတ်ပုံတင်']/preceding::flt-semantics[1][@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(NRCIDproofRdioLoc));
		Thread.sleep(500);
		
		WebElement NRCIDproofRdioBtn=driver.findElement(NRCIDproofRdioLoc);
		NRCIDproofRdioBtn.click();
	}
	
	
	public void nrcNumberFields() throws InterruptedException {
		
		
		// DistrictOption
		By	DistrictOPtion=By.xpath("//flt-semantics/span[.='NRC Number *']/following::flt-semantics[@aria-label='Districts']");
		wait.until(ExpectedConditions.presenceOfElementLocated(DistrictOPtion));
		Thread.sleep(1000);
		
		WebElement	districtBtn=driver.findElement(DistrictOPtion);
	//	Thread.sleep(400);
		js.executeScript("arguments[0].click();", districtBtn);
		WebElement fifthoption=driver.findElement(By.xpath("//flt-semantics/span[.='5']"));
		Thread.sleep(10);
		fifthoption.click();
		

		//  Town Selection
		By	TownShipOPtion=By.xpath("//flt-semantics/span[.='NRC Number *']/following::flt-semantics[6][@aria-label='Townships']");		
		wait.until(ExpectedConditions.presenceOfElementLocated(TownShipOPtion));
		Thread.sleep(500);	
		
		WebElement	TownSHipBtn=driver.findElement(TownShipOPtion);
		js.executeScript("arguments[0].click();", TownSHipBtn);		
		WebElement secondoption=driver.findElement(By.xpath("//flt-semantics/span[.='BAMANA']"));
		Thread.sleep(10);
		secondoption.click();
		
		//  bUtton
		By	ButtonOPtion=By.xpath("//flt-semantics/span[.='NRC Number *']/following::flt-semantics[10][last()]");
		wait.until(ExpectedConditions.presenceOfElementLocated(ButtonOPtion));
		Thread.sleep(500);
		
		WebElement	Btn=driver.findElement(ButtonOPtion);
		js.executeScript("arguments[0].click();", Btn);
				
		WebElement P_option=driver.findElement(By.xpath("//flt-semantics/span[.='P']"));
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
		    WebElement	uploadNRCFrontPagetBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Upload NRC Front Page']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
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
		 
		 By  uploadNRCBackPageLoc= By.xpath("//flt-semantics/span[.='Upload NRC Back Page']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
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
	 
	
	
	
	public void  uploadRequestForm_Btn() throws InterruptedException {    
	    // For Upload Passport front Page
	 
	 By  uploadReqFormPageLoc= By.xpath("//flt-semantics/span[.='Upload Request Form *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
	 wait.until(ExpectedConditions.presenceOfElementLocated(uploadReqFormPageLoc));
	 Thread.sleep(1000);
	 
	 WebElement UploadReqFormPageBtn= driver.findElement(uploadReqFormPageLoc);
	 js.executeScript("arguments[0].scrollIntoView( {behavior: 'smooth', block: 'center'} );", UploadReqFormPageBtn);
	 Thread.sleep(200);
	 
	 UploadReqFormPageBtn.click();
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
	
	public void nrcVerified_YesRadioBtn() throws InterruptedException {
		
		By NrcYesRadioLoc=By.xpath("//flt-semantics/span[.='NRC Verified? *']/following::flt-semantics[1][@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(NrcYesRadioLoc));
		Thread.sleep(500);
		
		WebElement	NrcYesRadio=driver.findElement(NrcYesRadioLoc);
		NrcYesRadio.click();
	}
		
	public void nrcVerified_NORadioBtn() throws InterruptedException {
		
		By NrcNORadioLoc=By.xpath("//flt-semantics/span[.='NRC Verified? *']/following::flt-semantics[3][@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(NrcNORadioLoc));
		Thread.sleep(500);
		
		WebElement	NrcNORadio=driver.findElement(NrcNORadioLoc);
		NrcNORadio.click();
	}
	
	 public void  uploadSIMCardOwnerDoc_Btn() throws InterruptedException {    
		    // For Upload Passport front Pag
		 By	SIMCardBtnLoc= By.xpath("//flt-semantics/span[.='SIM Card Owner Document *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
		 wait.until(ExpectedConditions.presenceOfElementLocated(SIMCardBtnLoc));
		 Thread.sleep(500);
		 
		 WebElement SIMCardBtn= driver.findElement(SIMCardBtnLoc);
	//	 js.executeScript("arguments[0].click();", SIMCardBtn);
		 SIMCardBtn.click();
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
	
	 public void  customerVerifiedPhnNUm_YesRadioBtn() throws InterruptedException {
			
			By YesRadioLoc=By.xpath("//flt-semantics/span[.='Customer Phone Number Verified? *']/following::flt-semantics[1][@role='radio']");
			wait.until(ExpectedConditions.presenceOfElementLocated(YesRadioLoc));
			Thread.sleep(500);
			
			WebElement	YesRadio=driver.findElement(YesRadioLoc);
			YesRadio.click();
		}
	 
	 public void  customerVerifiedPhnNUm_NORadioBtn() throws InterruptedException {
			
			By NORadioLoc=By.xpath("//flt-semantics/span[.='Customer Phone Number Verified? *']/following::flt-semantics[3][@role='radio']");
			wait.until(ExpectedConditions.presenceOfElementLocated(NORadioLoc));
			Thread.sleep(500);
			
			WebElement	NORadio=driver.findElement(NORadioLoc);
			NORadio.click();
		}	 
	 
	 
	 public void im_Banking_usernameField() throws InterruptedException {
		
		By im_Banking_usernameFieldLoc=By.xpath("//flt-semantics/span[.='I/m Banking Username *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
		wait.until(ExpectedConditions.presenceOfElementLocated(im_Banking_usernameFieldLoc));
		Thread.sleep(300);
		
		WebElement Im_Banking_usernameField=driver.findElement(im_Banking_usernameFieldLoc);
		Im_Banking_usernameField.sendKeys("Test123");
	 }
	 
	 public void  userNameVerified_YesRadioBtn() throws InterruptedException {
			
			By YesRadioLoc=By.xpath("//flt-semantics/span[.='User Name Verified? *']/following::flt-semantics[1][@role='radio']");
			wait.until(ExpectedConditions.presenceOfElementLocated(YesRadioLoc));
			Thread.sleep(500);
			
			WebElement	YesRadio=driver.findElement(YesRadioLoc);
			YesRadio.click();
		}	

	 public void  userNameVerified_NORadioBtn() throws InterruptedException {
			
			By NoRadioLoc=By.xpath("//flt-semantics/span[.='User Name Verified? *']/following::flt-semantics[3][@role='radio']");
			wait.until(ExpectedConditions.presenceOfElementLocated(NoRadioLoc));
			Thread.sleep(500);
			
			WebElement	NoRadio=driver.findElement(NoRadioLoc);
			NoRadio.click();
		}	
	 
	 public void  emailVerified_YesRadioBtn() throws InterruptedException {
			
			By YesRadioLoc=By.xpath("//flt-semantics/span[.='Email Verified? *']/following::flt-semantics[1][@role='radio']");
			wait.until(ExpectedConditions.presenceOfElementLocated(YesRadioLoc));
			Thread.sleep(50);
			
			WebElement	YesRadio=driver.findElement(YesRadioLoc);
			YesRadio.click();
		}	


	 public void  emailVerified_NORadioBtn() throws InterruptedException {
			
			By NoRadioLoc=By.xpath("//flt-semantics/span[.='Email Verified? *']/following::flt-semantics[3][@role='radio']");
			wait.until(ExpectedConditions.presenceOfElementLocated(NoRadioLoc));
			Thread.sleep(500);
			
			WebElement	NoRadio=driver.findElement(NoRadioLoc);
			NoRadio.click();
		}	


	 public void  docVerified_YesRadioBtn() throws InterruptedException {
			
			By YesRadioLoc=By.xpath("//flt-semantics/span[.='Documents Verified? *']/following::flt-semantics[1][@role='radio']");
			wait.until(ExpectedConditions.presenceOfElementLocated(YesRadioLoc));
			Thread.sleep(500);
			
			WebElement	YesRadio=driver.findElement(YesRadioLoc);
			YesRadio.click();
		}	

	 
	 public void 	docVerified_NORadioBtn() throws InterruptedException {
			
			By NoRadioLoc=By.xpath("//flt-semantics/span[.='Documents Verified? *']/following::flt-semantics[3][@role='radio']");
			wait.until(ExpectedConditions.presenceOfElementLocated(NoRadioLoc));
			Thread.sleep(500);
			
			WebElement	NoRadio=driver.findElement(NoRadioLoc);
			NoRadio.click();
		}	
	 
	 
	 public void EditIconClick() throws InterruptedException {
			
	 		// EDITING NRC number field
			By	EditLOC=By.xpath("//flt-semantics[.='Edit']");
			wait.until(ExpectedConditions.presenceOfElementLocated(EditLOC));
			Thread.sleep(1000);			
			WebElement	EditBtn=driver.findElement(EditLOC);
			Thread.sleep(300);
			js.executeScript("arguments[0].click();", EditBtn);
			Thread.sleep(100);
			
			
			// NRC Town Ship 
			By EditTownShipLoc=By.xpath("//flt-semantics/span[.='NRC Number *']/following::flt-semantics[6]");
			wait.until(ExpectedConditions.presenceOfElementLocated(EditTownShipLoc));
			Thread.sleep(1100);
			
			WebElement	EditTownShipbtn=driver.findElement(EditTownShipLoc);
			js.executeScript("arguments[0].scrollIntoView(true)", EditTownShipbtn);
			js.executeScript("arguments[0].focus();", EditTownShipbtn);
			Thread.sleep(350);
			js.executeScript("arguments[0].click();", EditTownShipbtn);
			// chamgin Township Option in Editing Page
			WebElement editTownshipOptionLoc=driver.findElement(By.xpath("//flt-semantics/span[.='DAHANA']"));
			Thread.sleep(10);
			editTownshipOptionLoc.click();
	 }
	 
	 
	 public void requestforClosurebutton() throws InterruptedException {
		 By requestforClosureOption_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Request for closure')]");

		    WebElement requestforClosureOption =
		            wait.until(ExpectedConditions.presenceOfElementLocated(requestforClosureOption_Btn));

		    Thread.sleep(500);
		    js.executeScript("arguments[0].click();",requestforClosureOption);
		
	}
	 
	 
	 public void reOpenbutton() throws InterruptedException {
		 By ReopenOption_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Reopen')]");

		    WebElement ReopenOption =
		            wait.until(ExpectedConditions.presenceOfElementLocated(ReopenOption_Btn));

		    Thread.sleep(500);
		    js.executeScript("arguments[0].click();",ReopenOption);
		
	}

	
	

}
