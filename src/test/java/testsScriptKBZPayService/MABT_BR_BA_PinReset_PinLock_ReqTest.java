package testsScriptKBZPayService;
import java.awt.AWTException;

import org.CentralOpsPages.DashBoardPage;
import org.CentralOpsPages.LoginPage;
import org.genricPackage.BaseClass;
import org.kbzPayAppPages.MABR_KYC_ChangePage;
import org.kbzPayAppPages.MABT_BR_BA_PinReset_PinLock_ReqPage;
import org.kbzPayAppPages.accountClosePage;
import org.kbzPayAppPages.closingLoopPage;
import org.kbzPayAppPages.tsoLoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class MABT_BR_BA_PinReset_PinLock_ReqTest extends BaseClass{
	
	@Test(priority = 1)
	public void MABT_BR_BA_PinReset_PinLock_ReqFlowTest() throws AWTException, InterruptedException {
		

		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		MABT_BR_BA_PinReset_PinLock_ReqPage MABT_RBA_PIN= new MABT_BR_BA_PinReset_PinLock_ReqPage(driver);
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
		
		accClose.kbzPayServiceOPtion();
		
		DashBoard.clickAddNew();
		
		accClose.selectType();
		
		MABT_RBA_PIN.MABT_BR_BA_PinReset_PinLock_ReqOption();
		
		accClose.branchPhnnUmberField();
		
		accClose.cusName();
		
		accClose.passportIDproof();
		
		accClose.passportNumField();
		
		accClose.uploadNewPassport_PageBtn();
		
		accClose.uploadOldPassport_PageBtn();
		
		accClose.phoneNumField();
		
		accClose.reasonTxtFiled();
		
		accClose.DateOfBirth();
		
		MABT_RBA_PIN.accType();
		
		MABT_RBA_PIN.mABT();
		
		MABT_RBA_PIN.staffIDNum_Field();
		
		MABT_RBA_PIN.UploadStafFaceBtn();
		
		MABT_RBA_PIN.actionOnPIN_DD();
		
		MABT_RBA_PIN.pinResetOption();
		
		MABT_RBA_PIN.Upload_PinRest_Pinlock_FormBtn();
		
		accClose.NextButton();

		accClose.EyeIconbtnClick();
		
		MABT_RBA_PIN.EditIconbtnClick();
		
		accClose.NextButton();
		
		MABT_RBA_PIN.assignToTSOBtn();
		
		accClose.recommedUploadLeter_YesRadioBtn();
		
		accClose.signatureVerfied_YesRadioBtn();
		
		accClose.docChecked_YesRadioBtn();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();
	}
	
	// , dependsOnMethods = "MABT_BR_BA_PinReset_PinLock_ReqFlowTest"
	@Test(priority = 2 , dependsOnMethods = "MABT_BR_BA_PinReset_PinLock_ReqFlowTest")
	public void tsoLoginFlow() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);	
		tsoLoginPage tso= new tsoLoginPage(driver);
		
		login.login("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");
		
		tso.selectKYCUpdate();
		
		tso.MABT_BR_BA_PinResetAndLockReq_Option();;
		
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
			
			accClose.kbzPayServiceOPtion();
			
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
				
				closingLoop.closebutton();
				
				closingLoop.UpdateStage_Commentsection();
				
				accClose.NextButton();
				
				closingLoop.EyeIconbtnClick();
				
				MABRKYC.downloadPDFButton();
						
				accClose.MenuButton();
				
				accClose.LogOut();	
					
			}
		


}
