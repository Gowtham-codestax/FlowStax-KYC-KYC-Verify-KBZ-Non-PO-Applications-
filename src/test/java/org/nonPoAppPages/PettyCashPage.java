package org.nonPoAppPages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PettyCashPage {

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions mouse;
    Robot robot;
    
	public PettyCashPage(WebDriver driver) throws AWTException {
		
		this.driver = driver;
    	PageFactory.initElements(driver,this);
    	wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        mouse=new Actions(driver);
        robot =new Robot();
	
	}
	
	public void nonPoProcess_Option() throws InterruptedException {
		
		WebElement NonPo_option=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Non PO Process']")));
		wait.until(ExpectedConditions.visibilityOf(NonPo_option));
		wait.until(ExpectedConditions.elementToBeClickable(NonPo_option));
		Thread.sleep(1000);
		NonPo_option.click();
	}
	
	
	
	
	 public void selectCategory() throws InterruptedException {
	    	
	    	WebElement	categoryDD=driver.findElement(By.xpath("(//span[.='Please select']/parent::flt-semantics)[1]"));
			//Category DD 
	    	Thread.sleep(500);	
			categoryDD.click();
			
	 }
	 
	 public void pettyCashOption() throws InterruptedException {
		 
		 
		//Petty cash option
			WebElement PettyCash_option=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Petty Cash']")));
			wait.until(ExpectedConditions.visibilityOf(PettyCash_option));
			wait.until(ExpectedConditions.elementToBeClickable(PettyCash_option));
			Thread.sleep(200);
			PettyCash_option.click();
			
	 }
	 
	 public void invoice_NumField() throws InterruptedException {
			
		 //Invoice number field
		 WebElement	InvoiceNum=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics/span[.='Invoice Number *']/following::flt-semantics/input[@data-semantics-role='text-field'])[1]")));
		// InvoiceNum.click();
			wait.until(ExpectedConditions.elementToBeClickable(InvoiceNum));
		 js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click' ,{bubbles:true}));", InvoiceNum);
		 Thread.sleep(500);
		 String incvoiceNumber= "INV"+ System.currentTimeMillis();
		 
		 InvoiceNum.sendKeys(incvoiceNumber);
		 
	 }
	 
	 
	 public void invoiceCreationDate() throws InterruptedException {
			
			//getting current Day e,g(Today)
			int CurrentDay=LocalDate.now().getDayOfMonth();
			
			// calender click
			By CalenderPopupLoc=By.xpath("//input[@aria-label='DD-MM-YYYY']");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='DD-MM-YYYY']")));
			Thread.sleep(500);
			WebElement	CalenderPopup=driver.findElement(CalenderPopupLoc);
			CalenderPopup.click();
			
			// Dyamimc xpath For Current Day
			By todayDate = By.xpath("//flt-semantics[contains(text(),'" + CurrentDay + "') and contains(text(),'Today')]");
			WebElement today = wait.until(ExpectedConditions.elementToBeClickable(todayDate));
			
			// Click current date
			Thread.sleep(100);
		    js.executeScript("arguments[0].click();", today);
			
		    //OK
		    WebElement	OkClick=driver.findElement(By.xpath("//flt-semantics[.='OK']"));
			//customerOnboardChannel
	    	OkClick.click();
			
		}
	 
	 public void vendorDetailsType() throws InterruptedException {
	    	
		 By VendorDetailsLoc= By.xpath("(//flt-semantics/span[.='Vendor Details']/following::flt-semantics[.='Please select'])[1]");
		 wait.until(ExpectedConditions.presenceOfElementLocated(VendorDetailsLoc));
			//Vendor DD 
		 Thread.sleep(1000);
		 WebElement VendorDetails=driver.findElement(VendorDetailsLoc);
		 VendorDetails.click();	
	 }
	 
	 public void vendorID() throws InterruptedException {
	    	
	    	By	VendorIDLoc=By.xpath("//flt-semantics[.='Vendor Id']");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(VendorIDLoc));
			//Vendor DD 
	    	
	    	WebElement	VendorID=driver.findElement(VendorIDLoc);
	    	Thread.sleep(500);
	    	VendorID.click();		
	 }
	 
	 public void vendorName() throws InterruptedException {
	    	
	    	WebElement	VendorName=driver.findElement(By.xpath("//flt-semantics[.='Vendor Name']"));
			//VendorName DD 
	    	Thread.sleep(500);
	    	VendorName.click();
			
	 }
	 
	 
	 public void searchKeyword() throws InterruptedException {
	    	
	    	WebElement	seacrhKeyword=driver.findElement(By.xpath("//flt-semantics[.='search Keyword']"));
			//seacrhKeyword DD 
	    	Thread.sleep(300);
	    	seacrhKeyword.click();
		
	 }
	 
	 
	 
	 
	 public void searchFor_vendorIDField() throws InterruptedException {
	    	
	    	WebElement	VendorIDField=driver.findElement(By.xpath("//flt-semantics/span[.='Vendor Details']/following::flt-semantics-container/flt-semantics/input[@aria-label='Search for Vendor Id']"));
			//VendorIDField DD 
	    	Thread.sleep(500);
	    	js.executeScript("arguments[0].click();",VendorIDField);
			Thread.sleep(500);
			VendorIDField.sendKeys("10000");
	 }
	 
	 
	 

	 
	 public void MGR_PvtLtdiD() throws InterruptedException {
	    	
	    	WebElement	MgrPvttd=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[contains(text(),'A.MGR Co. Pte Ltd')]")));
			//MgrPvttd DD 
	    	Thread.sleep(500);
	    	MgrPvttd.click();
	    	
	 }
	 
	 
	 public void currencyType() throws InterruptedException {
	    	
			
		 WebElement	Vendor= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics/span[.='Currency *']/following::flt-semantics[.='Please select'])[1]")));
	    
			//Curency DD 
		 	Thread.sleep(200);
	    	Vendor.click();
	 }
	 
	 public void usd() throws InterruptedException {
		
		 	WebElement	USD=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='USD']")));
			//USD DD
		 	Thread.sleep(200);
		 	USD.click();
		
	 }
	 
	 public void mpt() throws InterruptedException {
			
		
		 	WebElement	MPT=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='MPT']")));
			//MPT DD 
		 	Thread.sleep(200);
		 	MPT.click();
		 
	 }
	 
	 
	 public void descriptionTxtField() throws InterruptedException {
		 
		 
		 WebElement	DescriptionTxtField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics/span[contains(text(),'Description')]/following::flt-semantics/textarea[@data-semantics-role='text-field'])[1]")));
			//VendorIDField DD 
		 	Thread.sleep(1500);
	    	js.executeScript("arguments[0].click();",DescriptionTxtField);
			Thread.sleep(400);
			DescriptionTxtField.sendKeys("Testing Petty Cash Flow");
		 
			
	 }
	 
	 public void commodityType() throws InterruptedException {
	    	
			
		 WebElement	Commodity= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[contains(text(),'Commodity Code')]/following::flt-semantics[@style='position: absolute; overflow: visible; width: 150px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 371, 68); pointer-events: all; z-index: 17;']")));
	    
			//Commodity DD 
		 Thread.sleep(500);
		 Commodity.click();	
	 }
	 
	 
	 
	 public void dummy_Desc_CodePOPtion() throws InterruptedException {
			
			
		 	WebElement	DummyDec=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[contains(text(),'Dummy Desc code ')]")));
			//DummyDec DD 
		 	Thread.sleep(300);
		 	DummyDec.click();
	 }
	 
	 
	 public void atMCR_CodePOPtion() throws InterruptedException {
			
			
		 	WebElement	ATMCRComoodity=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[contains(text(),'ATM - NCR')]")));
			//DummyDec DD 
		 	Thread.sleep(300);
		 	ATMCRComoodity.click();
			
		 
	 }
	 
	 
	 public void QuantityField() throws InterruptedException {
			
			
		 	WebElement	Quantity=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics/span[contains(text(),'Quantity')]/following::flt-semantics/textarea[@data-semantics-role='text-field'])[5]")));
		 	wait.until(ExpectedConditions.visibilityOf(Quantity));
			wait.until(ExpectedConditions.elementToBeClickable(Quantity));
		 	//Quantity DD 
		 	js.executeScript("arguments[0].scrollIntoView({block:'center'});", Quantity);
			Thread.sleep(500);
			js.executeScript("arguments[0].click();", Quantity);
			Quantity.sendKeys("1000");
		 
	 }
	 
	 
	 public void eachUnitOPtion_RemoveBtn() throws InterruptedException {
		 
		 WebElement	EachUnitRemoveOption=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/flt-semantics-container/flt-semantics[@aria-label='Each']/flt-semantics-container/flt-semantics[@role='button']")));
			//DummyDec DD 
		 	Thread.sleep(300);
		 	js.executeScript("arguments[0].scrollIntoView({block: 'center'});", EachUnitRemoveOption);
		 	Thread.sleep(300);
		 	js.executeScript("arguments[0].click();", EachUnitRemoveOption);
		//
		 	EachUnitRemoveOption.click();
		 
	 }
	 
	 
	 public void unitOPtion() throws InterruptedException {
		 
		//flt-semantics/span[contains(text(),'Unit')]//following::flt-semantics/span[contains(text(),'The field is required')]
		 
		 	WebElement	UnitDD=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[contains(text(),'Unit')]//following::flt-semantics/span[contains(text(),'The field is required')]")));
			//UnitDD DD 
		 	Thread.sleep(200);
		 	UnitDD.click();
		 	
		 	WebElement Unit=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Unit']")));
		 	js.executeScript("arguments[0].scrollIntoView({block: 'center'});", Unit);
		 	Thread.sleep(200);
		 	js.executeScript("arguments[0].click();", Unit);
		 
		 
	 }
	 
	 
	 
	 
	 public void priceField() throws InterruptedException {
			
			
		 	WebElement	price=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics/span[contains(text(),'Price')]/following::flt-semantics/textarea[@data-semantics-role='text-field'])[6]")));
		 	wait.until(ExpectedConditions.visibilityOf(price));
			wait.until(ExpectedConditions.elementToBeClickable(price));
		 	//Quantity DD 
		 	js.executeScript("arguments[0].scrollIntoView({block:'center'});", price);
			Thread.sleep(600);
			js.executeScript("arguments[0].click();", price);
			Thread.sleep(300);
			price.sendKeys("2500000");
		 
	 }
	 
	 
	 
	 
	 public void showMenuButton() throws InterruptedException {
		 
			
			
		 	WebElement	menubtn=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[.='Show menu']")));
		 
			//menubtn DD 
		 	Thread.sleep(300);
		 	js.executeScript("arguments[0].scrollIntoView({behaviour: 'smooth', block: 'center'});", menubtn);
		 	Thread.sleep(1000);
		 	js.executeScript("arguments[0].click();", menubtn);
		 //	menubtn.click();
		 
		 
	 }
	 
	 public void duplicateRowButton() throws InterruptedException {
		 
			
			
		 	WebElement	DuplicateRowbtn=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[contains(text(),'Duplicate Row')]")));
		 	Thread.sleep(1000);
		 	js.executeScript("arguments[0].click();", DuplicateRowbtn);
		 //	DuplicateRowbtn.click();
		 
	 }
	 
	 
	 
	 public void deleteRowButton() throws InterruptedException {
		 
			
			
		 	WebElement	DeleteRowbtn=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[contains(text(),'Delete Row')]")));
		 	Thread.sleep(1000);
		 	js.executeScript("arguments[0].click();", DeleteRowbtn);

		 
	 }
	 
	 
	 public void uploadAttachments_Btn() throws InterruptedException {  
		   
		    
		    WebElement	Attachments_Btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics/span[contains(text(),'Attachment *')]/following::flt-semantics/input[@data-semantics-role='text-field'])[2]")));
		    js.executeScript("arguments[0].scrollIntoView(true);", Attachments_Btn);
		    Thread.sleep(1000);
		    Attachments_Btn.click();
		    Thread.sleep(5000);
		    
			 // For Upload Passport front Page Robot Loop 
	 			// Navigate using TAB 
	 			for (int i = 0; i < 9; i++) {
	 			    robot.keyPress(KeyEvent.VK_TAB);
	 			    robot.keyRelease(KeyEvent.VK_TAB);
	 			    Thread.sleep(350);
	 			}
	 		// Press DOWN arrow 3 times to select picture option
	 			for (int i = 0; i < 3; i++) {
	 			    robot.keyPress(KeyEvent.VK_DOWN);
	 			    robot.keyRelease(KeyEvent.VK_DOWN);
	 			    Thread.sleep(300);
	 			}
	 			// Press ENTER (select file + click Open)
	 			robot.keyPress(KeyEvent.VK_ENTER);
	 			robot.keyRelease(KeyEvent.VK_ENTER);
	 			Thread.sleep(300);
	 			// 🔹 1 TAB (move to Open button)
	 			robot.keyPress(KeyEvent.VK_TAB);
	 			robot.keyRelease(KeyEvent.VK_TAB);
	 			
	 			// Down to select the File 
	 			robot.keyPress(KeyEvent.VK_DOWN);
	 		    robot.keyRelease(KeyEvent.VK_DOWN);
	 			
	 			// Enter (click open)
	 			robot.keyPress(KeyEvent.VK_ENTER);
	 			robot.keyRelease(KeyEvent.VK_ENTER);
			   
		    }
	 
	 
	 
	 public void NextButton() throws InterruptedException {  	
		    WebElement	NxtBtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Next']"))));
		    Thread.sleep(400);
		    NxtBtn.click();
		    }
		    
	 
	 public void EyeIconbtnClick() throws InterruptedException {
	    	Thread.sleep(4000);
	    	for (int i = 0; i <32; i++) {
				
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(300);	
				}
	    	
	    		WebElement	eyeiconbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics[@style='position: absolute; overflow: visible; width: 40px; height: 40px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 100, 7.5); pointer-events: all; z-index: 2;'])[1]")));
	    		 js.executeScript("arguments[0].scrollIntoView({block:'center'});", eyeiconbtn);
	    		 Thread.sleep(1000);
	    		js.executeScript("arguments[0].click();", eyeiconbtn);
	    	
	    }
	 
	 public void EditIconbtnClick() throws InterruptedException {
	    	
	    	
 		WebElement	editbtn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flt-semantics[.='Edit']"))));
 		Thread.sleep(300);
 		editbtn.click();
 		
 		 //Invoice number field
		 WebElement	edit_InvoiceNum=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics/span[.='Invoice Number *']/following::flt-semantics/input[@data-semantics-role='text-field'])[1]")));
		// InvoiceNum.click();
		 wait.until(ExpectedConditions.visibilityOf(edit_InvoiceNum));
		 wait.until(ExpectedConditions.elementToBeClickable(edit_InvoiceNum));
		 js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click' ,{bubbles:true}));", edit_InvoiceNum);;
		
		 // Editing invoice in Editing Page
		 edit_InvoiceNum.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(200);
		 edit_InvoiceNum.sendKeys(Keys.BACK_SPACE);		 
		 Thread.sleep(100);
		 
		 String incvoiceNumber= "INV"+ System.currentTimeMillis();
		 edit_InvoiceNum.sendKeys(incvoiceNumber);	
 		
 }
	 
	 
	 public void lineItems_2ndRowEditing() throws InterruptedException {
		 
		 	//2nd Row DescriptionTxtField  editing  
		 	WebElement	SeocondDescriptionTxtField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics/span[contains(text(),'Description')]/following::flt-semantics/textarea[@data-semantics-role='text-field'])[10]")));
		 	Thread.sleep(2000);
		 	js.executeScript("arguments[0].scrollIntoView({behevior: 'smooth', block: 'center'})", SeocondDescriptionTxtField);
	    	js.executeScript("arguments[0].click();",SeocondDescriptionTxtField);
			Thread.sleep(400);
			SeocondDescriptionTxtField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Thread.sleep(400);
			SeocondDescriptionTxtField.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(400);
			js.executeScript("arguments[0].click();",SeocondDescriptionTxtField);
			Thread.sleep(400);
			SeocondDescriptionTxtField.sendKeys("Edit- Testing Petty Cash Flow");
				
			
			// 2nd Row Quantity editing 
			WebElement SecondRowQuantityfield= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics/span[contains(text(),'Quantity')]/following::flt-semantics/textarea[@data-semantics-role='text-field'])[14]")));
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView({behevior: 'smooth', block: 'center'})", SecondRowQuantityfield);
	    	js.executeScript("arguments[0].click();",SecondRowQuantityfield);
	    	Thread.sleep(400);
	    	SecondRowQuantityfield.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	    	Thread.sleep(500);

	    	SecondRowQuantityfield.sendKeys(Keys.BACK_SPACE);
	    	Thread.sleep(500);
	    	
	    	js.executeScript("arguments[0].click();",SecondRowQuantityfield);
	    	Thread.sleep(500);
	    	SecondRowQuantityfield.sendKeys("1999");;
			
	    	
			// 2nd Row Unit Editing 
			
			 WebElement	SecondRowUnitRemoveOption=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[@aria-label='Unit']/child::*/flt-semantics[@role='button']")));
				//SecondEachUnitRemoveOption 
			 	js.executeScript("arguments[0].scrollIntoView({block: 'center'});", SecondRowUnitRemoveOption);
			 	Thread.sleep(300);
			 	js.executeScript("arguments[0].click();", SecondRowUnitRemoveOption);
			 	Thread.sleep(400);			 	
			 
			// 2nd Row Unit option editing
				
				WebElement	UnitDD=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics/span[contains(text(),'Unit')]//following::flt-semantics/span[contains(text(),'The field is required')]")));
				//UnitDD DD 
			 	Thread.sleep(200);
			 	UnitDD.click();
			 	
			 	WebElement Each=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//flt-semantics/span[.='Each']")));
			 	Thread.sleep(200);
			 	js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", Each);
			 	Thread.sleep(200);
			 	js.executeScript("arguments[0].click();", Each);
			 	
			 	// 2nd Row Price editing
			 	
			 	WebElement	SecondRowpriceEditing=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//flt-semantics/span[contains(text(),'Price')]/following::flt-semantics/textarea[@data-semantics-role='text-field'])[15]")));
			 	wait.until(ExpectedConditions.visibilityOf(SecondRowpriceEditing));
				wait.until(ExpectedConditions.elementToBeClickable(SecondRowpriceEditing));
			 	//Quantity DD 
			 	js.executeScript("arguments[0].scrollIntoView({block:'center'});", SecondRowpriceEditing);
				Thread.sleep(600);
				js.executeScript("arguments[0].click();", SecondRowpriceEditing);
				Thread.sleep(300);
				SecondRowpriceEditing.sendKeys(Keys.chord(Keys.CONTROL,"a"));
				Thread.sleep(300);
				SecondRowpriceEditing.sendKeys(Keys.BACK_SPACE);
				Thread.sleep(400);
				js.executeScript("arguments[0].click();", SecondRowpriceEditing);
				Thread.sleep(400);
				SecondRowpriceEditing.sendKeys("2900000");
		 
	 }
	 
	 
	 public void backButton() throws InterruptedException {
		 WebElement	BackBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics/span[.='Details List']/preceding::flt-semantics[@role='button'])[4]")));
		    Thread.sleep(400);
		    BackBtn.click();
		 
		 
	 }
	 public void submitButton() throws InterruptedException {
		 WebElement	SubmitBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//flt-semantics[.='Submit']")));
		    Thread.sleep(400);
		    SubmitBtn.click();
		 
		 
	 }
	 
	 public void UpdateSatgeCMNTbox() throws InterruptedException {
	    	
	    	WebElement	UpdateSatgeCMNtTextField=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//flt-semantics/span/following::flt-semantics/textarea[@data-semantics-role='text-field'])[10]"))));
	    	Thread.sleep(1000);	
	    	UpdateSatgeCMNtTextField.click();
	    	UpdateSatgeCMNtTextField.sendKeys("Done");
	    	
	    }
	    
	 
	 
	 public void notesBtnClick() throws InterruptedException {
	    	Thread.sleep(4000);
	    	for (int i = 0; i <32; i++) {
				
				robot.keyPress(KeyEvent.VK_TAB);																										
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(300);	
				}
	    	
	    		WebElement	Notesbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//flt-semantics-container/flt-semantics[@style='position: absolute; overflow: visible; width: 33px; height: 33px; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 66, 13.5); pointer-events: all; z-index: 1;'])[1]")));
	    		 js.executeScript("arguments[0].scrollIntoView({block:'center'});", Notesbtn);
	    		 Thread.sleep(1000);
	    		js.executeScript("arguments[0].click();", Notesbtn);
	    	
	    }
	 
	 
	 
	  public void MenuButton() {
	    	
	    	// (//flt-semantics[@role='button'])[3]
	    			
	        By menuBtn = By.xpath("(//flt-semantics[@role='button'])[3]");

	        for (int i = 0; i < 5; i++) {

	            try {

	                WebElement menu =
	                        wait.until(ExpectedConditions.elementToBeClickable(menuBtn));

	                js.executeScript("arguments[0].scrollIntoView({block:'center'});", menu);
	                
	                Thread.sleep(2000);

	                js.executeScript(
	                        "arguments[0].dispatchEvent(new MouseEvent('click',{bubbles:true}));",
	                        menu);

	                System.out.println("Menu clicked");
	                break;

	            } catch (Exception e) {

	                System.out.println("Retrying menu click : " + i);

	                try {
	                    Thread.sleep(5000);
	                } catch (InterruptedException ex) {

	                }
	            }
	        }
	    }
	    
	    public void LogOut() {

	        By logoutDD = By.xpath("//*[@role='group']");

	        for (int i = 0; i < 5; i++) {

	            try {

	                WebElement dropdown =
	                        wait.until(ExpectedConditions.elementToBeClickable(logoutDD));
	                Thread.sleep(2000);
	                js.executeScript(
	                        "arguments[0].dispatchEvent(new MouseEvent('click',{bubbles:true}));",
	                        dropdown);

	                break;

	            } catch (Exception e) {

	                System.out.println("Retry logout dropdown : " + i);
	            }
	        }

	        By logoutBtn = By.xpath("//*[text()='Logout']");

	        for (int i = 0; i < 5; i++) {

	            try {

	                WebElement logout =
	                        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));

	                		Thread.sleep(3000);	             
	                		js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click',{bubbles:true}));",logout);

	                System.out.println("Logout success");
	                break;

	            } catch (Exception e) {

	                System.out.println("Retry logout button : " + i);

	                try {
	                    Thread.sleep(2000);
	                } catch (InterruptedException ex) {

	                }
	            }
	        }
	    }
	    
	    
	    
	    public void downloadPDFButton() throws InterruptedException {
	    	
	    	By DownLoadBtn=By.xpath("(//flt-semantics[@role='button'])[last()]");
	    	wait.until(ExpectedConditions.presenceOfElementLocated(DownLoadBtn));
	    	Thread.sleep(1000);
	    	
	    	WebElement downloadPdfbtn=driver.findElement(DownLoadBtn);
	    	Thread.sleep(2000);
	    //	downloadPdfbtn.click();
	    	js.executeScript("arguments[0].click();", downloadPdfbtn);
	    	
	    	
	    }

	}
