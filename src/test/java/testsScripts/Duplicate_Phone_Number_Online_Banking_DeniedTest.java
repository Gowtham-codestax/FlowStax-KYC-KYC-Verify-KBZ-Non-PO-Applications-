package testsScripts;
import java.awt.AWTException;
import org.genricPackage.BaseClass;
import org.pages.AdminPage;
import org.pages.CFIPages;
import org.pages.DashBoardPage;
import org.pages.Duplicate_Phone_Number_Online_BankingPage;
import org.pages.KYCPage;
import org.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class Duplicate_Phone_Number_Online_Banking_DeniedTest extends BaseClass {

	@Test(priority = 1)
	public void Duplicate_Phone_Number_Online_Banking_DeniedFlow() throws AWTException, InterruptedException {
		

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
	
	//  , dependsOnMethods = "Duplicate_Phone_Number_Online_Banking_DeniedFlow"
	@Test(priority = 2 , dependsOnMethods = "Duplicate_Phone_Number_Online_Banking_DeniedFlow")
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
		
		CFI.makeForcorrectionbutton();
		
		CFI.UpdateStage_Commentsection();
	
		Kyc.NextButton();
				
		Kyc.MenuButton();
		
		Kyc.LogOut();
			
		
	}
	
	// , dependsOnMethods = "CFI_Flow"
	@Test(priority = 3, dependsOnMethods = "CFI_Flow" )
	public void branchFlow() throws AWTException, InterruptedException {
		

		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		Duplicate_Phone_Number_Online_BankingPage DuplicatePhn_OnlineBank= new Duplicate_Phone_Number_Online_BankingPage(driver);
		CFIPages CFI = new CFIPages(driver);
		
		login.login("branch_COPS_stag@gmail.com", "olvH~jMjqdmX-lYdecx3");
		
		Kyc.EyeIconbtnClick();
		
		DuplicatePhn_OnlineBank.requestforClosurebutton();
		
		CFI.UpdateStage_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();	
	}
	
	// , dependsOnMethods = "branchFlow"
	@Test(priority = 4 , dependsOnMethods = "branchFlow")
	public void adminFlow() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		CFIPages CFI = new CFIPages(driver);
		AdminPage admin = new AdminPage(driver);
				
		login.login("admin_COPS_Stag@gmail.com", "~h1Fl$$BYNZA1$2Zeyra");
		
		admin.selectDropDownFilter();
		
		admin.duplicatePhnAndNoWorkOption();
		
		admin.switchRadioBtn();
		
		admin.EyeIconbtnClick();
		
		admin.denyOption();
		
		CFI.UpdateStage_Commentsection();

		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
	}
	
	// , dependsOnMethods = "adminFlow"
	@Test(priority = 5 , dependsOnMethods = "adminFlow")
	public void branchFlow_2() throws AWTException, InterruptedException {
		

		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		Duplicate_Phone_Number_Online_BankingPage DuplicatePhn_OnlineBank= new Duplicate_Phone_Number_Online_BankingPage(driver);
		CFIPages CFI = new CFIPages(driver);
		
		login.login("branch_COPS_stag@gmail.com", "olvH~jMjqdmX-lYdecx3");
		
		Kyc.EyeIconbtnClick();
		
		DuplicatePhn_OnlineBank.reOpenbutton();
		
		CFI.UpdateStage_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();	
	}
	
	@Test(priority = 6  )
	public void CFI_Flow_2() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		CFIPages CFI = new CFIPages(driver);
		
		login.login("CIF1_COPS_Stagi@gmail.com", "kPI!~KsWwyh62TZD$ehN");
		
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
