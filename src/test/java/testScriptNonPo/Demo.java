package testScriptNonPo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.healenium.SelfHealingDriver;

public class Demo {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	
	 ChromeOptions option = new ChromeOptions();

     WebDriver delegate = new ChromeDriver(option);

     SelfHealingDriver driver =
             SelfHealingDriver.create(delegate);

     driver.manage().timeouts()
             .implicitlyWait(Duration.ofSeconds(10));
     
     driver.get("file:///C:/Users/User/Downloads/selfheal-demo.html");
     
     WebElement V2=driver.findElement(By.xpath("//button[@id='toggle-version-btn']"));
     V2.click();
     
	driver.findElement(By.xpath("//input[@id='loginUsername']")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[@id='loginPassword']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	
	
	driver.findElement(By.xpath("//button[@class='add-record-btn']")).click();
	
	driver.findElement(By.xpath("//input[@id='empName']")).sendKeys("Gowtham");
	
	driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("9876543211");
	
	driver.findElement(By.xpath("//input[@id='emailField']")).sendKeys("gowtham@gmail.com");
	
	//select[@id='deptSelect']
	
	 // ── 9. DEPARTMENT (Select Dropdown) ───────────────────────────────
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement deptElement = wait.until(ExpectedConditions.elementToBeClickable( By.xpath("//select[@id='deptSelect']")));
    Select department = new Select(deptElement);
    
    department.selectByVisibleText("Engineering");
    
    driver.findElement(By.xpath("//input[@id='roleField']")).sendKeys("QA");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@id='fileUpload']")).sendKeys("C:\\Users\\User\\OneDrive\\dummy-pdf_2.pdf");
    Thread.sleep(2000);
    
	// For Upload Passport front Page Robot Loop 
		// Navigate using TAB 
    
 //  WebElement V2=driver.findElement(By.xpath("//button[@id='toggle-version-btn']"));
 
    driver.quit();
}

}
