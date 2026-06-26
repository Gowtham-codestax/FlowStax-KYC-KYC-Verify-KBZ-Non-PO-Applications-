package org.CentralOpsPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Im_Banking_CIFPage {
	
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	public Im_Banking_CIFPage(WebDriver driver) throws AWTException {
		
		this.driver=driver;
		PageFactory.initElements( driver,this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();

	}
	
	
	
	public void im_Banking_CIfOPtion() throws InterruptedException {
		
		WebElement	categoryDD=driver.findElement(By.xpath("(//span[.='Please select']/parent::flt-semantics)[1]"));
		//Category DD 
		categoryDD.click();
		Thread.sleep(1000);
		
		By Im_Banking_CIFPageloc=By.xpath("//flt-semantics/span[.='i/m Banking (CIF)']");
		wait.until(ExpectedConditions.presenceOfElementLocated(Im_Banking_CIFPageloc));
		Thread.sleep(500);
		
		WebElement	Im_Banking_CIFPage=driver.findElement(Im_Banking_CIFPageloc);
		js.executeScript("arguments[0].click();", Im_Banking_CIFPage);
		
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
    	Thread.sleep(200);
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
    	js.executeScript("arguments[0].scrollIntoView({block: 'center'});", Email_Field);
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
		Thread.sleep(200);
		
		WebElement NRCIDproofRdioBtn=driver.findElement(NRCIDproofRdioLoc);
		NRCIDproofRdioBtn.click();
	}
	public void nrcNumberFields() throws InterruptedException {
		
		// DistrictOption
		By	DistrictOPtion=By.xpath("//flt-semantics/span[.='NRC Number *']/following::flt-semantics[@aria-label='Districts']");
		wait.until(ExpectedConditions.presenceOfElementLocated(DistrictOPtion));
		Thread.sleep(200);
		
		WebElement	districtBtn=driver.findElement(DistrictOPtion);
		js.executeScript("arguments[0].click();", districtBtn);
		
		//Fifth OPtion
		WebElement fifthoption=driver.findElement(By.xpath("//flt-semantics/span[.='5']"));
		Thread.sleep(10);
		fifthoption.click();
		

		//  Town Selection
		By	TownShipOPtion=By.xpath("//flt-semantics/span[.='NRC Number *']/following::flt-semantics[@aria-label='Townships']");		
		wait.until(ExpectedConditions.presenceOfElementLocated(TownShipOPtion));
	//	Thread.sleep(200);	
		
		WebElement	TownSHipBtn=driver.findElement(TownShipOPtion);
		js.executeScript("arguments[0].click();", TownSHipBtn);	
		
		WebElement secondoption=driver.findElement(By.xpath("//flt-semantics/span[.='BAMANA']"));
		Thread.sleep(10);
		secondoption.click();
		
		//  bUtton
		By	ButtonOPtion=By.xpath("(//flt-semantics/span[.='NRC Number *']/following::flt-semantics[10])[last()]");
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
    WebElement	uploadNRCFrontPagetBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Upload NRC Front Page *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
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
			    Thread.sleep(250);
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
    WebElement	uploadNRCBackPagetBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Upload NRC Back Page *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
    uploadNRCBackPagetBtn.click();
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
			    Thread.sleep(250);
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
	
	
	public void  uploadReqForm_PageBtn() throws InterruptedException {    
	    // For Upload Passport front Pag
	    WebElement	uploadReqFormtPagetBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Upload Request Form *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
	//   Thread.sleep(1500);
	    uploadReqFormtPagetBtn.click();
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
				    Thread.sleep(250);
				}
				// Press ENTER (select file + click Open)
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(250);
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
	public void mobileVerifed_YesRadioBtn() throws InterruptedException {
		
		By	Mobile_YesLoc=By.xpath("//flt-semantics/span[.='Mobile Verified? *']//following::flt-semantics[1][@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(Mobile_YesLoc));
		Thread.sleep(400);
		
		WebElement Mobile_Yes=driver.findElement(Mobile_YesLoc);
		Mobile_Yes.click();	
	}
	
	
	public void signatureVerifed_YesRadioBtn() throws InterruptedException {
		
		By	Signature_YesLoc=By.xpath("//flt-semantics/span[.='Signature Verified? *']//following::flt-semantics[1][@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(Signature_YesLoc));
		Thread.sleep(400);
		
		WebElement Signature_Yes=driver.findElement(Signature_YesLoc);
		Signature_Yes.click();	
	}
	
	public void makerCheckerCompleted_YesRadioBtn() throws InterruptedException {
		
		By	MakerChecker_YesLoc=By.xpath("//flt-semantics/span[.='Maker Checker completed? *']//following::flt-semantics[1][@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(MakerChecker_YesLoc));
		Thread.sleep(400);
		
		WebElement MakerChecker_Yes=driver.findElement(MakerChecker_YesLoc);
		MakerChecker_Yes.click();	
	}
	
	
	public void cifAndMakerAccCreated_inIbanking_YesRadioBtn() throws InterruptedException {
		
		By	CifAndMakerAccCreated_inIbanking_YesRadioBtnLoc=By.xpath("//flt-semantics/span[.='CIF Verified + Maker account created in iBanking? *']//following::flt-semantics[1][@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(CifAndMakerAccCreated_inIbanking_YesRadioBtnLoc));
		Thread.sleep(400);
		
		WebElement CifAndMakerAccCreated_inIbanking_YesRadioBtn=driver.findElement(CifAndMakerAccCreated_inIbanking_YesRadioBtnLoc);
		CifAndMakerAccCreated_inIbanking_YesRadioBtn.click();	
	}
	
	public void nrcVerifed_YesRadioBtn() throws InterruptedException {
		
		By	NRC_YesLoc=By.xpath("//flt-semantics/span[.='NRC Verified? *']//following::flt-semantics[1][@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(NRC_YesLoc));
		Thread.sleep(400);
		
		WebElement NRC_Yes=driver.findElement(NRC_YesLoc);
		NRC_Yes.click();	
	}
	
	
	public void typeOfCIFReCheckBoxes() throws InterruptedException {
		
		By CIFReqAllCheckBoxesLoc=By.xpath("//flt-semantics/span[.='Select type of CIF request *']/following::flt-semantics[@role='checkbox']");
		wait.until(ExpectedConditions.presenceOfElementLocated(CIFReqAllCheckBoxesLoc));
		Thread.sleep(1000);
		 
		for (int i = 0; i < 5; i++) {
			 List<WebElement>	CIFReqAllCheckBoxes=driver.findElements(CIFReqAllCheckBoxesLoc);
			 Thread.sleep(700);
				js.executeScript("arguments[0].click();", CIFReqAllCheckBoxes.get(i));
		}
	}
	
	 public void NextButton() throws InterruptedException {  	
		 By NextBtnLoc=By.xpath("//flt-semantics[.='Next']");
		 wait.until(ExpectedConditions.presenceOfElementLocated(NextBtnLoc));
		 Thread.sleep(250);
		 
		WebElement NextBtn= driver.findElement(NextBtnLoc);
		 NextBtn.click();
		    
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
			
			
			// NRC  Lanuguage Button EN --> MM 
			By emLocntb=By.xpath("//flt-semantics/span[.='NRC Number *']/following::flt-semantics[.='en']");
			wait.until(ExpectedConditions.presenceOfElementLocated(emLocntb));
			Thread.sleep(1100);
			
			WebElement emBtn=driver.findElement(emLocntb);
			js.executeScript("arguments[0].scrollIntoView(true);", emBtn);
			Thread.sleep(350);
			js.executeScript("arguments[0].click();", emBtn);
			
			// MM Button
			By mmLocntb=By.xpath("//flt-semantics[.='mm']");
			wait.until(ExpectedConditions.presenceOfElementLocated(mmLocntb));
			Thread.sleep(1100);
			
			WebElement mmBtn=driver.findElement(mmLocntb);
			js.executeScript("arguments[0].focus();",  mmBtn);
			Thread.sleep(350);
			js.executeScript("arguments[0].click();", mmBtn);
			
			// NRC 
			By EditDistrictLoc=By.xpath("//flt-semantics/span[.='NRC Number *']/following::flt-semantics[@aria-label='Districts']");
			wait.until(ExpectedConditions.presenceOfElementLocated(EditDistrictLoc));
			Thread.sleep(1100);
			
			WebElement	EditDistrict=driver.findElement(EditDistrictLoc);
			js.executeScript("arguments[0].focus();", EditDistrict);
			Thread.sleep(350);
			js.executeScript("arguments[0].click();", EditDistrict);
			// changing District Option in Editing Page
			WebElement EditDistrict_1StOption=driver.findElement(By.xpath("//flt-semantics/span[.='၁']"));
			Thread.sleep(10);
			EditDistrict_1StOption.click();
			
			// NRC Town Ship 
			By EditTownShipLoc=By.xpath("//flt-semantics/span[.='NRC Number *']/following::flt-semantics[@aria-label='Townships']");
			wait.until(ExpectedConditions.presenceOfElementLocated(EditTownShipLoc));
			Thread.sleep(1100);
			
			WebElement	EditTownShipbtn=driver.findElement(EditTownShipLoc);
			js.executeScript("arguments[0].focus();", EditTownShipbtn);
			Thread.sleep(350);
			js.executeScript("arguments[0].click();", EditTownShipbtn);
			// changing Township Option in Editing Page
			WebElement editTownship_OptionLoc=driver.findElement(By.xpath("//flt-semantics/span[.='မညန']"));
			Thread.sleep(10);
			editTownship_OptionLoc.click();
			
		//  bUtton
			By	ButtonOPtion=By.xpath("(//flt-semantics/span[.='NRC Number *']/following::flt-semantics[10])[last()]");
			wait.until(ExpectedConditions.presenceOfElementLocated(ButtonOPtion));
			Thread.sleep(200);
			
			WebElement	Btn=driver.findElement(ButtonOPtion);
			js.executeScript("arguments[0].click();", Btn);
					
			WebElement option=driver.findElement(By.xpath("//flt-semantics/span[.='သာသနာ']"));
			Thread.sleep(10);
			option.click();
			
			

			// NRC NUMBER FIELD
			By	NumberTXTField=By.xpath("//flt-semantics/input[@aria-label='Number']");
			wait.until(ExpectedConditions.presenceOfElementLocated(NumberTXTField));
			Thread.sleep(500);	
			WebElement	NumberTxtFieldBtn=driver.findElement(NumberTXTField);
		    Thread.sleep(800);  // Allow scroll + re-render
		 // Always use JS click for Flutter input fields
		    js.executeScript("arguments[0].click();", NumberTxtFieldBtn);
		    Thread.sleep(200);
		    NumberTxtFieldBtn.sendKeys("565677");   
		    
		    
	 }
	 
	 public void MenuButton() {
	    	
	    	// (//flt-semantics[@role='button'])[3]
	    			
	        By menuBtn = By.xpath("(//flt-semantics[@role='button'])[2]");

	        for (int i = 0; i < 5; i++) {

	            try {

	                WebElement menu =
	                        wait.until(ExpectedConditions.elementToBeClickable(menuBtn));

	                js.executeScript("arguments[0].scrollIntoView({block:'center'});", menu);
	                
	                Thread.sleep(2000);

	                js.executeScript(
	                        "arguments[0].dispatchEvent(new MouseEvent('click',{bubbles:true}));",
	                        menu);

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
	    
	 
	 public void requestforClosurebutton() throws InterruptedException {
		 By requestforClosureOption_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Request for closure')]");

		    WebElement requestforClosureOption =
		            wait.until(ExpectedConditions.presenceOfElementLocated(requestforClosureOption_Btn));

		    Thread.sleep(500);
		    js.executeScript("arguments[0].click();",requestforClosureOption);
		
	}
	 
	 
	 public void reasonForClosure() throws InterruptedException {
	    	
	    	WebElement	categoryDD=driver.findElement(By.xpath("(//span[.='Please select']/parent::flt-semantics)[1]"));
			//Category DD 
			categoryDD.click();
			Thread.sleep(1000);
	 }
	 
	 public void customerRefusedButton() throws InterruptedException {
		 
		 By CustomerRefues_Btn_Loc=By.xpath("//flt-semantics/span[.='Customer refused']");
		 wait.until(ExpectedConditions.presenceOfElementLocated(CustomerRefues_Btn_Loc));
		 Thread.sleep(500);
		 
		 WebElement CustomerRefues_Btn=driver.findElement(CustomerRefues_Btn_Loc);
		 js.executeScript("arguments[0].click();", CustomerRefues_Btn);
	 }
	 public void wrongApplicationButton() throws InterruptedException {
		 
		 By wrongApplication_Btn_Loc=By.xpath("//flt-semantics/span[.='Wrong application']");
		 wait.until(ExpectedConditions.presenceOfElementLocated(wrongApplication_Btn_Loc));
		 Thread.sleep(500);
		 
		 WebElement wrongApplication_Btn=driver.findElement(wrongApplication_Btn_Loc);
		 js.executeScript("arguments[0].click();", wrongApplication_Btn);
	 }
	 
	  
	 
	    

}
