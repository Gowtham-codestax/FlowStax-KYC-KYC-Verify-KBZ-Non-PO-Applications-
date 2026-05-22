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
				Thread.sleep(300);	
				}
	    	
	    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all;'])[1]")));
	    		 js.executeScript("arguments[0].scrollIntoView({block:'center'});", eyeiconbtn);
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

	 
	 

}
