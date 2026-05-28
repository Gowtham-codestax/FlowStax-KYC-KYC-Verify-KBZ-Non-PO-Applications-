package org.nonPoAppPages;

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

public class FinanceAuthorizerPage {
	
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
    
	public FinanceAuthorizerPage(WebDriver driver) throws AWTException {
		
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
		
	}
	
	
	public void nonPoProcess_Option() throws InterruptedException {
		
		WebElement NonPo_option=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Non PO Process']")));
		wait.until(ExpectedConditions.visibilityOf(NonPo_option));
		wait.until(ExpectedConditions.elementToBeClickable(NonPo_option));
		Thread.sleep(200);
		NonPo_option.click();
	}
	
	 public void EyeIconbtnClick() throws InterruptedException {
	    	Thread.sleep(4000);
	    	for (int i = 0; i <32; i++) {
				
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(300);	
				}
	    	
	    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all; z-index: 2;'])[1]")));
	    		 js.executeScript("arguments[0].scrollIntoView({block:'center'});", eyeiconbtn);
	    		 Thread.sleep(1000);
	    		js.executeScript("arguments[0].click();", eyeiconbtn);
	    	
	    }
	 
	 public void approveButton() throws InterruptedException {
		 WebElement	ApproveBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[.='Approve']")));
		    Thread.sleep(400);
		    ApproveBtn.click();
 
	 }
	 
	 
	 public void denyButton() throws InterruptedException {
		 WebElement	DenyBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[.='Deny']")));
		    Thread.sleep(400);
		    DenyBtn.click();
 
	 }
	 
	 
	 public void reconileButton() throws InterruptedException {
		 WebElement	ReconileBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[.='Reconcile']")));
		    Thread.sleep(400);
		    ReconileBtn.click();
 
	 }
	 
	 public void rejectButton() throws InterruptedException {
		 WebElement	RejectBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[.='Reject']")));
		    Thread.sleep(400);
		    RejectBtn.click();
 
	 }
	 
	 public void UpdateSatgeCMNTbox() throws InterruptedException {
	    	
	    	WebElement	UpdateSatgeCMNtTextField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Comments']/following::flt-semantics/textarea[@data-semantics-role='text-field']")));
	    	Thread.sleep(1000);	
	    	UpdateSatgeCMNtTextField.click();
	    	UpdateSatgeCMNtTextField.sendKeys("Done");
	    	
	    }
	    
	

}
