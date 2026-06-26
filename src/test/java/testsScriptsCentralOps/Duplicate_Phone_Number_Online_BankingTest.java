package testsScriptsCentralOps;
import java.awt.AWTException;

import org.CentralOpsPages.CFIPages;
import org.CentralOpsPages.DashBoardPage;
import org.CentralOpsPages.Duplicate_Phone_Number_Online_BankingPage;
import org.CentralOpsPages.KYCPage;
import org.CentralOpsPages.LoginPage;
import org.genricPackage.BaseClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class Duplicate_Phone_Number_Online_BankingTest extends BaseClass {
	
	@Test(priority = 1)
	public void Duplicate_Phone_Number_Online_BankingFlowTest() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		Duplicate_Phone_Number_Online_BankingPage DuplicatePhn_OnlineBank= new Duplicate_Phone_Number_Online_BankingPage(driver);
		
		login.login("branch_COPS_stag@gmail.com", "olvH~jMjqdmX-lYdecx3");
	
		DashBoard.clickAddNew();
		
		DuplicatePhn_OnlineBank.Duplicate_Phone_Number_Online_BankingOption();
		
		DuplicatePhn_OnlineBank.enterCustomerDetails();
		
		DuplicatePhn_OnlineBank.nrcIDproof();
		
		DuplicatePhn_OnlineBank.uploadNRC_Back_PageBtn();
		
		DuplicatePhn_OnlineBank.uploadNrcFront_PageBtn();
		
		DuplicatePhn_OnlineBank.nrcNumberFields();
		
		DuplicatePhn_OnlineBank.uploadRequestForm_Btn();
		
		DuplicatePhn_OnlineBank.nrcVerified_YesRadioBtn();
		
		DuplicatePhn_OnlineBank.uploadSIMCardOwnerDoc_Btn();
		
		DuplicatePhn_OnlineBank.customerVerifiedPhnNUm_YesRadioBtn();
		
		DuplicatePhn_OnlineBank.im_Banking_usernameField();
		
		DuplicatePhn_OnlineBank.userNameVerified_YesRadioBtn();
		
		DuplicatePhn_OnlineBank.emailVerified_YesRadioBtn();
		
		DuplicatePhn_OnlineBank.docVerified_YesRadioBtn();
		
		Kyc.RemarkTextField();
		
		Kyc.NextButton();
		
		Kyc.EyeIconbtnClick();
		
		DuplicatePhn_OnlineBank.EditIconClick();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
			
	}
	
	// , dependsOnMethods = "Duplicate_Phone_Number_Online_BankingFlowTest"
	@Test(priority = 2 )
	public void CFI_Flow() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		CFIPages CFI = new CFIPages(driver);
		
		login.login("CIF1_COPS_Stagi@gmail.com", "kPI!~KsWwyh62TZD$ehN");
		
		CFI.selectKYCUpdate();
				
		CFI.Duplicate_Phone_Number_Online_BankingOption();
		
		CFI.PullOptionButon();
		
		CFI.EyeIconbtnClick();
		
		CFI.startActionebutton();
		
		CFI.UpdateStage_Commentsection();
		
		Kyc.NextButton();
		
		CFI.EyeIconbtnClick();
		
		CFI.verifyAndActivebutton();
		
		CFI.verifedandUserActivated_YES_Radiobtn();
		
		Kyc.NextButton();
		
		CFI.EyeIconbtnClick();
		
		CFI.authorizebutton();
		
		CFI.UpdateStage_Commentsection();
		
		Kyc.NextButton();
				
		Kyc.MenuButton();
		
		Kyc.LogOut();
			
		
	}

}
