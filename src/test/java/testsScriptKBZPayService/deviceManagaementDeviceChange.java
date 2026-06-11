package testsScriptKBZPayService;

import java.awt.AWTException;

import org.genricPackage.BaseClass;
import org.kbzPayAppPages.accountClosePage;
import org.kbzPayAppPages.closingLoopPage;
import org.kbzPayAppPages.deviceManagement_DeviceChange;
import org.pages.DashBoardPage;
import org.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class deviceManagaementDeviceChange extends BaseClass {

	
	@Test(priority = 1)
	public void deviceChange() throws InterruptedException, AWTException {
		
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		deviceManagement_DeviceChange deviceChange= new deviceManagement_DeviceChange(driver);
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
		
		accClose.kbzPayServiceOPtion();
		
		DashBoard.clickAddNew();
		
		accClose.selectType();
		
		deviceChange.deviceManagement_Change();
		
		accClose.branchPhnnUmberField();
		
		accClose.cusName();
		
		accClose.DateOfBirth();
		
		accClose.UploadCustomerFace();
		
		accClose.passportIDproof();
		
		accClose.passportNumField();
		
		accClose.uploadNewPassport_PageBtn();
		
		accClose.uploadOldPassport_PageBtn();
		
		deviceChange.alternate_phoneNumField();
		
		accClose.bankStaffApprovalformBtn();
		
		deviceChange.oldHandsetModelField();
		
		deviceChange.kbzRegisterdPhnNum();
		
		accClose.NextButton();
		
		accClose.EyeIconbtnClick();
		
		deviceChange.escalateBtn();
		
		accClose.MenuButton();
		
		accClose.LogOut();			
			
	}
	
	// , dependsOnMethods = "deviceChange"
	@Test(priority = 2 , dependsOnMethods = "deviceChange" )
	public void closingLoopLogin() throws InterruptedException, AWTException {
			
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		closingLoopPage closingLoop= new closingLoopPage(driver);
		
		login.login("closeloopteam@gmail.com", "Nw5ZQMJNx9uN85AJb0n0");
		
		closingLoop.EyeIconbtnClick();
		
		closingLoop.markForCorrectionbutton();
		
		closingLoop.UpdateStage_Commentsection();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();	
		
		
	}
	
	@Test(priority = 3,dependsOnMethods = "closingLoopLogin")
	public void branchLogin() throws InterruptedException, AWTException {
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
		
		accClose.kbzPayServiceOPtion();
		
		accClose.EyeIconbtnClick();
		
		accClose.applicationCorrectedButton();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();	
		
	}
	
	// 
	@Test(priority = 4,dependsOnMethods = "branchLogin")
	public void closingloop2() throws InterruptedException, AWTException {
		
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		closingLoopPage closingLoop= new closingLoopPage(driver);
				
		login.login("closeloopteam@gmail.com", "Nw5ZQMJNx9uN85AJb0n0");
		
		closingLoop.EyeIconbtnClick();
		
		closingLoop.closebutton();
		
		closingLoop.UpdateStage_Commentsection();
		
		accClose.NextButton();
		
		accClose.EyeIconbtnClick();
		
		accClose.downloadPDFButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();	
		
	}
	
	
	
	
	
}
