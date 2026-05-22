package testScriptsKycVerification;

import java.awt.AWTException;

import org.KycVerificationAppPages.ClustuerManger1Page;
import org.KycVerificationAppPages.KBZPayCenterChecker1Page;
import org.KycVerificationAppPages.KBZPayCenterMaker1Page;
import org.KycVerificationAppPages.KycOfficerPage;
import org.KycVerificationAppPages.customerUrgentRequestPages;
import org.genricPackage.BaseClass;
import org.pages.DashBoardPage;
import org.pages.KYCPage;
import org.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilityPackage.ListenersClass;

@Listeners(ListenersClass.class)
public class customerUrgentRequestFlow extends BaseClass {

	@Test(priority = 1)
	public void CustomerUrgentRequestFlowTest()throws AWTException, InterruptedException {
		
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		customerUrgentRequestPages customerUgerntreq= new customerUrgentRequestPages(driver);
		
		
		login.login("branch_sr@gmail.com", "HybjyJcjHWAYtgTvXbe!");
	
		DashBoard.clickAddNew();
		
		customerUgerntreq.ticketpriority();
		
		customerUgerntreq.customerOnboardDate();
		
		customerUgerntreq.customerOnboardChannel();
		
		customerUgerntreq.selfOnboarding();
		
		customerUgerntreq.enteringCustomerDetails();
		
		customerUgerntreq.serviceRequestType();
		
		customerUgerntreq.customerUrgentRequestOption();
		
		customerUgerntreq.typesofserviceReqTextFiedl();
		
		customerUgerntreq.passportIDproofRadiobtn();
		
		customerUgerntreq.passportnumField();
		
		customerUgerntreq.uploadPassport_FrontPageBtn();
		
		customerUgerntreq.uploadPassport_BackpageBtn();
		
		customerUgerntreq.uploadRequestForm_Btn();
		
		customerUgerntreq.customerSegmentType();
		
		customerUgerntreq.uploadSecondaryIDfrontPage_Btn();
		
		customerUgerntreq.uploadSecondaryIDBackPage_Btn();
		
		customerUgerntreq.uploadAdditionalDocument_Btn();
		
		customerUgerntreq.UploadSelfPhoto();
		
		Kyc.NextButton();
		
	/*	
		customerUgerntreq.SendCheckerButtonClick();
		
		customerUgerntreq.KBZcenterCheckerRadioButon();
		
		customerUgerntreq.UpdateSatgeCMNTbox();
		
		Kyc.NextButton();
		*/
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
		
	}
	
	// 
	@Test(priority = 2,dependsOnMethods = "CustomerUrgentRequestFlowTest")
	public void KycOfficerFlow() throws AWTException , InterruptedException{
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KycOfficerPage KycOfficer1= new KycOfficerPage(driver);
		customerUrgentRequestPages customerUgerntreq= new customerUrgentRequestPages(driver);
		
		
		login.login("kycofficer_sr@gmail.com", "DD5GK7Ki6W18NgYoQPA8");
		
		KycOfficer1.PullOptionButon();
		
		KycOfficer1.eyeIconBtn();
		
		KycOfficer1.resolvedbtn();
		
		KycOfficer1.ApprovalStatusDropdown();
		
		KycOfficer1.ApprovedButton();
		
		KycOfficer1.RemarkCMNTbox();
		
		KycOfficer1.UpdateSatgeCMNTbox();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();	
	
	}
	
	
	/*
	// , dependsOnMethods = "CustomerUrgentRequestFlowTest"
	// @Test(priority = 2)
	public void  KBZPayCenterChecker1Flow() throws InterruptedException, AWTException {
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KBZPayCenterChecker1Page KbzPaycentercheck1= new KBZPayCenterChecker1Page(driver);
		
		login.login("KBZPayCenter_checker1@gmail.com", "w8O$cz~CI6hV7L-tc4SG");
		
		KbzPaycentercheck1.KYCserviceReqOPtion();
		
		KbzPaycentercheck1.eyeIconBtn();
		
		KbzPaycentercheck1.sendtoKYCOfficerbtn();
		
		KbzPaycentercheck1.UpdateSatgeCMNTbox();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
		
	}
	
	@Test(priority = 3)
	public void KBZPayCenterMaker1Flow() throws InterruptedException, AWTException {
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KBZPayCenterChecker1Page KbzPaycentercheck1= new KBZPayCenterChecker1Page(driver);
		KBZPayCenterMaker1Page KbzPaycenterMaker1= new KBZPayCenterMaker1Page(driver);
		customerUrgentRequestPages customerUgerntreq= new customerUrgentRequestPages(driver);
		
		
		login.login("kbzpaycenter_sr@gmail.com", "4vI$kVgf6hFwdyG2qnXR");
		
		KbzPaycenterMaker1.eyeIconBtn();
		
		KbzPaycenterMaker1.reSubmitBtn();
		
		customerUgerntreq.KBZcenterCheckerRadioButon();
		
	//	customerUgerntreq.CluserManagerRadioButtton();
		
		KbzPaycentercheck1.UpdateSatgeCMNTbox();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
		
		
	}
	
//	@Test(priority = 4)
	public void ClustuerManger1PageFlow() throws InterruptedException, AWTException {
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KBZPayCenterChecker1Page KbzPaycentercheck1= new KBZPayCenterChecker1Page(driver);
		KBZPayCenterMaker1Page KbzPaycenterMaker1= new KBZPayCenterMaker1Page(driver);
		customerUrgentRequestPages customerUgerntreq= new customerUrgentRequestPages(driver);
		ClustuerManger1Page ClustuerManger1 = new ClustuerManger1Page(driver);
		
		login.login("clustermgr1@gmail.com", "g4-22t~zaco52DVuZfG7");
		
		KbzPaycentercheck1.KYCserviceReqOPtion();
		
		ClustuerManger1.eyeIconBtn();
		
		ClustuerManger1.sendtoKYCOfficerbtn();
		
		KbzPaycentercheck1.UpdateSatgeCMNTbox();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
		
	}
	
//	@Test(priority = 4)
	public void KBZPaycenterCheckerFlow() throws InterruptedException, AWTException {
		
		driver.get("https://staging.flow.stax.run/#/login");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		KYCPage Kyc= new KYCPage(driver);
		KBZPayCenterChecker1Page KbzPaycentercheck1= new KBZPayCenterChecker1Page(driver);
		KBZPayCenterMaker1Page KbzPaycenterMaker1= new KBZPayCenterMaker1Page(driver);
		customerUrgentRequestPages customerUgerntreq= new customerUrgentRequestPages(driver);
		
		
		login.login("KBZPayCenter_checker1@gmail.com", "w8O$cz~CI6hV7L-tc4SG");
		
		KbzPaycentercheck1.KYCserviceReqOPtion();
		
		KbzPaycentercheck1.eyeIconBtn();
		
		KbzPaycentercheck1.sendtoKYCOfficerbtn();
		
		KbzPaycentercheck1.UpdateSatgeCMNTbox();
		
		Kyc.NextButton();
		
		Kyc.MenuButton();
		
		Kyc.LogOut();
		
	}
	
	*/
	
	
	
}
