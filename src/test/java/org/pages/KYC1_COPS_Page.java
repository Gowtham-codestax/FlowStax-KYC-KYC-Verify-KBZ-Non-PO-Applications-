package org.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KYC1_COPS_Page {
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	
	
	public KYC1_COPS_Page(WebDriver driver) throws AWTException {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
	}
	
	public void StatusActionClick() throws InterruptedException {
    	for (int i = 0; i <29; i++) {
			
			robot.keyPress(KeyEvent.VK_TAB);																										
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(500);	
			}
    	
    	By StausAction=By.xpath("(//flt-semantics[.='Start Action'])[1]");
    	
    	WebElement actionbtn=wait.until(ExpectedConditions.presenceOfElementLocated(StausAction));
    	wait.until(ExpectedConditions.visibilityOf(actionbtn));
    	js.executeScript("arguments[0].scrollIntoView(true)", actionbtn);
    	js.executeScript("arguments[0].click();",actionbtn );
    	
    	
    	
    }
	
	public void PullOptionButon() throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {
			
		try {
		
		By pullOption = By.xpath("//flt-semantics[@style[contains(.,'width: 36px') and contains(.,'height: 34px')]]");
		WebElement Pull=wait.until(ExpectedConditions.presenceOfElementLocated(pullOption));
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", Pull);
		
		}catch(StaleElementReferenceException e) {
			e.printStackTrace();
			
			}
		}
	}
	
	
	public void selectKYCUpdate() throws InterruptedException {
		
		By KYCUpdateSelect = By.xpath("//flt-semantics[@style[contains(.,'width: 36px') and contains(.,'height: 34px')]]");
		WebElement KYCSelect=wait.until(ExpectedConditions.presenceOfElementLocated(KYCUpdateSelect));
		wait.until(ExpectedConditions.elementToBeClickable(KYCUpdateSelect));
		Thread.sleep(2000);
		KYCSelect.click();
		// js.executeScript("arguments[0].click();", KYCSelect);
	
		
	}
	
	public void MakerRadioButton() throws InterruptedException {
		
		By MakerRadio=By.xpath("(//flt-semantics[@role='radio'])[1]");
		WebElement MakerRadiobtn=wait.until(ExpectedConditions.presenceOfElementLocated(MakerRadio));
		Thread.sleep(500);
		js.executeScript("arguments[0].click();",MakerRadiobtn);
	}
	
	
