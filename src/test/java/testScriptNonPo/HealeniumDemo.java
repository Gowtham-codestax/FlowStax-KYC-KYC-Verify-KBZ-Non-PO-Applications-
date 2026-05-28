package testScriptNonPo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.epam.healenium.SelfHealingDriver;

public class HealeniumDemo {

    public static void main(String[] args)
            throws InterruptedException {

        ChromeOptions option = new ChromeOptions();

        WebDriver delegate = new ChromeDriver(option);

        SelfHealingDriver driver =
                SelfHealingDriver.create(delegate);

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get(
                "file:///C:/Users/User/Documents/Downloads/new-login.html");

        driver.findElement(By.id("username"))
                .sendKeys("admin");

        driver.findElement(By.id("password"))
                .sendKeys("password123");

        driver.findElement(By.id("loginBtn"))
                .click();

        Thread.sleep(3000);

        driver.quit();
    }
}