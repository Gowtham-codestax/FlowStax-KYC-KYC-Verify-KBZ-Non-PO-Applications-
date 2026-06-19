package testsScriptKBZPayService;

import java.awt.AWTException;
import org.genricPackage.BaseClass;
import org.kbzPayAppPages.Account_Resumption_Fraud_RelatedPage;
import org.kbzPayAppPages.Pin_Reset_Req_Device_Change_ReqPage;
import org.kbzPayAppPages.accountClosePage;
import org.kbzPayAppPages.closingLoopPage;
import org.kbzPayAppPages.tsoLoginPage;
import org.pages.DashBoardPage;
import org.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class Account_Resumption_Fraud_RelatedTest extends BaseClass {
	
	
	@Test(priority = 1 )
	public void Account_Resumption_Fraud_RelatedFlowTest() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		Pin_Reset_Req_Device_Change_ReqPage PinReset_DeviceChange =new  Pin_Reset_Req_Device_Change_ReqPage(driver);
		Account_Resumption_Fraud_RelatedPage Account_Fraud = new Account_Resumption_Fraud_RelatedPage(driver);
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
		
		accClose.kbzPayServiceOPtion();
		
		DashBoard.clickAddNew();
		
		accClose.selectType();
		
		Account_Fraud.Account_Resumption_Fraud_RelatedOption();
		
		accClose.branchPhnnUmberField();
		
		accClose.cusName();
		
		PinReset_DeviceChange.nrcIDproof();
		
		PinReset_DeviceChange.nrcNumberFields();
		
		PinReset_DeviceChange.uploadNrcFront_PageBtn();
		
		PinReset_DeviceChange.uploadNRC_Back_PageBtn();
		
		PinReset_DeviceChange.DateOfBirth();
		
		PinReset_DeviceChange.addressFiled();
		
		accClose.UploadCustomerFace();
		
		accClose.fathersNameField();
		
		accClose.bankStaffApprovalformBtn();
		
		Account_Fraud.kbzRegPhnNumField();
		
		Account_Fraud.reasonForContactingBackField();
		
		accClose.NextButton();
		
		accClose.EyeIconbtnClick();
		
		Account_Fraud.EditIconClick();
		
		Account_Fraud.escalateBtn();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();
		
	}

	// ,dependsOnMethods = "Account_Resumption_Fraud_RelatedFlowTest"
		@Test(priority = 2 ,dependsOnMethods = "Account_Resumption_Fraud_RelatedFlowTest" )
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

		// , dependsOnMethods = "closingLoopLogin"
		@Test(priority = 3  , dependsOnMethods = "closingLoopLogin")
		public void branchLoginFlow() throws AWTException, InterruptedException {
			
			LoginPage login = new LoginPage(driver);
			accountClosePage accClose= new accountClosePage(driver);
			tsoLoginPage tso = new tsoLoginPage(driver);
			
			login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
			
		//	accClose.kbzPayServiceOPtion();
			
			tso.EyeIconbtnClick();
			
			accClose.applicationCorrectedButton();
			
			accClose.NextButton();
			
			accClose.MenuButton();
			
			accClose.LogOut();	
			
		}
		
		// ,dependsOnMethods = "branchLoginFlow"
		@Test(priority = 4 ,dependsOnMethods = "branchLoginFlow" )
		public void closingLoopLogin2() throws InterruptedException, AWTException {
			
			LoginPage login = new LoginPage(driver);
			accountClosePage accClose= new accountClosePage(driver);
			closingLoopPage closingLoop= new closingLoopPage(driver);
			
			login.login("closeloopteam@gmail.com", "Nw5ZQMJNx9uN85AJb0n0");
			
			closingLoop.EyeIconbtnClick();
			
			closingLoop.ReOpenbutton();
			
			closingLoop.additionalDoc_Upload_Btn();
			
			closingLoop.UpdateStage_Commentsection();
			
			accClose.NextButton();
			
			accClose.MenuButton();
			
			accClose.LogOut();	
				
		}

		// , dependsOnMethods = "closingLoopLogin2"
				@Test(priority = 5 , dependsOnMethods = "closingLoopLogin2")
				public void branchLoginFlow2() throws AWTException, InterruptedException {
					
					LoginPage login = new LoginPage(driver);
					accountClosePage accClose= new accountClosePage(driver);
					Account_Resumption_Fraud_RelatedPage Account_Fraud = new Account_Resumption_Fraud_RelatedPage(driver);
					tsoLoginPage tso = new tsoLoginPage(driver);
					
					login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
					
		//			accClose.kbzPayServiceOPtion();
					
					tso.EyeIconbtnClick();
					
					Account_Fraud.escalateBtn();
					
					accClose.UpdateStage_Commentsection();
					
					accClose.NextButton();
					
					accClose.MenuButton();
					
					accClose.LogOut();	
					
				}

		
				// ,dependsOnMethods = "branchLoginFlow2"
				@Test(priority = 6 ,dependsOnMethods = "branchLoginFlow2" )
				public void closingLoopLogin3() throws InterruptedException, AWTException {
					
					LoginPage login = new LoginPage(driver);
					accountClosePage accClose= new accountClosePage(driver);
					closingLoopPage closingLoop= new closingLoopPage(driver);
					
					login.login("closeloopteam@gmail.com", "Nw5ZQMJNx9uN85AJb0n0");
					
					closingLoop.EyeIconbtnClick();
					
					closingLoop.closebutton();
					
					closingLoop.UpdateStage_Commentsection();
					
					accClose.NextButton();
					
					closingLoop.EyeIconbtnClick();
					
					closingLoop.downloadPDFButton();
					
					accClose.MenuButton();
					
					accClose.LogOut();	
						
				}
		
				
}
