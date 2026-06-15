package org.kbzPayAppPages;

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

public class closingLoopPage {
	

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	public closingLoopPage(WebDriver driver) throws AWTException {
		
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
    	
		
	}
	
	
	 public void EyeIconbtnClick() throws InterruptedException {
	    	Thread.sleep(5000);
	    	for (int i = 0; i <40; i++) {
				
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(200);	
				}
	    	
	    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics[@role='button' and @style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all;'])[1]")));
	    		// js.executeScript("arguments[0].scrollIntoView({block:'center'});", eyeiconbtn);
	    		 Thread.sleep(1000);
	    		 js.executeScript("arguments[0].click();", eyeiconbtn);
	    	
	    }
	 
	 
	 
	 public void closebutton() throws InterruptedException {
		 By CloseOption_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Close')]");

		    WebElement Close =
		            wait.until(ExpectedConditions.presenceOfElementLocated(CloseOption_Btn));

		    Thread.sleep(500);
		    js.executeScript("arguments[0].click();",Close);
		
	}
	 
	 
	 public void resolvebutton() throws InterruptedException {
		 By Resolve_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Resolve')]");

		    WebElement Resolve =
		            wait.until(ExpectedConditions.presenceOfElementLocated(Resolve_Btn));

		    Thread.sleep(500);
		    js.executeScript("arguments[0].click();",Resolve);
		
	}

	 
	 
	 public void ReOpenbutton() throws InterruptedException {
		 By ReOpenOption_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Reopen')]");

		    WebElement Reopen =
		            wait.until(ExpectedConditions.presenceOfElementLocated(ReOpenOption_Btn));

		    Thread.sleep(500);
		    js.executeScript("arguments[0].click();",Reopen);
		
	}
	 
	 public void markForCorrectionbutton() throws InterruptedException {
		 By MarkForcorrection_Option_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Mark for Correction')]");

		    WebElement Mark =
		            wait.until(ExpectedConditions.presenceOfElementLocated(MarkForcorrection_Option_Btn));

		    Thread.sleep(500);
		    js.executeScript("arguments[0].click();",Mark);
		
	}
	 
	 public void updatebutton() throws InterruptedException {
		 By UpdtaePtion_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Update')]");

		    WebElement Update =
		            wait.until(ExpectedConditions.presenceOfElementLocated(UpdtaePtion_Btn));

		    Thread.sleep(500);
		    js.executeScript("arguments[0].click();",Update);
		
	}
	 
	 public void needMoreInfobutton() throws InterruptedException {
		 By NeedMoreInfo_Option_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Need more info')]");

		    WebElement NeedInfo =
		            wait.until(ExpectedConditions.presenceOfElementLocated(NeedMoreInfo_Option_Btn));

		    Thread.sleep(500);
		    js.executeScript("arguments[0].click();",NeedInfo);
		
	}
	 
	 
	 
	 

	    public void denyButton() throws InterruptedException {
	    	

 		WebElement	Denytbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[contains(text(),'Deny')]")));
 		Thread.sleep(1000);
 		js.executeScript("arguments[0].click();", Denytbtn);
	    	
	    	
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

	    
	    public void  additionalDoc_Upload_Btn() throws InterruptedException {    
 		    // For Upload Passport front Pag
 		    WebElement	additiondoc=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Additional Documents']/following::flt-semantics/input[@data-semantics-role='text-field']")));
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
 		 			    Thread.sleep(200);
 		 			}
 		 			// Press ENTER (select file + click Open)
 		 			robot.keyPress(KeyEvent.VK_ENTER);
 		 			robot.keyRelease(KeyEvent.VK_ENTER);
 		 			Thread.sleep(500);
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
