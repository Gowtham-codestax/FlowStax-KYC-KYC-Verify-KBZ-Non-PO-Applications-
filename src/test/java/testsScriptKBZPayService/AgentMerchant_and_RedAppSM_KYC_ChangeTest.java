package testsScriptKBZPayService;

import java.awt.AWTException;
import org.genricPackage.BaseClass;
import org.kbzPayAppPages.AgentMerchant_and_RedAppSM_KYC_ChangePage;
import org.kbzPayAppPages.accountClosePage;
import org.kbzPayAppPages.closingLoopPage;
import org.kbzPayAppPages.tsoLoginPage;
import org.pages.DashBoardPage;
import org.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class AgentMerchant_and_RedAppSM_KYC_ChangeTest extends BaseClass {
	
	@Test(priority = 1 )
	public void AgemtMerchantand_RedAppFlowTest() throws InterruptedException, AWTException {
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		AgentMerchant_and_RedAppSM_KYC_ChangePage agent_RedApp= new AgentMerchant_and_RedAppSM_KYC_ChangePage(driver);
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
		
		accClose.kbzPayServiceOPtion();
	
		DashBoard.clickAddNew();
		
		agent_RedApp.selectType();
		
		agent_RedApp.AgentMerchant_RedAppSM_KYC_ChangeOption();
		
		accClose.branchPhnnUmberField();
		
		accClose.cusName();
		
		accClose.passportIDproof();
		
		accClose.passportNumField();
		
		accClose.uploadNewPassport_PageBtn();
		
		accClose.uploadOldPassport_PageBtn();
		
		accClose.phoneNumField();
		
		accClose.reasonTxtFiled();
		
		accClose.DateOfBirth();
		
		agent_RedApp.accountType();
		
		agent_RedApp.agentAccType();
		
		agent_RedApp.agentKYC_changeType();
		
		agent_RedApp.SelectAllCheckBox_KYC_changeType_Agent();
		
		agent_RedApp.kycChangeFormUpload_Btn();
		
		agent_RedApp.oldKycDataTxtField();
		
		agent_RedApp.newycDataTxtField();
		
		agent_RedApp.shopFrontAndBack_Upload_Btn();
		
		agent_RedApp.businnesLicence_Upload_Btn();
		
		agent_RedApp.shortCodeTxtField();
		
		agent_RedApp.shopName_TxtField();
		
		agent_RedApp.address_TxtField();
		
		agent_RedApp.customerFace_Upload_Btn();
		
		agent_RedApp.currentBalanceTXTField();
		
		agent_RedApp.qalStatusDD();
		
		agent_RedApp.yesOption();
		
		agent_RedApp.additionalDoc_Upload_Btn();
		
		agent_RedApp.NextButton();
		
		agent_RedApp.EyeIconbtnClick();
		
		agent_RedApp.EditIconbtnClick();
		
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
	
	//  ,dependsOnMethods = "AgemtMerchantand_RedAppFlowTest"
	@Test(priority = 2  ,dependsOnMethods = "AgemtMerchantand_RedAppFlowTest" )
	public void TSOLoginFlow() throws AWTException, InterruptedException {
		
		
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);	
		tsoLoginPage tso= new tsoLoginPage(driver);
		
		login.login("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");
		
		tso.selectKYCUpdate();
		
		tso.agentMerchantandRedApp_Option();;
		
		tso.PullOptionButon();
		
		tso.EyeIconbtnClick();
	
		tso.makeForcorrectionbutton();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
	
		accClose.MenuButton();
		
		accClose.LogOut();	
		
	}
	
	// , dependsOnMethods = "TSOLoginFlow"
	@Test(priority = 3  , dependsOnMethods = "TSOLoginFlow" ) 
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
	
	// ,dependsOnMethods = "branchLoginFlow"
	@Test(priority = 4 ,dependsOnMethods = "branchLoginFlow")
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
	
	// , dependsOnMethods = "TsoLoginFlow2"
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
	
	// ,dependsOnMethods = "closingLoopLogin"
	@Test(priority = 6 ,dependsOnMethods = "closingLoopLogin")
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
	@Test(priority = 7 ,dependsOnMethods = "TsoLoginFlow3")
	public void closingLoopLogin2() throws AWTException, InterruptedException {
		
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
