package testsScriptKBZPayService;
import java.awt.AWTException;

import org.genricPackage.BaseClass;
import org.kbzPayAppPages.accountClosePage;
import org.kbzPayAppPages.closingLoopPage;
import org.kbzPayAppPages.tsoLoginPage;
import org.pages.DashBoardPage;
import org.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class accountCloseTest extends BaseClass{

	
	@Test(priority = 1)
	public void AccountCloseTest() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
	
		accClose.kbzPayServiceOPtion();
		
		DashBoard.clickAddNew();
		
		accClose.selectType();
		
		accClose.accCloseOption();
		
		accClose.branchPhnnUmberField();
		
		accClose.cusName();
		
		accClose.DateOfBirth();
		
		accClose.UploadCustomerFace();
		
		accClose.passportIDproof();
		
		accClose.passportNumField();
		
		accClose.uploadNewPassport_PageBtn();
		
		accClose.uploadOldPassport_PageBtn();
		
		accClose.addressFiled();
		
		accClose.fathersNameFiedl();
		
		accClose.currentBalanceNumFiedl();
		
		accClose.phoneNumField();
		
		accClose.bankStaffApprovalformBtn();
		
		accClose.infoOf3transaction_Btn();
		
		accClose.sparrowTicketNumField();
		
		accClose.oldNRC_NumField();
		
		accClose.sparrowTicker_DateandTime();
		
		accClose.alternate_phoneNumField();
		
		accClose.reasonTxtFiled();
		
		accClose.NextButton();
		
		accClose.EyeIconbtnClick();
		
		accClose.assignToTSOBtn();
		
		accClose.recommedUploadLeter_YesRadioBtn();
		
		accClose.signatureVerfied_YesRadioBtn();
		
		accClose.docChecked_YesRadioBtn();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();
		
	//	login.login("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");
		
	}
	  
	@Test(priority = 2,dependsOnMethods = "AccountCloseTest")
	public void TSOLoginFlow() throws AWTException, InterruptedException {
		
	//	driver.get("https://staging.flow.stax.run/#/login");
	//	Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);	
		tsoLoginPage tso= new tsoLoginPage(driver);
		
		login.login("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");
		
		tso.PullOptionButon();
		
		tso.accountClose_Option();
		
		accClose.EyeIconbtnClick();
	
		tso.makeForcorrectionbutton();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
	
		accClose.MenuButton();
		
		accClose.LogOut();	
		
	
	}
	
	// , dependsOnMethods = "TSOLoginFlow"
	@Test(priority = 3, dependsOnMethods = "TSOLoginFlow")
	public void branchLogin() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		
		login.login("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");
		
		accClose.kbzPayServiceOPtion();
		
		accClose.EyeIconbtnClick();
		
		accClose.applicationCorrectedButton();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();	
		
		
	}
	
	@Test(priority = 4,dependsOnMethods ="branchLogin")
	public void tsoLogin2() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		tsoLoginPage tso= new tsoLoginPage(driver);
		
		login.login("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");
		
		accClose.EyeIconbtnClick();
		
		tso.resolvebutton();
		
		accClose.UpdateStage_Commentsection();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();	
		
		
			
	}
	
	
	@Test(priority = 5,dependsOnMethods = "tsoLogin2")
	public void closingLoopLogin() throws InterruptedException, AWTException {
		
		LoginPage login = new LoginPage(driver);
		accountClosePage accClose= new accountClosePage(driver);
		closingLoopPage closingLoop= new closingLoopPage(driver);
		
		login.login("closeloopteam@gmail.com", "Nw5ZQMJNx9uN85AJb0n0");
		
		closingLoop.EyeIconbtnClick();
		
		closingLoop.closebutton();
		
		accClose.NextButton();
		
		accClose.MenuButton();
		
		accClose.LogOut();			
	}
}
