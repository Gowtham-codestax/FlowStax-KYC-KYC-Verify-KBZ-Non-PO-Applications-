package org.kbzPayAppPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
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
	
	
	public void selectKYCUpdate() throws InterruptedException {
		
		By Select = By.xpath("//flt-semantics/span[.='Select']");
		WebElement KYCSelect=wait.until(ExpectedConditions.presenceOfElementLocated(Select));
		wait.until(ExpectedConditions.elementToBeClickable(Select));
		Thread.sleep(2000);
		KYCSelect.click();
		// js.executeScript("arguments[0].click();", KYCSelect);
	
		
	}
	
	public void PullOptionButon() throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {
			
		try {
		
		By pullOption = By.xpath("//flt-semantics[@style[contains(.,'width: 36px') and contains(.,'height: 34px')]]");
		WebElement Pull=wait.until(ExpectedConditions.presenceOfElementLocated(pullOption));
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", Pull);
		
		}catch(Exception e) {
			e.printStackTrace();
			
			}
		}
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
	
	
	public void agentMerchantandRedApp_Option() throws InterruptedException {
		
		By AgentMerchant_RedappLocator = By.xpath("//flt-semantics/span[contains(text(),'Agent Merchant and Red App SM KYC Change')]");
		wait.until(ExpectedConditions.presenceOfElementLocated(AgentMerchant_RedappLocator));
		Thread.sleep(1000); // Allow Flutter rendering to stabilize
	//	wait.until(ExpectedConditions.elementToBeClickable(AgentMerchant_Redapp));
	//	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block :'center'});", AgentMerchant_Redapp);
		
		// Fetch FRESH reference right before use (not stored between waits)
		WebElement Agent_Redapp = driver.findElement(AgentMerchant_RedappLocator);

		js.executeScript("arguments[0].click();", Agent_Redapp);

		
		// PUll
		By pull = By.xpath("//flt-semantics[@role='button' and .='Pull']");
		WebElement Pull=wait.until(ExpectedConditions.presenceOfElementLocated(pull));
		Thread.sleep(500);
		js.executeScript("arguments[0].click();", Pull);	
		
	}
	
	
	public void cutomerKYC_Change_Option() throws InterruptedException {
		
		By CutomerKYCChangeLocator = By.xpath("//flt-semantics/span[contains(text(),'Customer KYC Change Request')]");
		wait.until(ExpectedConditions.presenceOfElementLocated(CutomerKYCChangeLocator));
		Thread.sleep(1000); // Allow Flutter rendering to stabilize
	
		
		// Fetch FRESH reference right before use (not stored between waits)
		WebElement CustKYCChange = driver.findElement(CutomerKYCChangeLocator);

		js.executeScript("arguments[0].click();", CustKYCChange);

		
		// PUll
		By pull = By.xpath("//flt-semantics[@role='button' and .='Pull']");
		WebElement Pull=wait.until(ExpectedConditions.presenceOfElementLocated(pull));
		Thread.sleep(500);
		js.executeScript("arguments[0].click();", Pull);	
		
	}
	
	public void MABR_KYC_Change_Option() throws InterruptedException {
		
		By MABR_KYC_ChangeLocator = By.xpath("//flt-semantics/span[contains(text(),'MABR KYC Change')]");
		wait.until(ExpectedConditions.presenceOfElementLocated(MABR_KYC_ChangeLocator));
		Thread.sleep(1000); // Allow Flutter rendering to stabilize
	
		// Fetch FRESH reference right before use (not stored between waits)
		WebElement MABRKYCChange = driver.findElement(MABR_KYC_ChangeLocator);
		js.executeScript("arguments[0].click();", MABRKYCChange);
		
		// PUll
		By pull = By.xpath("//flt-semantics[@role='button' and .='Pull']");
		WebElement Pull=wait.until(ExpectedConditions.presenceOfElementLocated(pull));
		Thread.sleep(500);
		js.executeScript("arguments[0].click();", Pull);	
		
	}
	
	
	 public void resolvebutton() throws InterruptedException {
		 By ResolveOption_Btn =
		            By.xpath("//flt-semantics[contains(text(),'Resolve')]");

		    WebElement Resolve =
		            wait.until(ExpectedConditions.presenceOfElementLocated(ResolveOption_Btn));

		    Thread.sleep(500);
		    js.executeScript("arguments[0].click();",Resolve);
		
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
			
			
	    	
			By Commentsection=	By.xpath("//flt-semantics/span[.='Comments']/following::flt-semantics/textarea[@data-semantics-role='text-field']");
	    	WebElement UpdatestageCMNTbox=wait.until(ExpectedConditions.presenceOfElementLocated(Commentsection));
	    	Thread.sleep(2000);
	    	js.executeScript("arguments[0].click();", UpdatestageCMNTbox);
	    	Thread.sleep(500);
	    	UpdatestageCMNTbox.sendKeys("Okay");
	    //	js.executeScript("arguments[0].click()", UpdatestageCMNTbox);
	    //	js.executeScript("arguments[0].value= 'Okay';", UpdatestageCMNTbox);
		
		}


	


}
