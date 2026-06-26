package testsScriptsCentralOps;

import java.awt.AWTException;

import org.CentralOpsPages.DashBoardPage;
import org.CentralOpsPages.KYC1_COPS_Page;
import org.CentralOpsPages.KYCPage;
import org.CentralOpsPages.LoginPage;
import org.genricPackage.BaseClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class KYCFlowTest extends BaseClass {

	
	
	@Test(priority = 1 )
	public void kycFlowTest() throws AWTException, InterruptedException {
		
		
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
	
//	,dependsOnMethods = "kycFlowTest"
	
	@Test(priority =2 ,dependsOnMethods = "kycFlowTest")
	public void Kyc1Flow() throws AWTException, InterruptedException {
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
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
		
		Kyc1.updateButton();
		
		Kyc1.update_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
	}
	
	// , dependsOnMethods = "Kyc1Flow"
	@Test(priority = 3, dependsOnMethods = "Kyc1Flow" )
	public void Kyc2Flow() throws InterruptedException, AWTException {
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
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
		
		Kyc1.completeButton();
		
		Kyc1.branchAu_YesRadiobtn();
		
		Kyc1.update_Commentsection();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
	}
	
//	@Test(priority = 4, dependsOnMethods = "Kyc2Flow" )
	 public void branchFlow() throws InterruptedException, AWTException {
		 
		 	LoginPage login = new LoginPage(driver);
			KYCPage Kyc= new KYCPage(driver);
			
			login.login("branch_COPS_stag@gmail.com", "olvH~jMjqdmX-lYdecx3");
		
			Kyc.EyeIconbtnClick();
			
			Kyc.MenuButton();
			
			Kyc.LogOut();
			
		 
	 }

}
