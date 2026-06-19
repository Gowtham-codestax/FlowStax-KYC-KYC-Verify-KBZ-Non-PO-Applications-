package org.KycVerificationAppPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KycOfficerPage {
	
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	
	public KycOfficerPage(WebDriver driver) throws AWTException {
		
		
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
	}

	public void PullOptionButon() throws InterruptedException {
		
		By pullOption = By.xpath("//flt-semantics[@style[contains(.,'width: 36px') and contains(.,'height: 34px')]]");
		
		for (int i=0; i<5; i++) {
			
			try {
			
				WebElement Pull=wait.until(ExpectedConditions.presenceOfElementLocated(pullOption));
			
				js.executeScript("arguments[0].scrollIntoView({block:'center'});", Pull);
				js.executeScript("arguments[0].click();", Pull);
				
				System.out.println((i+1));
				Thread.sleep(1000);
					}
		
			catch(StaleElementReferenceException e){
					e.printStackTrace();
			
					}
				}
			}
	
	
	  public void eyeIconBtn() throws InterruptedException {
	    	Thread.sleep(7000);
	    	for (int i = 0; i <33; i++) {
				
	    		
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(500);	
				}
	    	
	    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all;'])[1]"))));
	    		eyeiconbtn.click();
	    	
	    }
	  
	  public void resolvedbtn() throws InterruptedException {
		  
		  
			WebElement Resolvedcbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[contains(text(),'Resolved')]")));
			Thread.sleep(1000);
			Resolvedcbtn.click();
			Thread.sleep(1000);
		  }
	  

	  
	  public void markForCorrectionbtn() throws InterruptedException {
		  
		  
			WebElement Markcoreectionbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[contains(text(),'Mark for Correction')]")));
			Thread.sleep(1000);
			Markcoreectionbtn.click();
			Thread.sleep(1000);
		  }
	
	  public void Denybtn() throws InterruptedException {
		  
		  
			WebElement denybtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[contains(text(),'Denied')]")));
			Thread.sleep(1000);
			denybtn.click();
			Thread.sleep(1000);
		  }
	  public void ApprovalStatusDropdown() {
		  
			// Approval OPtion
			WebElement approvaloption=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Approval Status *']/following::flt-semantics/span[.='Please select']")));
			wait.until(ExpectedConditions.visibilityOf(approvaloption));
			wait.until(ExpectedConditions.elementToBeClickable(approvaloption));
			approvaloption.click();
		  
	  }
	  
	  public void ApprovedButton() {
		  
			// Approval OPtion
			WebElement approvedButton=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Approval Status *']/following::flt-semantics/span[.='Approved']")));
			wait.until(ExpectedConditions.visibilityOf(approvedButton));
			wait.until(ExpectedConditions.elementToBeClickable(approvedButton));
			approvedButton.click();
		  
	  }
	  
	  public void rejectedButton() {
		  
			// rejectedButton OPtion
			WebElement rejectedButton=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Approval Status *']/following::flt-semantics/span[.='Rejected']")));
			wait.until(ExpectedConditions.visibilityOf(rejectedButton));
			wait.until(ExpectedConditions.elementToBeClickable(rejectedButton));
			rejectedButton.click();
		  
	  }
	  
	  public void RemarkCMNTbox() throws InterruptedException {
	    	
	    	WebElement	remarkTextField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics/span[.='Remark']/following::flt-semantics/input[@data-semantics-role='text-field']"))));
	    	Thread.sleep(1000);	
	    	remarkTextField.click();
	    	remarkTextField.sendKeys("Done");
	    	
	    }
	  
	  
	  
	  public void UpdateSatgeCMNTbox() throws InterruptedException {
	    	
	    	WebElement	UpdateSatgeCMNtTextField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics/span/following::flt-semantics/textarea[@data-semantics-role='text-field']"))));
	    	Thread.sleep(1000);	
	    	UpdateSatgeCMNtTextField.click();
	    	UpdateSatgeCMNtTextField.sendKeys("Done");
	    	
	    }
	  
	  
	   public void downloadPDFButton() throws InterruptedException {
	    	
	    	By DownLoadBtn=By.xpath("(//flt-semantics[@role='button'])[last()]");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(DownLoadBtn));
	    	Thread.sleep(1000);
	    	
	    	WebElement downloadPdfbtn=driver.findElement(DownLoadBtn);
	    	Thread.sleep(2000);
	    //	downloadPdfbtn.click();
	    	js.executeScript("arguments[0].click();", downloadPdfbtn);
	    	
	    	
	    }


	  
	  
	
	
	
	
}
