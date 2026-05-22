package factory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	private static ThreadLocal<WebDriver> t1Driver= new ThreadLocal<WebDriver>();
	
	//set driver for current thread
	
	public static void setDriver(WebDriver driver) {
		
		t1Driver.set(driver);
	}
	
	// Get Driver for current thread
	
	public static WebDriver getDriver() {
		
		return t1Driver.get();

	}
	
	// Remove driver after execution
	
	public static void unload() {
		
		t1Driver.remove();
	}

}
