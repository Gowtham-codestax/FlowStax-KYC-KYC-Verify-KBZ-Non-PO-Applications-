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

public class AdminPage {
	
	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
    
	public AdminPage(WebDriver driver) throws AWTException {
		
		this.driver=driver;
		PageFactory.initElements( driver,this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
	}

	
	public void selectDropDownFilter() throws InterruptedException {
		 By SelectDDLoc=By.xpath("//flt-semantics[@role='button' and contains(.,'Select Filter')]");
		 wait.until(ExpectedConditions.presenceOfElementLocated(SelectDDLoc));
		 Thread.sleep(1000);
		 
		 WebElement SelectDD= driver.findElement(SelectDDLoc);
		 SelectDD.click();
		 
	}
	
	public void duplicatePhnAndNoWorkOption() throws InterruptedException {
		
		By DuplicatePhnAndNoWorkOptionLoc	=By.xpath("//flt-semantics[@role='button' and contains(.,'Duplicate Phone No. Work')]");
		wait.until(ExpectedConditions.presenceOfElementLocated(DuplicatePhnAndNoWorkOptionLoc));
		Thread.sleep(2500);
		
		WebElement DuplicatePhnAndNoWorkOption=driver.findElement(DuplicatePhnAndNoWorkOptionLoc);
		Thread.sleep(1100);
		js.executeScript("arguments[0].click();", DuplicatePhnAndNoWorkOption);
	//	DuplicatePhnAndNoWorkOption.click();
	}
	
	public void switchRadioBtn() throws InterruptedException {
		By switchLoc	=By.xpath("//flt-semantics[@role='switch']");
		wait.until(ExpectedConditions.presenceOfElementLocated(switchLoc));
		Thread.sleep(500);
		
		WebElement switchBtn=driver.findElement(switchLoc);
		switchBtn.click();
		
	}
	
	public void EyeIconbtnClick() throws InterruptedException {
    	Thread.sleep(6000);
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
	
	
	public void closeApplicationOption() throws InterruptedException {
		
		By closeOPtionOptionLoc	=By.xpath("//flt-semantics[@role='button' and contains(.,'Close Application')]");
		wait.until(ExpectedConditions.presenceOfElementLocated(closeOPtionOptionLoc));
		Thread.sleep(3000);
		
		WebElement closeOPtionOption=driver.findElement(closeOPtionOptionLoc);
		closeOPtionOption.click();
	}
	
	public void denyOption() throws InterruptedException {
		
		By DenyOptionLoc	=By.xpath("//flt-semantics[@role='button' and contains(.,'Deny')]");
		wait.until(ExpectedConditions.presenceOfElementLocated(DenyOptionLoc));
		Thread.sleep(3000);
		
		WebElement DenyOption=driver.findElement(DenyOptionLoc);
		DenyOption.click();
	}
}
