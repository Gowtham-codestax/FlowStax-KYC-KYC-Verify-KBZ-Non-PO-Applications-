package testsScripts;

import java.awt.AWTException;

import org.genricPackage.BaseClass;
import org.pages.AccountUnlock_Paygilant_Page;
import org.pages.DashBoardPage;
import org.pages.KYC1_COPS_Page;
import org.pages.KYCPage;
import org.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class accountUnlockPaygilantTest  extends BaseClass{
	
	@Test(priority = 1)
	public void accountUnlockPaygilantFlow() throws AWTException, InterruptedException {
		
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		
		AccountUnlock_Paygilant_Page accPaygilant = new AccountUnlock_Paygilant_Page(driver);
		
		login.login("branch_COPS_stag@gmail.com", "olvH~jMjqdmX-lYdecx3");
		
		DashBoard.clickAddNew();
		
		accPaygilant.selectAccountUnlock_Paygilant();
		
	//	accPaygilant.initialDeposit();
		
		accPaygilant.enterCustomerDetails();
	
		accPaygilant.uploadPassport_FrontPageBtn();
				
		accPaygilant.uploadPassport_BackpageBtn();
		
		accPaygilant.uploadRequestForm_Btn();
		
		accPaygilant.lockedReasonDetails();
		
		accPaygilant.simCardDocUpload_Btn();
		
		accPaygilant.deviceTypeTextFiled();
		
		accPaygilant.RemarkTextField();
		
		Kyc.NextButton();
		
		
	//	Kyc.EyeIconbtnClick();
		
	//	Kyc.EditIconbtnClick();
		
	//	Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
	
	
	}
	
	
	// , dependsOnMethods = "accountUnlockPaygilantTest"
	@Test(priority = 2, dependsOnMethods = "accountUnlockPaygilantFlow")
	public void FMU1Login() throws InterruptedException, AWTException {
		
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KYC1_COPS_Page Kyc1=new KYC1_COPS_Page(driver);
		AccountUnlock_Paygilant_Page accPaygilant = new AccountUnlock_Paygilant_Page(driver);
		
		login.login("fmu1_cops@gmail.com", "FPsvBbB6!!3Cfobbq$9E");
		
		accPaygilant.PullOptionButon();
		
		accPaygilant.StatusActionClick();
		
		accPaygilant.EscalteActionclick();
		
		accPaygilant.UpdateStage_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
	}
	
	
	@Test(priority = 3,dependsOnMethods = "FMU1Login")
	public void SOC1Login() throws InterruptedException, AWTException {
		
		
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KYC1_COPS_Page Kyc1=new KYC1_COPS_Page(driver);
		AccountUnlock_Paygilant_Page accPaygilant = new AccountUnlock_Paygilant_Page(driver);
		
		login.login("soc1_cops@gmail.com", "CLTC7Zpovr8bHn8sphrZ");
		
		accPaygilant.PullOptionButon();
		
		accPaygilant.soc1loginApproveaction();
		
		accPaygilant.UpdateStage_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
		
	}
	
	// 
	 @Test(priority = 4 ,dependsOnMethods = "SOC1Login")
	public void FMUlogin() throws InterruptedException, AWTException {
		
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KYC1_COPS_Page Kyc1=new KYC1_COPS_Page(driver);
		AccountUnlock_Paygilant_Page accPaygilant = new AccountUnlock_Paygilant_Page(driver);
		
		login.login("fmu1_cops@gmail.com", "FPsvBbB6!!3Cfobbq$9E");
		
		accPaygilant.PullOptionButon();
		
		accPaygilant.FMU1loginUpdateaction();
		
		accPaygilant.UpdateStage_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
	}
	
	
	//  ,dependsOnMethods ="FMUlogin"
	@Test(priority = 5 ,dependsOnMethods ="FMUlogin")
	public void CIFGropuLogin() throws InterruptedException, AWTException {
		
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KYC1_COPS_Page Kyc1=new KYC1_COPS_Page(driver);
		AccountUnlock_Paygilant_Page accPaygilant = new AccountUnlock_Paygilant_Page(driver);
		
		login.login("CIF1_COPS_Stagi@gmail.com", "kPI!~KsWwyh62TZD$ehN");
	
		accPaygilant.SelectOptionButon();
		
		accPaygilant.accountUnlock_Paygliant_workflowOption();
		
		accPaygilant.CIF1GroupLoginStatusAction();
		
		accPaygilant.UpdateStage_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
		
		
	//	accPaygilant.PullOptionButon();
		
		
	}
	@Test(priority =6,dependsOnMethods = "CIFGropuLogin")
	public void branchGropLogin() throws InterruptedException, AWTException {
		
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		
		AccountUnlock_Paygilant_Page accPaygilant = new AccountUnlock_Paygilant_Page(driver);
		
		login.login("branch_COPS_stag@gmail.com", "olvH~jMjqdmX-lYdecx3");
		
		
		
		
	}
	


}
