package org.CentralOpsPages;

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

public class KYC2_COPS_Page {
	WebDriver driver;
	WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
	public KYC2_COPS_Page(WebDriver driver) throws AWTException {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
	}
	public void updateButton() throws InterruptedException {
		By UpdateButton=By.xpath("(//flt-semantics[@style[contains(.,'position: absolute; overflow: visible; width: 140px; height: 28px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 15, 13.5); pointer-events: all; z-index: 1;')]])[1]");
		WebElement UpdateButon=wait.until(ExpectedConditions.presenceOfElementLocated(UpdateButton));
		wait.until(ExpectedConditions.elementToBeClickable(UpdateButon));
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", UpdateButon);
		Thread.sleep(1000);
		js.executeScript("arguments[0]dispatchEvent(new MouseEvent('click',{bubbles: true}))", UpdateButon);
	}
	public void markAsCorrection() throws InterruptedException {
		By MakeForCorrectionButton=By.xpath("(//flt-semantics[@style[contains(.,'position: absolute; overflow: visible; width: 140px; height: 28px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 165, 13.5); pointer-events: all; z-index: 2;')]])[1]");
		WebElement MakecorrectionButon=wait.until(ExpectedConditions.presenceOfElementLocated(MakeForCorrectionButton));
		wait.until(ExpectedConditions.elementToBeClickable(MakecorrectionButon));
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", MakecorrectionButon);
		Thread.sleep(1000);
		js.executeScript("arguments[0]dispatchEvent(new MouseEvent('click',{bubbles: true}))", MakecorrectionButon);
	}
}
