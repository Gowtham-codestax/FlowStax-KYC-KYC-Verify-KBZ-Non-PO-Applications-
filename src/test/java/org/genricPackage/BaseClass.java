package org.genricPackage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
// import com.epam.healenium.SelfHealingDriver;s
import factory.DriverFactory;

public class BaseClass {
	
//  ThreadLocal: Each thread gets its own driver instance
//  private static ThreadLocal<SelfHealingDriver> driverThreadLocal = new ThreadLocal<SelfHealingDriver>();
//	protected SelfHealingDriver driver;
	
	public WebDriver driver; 
	@BeforeClass
    public void setup() {
		
		ChromeOptions option= new ChromeOptions();
	//	option.addArguments("--headless=new");
		
	// driver = new ChromeDriver(option);
	//	driver = SelfHealingDriver.create(webDriver);  // Initialize self-healing
		
        driver = new ChromeDriver(option);
		
        DriverFactory.setDriver(driver);
        
        DriverFactory.getDriver().manage().window().maximize();

        DriverFactory.getDriver().manage().timeouts() .implicitlyWait(Duration.ofSeconds(20));

        DriverFactory.getDriver().get("https://staging.flow.stax.run/#/login");
        		
    }

    @AfterClass					
    public void tearDown() {

        if (driver != null) {
        	
       // 	DriverFactory.getDriver().quit();
       // 	DriverFactory.unload();
        	
     //       driver.getDelegate().quit();
     //       driverThreadLocal.remove();
          
     //       DriverFactory.unload();   
        }
    }

}
