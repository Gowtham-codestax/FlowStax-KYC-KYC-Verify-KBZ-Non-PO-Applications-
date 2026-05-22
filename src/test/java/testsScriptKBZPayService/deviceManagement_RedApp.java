package testsScriptKBZPayService;

import java.awt.AWTException;

import org.genricPackage.BaseClass;
import org.kbzPayAppPages.accountClosePage;
import org.kbzPayAppPages.closingLoopPage;
import org.kbzPayAppPages.deviceChangeRedApp;
import org.kbzPayAppPages.deviceManagement_DeviceChange;
import org.pages.DashBoardPage;
import org.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;
@Listeners(ListenersClass.class)
public class deviceManagement_RedApp  extends BaseClass{

	
	@Test(priority = 1)
	public void deviceRedApp() throws AWTException, InterruptedException {
		

		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		deviceManagement_DeviceChange deviceChange= new deviceManagement_DeviceChange(driver);
		deviceChangeRedApp RedApp= new deviceChangeRedApp(driver);
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
		
		accClose.kbzPayServiceOPtion();
		
		DashBoard.clickAddNew();
		
		accClose.selectType();
		
		RedApp.deviceManagement_Change_RedApp();
		
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
		
		RedApp.agentOrMerchantPhnNumField();
		
		RedApp.agentOrMerchantCodeField();
		
		accClose.NextButton();
		
		RedApp.EyeIconbtnClick();
		
		RedApp.escalateBtn();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();		
		
		
	}
	
	// 
	@Test(priority = 2, dependsOnMethods = "deviceRedApp")
	public void closingLoopLogin() throws InterruptedException, AWTException {
		
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		closingLoopPage closingLoop= new closingLoopPage(driver);
		deviceManagement_DeviceChange deviceChange= new deviceManagement_DeviceChange(driver);
		
		login.login("closeloopteam@gmail.com", "Nw5ZQMJNx9uN85AJb0n0");
		
		closingLoop.EyeIconbtnClick();
		
		closingLoop.denyButton();
		
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
		closingLoopPage closingLoop= new closingLoopPage(driver);
		deviceManagement_DeviceChange deviceChange= new deviceManagement_DeviceChange(driver);
		
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
		
		accClose.kbzPayServiceOPtion();
		
		accClose.EyeIconbtnClick();
		
		accClose.MenuButton();
		
		accClose.LogOut();	
		
	}

}
