package testsScriptsCentralOps;
import java.awt.AWTException;

import org.CentralOpsPages.CFIPages;
import org.CentralOpsPages.DashBoardPage;
import org.CentralOpsPages.Im_Banking_CIFPage;
import org.CentralOpsPages.KYCPage;
import org.CentralOpsPages.LoginPage;
import org.genricPackage.BaseClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class Im_Banking_CIFTest  extends BaseClass{

	@Test(priority = 1)
	public void im_Banking_CIFFlowTest() throws AWTException, InterruptedException {

		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		Im_Banking_CIFPage ImBanking = new Im_Banking_CIFPage(driver);
		
		login.login("branch_COPS_stag@gmail.com", "olvH~jMjqdmX-lYdecx3");
	
		DashBoard.clickAddNew();
		
		ImBanking.im_Banking_CIfOPtion();
		
		ImBanking.enterCustomerDetails();
		
		ImBanking.nrcIDproof();
		
		ImBanking.uploadNRC_Back_PageBtn();
		
		ImBanking.uploadNrcFront_PageBtn();
		
		ImBanking.nrcNumberFields();
		
		ImBanking.uploadReqForm_PageBtn();
		
		ImBanking.mobileVerifed_YesRadioBtn();
		
		ImBanking.signatureVerifed_YesRadioBtn();
		
		ImBanking.makerCheckerCompleted_YesRadioBtn();
		
		ImBanking.cifAndMakerAccCreated_inIbanking_YesRadioBtn();
		
		ImBanking.nrcVerifed_YesRadioBtn();
		
		ImBanking.typeOfCIFReCheckBoxes();
		
		Kyc.RemarkTextField();
		
		ImBanking.NextButton();
		
		Kyc.EyeIconbtnClick();
		
		ImBanking.EditIconClick();
		
		ImBanking.NextButton();
		
		ImBanking.MenuButton();
		
		Kyc.LogOut();
	}
	
	// , dependsOnMethods = "im_Banking_CIFFlowTest"
		@Test(priority = 2 )
		public void CFI_Flow() throws AWTException, InterruptedException {
			
			LoginPage login = new LoginPage(driver);
			KYCPage Kyc= new KYCPage(driver);
			CFIPages CFI = new CFIPages(driver);
			
			login.login("CIF1_COPS_Stagi@gmail.com", "kPI!~KsWwyh62TZD$ehN");
			
			CFI.selectKYCUpdate();
					
			CFI.im_BankingOption();
			
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
