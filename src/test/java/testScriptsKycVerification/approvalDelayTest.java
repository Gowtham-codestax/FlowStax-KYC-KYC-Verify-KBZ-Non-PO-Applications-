package testScriptsKycVerification;

import java.awt.AWTException;

import org.KycVerificationAppPages.KBZPayCenterChecker1Page;
import org.KycVerificationAppPages.KycOfficerPage;
import org.KycVerificationAppPages.approvalDelayPage;
import org.KycVerificationAppPages.customerUrgentRequestPages;
import org.genricPackage.BaseClass;
import org.pages.DashBoardPage;
import org.pages.KYCPage;
import org.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class approvalDelayTest extends BaseClass {
	
	
	@Test(priority = 1)
	public void approvalDelayFlow() throws AWTException, InterruptedException {
		
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		approvalDelayPage approvalDelay= new approvalDelayPage(driver);
		
		login.login("kbzpaycenter_sr@gmail.com", "4vI$kVgf6hFwdyG2qnXR");

		DashBoard.clickAddNew();
		
		approvalDelay.ticketPriorityMedium();
		
		approvalDelay.customerOnboardDate();
		
		approvalDelay.customerOnboardChannel();
		
		approvalDelay.selfOnboarding();
		
		approvalDelay.enteringCustomerDetails();
		
		approvalDelay.serviceRequestType();
		
		approvalDelay.approvalDelayOption();
		
		approvalDelay.typeOfServiceRequestField();
		
		approvalDelay.passportIDProof();
		
		approvalDelay.customerPassportNumField();
		
		approvalDelay.uploadPassport_FrontPageBtn();
		
		approvalDelay.uploadPassport_BackpageBtn();
		
		approvalDelay.uploadRequestForm_Btn();
		
		approvalDelay.customerSegmentType();
		
		approvalDelay.uploadSecondaryIDfrontPage_Btn();
		
		approvalDelay.uploadSecondaryIDBackPage_Btn();
		
		approvalDelay.uploadAdditionalDocument_Btn();

		approvalDelay.UploadNRCRecmendationLetter();
		
		approvalDelay.UploadSelfPhoto();	
		
		approvalDelay.NextButton();
		
		approvalDelay.EyeIconbtnClick();
		
		approvalDelay.sendToCheckerBtn();
		
		approvalDelay.kbzcenterChecker_RadioBtn();
		
		approvalDelay.UpdateSatgeCMNTbox();
		
		approvalDelay.NextButton();

		Kyc.MenuButton();
		
		Kyc.LogOut();
		
		
	}
	
	// ,dependsOnMethods = "approvalDelayFlow"
	@Test(priority = 2 ,dependsOnMethods = "approvalDelayFlow")
	public void  KBZPayCenterCheckerFlow() throws InterruptedException, AWTException {
		
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KBZPayCenterChecker1Page KbzPaycentercheck1= new  KBZPayCenterChecker1Page(driver);
		
		
		login.login("KBZPayCenter_checker1@gmail.com", "w8O$cz~CI6hV7L-tc4SG");
	
	//	KbzPaycentercheck1.KYCserviceReqOPtion();
		
		KbzPaycentercheck1.eyeIconBtn();
		
		KbzPaycentercheck1.sendtoKYCOfficerbtn();
		
		KbzPaycentercheck1.UpdateSatgeCMNTbox();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
		
	}
	
	@Test(priority = 3,dependsOnMethods = "KBZPayCenterCheckerFlow")
	public void kycOfficerFlow() throws InterruptedException, AWTException {
		

		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KycOfficerPage KycOfficer1= new KycOfficerPage(driver);
		
		login.login("kycofficer_sr@gmail.com", "DD5GK7Ki6W18NgYoQPA8");
		
		KycOfficer1.PullOptionButon();
		
		KycOfficer1.eyeIconBtn();
		
		KycOfficer1.resolvedbtn();
		
		KycOfficer1.ApprovalStatusDropdown();
		
		KycOfficer1.rejectedButton();
		
		KycOfficer1.RemarkCMNTbox();
		
		KycOfficer1.UpdateSatgeCMNTbox();
		
		Kyc.NextButton();
		
		KycOfficer1.eyeIconBtn();
		
		KycOfficer1.downloadPDFButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
				
	}
	

}
