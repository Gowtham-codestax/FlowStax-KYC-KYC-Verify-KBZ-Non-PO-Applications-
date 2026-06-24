package org.pages;

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

public class CFIPages {

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
    
	public CFIPages(WebDriver driver) throws AWTException {
		
		this.driver=driver;
		PageFactory.initElements( driver,this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
			
	}
	
	public void selectKYCUpdate() throws InterruptedException {
		
		By KYCUpdateSelect = By.xpath("//flt-semantics[@style[contains(.,'width: 36px') and contains(.,'height: 34px')]]");
		WebElement KYCSelect=wait.until(ExpectedConditions.presenceOfElementLocated(KYCUpdateSelect));
		wait.until(ExpectedConditions.elementToBeClickable(KYCUpdateSelect));
		Thread.sleep(1500);
		KYCSelect.click();
		// js.executeScript("arguments[0].click();", KYCSelect);
	
		
	}

	public void Duplicate_Phone_Number_Online_BankingOption() throws InterruptedException {
		
		By	Duplicate_Phone_Number_Online_BankingOptionLoc=By.xpath("//flt-semantics/span[contains(.,'Duplicate Phone Number: Online Banking')]");
		wait.until(ExpectedConditions.presenceOfElementLocated(Duplicate_Phone_Number_Online_BankingOptionLoc));
		Thread.sleep(1000);
		
		WebElement	Duplicate_Phone_Number_Online_BankingOption=driver.findElement(Duplicate_Phone_Number_Online_BankingOptionLoc);
		js.executeScript("arguments[0].click();", Duplicate_Phone_Number_Online_BankingOption);
		
		Thread.sleep(600);
			
				// PUll
					By pull = By.xpath("//flt-semantics[@role='button' and .='Pull']");
					WebElement Pull=wait.until(ExpectedConditions.presenceOfElementLocated(pull));
					Thread.sleep(500);
					js.executeScript("arguments[0].click();", Pull);	
	}
	
	
	public void PullOptionButon() throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {
			
		try {
		
		By pullOption = By.xpath("//flt-semantics[@style[contains(.,'width: 36px') and contains(.,'height: 34px')]]");
		wait.until(ExpectedConditions.presenceOfElementLocated(pullOption));
		Thread.sleep(1000);
		
		WebElement Pull=driver.findElement(pullOption);
		js.executeScript("arguments[0].click();", Pull);
		
		}catch(Exception e) {
			e.printStackTrace();
			
			}
		}
	}
	
	  public void EyeIconbtnClick() throws InterruptedException {
	    	Thread.sleep(6100);
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
	  
	  
	  public void startActionebutton() throws InterruptedException {
			 By StartActionOption_Btn =
			            By.xpath("//flt-semantics[contains(text(),'Start Action')]");

			    WebElement StartActionOption =
			            wait.until(ExpectedConditions.presenceOfElementLocated(StartActionOption_Btn));

			    Thread.sleep(500);
			    js.executeScript("arguments[0].click();",StartActionOption);
			
		}
		
	  public void UpdateStage_Commentsection() throws InterruptedException {
			
			By Commentsection=	By.xpath("//flt-semantics/span[.='Comments']/following::flt-semantics/textarea[@data-semantics-role='text-field']");
	    	WebElement UpdatestageCMNTbox=wait.until(ExpectedConditions.presenceOfElementLocated(Commentsection));
	    	Thread.sleep(2000);
	    	js.executeScript("arguments[0].click();", UpdatestageCMNTbox);
	    	Thread.sleep(500);
	    	UpdatestageCMNTbox.sendKeys("Test@123");
	    //	js.executeScript("arguments[0].click()", UpdatestageCMNTbox);
	    //	js.executeScript("arguments[0].value= 'Okay';", UpdatestageCMNTbox);
		
		}
	  
	  public void verifyAndActivebutton() throws InterruptedException {
			 By VerifiyandActiveOption_Btn =
			            By.xpath("//flt-semantics[contains(text(),'Verify and Activate')]");

			    WebElement VerifiyandActiveOption =
			            wait.until(ExpectedConditions.presenceOfElementLocated(VerifiyandActiveOption_Btn));

			    Thread.sleep(500);
			    js.executeScript("arguments[0].click();",VerifiyandActiveOption);
			
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
		
	  public void verifedandUserActivated_YES_Radiobtn() throws InterruptedException {
		  
		By yesbtnloc= By.xpath("//flt-semantics/span[.='All the Documents Verified and User Activated? *']/following::flt-semantics[1][@role='radio']");
		wait.until(ExpectedConditions.presenceOfElementLocated(yesbtnloc));
		Thread.sleep(500);
		
		WebElement yesbtn=driver.findElement(yesbtnloc);
		yesbtn.click();
	  }
	  
	  public void verifedandUserActivated_NO_Radiobtn() throws InterruptedException {
		  
			By notnloc= By.xpath("//flt-semantics/span[.='All the Documents Verified and User Activated? *']/following::flt-semantics[3][@role='radio']");
			wait.until(ExpectedConditions.presenceOfElementLocated(notnloc));
			Thread.sleep(500);
			
			WebElement Nobtn=driver.findElement(notnloc);
			Nobtn.click();
		  }
	  
	  public void authorizebutton() throws InterruptedException {
			 By AuthorizeOption_Btn =
			            By.xpath("//flt-semantics[contains(text(),'Authorize')]");

			    WebElement AuthorizeOption =
			            wait.until(ExpectedConditions.presenceOfElementLocated(AuthorizeOption_Btn));

			    Thread.sleep(500);
			    js.executeScript("arguments[0].click();",AuthorizeOption);
			
		}
	  

}
