package testsScriptsCentralOps;

import java.awt.AWTException;

import org.CentralOpsPages.DashBoardPage;
import org.CentralOpsPages.KYC1_COPS_Page;
import org.CentralOpsPages.KYCPage;
import org.CentralOpsPages.LoginPage;
import org.CentralOpsPages.SAOPage;
import org.genricPackage.BaseClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class KYC_EscalateFlowTest extends BaseClass {
	
	@Test(priority = 1   )
	public void kyc_EscalateTest() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		
		login.login("branch_COPS_stag@gmail.com", "olvH~jMjqdmX-lYdecx3");
	
		DashBoard.clickAddNew();
		
		Kyc.selectKYCupdate();
		
		Kyc.enterCustomerDetails();
		
		Kyc.uploadPassport_BackpageBtn();
		
		Kyc.uploadPassport_FrontPageBtn();
		
		Kyc.passPortNumField();
		
		Kyc.uploadRequestForm_Btn();
		
		Kyc.Regular_KYC_RequestBtn();
		
		Kyc.typesOf_KYC_ChangeReq_Checkboxes();
		
		Kyc.RemarkTextField();
		
		Kyc.NextButton();
		
		Kyc.EyeIconbtnClick();
		
		Kyc.EditIconbtnClick();
		
		Kyc.NextButton();
				
		Kyc.MenuButton();
		
		Kyc.LogOut();
			
	}
	
//	,dependsOnMethods = "kyc_EscalateTest	
	@Test(priority =2 ,dependsOnMethods = "kyc_EscalateTest" )
	public void Kyc1_StartAndEscalate_Flow() throws AWTException, InterruptedException {
				
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KYC1_COPS_Page Kyc1=new KYC1_COPS_Page(driver);
			
		login.login("KYC1_COPS_Stag@gmail.com", "dZnZGgFV!kROcvmyDRaf");
	
		Kyc1.selectKYCUpdate();
		
		Kyc1.MakerRadioButton();
		
		Kyc1.KYC_UpdateWorkflow_Option();
		
		Kyc1.PullButton();
		
		Kyc1.PullOptionButon();
		
		Kyc1.eyeIconBtn();
		
		Kyc1.startActionButton();
		
		Kyc1.update_Commentsection();
		
		Kyc.NextButton();
		
		Kyc1.eyeIconBtn();
		
		Kyc1.escalateButton();
		
		Kyc1.update_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
	}
	
	// ,dependsOnMethods = "Kyc1_StartAndEscalate_Flow"
	@Test(priority =3 ,dependsOnMethods = "Kyc1_StartAndEscalate_Flow")
	public void sao_ApplicationCorrected_Flow() throws AWTException, InterruptedException {
				
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KYC1_COPS_Page Kyc1=new KYC1_COPS_Page(driver);
		SAOPage SAO= new SAOPage(driver);
		
		login.login("SAO_COPS_Stag@gmail.com", "6xXoKo@se0GUqZQIeWwi");
		
		Kyc1.eyeIconBtn();
		
		SAO.editIconClick();
		
		Kyc.NextButton();
		
		SAO.applicationCorrectedBtn();
		
		Kyc1.update_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
	}
	
	// ,dependsOnMethods = "sao_ApplicationCorrected_Flow"
	@Test(priority =4 ,dependsOnMethods = "sao_ApplicationCorrected_Flow")
	public void Kyc1_UpdateFlow() throws AWTException, InterruptedException {
				
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KYC1_COPS_Page Kyc1=new KYC1_COPS_Page(driver);
			
		login.login("KYC1_COPS_Stag@gmail.com", "dZnZGgFV!kROcvmyDRaf");
		
		Kyc1.eyeIconBtn();
		
		Kyc1.updateButton();
		
		Kyc1.update_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
	}
	
	// , dependsOnMethods = "Kyc1_UpdateFlow"
	@Test(priority = 5	, dependsOnMethods = "Kyc1_UpdateFlow" )
	public void Kyc2_ReWorkFlow() throws InterruptedException, AWTException {
		
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KYC1_COPS_Page Kyc1=new KYC1_COPS_Page(driver);
		
		login.login("KYC2_COPS_Stag@gmail.com", "EDaFiUnEMTN#~g96vovH");
		
		Kyc1.selectKYCUpdate();
		
		Kyc1.checkerRadioButton();
		
		Kyc1.KYC_UpdateWorkflow_Option();
		
		Kyc1.PullButton();
		
		Kyc1.PullOptionButon();
		
		Kyc1.eyeIconBtn();
		
		Kyc1.reWorkButton();
		
		Kyc1.update_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
	}
	
	// , dependsOnMethods = "Kyc2_ReWorkFlow"
	@Test(priority = 6 , dependsOnMethods = "Kyc2_ReWorkFlow")
	public void kycRework_Complete_Flow() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KYC1_COPS_Page Kyc1=new KYC1_COPS_Page(driver);
		
		login.login("KYC1_COPS_Stag@gmail.com", "dZnZGgFV!kROcvmyDRaf");
		
		Kyc1.eyeIconBtn();
		
		Kyc1.reWorkcompleteButton();
		
		Kyc1.update_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
			
	}
	
	// , dependsOnMethods = "kycRework_Complete_Flow"
		@Test(priority = 7	, dependsOnMethods = "kycRework_Complete_Flow" )
		public void Kyc2CompleteFlow() throws InterruptedException, AWTException {
			
			LoginPage login = new LoginPage(driver);
			KYCPage Kyc= new KYCPage(driver);
			KYC1_COPS_Page Kyc1=new KYC1_COPS_Page(driver);
			
			login.login("KYC2_COPS_Stag@gmail.com", "EDaFiUnEMTN#~g96vovH");
			
			Kyc1.eyeIconBtn();
			
			Kyc1.completeButton();
			
			Kyc1.branchAu_YesRadiobtn();
			
			Kyc1.update_Commentsection();
			
			Kyc.NextButton();
			
			Kyc.MenuButton();
			
			Kyc.LogOut();
			
		}		
		
}