public void checkerRadioButton() throws InterruptedException {
		
		By checkerRadio=By.xpath("(//flt-semantics[@role='radio'])[2]");
		WebElement checkerRadiobtn=wait.until(ExpectedConditions.presenceOfElementLocated(checkerRadio));
		Thread.sleep(500);
		js.executeScript("arguments[0].click();",checkerRadiobtn);
	}
	
	public void KYC_UpdateWorkflow_Option() throws InterruptedException {
		
		By	KYC_Update_workflow=By.xpath("//span[@style[contains(.,'display: inline-block; white-space: nowrap; transform-origin: 0px 0px 0px; transform: scale(1.3587, 3.11111);')]]");
		WebElement KYC_Update_workflow_Btn	=wait.until(ExpectedConditions.presenceOfElementLocated(KYC_Update_workflow));
		Thread.sleep(300);
		js.executeScript("arguments[0].click();", KYC_Update_workflow_Btn);
			
		
	}
	
	public void PullButton() throws InterruptedException {
		
		 By pullButton = By.xpath( "//flt-semantics[@style[contains(.,'position: absolute; overflow: visible; width: 234px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 8, 302); pointer-events: all; z-index: 5;')]]");

		    // Check if pull record exists
		    List<WebElement> pullRecords = driver.findElements(pullButton);
		    if (pullRecords.isEmpty()) {

		        System.out.println("No Pull Record Found");
		        return; // move to next method
		    }

		    // Pull record found
		    for (int i = 0; i < 1; i++) {

		        try {

		            // Find fresh element every time
		            WebElement pullBtn = wait.until( ExpectedConditions.presenceOfElementLocated(pullButton));

		            js.executeScript("arguments[0].scrollIntoView({block:'center'});",pullBtn); 
		            js.executeScript("arguments[0].click();", pullBtn);
		            
		            //PULLS
		            List< WebElement > Pulls= driver.findElements(By.xpath("//flt-semantics[@style[contains(.,'position: absolute; overflow: visible; width: 36px; height: 34px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 493.504, 214.5); pointer-events: all; z-index: 8;')]]"));
		         
		            if (Pulls.size()>0) {
		            	js.executeScript("arguments[0].click();", Pulls);
		            	break;
		         	 }
		        //    System.out.println("Pull button clicked : " + (i + 1));
		            Thread.sleep(1000);
		            
		        } catch (StaleElementReferenceException e) {

		        	System.out.println("Stale element. Continuing...");
		        }
		    }

		}
	
	 public void eyeIconBtn() throws InterruptedException {
	    	Thread.sleep(4000);
	    	for (int i = 0; i <33; i++) {
				
	    		
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(500);	
				}
	    	
	    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all;'])[1]"))));
	    		eyeiconbtn.click();
	    	
	    }
	

	
	public void startActionButton() throws InterruptedException {
	
		/*
		for (int i = 0; i <39; i++) {
			
			robot.keyPress(KeyEvent.VK_TAB);																										
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(500);	
			}
			*/
    	
    		By StausAction=By.xpath("(//flt-semantics[contains(text(),'Start Action')])[1]");
    		WebElement actionbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(StausAction));
    		js.executeScript("arguments[0].scrollIntoView({block:'center'});", actionbtn);
    		Thread.sleep(1000);

    		js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click', {bubbles:true}));",actionbtn);
		}
	
	
	
	public void updateButton() throws InterruptedException {
	
    	
    		By UpdateButton=By.xpath("//flt-semantics[@role='button' and contains(text(),'Update')]");
    		WebElement Updatebtn=wait.until(ExpectedConditions.visibilityOfElementLocated(UpdateButton));
    		js.executeScript("arguments[0].scrollIntoView({block:'center'});", Updatebtn);
    		Thread.sleep(1000);
    		js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click', {bubbles:true}));",Updatebtn);
		}
	
	
	public void completeButton() throws InterruptedException {
		
    	
		By CompleteButton=By.xpath("//flt-semantics[@role='button' and contains(text(),'Complete')]");
		WebElement Completebtn=wait.until(ExpectedConditions.visibilityOfElementLocated(CompleteButton));
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", Completebtn);
		Thread.sleep(1000);
		js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click', {bubbles:true}));",Completebtn);
	}

	
public void reWorkButton() throws InterruptedException {
		
    	
		By ReworkButton=By.xpath("//flt-semantics[@role='button' and contains(text(),'Rework')]");
		WebElement reworkbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(ReworkButton));
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", reworkbtn);
		Thread.sleep(1000);
		js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click', {bubbles:true}));",reworkbtn);
	}

	
	
	
	public void update_Commentsection() throws InterruptedException {
		
		By Commentsection=	By.xpath("//textarea[@data-semantics-role[contains(.,'text-field')]]");
    	WebElement UpdatestageCMNTbox=wait.until(ExpectedConditions.presenceOfElementLocated(Commentsection));
    	Thread.sleep(1000);
    	UpdatestageCMNTbox.click();
    	UpdatestageCMNTbox.sendKeys("Okay");
    //	js.executeScript("arguments[0].click()", UpdatestageCMNTbox);
    //	js.executeScript("arguments[0].value= 'Okay';", UpdatestageCMNTbox);
	
	}
	
	
	public void backButton() throws InterruptedException {
		
		
		By Backoption=	By.xpath("(//flt-semantics/span[.='Details List']/preceding::flt-semantics[@role='button'])[4]");
    	WebElement Back=wait.until(ExpectedConditions.presenceOfElementLocated(Backoption));
    	Thread.sleep(3000);
    	Back.click();
 
		
	}
	
	
	public void branchAu_YesRadiobtn() throws InterruptedException {
		
		By AuYesRadio=By.xpath("//flt-semantics/span[.='yes/ပြီး']/preceding::flt-semantics[@role='radio']");
		WebElement YesRadiobtn=wait.until(ExpectedConditions.presenceOfElementLocated(AuYesRadio));
		Thread.sleep(500);
		js.executeScript("arguments[0].click();",YesRadiobtn);
		
	}
	
	
	
	public void branchAu_NORadiobtn() throws InterruptedException {
		
		By AuNoRadio=By.xpath("(//flt-semantics/span[.='no/မပြီး']/preceding::flt-semantics[@role='radio'])[2]");
		WebElement NoRadiobtn=wait.until(ExpectedConditions.presenceOfElementLocated(AuNoRadio));
		Thread.sleep(500);
		js.executeScript("arguments[0].click();",NoRadiobtn);
		
	}
	

	
	
	

}
