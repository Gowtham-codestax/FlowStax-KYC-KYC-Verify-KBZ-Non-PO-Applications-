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

public class MABR_KYC_ChangePage {
	

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;	
    
    
	public MABR_KYC_ChangePage(WebDriver driver) throws AWTException {
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
		
	}
	
	

	public void mabr_KYC_ChangeOption() throws InterruptedException{
    	
    	
    	WebElement	MABR_KYC_ChangeOPtion=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='MABR KYC Change']")));
    	wait.until(ExpectedConditions.elementToBeClickable(MABR_KYC_ChangeOPtion));
    	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", MABR_KYC_ChangeOPtion);
    	Thread.sleep(500);
    	js.executeScript("arguments[0].click();", MABR_KYC_ChangeOPtion);
    	
    }
	
	
	public void nrcIDproof() throws InterruptedException {
		
		
		WebElement NRCIDproofRdioBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='NRC / မှတ်ပုံတင်']/preceding::flt-semantics[@role='radio']")));
		wait.until(ExpectedConditions.visibilityOf(NRCIDproofRdioBtn));
		wait.until(ExpectedConditions.elementToBeClickable(NRCIDproofRdioBtn));
		NRCIDproofRdioBtn.click();
		Thread.sleep(1000);
	}
	
	
	public void nrcNumberFields() throws InterruptedException {
		
		
		// DistrictOption
		By	DistrictOPtion=By.xpath("//flt-semantics/span[.='NRC number *']/following::flt-semantics[@aria-label='Districts']");
		wait.until(ExpectedConditions.presenceOfElementLocated(DistrictOPtion));
		Thread.sleep(1100);
		WebElement	districtBtn=driver.findElement(DistrictOPtion);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", districtBtn);
		
		WebElement fifthoption=driver.findElement(By.xpath("//flt-semantics/span[.='5']"));
		Thread.sleep(1100);
		fifthoption.click();
		

		//  Town Selection
		By	TownShipOPtion=By.xpath("//flt-semantics/span[.='NRC number *']/following::flt-semantics[@aria-label='Townships']");		
		wait.until(ExpectedConditions.presenceOfElementLocated(TownShipOPtion));
		Thread.sleep(500);		
		WebElement	TownSHipBtn=driver.findElement(TownShipOPtion);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", TownSHipBtn);
				
		WebElement secondoption=driver.findElement(By.xpath("//flt-semantics/span[.='BAMANA']"));
		Thread.sleep(1100);
		secondoption.click();
		
		
		
		//  bUtton
		By	ButtonOPtion=By.xpath("//flt-semantics[ @style[contains(.,'position: absolute; overflow: visible; width: 150px; height: 54.4px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 235.29, 451.85); pointer-events: none; z-index: 26;')]]");
		wait.until(ExpectedConditions.presenceOfElementLocated(ButtonOPtion));
		Thread.sleep(500);			
		WebElement	Btn=driver.findElement(ButtonOPtion);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", Btn);
				
		WebElement P_option=driver.findElement(By.xpath("//flt-semantics/span[.='P']"));
		Thread.sleep(1100);
		P_option.click();
		
		
		//NUMBER FIELD
		By	NumberTXTField=By.xpath("//flt-semantics/input[@aria-label='Number']");
		wait.until(ExpectedConditions.presenceOfElementLocated(NumberTXTField));
		Thread.sleep(500);			
		WebElement	NumberTxtFieldBtn=driver.findElement(NumberTXTField);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", NumberTxtFieldBtn);
		Thread.sleep(600);
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
		 			    Thread.sleep(200);
		 			}
		 			// Press ENTER (select file + click Open)
		 			robot.keyPress(KeyEvent.VK_ENTER);
		 			robot.keyRelease(KeyEvent.VK_ENTER);
		 			Thread.sleep(1100);
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
		    WebElement	uploadNRCBackPagetBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Upload NRC back page *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
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
		 			Thread.sleep(1100);
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
	
	public void new_UserDateOfBirth() throws InterruptedException {
		
		
		// calender click

		WebElement Calender=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='YYYY-MM-DD']")));
		wait.until(ExpectedConditions.visibilityOf(Calender));
		wait.until(ExpectedConditions.elementToBeClickable(Calender));
		Thread.sleep(500);
		Calender.click();
		Thread.sleep(500);
		
		 // Target date
	    int targetYear = 2003, targetMonth = 9, targetDay = 22;
	    
		 // Navigate to correct month/year using while loop
	    while (true) {
	    	String monthYear = driver.findElement(By.xpath("//flt-semantics[.='Select year']")).getText();
	        
	        if (monthYear.contains("September") && monthYear.contains("2003")) {
	            break;
	        }

	        // Click previous button to go back
	        WebElement prevBtn = driver.findElement(By.xpath("//flt-semantics[@role='button' and contains(text(),'Previous month')]"));
	        Thread.sleep(100);
	        js.executeScript("arguments[0].click();", prevBtn);
	    }
	
	    // Select day 22
	    WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[contains(text(),'" + targetDay + "') and not(contains(text(),'Today'))]")));
	    Thread.sleep(100);
	    js.executeScript("arguments[0].click();", dayElement);
	    Thread.sleep(300);
	 
	    // OK 
	    WebElement	OkClick=driver.findElement(By.xpath("//flt-semantics[.='OK']"));
    //	OkClick.click();
	    js.executeScript("arguments[0].click();", OkClick);
		Thread.sleep(500);	
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
		 			    Thread.sleep(200);
		 			}
		 			// Press ENTER (select file + click Open)
		 			robot.keyPress(KeyEvent.VK_ENTER);
		 			robot.keyRelease(KeyEvent.VK_ENTER);
		 			Thread.sleep(1100);
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
	 
	
	public void UploadNewUserFace() throws InterruptedException {
	
		  // For UploadCustomerFaceBtn
	    WebElement	UploadNewUserFaceBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='New User Face Photo *']/following::flt-semantics[1]/input[@data-semantics-role='text-field']")));
	    Thread.sleep(500);
	    
	    UploadNewUserFaceBtn.click();
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
	 			Thread.sleep(1100);
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
	
	 public void EyeIconbtnClick() throws InterruptedException {
	    	Thread.sleep(13000);
	    	for (int i = 0; i <40; i++) {
				
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
		
		By	NumberTXTField=By.xpath("//flt-semantics[.='Edit']");
		wait.until(ExpectedConditions.presenceOfElementLocated(NumberTXTField));
		Thread.sleep(500);			
		WebElement	NumberTxtFieldBtn=driver.findElement(NumberTXTField);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", NumberTxtFieldBtn);
		Thread.sleep(600);
		NumberTxtFieldBtn.sendKeys("33457");
		
		NumberTxtFieldBtn.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(300);
		NumberTxtFieldBtn.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(200);
		NumberTxtFieldBtn.click();
		NumberTxtFieldBtn.sendKeys("67"+System.currentTimeMillis() % 1000L);
		
	}
	
	 
    public void downloadPDFButton() throws InterruptedException {
    	
    	By DownLoadBtn=By.xpath("(//flt-semantics[@role='button'])[last()]");
    	wait.until(ExpectedConditions.presenceOfElementLocated(DownLoadBtn));
    	Thread.sleep(1000);
    	
    	WebElement downloadPdfbtn=driver.findElement(DownLoadBtn);
    //	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'})", downloadPdfbtn);
    	Thread.sleep(2000);
    //	downloadPdfbtn.click();
    	js.executeScript("arguments[0].click();", downloadPdfbtn);
    	
    	
    }
	
	
	

}
