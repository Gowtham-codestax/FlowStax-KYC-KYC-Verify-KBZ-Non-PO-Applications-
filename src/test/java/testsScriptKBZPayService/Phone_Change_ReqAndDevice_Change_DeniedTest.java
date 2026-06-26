package testsScriptKBZPayService;

import java.awt.AWTException;

import org.CentralOpsPages.DashBoardPage;
import org.CentralOpsPages.LoginPage;
import org.genricPackage.BaseClass;
import org.kbzPayAppPages.MABR_KYC_ChangePage;
import org.kbzPayAppPages.Phone_Change_ReqAndDevice_Change_ReqPage;
import org.kbzPayAppPages.accountClosePage;
import org.kbzPayAppPages.closingLoopPage;
import org.kbzPayAppPages.tsoLoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class Phone_Change_ReqAndDevice_Change_DeniedTest  extends BaseClass{
	
	@Test(priority = 1)
	public void Phone_Change_ReqAndDevice_Change_DeniedFlowTest() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		Phone_Change_ReqAndDevice_Change_ReqPage Phone_DeviceChange = new Phone_Change_ReqAndDevice_Change_ReqPage(driver);
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
		
		accClose.kbzPayServiceOPtion();

		DashBoard.clickAddNew();
		
		accClose.selectType();
		
		Phone_DeviceChange.Phone_Change_ReqAndDevice_Change_ReqOption();
		
		Phone_DeviceChange.branchPhnnUmberField();
		
		Phone_DeviceChange.cusName();
		
		Phone_DeviceChange.nrcIDproof();
		
		Phone_DeviceChange.nrcNumberFields();
		
		Phone_DeviceChange.uploadNrcFront_PageBtn();
		
		Phone_DeviceChange.uploadNRC_Back_PageBtn();
		
		Phone_DeviceChange.DateOfBirth();
		
		Phone_DeviceChange.uploadCustomerFacePhoto();
		
		Phone_DeviceChange.currentBalanceNumFiedl();
		
		Phone_DeviceChange.infoOf3transaction_Btn();
		
		Phone_DeviceChange.reasonTxtFiled();
		
		Phone_DeviceChange.bankStaffApprovalformBtn();
		
		Phone_DeviceChange.oldHandsetModelField();
		
		Phone_DeviceChange.kbzRegPhnNumField();
		
		Phone_DeviceChange.oldPhnNumField();
		
		Phone_DeviceChange.newPhnNumField();
		
		Phone_DeviceChange.uploadDocUrl();
		
		accClose.NextButton();
	
		Phone_DeviceChange.EyeIconbtnClick();
		
		Phone_DeviceChange.EditIconClick();
		
		Phone_DeviceChange.assignToTSOBtn();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();
		
	}
	
	
	// , dependsOnMethods = "Phone_Change_ReqAndDevice_Change_DeniedFlowTest"
		@Test(priority = 2 , dependsOnMethods = "Phone_Change_ReqAndDevice_Change_DeniedFlowTest" )
		public void tsoLoginFlow() throws AWTException, InterruptedException {
			
			LoginPage login = new LoginPage(driver);
			accountClosePage accClose= new accountClosePage(driver);	
			tsoLoginPage tso= new tsoLoginPage(driver);
			
			login.login("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");
			
			tso.selectKYCUpdate();
			
			tso.phoneAndDevice_Change_Option();;
			
			tso.PullOptionButon();
			
			tso.EyeIconbtnClick();
		
			tso.makeForcorrectionbutton();
			
			accClose.UpdateStage_Commentsection();
			
			accClose.NextButton();
		
			accClose.MenuButton();
			
			accClose.LogOut();	
						
		}
		
		// , dependsOnMethods = "tsoLoginFlow"
			@Test(priority = 3  , dependsOnMethods = "tsoLoginFlow")
			public void branchLoginFlow() throws InterruptedException, AWTException {
				
				LoginPage login = new LoginPage(driver);
				accountClosePage accClose= new accountClosePage(driver);
				tsoLoginPage tso= new tsoLoginPage(driver);
				
				login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
				
		//		accClose.kbzPayServiceOPtion();
				
				tso.EyeIconbtnClick();
				
				accClose.applicationCorrectedButton();
				
				accClose.NextButton();
				
				accClose.MenuButton();
				
				accClose.LogOut();	
				
			}
			
			//  , dependsOnMethods = "branchLoginFlow"
			@Test(priority = 4  , dependsOnMethods = "branchLoginFlow")
			public void TsoLoginFlow2() throws AWTException, InterruptedException {
				
				LoginPage login = new LoginPage(driver);
				accountClosePage accClose= new accountClosePage(driver);	
				tsoLoginPage tso= new tsoLoginPage(driver);
				
				login.login("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");
				
				tso.EyeIconbtnClick();
				
				tso.needMoreInfobutton();
				
				tso.UpdateStage_Commentsection();
				
				accClose.NextButton();
				
				accClose.MenuButton();
				
				accClose.LogOut();	
				
			}
			
		//  , dependsOnMethods = "TsoLoginFlow2"
			@Test(priority = 5 , dependsOnMethods = "TsoLoginFlow2")
			public void closingLoopLogin() throws AWTException, InterruptedException {
				
				LoginPage login = new LoginPage(driver);
				accountClosePage accClose= new accountClosePage(driver);
				closingLoopPage closingLoop= new closingLoopPage(driver);
				
				login.login("closeloopteam@gmail.com", "Nw5ZQMJNx9uN85AJb0n0");
				
				closingLoop.EyeIconbtnClick();
				
				closingLoop.updatebutton();
				
				closingLoop.additionalDoc_Upload_Btn();
				
				closingLoop.UpdateStage_Commentsection();
				
				accClose.NextButton();
				
				accClose.MenuButton();
				
				accClose.LogOut();	
				
			}
				
		//  , dependsOnMethods = "closingLoopLogin"
			@Test(priority = 6 , dependsOnMethods = "closingLoopLogin" )
			public void TsoLoginFlow3() throws AWTException, InterruptedException {
				
				LoginPage login = new LoginPage(driver);
				accountClosePage accClose= new accountClosePage(driver);	
				tsoLoginPage tso= new tsoLoginPage(driver);
				
				login.login("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");
				
				tso.EyeIconbtnClick();
				
				tso.resolvebutton();
				
				tso.UpdateStage_Commentsection();
				
				accClose.NextButton();
				
				accClose.MenuButton();
				
				accClose.LogOut();	
				
			}
				
			// ,dependsOnMethods = "TsoLoginFlow3"
				@Test(priority = 7,dependsOnMethods = "TsoLoginFlow3" )
				public void closingLoopLogin2() throws AWTException, InterruptedException {
					
					LoginPage login = new LoginPage(driver);
					accountClosePage accClose= new accountClosePage(driver);
					closingLoopPage closingLoop= new closingLoopPage(driver);
					MABR_KYC_ChangePage MABRKYC= new MABR_KYC_ChangePage(driver);
					
					login.login("closeloopteam@gmail.com", "Nw5ZQMJNx9uN85AJb0n0");
					
					closingLoop.EyeIconbtnClick();
					
					closingLoop.denyButton();
					
					closingLoop.UpdateStage_Commentsection();
					
					accClose.NextButton();
					
					closingLoop.EyeIconbtnClick();
					
					MABRKYC.downloadPDFButton();
							
					accClose.MenuButton();
					
					accClose.LogOut();	
						
				}	
		
	

}
