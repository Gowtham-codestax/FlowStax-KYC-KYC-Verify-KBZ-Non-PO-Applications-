package testsScriptKBZPayService;

import java.awt.AWTException;

import org.CentralOpsPages.DashBoardPage;
import org.CentralOpsPages.LoginPage;
import org.genricPackage.BaseClass;
import org.kbzPayAppPages.MABR_KYC_ChangePage;
import org.kbzPayAppPages.Pin_Reset_Req_Device_Change_ReqPage;
import org.kbzPayAppPages.accountClosePage;
import org.kbzPayAppPages.closingLoopPage;
import org.kbzPayAppPages.tsoLoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class Pin_Reset_Req_Device_Change_Req_Denied_FlowTest  extends BaseClass{
	

	@Test(priority = 1)
	public void Pin_Reset_Req_Device_Change_ReqPage_DeniedFlowTest() throws AWTException, InterruptedException {

		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		Pin_Reset_Req_Device_Change_ReqPage PinReset_DeviceChange =new  Pin_Reset_Req_Device_Change_ReqPage(driver);
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
		
		accClose.kbzPayServiceOPtion();
		
		DashBoard.clickAddNew();
		
		accClose.selectType();
		
		PinReset_DeviceChange.Pin_Reset_Req_Device_Change_ReqOption();
		
		accClose.branchPhnnUmberField();
		
		accClose.cusName();
		
		PinReset_DeviceChange.nrcIDproof();
		
		PinReset_DeviceChange.nrcNumberFields();
		
		PinReset_DeviceChange.uploadNrcFront_PageBtn();
		
		PinReset_DeviceChange.uploadNRC_Back_PageBtn();
		
		PinReset_DeviceChange.DateOfBirth();
		
		PinReset_DeviceChange.addressFiled();
		
		accClose.UploadCustomerFace();
		
		accClose.currentBalanceNumFiedl();
		
		accClose.fathersNameField();
		
		accClose.infoOf3transaction_Btn();
		
		accClose.reasonTxtFiled();
		
		PinReset_DeviceChange.alternate_phoneNumField();
		
		PinReset_DeviceChange.loanStatusField();
		
		PinReset_DeviceChange.errorDetailsField();
		
		PinReset_DeviceChange.dateAndTime_IssueOccured();
		
		accClose.bankStaffApprovalformBtn();
		
		accClose.oldHandsetModelField();
		
		PinReset_DeviceChange.kbzRegPhnNumField();
		
		accClose.NextButton();
	
		PinReset_DeviceChange.EyeIconbtnClick();
		
		PinReset_DeviceChange.EditIconClick();
		
		accClose.assignToTSOBtn();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();

	}
	
	// , dependsOnMethods = "Pin_Reset_Req_Device_Change_ReqPage_DeniedFlowTest"
	@Test(priority = 2 , dependsOnMethods = "Pin_Reset_Req_Device_Change_ReqPage_DeniedFlowTest" )
	public void tsoLoginFlow() throws AWTException, InterruptedException {
				
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);	
		tsoLoginPage tso= new tsoLoginPage(driver);
				
		login.login("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");
				
		tso.selectKYCUpdate();
				
		tso.pinResetAndDevice_Change_Option();;
				
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
