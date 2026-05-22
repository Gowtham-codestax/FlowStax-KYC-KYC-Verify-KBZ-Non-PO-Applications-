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
	    	WebElement CusId=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[1]"))));
	    	CusId.click();
	    	Thread.sleep(1000);
	    	CusId.sendKeys("123456711");
	    	
	    	//CUS Name
	    	WebElement	CusName=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[2]"))));
	    	Thread.sleep(1500);
	    	mouse.moveToElement(CusName).click().sendKeys(" Flow stax").perform();
	    	
	    	//Premium Radio button
	    	WebElement PremiumRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@aria-checked='false'])[1]"))));
	    	PremiumRadioBtn.click();
	    	Thread.sleep(1000);
	    	
	    	// Customer Email Entering
	    	WebElement addrecord_Email_Field=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@data-semantics-role='text-field'])[3]")));
	    	wait.until(ExpectedConditions.visibilityOf(addrecord_Email_Field));
	    	wait.until(ExpectedConditions.elementToBeClickable(addrecord_Email_Field));
	    	//mouse.moveToElement(addrecord_Email_Field).click().sendKeys("Gowthamcodestax@gmail.com").perform();
	    	
	    	addrecord_Email_Field.click();
	    	Thread.sleep(500);
	    	addrecord_Email_Field.sendKeys("Gowthamcodestax@gmail.com");
	    	Thread.sleep(1000);
	    	
	    	//Customer Phn Number
	    	WebElement	addrecord_Phn_Field=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[4]"))));
	    //	mouse.moveToElement(addrecord_Phn_Field).click(addrecord_Phn_Field).sendKeys("678976777").perform();
	    	addrecord_Phn_Field.click();
	    	addrecord_Phn_Field.sendKeys("678976777");
	    	
	    	//Customer PassportType
	    	WebElement Passport_TDType=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@aria-checked='false'])[4]"))));
	    	Passport_TDType.click();
	    	
	    	//Passporrt number field
	    	WebElement	Passport_NumField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[5]"))));
	    	mouse.moveToElement(Passport_NumField).click(Passport_NumField).sendKeys(" 11223344577").perform();
	    	
	    	
	    	
	    	
	    }
	    
	    
	    public void  uploadPassport_FrontPageBtn() throws InterruptedException {    
	    // For Upload Passport front Pag
	    WebElement	PassportFrontPagebtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[6]"))));
	    PassportFrontPagebtn.click();
	    Thread.sleep(2000);
	    
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
	    	
	    	WebElement	PassportBackPagebtn	=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@data-semantics-role='text-field'])[7]")));
	    	wait.until(ExpectedConditions.visibilityOf(PassportBackPagebtn));
	    	wait.until(ExpectedConditions.elementToBeClickable(PassportBackPagebtn));
	    	PassportBackPagebtn.click();
	    	Thread.sleep(2000);
	    	
	    	// For Upload Passport Back Page Robot Loop 
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
	    
	    
	    // For Upload Passport Request Form 
	    public void uploadRequestForm_Btn() throws InterruptedException {  
	   
	    
	    WebElement	Passport_ReqFormBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[8]"))));
	    Passport_ReqFormBtn.click();
	    Thread.sleep(2000);
	 
	    	// For Upload Passport Request Form  Robot Loop 
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
	    
	    public void Regular_KYC_RequestBtn() {   	
	    WebElement	RegularKYCRadioBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@role='radio'])[7]"))));
	    RegularKYCRadioBtn.click();
	    }
	    
	    public void PhnNumber_Change_KYC_Checkbox() {  	
	    WebElement	PhnNumberchage_CheckBox=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics[@role='checkbox'])[1]")));
	    wait.until(ExpectedConditions.visibilityOf(PhnNumberchage_CheckBox));
	    wait.until(ExpectedConditions.elementToBeClickable(PhnNumberchage_CheckBox));
	    js.executeScript("arguments[0].scrollIntoView(true);", PhnNumberchage_CheckBox);
	    js.executeScript("arguments[0].click()", PhnNumberchage_CheckBox);
	   // PhnNumberchage_CheckBox.click();
	    
	   
	    }
	    
	    public void RemarkTextField() { 	
	    WebElement	remarkField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@data-semantics-role='text-field'])[9]"))));
	    remarkField.sendKeys("Done");
	    
	    }
	    
	    public void NextButton() {  	
	    WebElement	NxtBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Next']"))));
	    NxtBtn.click();
	    }
	    
	    
	    public void EyeIconbtnClick() throws InterruptedException {
	    	Thread.sleep(4000);
	    	for (int i = 0; i <45; i++) {
				
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(500);	
				}
	    	
	    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all;'])[1]"))));
	    		eyeiconbtn.click();
	    	
	    }
	    
	    public void EditIconbtnClick() {
	    	
	    	
	    		WebElement	editbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Edit']"))));
	    		editbtn.click();
	    }
	    
	    public void NameCorrection_Checkbox() {
	    	
	    WebElement	NamecorrectionCheckbox=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@role='checkbox'])[3]"))));
	    js.executeScript("arguments[0].click();",NamecorrectionCheckbox);
	    
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
