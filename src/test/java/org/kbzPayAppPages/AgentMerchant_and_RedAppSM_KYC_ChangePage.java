package org.kbzPayAppPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgentMerchant_and_RedAppSM_KYC_ChangePage {
	
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;									
    				
    	
    public AgentMerchant_and_RedAppSM_KYC_ChangePage(WebDriver driver) throws AWTException,  InterruptedException {
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
        
		
	}
    
	public void selectType() throws InterruptedException {
		
		
		
		WebElement	TypeDD=driver.findElement(By.xpath("(//span[.='Please select']/parent::flt-semantics)[1]"));
		//Type DD 
		TypeDD.click();
		Thread.sleep(1000);
		
	
	}
    
    
    public void AgentMerchant_RedAppSM_KYC_ChangeOption() throws InterruptedException{
    	
    	
    	WebElement	AgentandRedAppOPtion=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Agent Merchant and Red App SM KYC Change']")));
    	wait.until(ExpectedConditions.elementToBeClickable(AgentandRedAppOPtion));
    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", AgentandRedAppOPtion);
    	Thread.sleep(500);
    	js.executeScript("arguments[0].click();", AgentandRedAppOPtion);
    	
    }
    
    
    public void accountType() throws InterruptedException {
    	
    	WebElement	AccType=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Account Type *']/following::flt-semantics[1]/span[.='Please select']")));
    	wait.until(ExpectedConditions.elementToBeClickable(AccType));
    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", AccType);
    	Thread.sleep(1500);
    	js.executeScript("arguments[0].click();", AccType);
    	
    	
    }
    
    public void  agentAccType() throws InterruptedException {
    	
    	WebElement	AgentAccType=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Agent']")));
    	wait.until(ExpectedConditions.elementToBeClickable(AgentAccType));
    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", AgentAccType);
    	Thread.sleep(500);
    	js.executeScript("arguments[0].click();", AgentAccType);
    	
    	
    }
    
    public void  merchantAccType() throws InterruptedException {
    	
    	WebElement	MetchantAccType=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Merchant']")));
    	wait.until(ExpectedConditions.elementToBeClickable(MetchantAccType));
    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", MetchantAccType);
    	Thread.sleep(500);
    	js.executeScript("arguments[0].click();", MetchantAccType);
    	
    	
    }
    
    
public void  redAppSimtAccType() throws InterruptedException {
    	
    	WebElement	RedappSIMtAccType=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Red App SM']")));
    	wait.until(ExpectedConditions.elementToBeClickable(RedappSIMtAccType));
    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", RedappSIMtAccType);
    	Thread.sleep(500);
    	js.executeScript("arguments[0].click();", RedappSIMtAccType);
    	
    	
    }
    


	public void  agentKYC_changeType() throws InterruptedException {
	
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
		WebElement	CloseSelect=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='KYC Change Type (Agent) *']/following::flt-semantics[@role='group']")));
		wait.until(ExpectedConditions.elementToBeClickable(CloseSelect));
	//	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", CloseSelect);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", CloseSelect);
		
	}
		
	
	 public void  kycChangeFormUpload_Btn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	KYCForm_Btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='KYC Change Form *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", KYCForm_Btn);
			Thread.sleep(2000);
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
	
	
	 public void oldKycDataTxtField() throws InterruptedException {
		  
		 	WebElement	oldKYCTxtField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Old KYC Data']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
	    	wait.until(ExpectedConditions.elementToBeClickable(oldKYCTxtField));
	    	// js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", oldKYCTxtField);
	    	Thread.sleep(1500);
	    	oldKYCTxtField.click();
	    	Thread.sleep(300);
	    	oldKYCTxtField.sendKeys("Test");
//	    	js.executeScript("arguments[0].click();", oldKYCTxtField);
//	    	Thread.sleep(500);
//	    	js.executeScript("arguments[0].value='Test';", oldKYCTxtField);	
		 
	 }
	 
	 public void newycDataTxtField() throws InterruptedException {
		  
		 	WebElement	NewTxtField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='New KYC Data *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
	    	wait.until(ExpectedConditions.elementToBeClickable(NewTxtField));
	//    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", NewTxtField);
	    	Thread.sleep(1500);
	    	NewTxtField.click();
	    	Thread.sleep(300);
	    	NewTxtField.sendKeys("Test");
//	    	js.executeScript("arguments[0].click();", NewTxtField);
//	    	Thread.sleep(500);
//	    	js.executeScript("arguments[0].value='New KYC Data Test';", NewTxtField);
//	    	
	 }
		
	 
	 public void  shopFrontAndBack_Upload_Btn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	ShopPic=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Shop Photo (Front & Back) *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", ShopPic);
			Thread.sleep(3000);
		//	js.executeScript("arguments[0].click();", ShopPic);
			ShopPic.click();
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
	
		
	 
	 public void  businnesLicence_Upload_Btn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	BusnessLicence=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Business Licence *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", BusnessLicence);
			Thread.sleep(3000);
		//	js.executeScript("arguments[0].click();", BusnessLicence);
			BusnessLicence.click();
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
	
		
	 
	 
	 public void shortCodeTxtField() throws InterruptedException {
		  
		 	WebElement	SHORTCODETxtField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Short Code *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
	    	wait.until(ExpectedConditions.elementToBeClickable(SHORTCODETxtField));
	    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", SHORTCODETxtField);
	    	Thread.sleep(1200);
	    	SHORTCODETxtField.click();
	    	Thread.sleep(300);
	    	SHORTCODETxtField.sendKeys("1007");
//	    	js.executeScript("arguments[0].click();", SHORTCODETxtField);
//	    	Thread.sleep(500);
//	    	js.executeScript("arguments[0].value='1007';", SHORTCODETxtField);
	    	
	 }
	 
	 
	 public void shopName_TxtField() throws InterruptedException {
		  
		 	WebElement	SHOPNAMETxtField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Shop Name *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
	    	wait.until(ExpectedConditions.elementToBeClickable(SHOPNAMETxtField));
	    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", SHOPNAMETxtField);
	    	Thread.sleep(1200);
	    	SHOPNAMETxtField.click();
	    	Thread.sleep(300);
	    	SHOPNAMETxtField.sendKeys("Test");
//	    	js.executeScript("arguments[0].click();", SHOPNAMETxtField);
//	    	Thread.sleep(500);
//	    	js.executeScript("arguments[0].value='Test';", SHOPNAMETxtField);
	    	
	 }
	 
	 public void address_TxtField() throws InterruptedException {
		  
		 	WebElement	Addrestxtfeild=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Address *']/following::flt-semantics[1]/textarea[@data-semantics-role='text-field']")));
	    	wait.until(ExpectedConditions.elementToBeClickable(Addrestxtfeild));
	    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", Addrestxtfeild);
	    	Thread.sleep(1200);
	    	Addrestxtfeild.click();
	    	Thread.sleep(300);
	    	Addrestxtfeild.sendKeys("Test");
//	    	js.executeScript("arguments[0].click();", Addrestxtfeild);
//	    	Thread.sleep(500);
//	    	js.executeScript("arguments[0].value='Test';", Addrestxtfeild);
	    	
	 }
	 
	 
	 
	 
	 public void  customerFace_Upload_Btn() throws InterruptedException {    
		    // For Upload Passport front Pag
		    WebElement	cutomerFace=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Customer Face Photo *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
		    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", cutomerFace);
			Thread.sleep(3000);
		//	js.executeScript("arguments[0].click();", cutomerFace);
			cutomerFace.click();
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
	
	 
	 public void currentBalanceDD() throws InterruptedException {
		 
		//flt-semantics/span[.='Current Balance *']/following::flt-semantics[contains(text(),'MMK')]
		 
		 WebElement	Curentbal=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Current Balance *']/following::flt-semantics[contains(text(),'MMK')]")));
	    	wait.until(ExpectedConditions.elementToBeClickable(Curentbal));
	    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", Curentbal);
	    	Thread.sleep(1200);
	    	js.executeScript("arguments[0].click();", Curentbal);
	    	
	 }
	
	 public void usdOption() throws InterruptedException {
	
		 
		 WebElement	USD=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics[contains(text(),'USD')]")));
	    	wait.until(ExpectedConditions.elementToBeClickable(USD));
	    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", USD);
	    	Thread.sleep(600);
	    	js.executeScript("arguments[0].click();", USD);
	    	
	 }

	 public void inrOption() throws InterruptedException {
	
		 
		 WebElement	INR=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics[contains(text(),'INR')]")));
	    	wait.until(ExpectedConditions.elementToBeClickable(INR));
	    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", INR);
	    	Thread.sleep(600);
	    	js.executeScript("arguments[0].click();", INR);
	    	
	 }
	
	 
	 public void currentBalanceTXTField() throws InterruptedException {
		 
			//flt-semantics/span[.='Current Balance *']/following::flt-semantics[contains(text(),'MMK')]
			 
			 WebElement	CurentbalTXT=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Current Balance *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']")));
		    	wait.until(ExpectedConditions.elementToBeClickable(CurentbalTXT));
		    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", CurentbalTXT);
		    	Thread.sleep(1200);
		    	CurentbalTXT.click();
		    	Thread.sleep(300);
		    	CurentbalTXT.sendKeys("222222");
//		    	js.executeScript("arguments[0].click();", CurentbalTXT);
//		    	Thread.sleep(500);
//		    	js.executeScript("arguments[0].value='222200';", CurentbalTXT);
		 }
	 
	 	public void qalStatusDD() throws InterruptedException {
		 
			//flt-semantics/span[.='Current Balance *']/following::flt-semantics[contains(text(),'MMK')]
			 
			 WebElement	QALStatus=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='QAL Status *']/following::flt-semantics/span[.='Please select']")));
		    	wait.until(ExpectedConditions.elementToBeClickable(QALStatus));
		    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", QALStatus);
		    	Thread.sleep(1200);
		    	js.executeScript("arguments[0].click();", QALStatus);
		    	
		 }
	 	
	 	
	 
	 		public void yesOption() throws InterruptedException {
	 		
			 
			 WebElement	YES=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Yes']")));
		    	wait.until(ExpectedConditions.elementToBeClickable(YES));
		    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", YES);
		    	Thread.sleep(600);
		    	js.executeScript("arguments[0].click();", YES);
		    	
		 }
	 		
	 		public void NoOption() throws InterruptedException {
		 		
				 
				 WebElement	NO=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='No']")));
			    	wait.until(ExpectedConditions.elementToBeClickable(NO));
			    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", NO);
			    	Thread.sleep(600);
			    	js.executeScript("arguments[0].click();", NO);
			    	
			 }
	 		
	 		 public void  additionalDoc_Upload_Btn() throws InterruptedException {    
	 		    // For Upload Passport front Pag
	 		    WebElement	additiondoc=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Additional Document']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
	 		    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", additiondoc);
	 			Thread.sleep(3000);
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
	 		 
	 	public void NextButton() throws InterruptedException {  	
				   
	 		WebElement	NxtBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Next']"))));
	 		// NxtBtn.click();
	 		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", NxtBtn);
	    	Thread.sleep(500);
	    	js.executeScript("arguments[0].click();", NxtBtn);
		
	 	}
	 	

	    public void EyeIconbtnClick() throws InterruptedException {
	    	Thread.sleep(6000);
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
    		js.executeScript("arguments[0].scrollIntoView({block:'center'});", editbtn);
    		Thread.sleep(1300);
    		js.executeScript("arguments[0].click();", editbtn);
    		
    		
//    		// Editing in  Editing Page 		
//    		WebElement BranhcPhnnumField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Branch Phone Number *']/following::flt-semantics[2]/input[@data-semantics-role='text-field']")));
//    		wait.until(ExpectedConditions.visibilityOf(BranhcPhnnumField));
//    		wait.until(ExpectedConditions.elementToBeClickable(BranhcPhnnumField));
    		
    		WebElement currentBalNumField=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //flt-semantics/span[.='Current Balance *']/following::flt-semantics[3]/input[@data-semantics-role='text-field']")));
			wait.until(ExpectedConditions.visibilityOf(currentBalNumField));
			wait.until(ExpectedConditions.elementToBeClickable(currentBalNumField));
			currentBalNumField.sendKeys(Keys.CONTROL+"a");
			Thread.sleep(300);
			currentBalNumField.sendKeys(Keys.BACK_SPACE);
    		Thread.sleep(200);
			currentBalNumField.click();
			currentBalNumField.sendKeys("67"+System.currentTimeMillis() % 10000000L);
    		
    		
    }

	    
	    public void assignToTSOBtn() throws InterruptedException {
	    	
	    	
    		WebElement	AssignToTSOBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[@role='button' and contains(text(),'Assign to TSO')]")));
    		Thread.sleep(1500);
    		AssignToTSOBtn.click();
    }
}
