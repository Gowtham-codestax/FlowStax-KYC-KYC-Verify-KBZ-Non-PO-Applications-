package org.CentralOpsPages;
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
	 		wait= new WebDriverWait(driver,Duration.ofSeconds(15));
	 		mouse= new Actions(driver);
	 		js = (JavascriptExecutor) driver;
	        PageFactory.initElements( driver,this);
	    }
	    
	    
	 	
	    
	    public void login(String user, String pass) throws InterruptedException {   	
	    	
	     // Email
	        By email = By.xpath("(//flt-semantics/span[.='Email ']/following::flt-semantics/input[@data-semantics-role='text-field'])[1]");
	        Thread.sleep(300);
	        wait.until(ExpectedConditions.presenceOfElementLocated(email)).click();
	        Thread.sleep(500);
	        wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys(user);
	        

	        // Password
	        By password = By.xpath("(//flt-semantics/span[.='Password ']/following::flt-semantics/flt-semantics-container/flt-semantics/input[@data-semantics-role='text-field'])[1]");
	        Thread.sleep(300);
	        wait.until(ExpectedConditions.presenceOfElementLocated(password)).click();
	  	    Thread.sleep(500);
	        wait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys(pass);

	        
	        // Login button
	        By loginBtn = By.xpath("//flt-semantics[text()='Login']");
	        wait.until(ExpectedConditions.presenceOfElementLocated(loginBtn));
	        Thread.sleep(500);
	        
	        WebElement LoginBtn=driver.findElement(loginBtn);
	        LoginBtn.click();
	        Thread.sleep(5000);
	      
	        
	        
	    }
	 		    
	 		  
}
