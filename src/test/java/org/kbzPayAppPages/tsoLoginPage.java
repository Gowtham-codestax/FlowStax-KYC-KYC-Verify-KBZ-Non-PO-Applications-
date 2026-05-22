package org.kbzPayAppPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tsoLoginPage {
	
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	public tsoLoginPage(WebDriver driver) throws AWTException {
		
		
		this.driver=driver;
		PageFactory.initElements( driver,this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
		
	}
	
	

	
	public void accountClose_Option() throws InterruptedException {
		
		By	accountClose=By.xpath("//flt-semantics/span[@style[contains(.,'display: inline-block; white-space: nowrap; transform-origin: 0px 0px 0px; transform: scale(1.22549, 3.11111);')]]");
		WebElement accountClse	=wait.until(ExpectedConditions.presenceOfElementLocated(accountClose));
			js.executeScript("arguments[0].click();", accountClse);
			Thread.sleep(500);
			
			// PUll
			By pull = By.xpath("//flt-semantics[@role='button' and .='Pull']");
			WebElement Pull=wait.until(ExpectedConditions.presenceOfElementLocated(pull));
			Thread.sleep(500);
			js.executeScript("arguments[0].click();", Pull);
		
		
			
	}
	
	public void PullOptionButon() {
		
		By pullOption = By.xpath("//flt-semantics[@style[contains(.,'width: 36px') and contains(.,'height: 34px')]]");
		WebElement Pull=wait.until(ExpectedConditions.presenceOfElementLocated(pullOption));
		js.executeScript("arguments[0].click();", Pull);
	
	}
	
	
	public void makeForcorrectionbutton() throws InterruptedException {
		 By MakeforcorrectionOption_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Mark for Correction')]");

		    WebElement Make =
		            wait.until(ExpectedConditions.presenceOfElementLocated(
		                    MakeforcorrectionOption_Btn));

		    Thread.sleep(500);

		    js.executeScript("arguments[0].click();",
		    		Make);
		
	}
	
	 public void UpdateStage_Commentsection() throws InterruptedException {
			
			
	    	
			By Commentsection=	By.xpath("//flt-semantics/span[.='Comments']/following::flt-semantics/textarea[@data-semantics-role='text-field']");
	    	WebElement UpdatestageCMNTbox=wait.until(ExpectedConditions.presenceOfElementLocated(Commentsection));
	    	Thread.sleep(2000);
	    	js.executeScript("arguments[0].click();", UpdatestageCMNTbox);
	    	Thread.sleep(500);
	    	UpdatestageCMNTbox.sendKeys("Okay");
	    //	js.executeScript("arguments[0].click()", UpdatestageCMNTbox);
	    //	js.executeScript("arguments[0].value= 'Okay';", UpdatestageCMNTbox);
		
		}


	 public void resolvebutton() throws InterruptedException {
		 By ResolveOption_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Resolve')]");

		    WebElement Resolve =
		            wait.until(ExpectedConditions.presenceOfElementLocated(ResolveOption_Btn));

		    Thread.sleep(500);
		    js.executeScript("arguments[0].click();",Resolve);
		
	}
	
	


}
