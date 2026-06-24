package org.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.gl.Logo;
import net.bytebuddy.utility.visitor.LineNumberPrependingMethodVisitor;

public class KYCPage {

		WebDriver driver;
	    WebDriverWait wait;
	    JavascriptExecutor js;
	    Actions mouse;
	    Robot robot;

	    public KYCPage(WebDriver driver) throws AWTException {
	    	
	    	this.driver = driver;
	    	PageFactory.initElements(driver,this);
	    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	        js = (JavascriptExecutor) driver;
	        mouse=new Actions(driver);
	        robot =new Robot();
	    	
	    }
	    
	    public void selectKYCupdate() throws InterruptedException {
	    	
	    	WebElement	categoryDD=driver.findElement(By.xpath("(//span[.='Please select']/parent::flt-semantics)[1]"));
			//Category DD 
			categoryDD.click();
			Thread.sleep(1000);
			
			//KYC_Update option
			WebElement KYC_updateoption=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics[.='KYC Update']")));
			wait.until(ExpectedConditions.visibilityOf(KYC_updateoption));
			wait.until(ExpectedConditions.elementToBeClickable(KYC_updateoption));
			KYC_updateoption.click();
			
			
			
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
	    	By Email_FieldLoc=By.xpath("//flt-semantics/span[.='Email ID']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
	    	wait.until(ExpectedConditions.elementToBeClickable(Email_FieldLoc));
	    	Thread.sleep(800);
	    	//mouse.moveToElement(addrecord_Email_Field).click().sendKeys("Gowthamcodestax@gmail.com").perform();
	    	WebElement Email_Field=driver.findElement(Email_FieldLoc);
	    	Email_Field.click();
	    	Thread.sleep(200);
	    	Email_Field.sendKeys("Test@gmail.com");

	    	
	    	//Customer Phn Number
	    	By Contact_FieldLoc=By.xpath("//flt-semantics/span[.='Contact Number']/following::flt-semantics[2]/input[@data-semantics-role='text-field']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(Contact_FieldLoc));
	    //	mouse.moveToElement(addrecord_Phn_Field).click(addrecord_Phn_Field).sendKeys("678976777").perform();
	    	Thread.sleep(800);
	    	WebElement Contact_Field=driver.findElement(Contact_FieldLoc);
	    	Contact_Field.click();
	    	Contact_Field.sendKeys("678976777");
	    	
	    	//Customer PassportType
	    	WebElement Passport_TDType=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics/span[.='Passport / နိုင်ငံကူးလက်မှတ်']/preceding::flt-semantics[1][@role='radio']"))));
	    	Passport_TDType.click();
	    	
	    }
	    
	  
	    
	    public void  uploadPassport_FrontPageBtn() throws InterruptedException {    
	    // For Upload Passport front Page
	   By 	PassportFrontPagebtnLoc=	By.xpath("//flt-semantics/span[.='Upload Passport Front Page *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
	   wait.until(ExpectedConditions.presenceOfElementLocated(PassportFrontPagebtnLoc));
	   Thread.sleep(800);
	   
	   WebElement   PassportFrontPagebtn= driver.findElement(PassportFrontPagebtnLoc);
	   PassportFrontPagebtn.click();
	//  js.executeScript("arguments[0].click();", PassportFrontPagebtn);
	    Thread.sleep(5100);
	    
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
		    Thread.sleep(350);
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
	    
	    // For Upload Passport Back Page
	    public void uploadPassport_BackpageBtn() throws InterruptedException {  	
	    	
	    	By PassportBackPagebtnLoc=By.xpath("//flt-semantics/span[.='Upload Passport Back Page *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(PassportBackPagebtnLoc));
	    	Thread.sleep(800);
	    	
	    	WebElement 	PassportBackPagebtn=driver.findElement(PassportBackPagebtnLoc);
	   // 	js.executeScript("arguments[0].scrollIntoView(true);", PassportBackPagebtn);
	  //  	Thread.sleep(200);
	    	PassportBackPagebtn.click();
	    //	js.executeScript("arguments[0].click();", PassportBackPagebtn);
	    	Thread.sleep(5100);
	    	
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
			    Thread.sleep(350);
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
	    
	    public void passPortNumField() throws InterruptedException {
	    	
	    	By PassNumLoc= By.xpath("//flt-semantics/span[.='Passport Number *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(PassNumLoc));
	    	Thread.sleep(500);
	    	
	    	WebElement	PassportNumField=driver.findElement(PassNumLoc);
	    	PassportNumField.click();
	    	Thread.sleep(300);
	    	PassportNumField.sendKeys("3478279921");
	    	
	    }
	    
	    
	    // For Upload Passport Request Form 
	    public void uploadRequestForm_Btn() throws InterruptedException {  
	   
	    By	Passport_ReqFormBtnLoc=By.xpath("//flt-semantics/span[.='Upload Request Form *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']");
	    wait.until(ExpectedConditions.presenceOfElementLocated(Passport_ReqFormBtnLoc));
	    Thread.sleep(800);
	    
	    WebElement   Passport_ReqFormBtn= driver.findElement(Passport_ReqFormBtnLoc);
	//    js.executeScript("arguments[0].scrollIntoView(true);", Passport_ReqFormBtn);
	//    Thread.sleep(200);
	    Passport_ReqFormBtn.click();
	//    js.executeScript("arguments[0].click();", Passport_ReqFormBtn);
	    Thread.sleep(5100);
	 
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
		    Thread.sleep(350);
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
	    
	    public void Regular_KYC_RequestBtn() throws InterruptedException {   
	    	By RegularKYCRadioBtnLoc	=By.xpath("//flt-semantics/span[.='Regular Request']/preceding::flt-semantics[1][@role='radio']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(RegularKYCRadioBtnLoc));
	    	Thread.sleep(400);
	    	WebElement  	RegularKYCRadioBtn=driver.findElement(RegularKYCRadioBtnLoc);
	    	RegularKYCRadioBtn.click();
	    }
	    
	    
	    public void idClose_IdOpenRadioBtn() throws InterruptedException {   
	    	By IDClose_IdOpenRadioBtnLoc	=By.xpath("//flt-semantics/span[.='999 ID Closed / 999 ID Reopen']/preceding::flt-semantics[1][@role='radio']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(IDClose_IdOpenRadioBtnLoc));
	    	Thread.sleep(400);
	    	WebElement  	RegularKYCRadioBtn=driver.findElement(IDClose_IdOpenRadioBtnLoc);
	    	RegularKYCRadioBtn.click();
	    }
	    
	    public void dormant_ACReleasenRadioBtn() throws InterruptedException {   
	    	By dormant_ACReleasenRadioBtnLoc	=By.xpath("//flt-semantics/span[.='999 dormant A/C release']/preceding::flt-semantics[1][@role='radio']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(dormant_ACReleasenRadioBtnLoc));
	    	Thread.sleep(400);
	    	WebElement  	Dormant_ACReleasen_RadioBtn=driver.findElement(dormant_ACReleasenRadioBtnLoc);
	    	Dormant_ACReleasen_RadioBtn.click();
	    }
	    
	    
	    
	    
	    public void typesOf_KYC_ChangeReq_Checkboxes() throws InterruptedException {  
	    	
	    	// Phn number checkox
	    	By PhnNumber_Change_KYC_CheckboxLoc	=By.xpath("//flt-semantics/span[.='Type of KYC Change Request *']/following::flt-semantics[@aria-label='Phone Number Change'][@role='checkbox']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(PhnNumber_Change_KYC_CheckboxLoc));
	    	Thread.sleep(200);
	    	WebElement  	PhnNumberChange_KYC_Checkbox=driver.findElement(PhnNumber_Change_KYC_CheckboxLoc);
	    	PhnNumberChange_KYC_Checkbox.click();
	    	
	    	// Email Change chekc Box
	    	
	    	By emailChange_CheckboxLoc	=By.xpath("//flt-semantics/span[.='Type of KYC Change Request *']/following::flt-semantics[@aria-label='Email Change'][@role='checkbox']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(emailChange_CheckboxLoc));
	    	Thread.sleep(200);
	    	WebElement  	emailChange_Checkbox=driver.findElement(emailChange_CheckboxLoc);
	    	emailChange_Checkbox.click();
	    	
	    	
	    	//
	    	
	   
	    }
	    
	    
	    
	    
	    public void RemarkTextField() throws InterruptedException { 	
	    By	RemarkTxtFiledlOc=By.xpath("//flt-semantics/span[.='Remark']/following::flt-semantics/input[@data-semantics-role='text-field']");
	    wait.until(ExpectedConditions.presenceOfElementLocated(RemarkTxtFiledlOc));
	    Thread.sleep(400);
	    
	    WebElement  remarkField=driver.findElement(RemarkTxtFiledlOc);
	    remarkField.sendKeys("Test@123");
	    
	    }
	    
	    public void NextButton() {  	
	    WebElement	NxtBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Next']"))));
	    NxtBtn.click();
	    }
	    
	    
	    public void EyeIconbtnClick() throws InterruptedException {
	    	Thread.sleep(6000);
	    	for (int i = 0; i <46; i++) {
				
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(200);	
				}
	    	
	    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all;'])[1]"))));
	    		eyeiconbtn.click();
	    	
	    }
	    
	    public void EditIconbtnClick() throws InterruptedException {
	    	
	    	By EditLoc=By.xpath("//flt-semantics[.='Edit']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(EditLoc));
	    	Thread.sleep(1000);
	    	WebElement	EditBtn=driver.findElement(EditLoc);
	    	EditBtn.click();
	    	Thread.sleep(8000);
	    
		    	// DOB  chekc Box
		    	
		    	By DOB_CheckboxLoc	=By.xpath("//flt-semantics/span[.='Type of KYC Change Request *']/following::flt-semantics[@aria-label='DOB Change'][@role='checkbox']");
		    	wait.until(ExpectedConditions.presenceOfElementLocated(DOB_CheckboxLoc));
		    	Thread.sleep(500);
		    	
		    	WebElement  	DOB_Checkbox=driver.findElement(DOB_CheckboxLoc);
		    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',});", DOB_Checkbox);
		    	Thread.sleep(180);
		    	js.executeScript("arguments[0].click();", DOB_Checkbox);
		    	//DOB_Checkbox.click();
		    	
		    	// signature 
		    	
		    	By Signature_Change_CheckboxLoc	=By.xpath("//flt-semantics/span[.='Type of KYC Change Request *']/following::flt-semantics[@aria-label='Signature Change'][@role='checkbox']");
		    	wait.until(ExpectedConditions.presenceOfElementLocated(Signature_Change_CheckboxLoc));
		    	Thread.sleep(400);
		    	WebElement  Signature_Change_Checkbox=driver.findElement(Signature_Change_CheckboxLoc);
		    	Thread.sleep(180);
		    	js.executeScript("arguments[0].click();", Signature_Change_Checkbox);
		    //	Signature_Change_Checkbox.click();
		    	
		    	// Occupation
		    	By Occupatione_CheckboxLoc	=By.xpath("//flt-semantics/span[.='Type of KYC Change Request *']/following::flt-semantics[@aria-label='Occupation'][@role='checkbox']");
		    	wait.until(ExpectedConditions.presenceOfElementLocated(Occupatione_CheckboxLoc));
		    	Thread.sleep(400);
		    	WebElement  Occupatione_Checkbox=driver.findElement(Occupatione_CheckboxLoc);
		    	Thread.sleep(180);
		    	js.executeScript("arguments[0].click();", Occupatione_Checkbox);
		    	//	Occupatione_Checkbox.click();	
	    		
	    		
	    }
	    
	    
	    
	    public void MenuButton() {
	    	
	    	// (//flt-semantics[@role='button'])[3]
	    			
	        By menuBtn = By.xpath("(//flt-semantics[@role='button'])[3]");

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
	    
	    public void LogOut() {

	        By logoutDD = By.xpath("//*[@role='group']");

	        for (int i = 0; i < 5; i++) {

	            try {

	                WebElement dropdown =
	                        wait.until(ExpectedConditions.elementToBeClickable(logoutDD));
	                Thread.sleep(2000);
	                js.executeScript(
	                        "arguments[0].dispatchEvent(new MouseEvent('click',{bubbles:true}));",
	                        dropdown);

	                break;

	            } catch (Exception e) {

	                System.out.println("Retry logout dropdown : " + i);
	            }
	        }

	        By logoutBtn = By.xpath("//*[text()='Logout']");

	        for (int i = 0; i < 5; i++) {

	            try {

	                WebElement logout =
	                        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));

	                		Thread.sleep(3000);	                js.executeScript(
	                        "arguments[0].dispatchEvent(new MouseEvent('click',{bubbles:true}));",
	                        logout);

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


}
