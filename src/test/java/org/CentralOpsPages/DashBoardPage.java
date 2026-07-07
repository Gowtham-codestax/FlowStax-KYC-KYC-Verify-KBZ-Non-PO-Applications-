package org.CentralOpsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

    WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By addNew = By.xpath("//flt-semantics[.='Add New']");

    public void clickAddNew() throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(addNew).click();
    }
}
