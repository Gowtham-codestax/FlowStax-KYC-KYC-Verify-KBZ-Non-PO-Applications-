package testsScriptKBZPayService;
import java.awt.AWTException;
import org.genricPackage.BaseClass;
import org.kbzPayAppPages.AgentMerchant_and_RedAppSM_KYC_ChangePage;
import org.kbzPayAppPages.Customer_Kyc_ChangeReqPage;
import org.kbzPayAppPages.MABR_KYC_ChangePage;
import org.kbzPayAppPages.accountClosePage;
import org.kbzPayAppPages.closingLoopPage;
import org.kbzPayAppPages.tsoLoginPage;
import org.pages.DashBoardPage;
import org.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;


@Listeners(ListenersClass.class)
public class MABR_KYC_ChangeTest extends BaseClass {
	
//	@Test(priority = 1)
	public void MABR_KYC_ChangeFlowTest() throws AWTException, InterruptedException {

		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		AgentMerchant_and_RedAppSM_KYC_ChangePage agent_RedApp= new AgentMerchant_and_RedAppSM_KYC_ChangePage(driver);
		Customer_Kyc_ChangeReqPage CusKYC = new Customer_Kyc_ChangeReqPage(driver);
		MABR_KYC_ChangePage MABRKYC= new MABR_KYC_ChangePage(driver);
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
		
		accClose.kbzPayServiceOPtion();

		DashBoard.clickAddNew();
		
		agent_RedApp.selectType();
		
		MABRKYC.mabr_KYC_ChangeOption();
		
		accClose.branchPhnnUmberField();
		
		accClose.cusName();
		
	/*	
		MABRKYC.nrcIDproof();
		
		MABRKYC.nrcNumberFields();
		
		MABRKYC.uploadNrcFront_PageBtn();
		
		MABRKYC.uploadNRC_Back_PageBtn();
		
		*/
			
		CusKYC.passportIDproof();
		
		CusKYC.passportNumField();
		
		CusKYC.uploadNewPassport_PageBtn();
		
		CusKYC.uploadOldPassport_PageBtn();

		accClose.phoneNumField();
		
		MABRKYC.DateOfBirth();
		
		agent_RedApp.kycChangeFormUpload_Btn();
		
		MABRKYC.UploadNewUserFace();
		
		accClose.reasonTxtFiled();
		
		agent_RedApp.NextButton();
		
		MABRKYC.EyeIconbtnClick();
		
		CusKYC.EditIconbtnClick();
		
		accClose.NextButton();
		
		accClose.assignToTSOBtn();
		
		accClose.recommedUploadLeter_YesRadioBtn();
		
		accClose.signatureVerfied_YesRadioBtn();
		
		accClose.docChecked_YesRadioBtn();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();

	}
	
	// , dependsOnMethods = "MABR_KYC_ChangeFlowTest"
//	@Test(priority = 2 , dependsOnMethods = "MABR_KYC_ChangeFlowTest")
	public void tsoLoginFlow() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);	
		tsoLoginPage tso= new tsoLoginPage(driver);
		
		login.login("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");
		
		tso.selectKYCUpdate();
		
		tso.MABR_KYC_Change_Option();;
		
		tso.PullOptionButon();
		
		tso.EyeIconbtnClick();
	
		tso.makeForcorrectionbutton();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
	
		accClose.MenuButton();
		
		accClose.LogOut();	
					
	}
	
	
	// , dependsOnMethods = "tsoLoginFlow"
	@Test(priority = 3  , dependsOnMethods = "tsoLoginFlow" )
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
	@Test(priority = 4 , dependsOnMethods = "branchLoginFlow"  )
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
