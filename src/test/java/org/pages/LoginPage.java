package org.pages;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	 WebDriver driver;
	 WebDriverWait wait;
	 Actions mouse ;
	 JavascriptExecutor js;
	 
	 
	 public LoginPage(WebDriver driver) {
		 	this.driver = driver;
		 	wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		 	mouse= new Actions(driver);
		 	js = (JavascriptExecutor) driver;
		 	
	        PageFactory.initElements( driver,this);
	    }
	    
	    
	 	
	    
	    public void login(String user, String pass) throws InterruptedException {   	
	    	
	   /*
	    	// Via Google login
	    	String parentWindow =driver.getWindowHandle();
	    	
	    	By	viaGoogle=By.xpath("//flt-semantics[contains(text(),'Login with Google')]");
	    	Thread.sleep(500);
	    	wait.until(ExpectedConditions.elementToBeClickable(viaGoogle)).click();
	    	 
	    	Set<String> childWindow=driver.getWindowHandles();
	    	
	    	// switch to child window
	    	for (String child : childWindow) {
	    		if (!child.equals(parentWindow)) {
					
	    			driver.switchTo().window(child);
	    			break;
				}
			}
	    	
	    	By	UseAnotherAccbtn=By.xpath("//li[@class='aZvCDf mIVEJc W7Aapd zpCp3 SmR8']/div/div/div[2]");
	    	WebElement anotheracccBtn=wait.until(ExpectedConditions.elementToBeClickable(UseAnotherAccbtn));
	    	Thread.sleep(500);
	    	anotheracccBtn.click();
	    	
	    	// Email entering
	    	WebElement EmailTxtfield=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='Email or phone']")));
	    	Thread.sleep(300);
	    	EmailTxtfield.click();
	    	Thread.sleep(200);
	    	EmailTxtfield.sendKeys(user);
	    	
	    	// Next btn
	    	
	    	WebElement	NextBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='Next']")));
	    	NextBtn.click();
	    	
	    	//Password Entering
	    	
	    	*/
	    	
	    	

	    	 
	     // Email
	        By email = By.xpath("(//flt-semantics/span[.='Email ']/following::flt-semantics/input[@data-semantics-role='text-field'])[1]");
	        Thread.sleep(300);
	        wait.until(ExpectedConditions.elementToBeClickable(email)).click();
	        Thread.sleep(500);
	        wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys(user);
	        

	        // Password
	        By password = By.xpath("(//flt-semantics/span[.='Password ']/following::flt-semantics/flt-semantics-container/flt-semantics/input[@data-semantics-role='text-field'])[1]");
	        Thread.sleep(300);
	        wait.until(ExpectedConditions.elementToBeClickable(password)).click();
	  	    Thread.sleep(500);
	        wait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys(pass);

	        
	        // Login button
	        By loginBtn = By.xpath("//flt-semantics[text()='Login']");
	        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
	       
	      //  mouse.moveToElement(driver.findElement(email)).click().sendKeys(user).perform(); //  mouse.moveToElement(driver.findElement(password)).click().sendKeys(pass).perform(); //   driver.findElement(loginBtn).click();
	        Thread.sleep(5000);
	        
	        
	        
	    }
	 		    
	 		  
}
