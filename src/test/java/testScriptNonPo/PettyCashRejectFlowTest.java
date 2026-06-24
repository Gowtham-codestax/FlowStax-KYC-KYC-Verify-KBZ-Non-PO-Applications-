package testScriptNonPo;

import java.awt.AWTException;

import org.genricPackage.BaseClass;
import org.nonPoAppPages.FinanceAuthorizerPage;
import org.nonPoAppPages.PettyCashPage;
import org.pages.DashBoardPage;
import org.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilityPackage.ListenersClass;


@Listeners(ListenersClass.class)
public class PettyCashRejectFlowTest  extends BaseClass{

 	@Test(priority = 1)
	public void pettyCash_Reject_Flow() throws InterruptedException, AWTException {
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		PettyCashPage petty= new PettyCashPage(driver);
		
		login.login("branch_npo@gmail.com", "P$2EorwK5cyc@Ar-8NOT");
	
		
		DashBoard.clickAddNew();
		
		petty.selectCategory();
		
		petty.pettyCashOption();
		
		petty.invoice_NumField();
		
		petty.invoiceCreationDate();
		
		petty.vendorDetailsType();
		
		petty.vendorID();
		
		petty.searchFor_vendorIDField();
		
		petty.MGR_PvtLtdiD();
		
		petty.currencyType();
		
		petty.mpt();;
		
		petty.descriptionTxtField();
		
		petty.commodityType();
		
		petty.dummy_Desc_CodePOPtion();
		
		petty.QuantityField();
		
		petty.priceField();
		
		petty.uploadAttachments_Btn();
		
		petty.NextButton();
		
		petty.EyeIconbtnClick();
		
		petty.EditIconbtnClick();
		
		petty.NextButton();
		
		petty.submitButton();
		
		petty.UpdateSatgeCMNTbox();
		
		petty.NextButton();
		
		petty.MenuButton();
		
		petty.LogOut();
		
	}
	
	// ,dependsOnMethods = "pettyCash_Reject_Flow"
	
	@Test(priority = 2 )
	public void financeAuthorizerFlow() throws AWTException, InterruptedException {
		

		LoginPage login = new LoginPage(driver);
		PettyCashPage petty= new PettyCashPage(driver);
		FinanceAuthorizerPage financeAuthorizer= new FinanceAuthorizerPage(driver);
		
		login.login("finance_authorizer_npo@gmail.com", "bbJyL6et2OCjao4hy30B");
		
	//	financeAuthorizer.nonPoProcess_Option();
		
		financeAuthorizer.EyeIconbtnClick();
		
		financeAuthorizer.approveButton();
		
		financeAuthorizer.UpdateSatgeCMNTbox();
		
		petty.NextButton();
		
		petty.MenuButton();
		
		petty.LogOut();
		
		
	}
	
	// ,dependsOnMethods = "financeAuthorizerFlow"
	
	@Test(priority = 3 )
	public void dcfoFlow() throws InterruptedException, AWTException {
		

		LoginPage login = new LoginPage(driver);
		PettyCashPage petty= new PettyCashPage(driver);
		FinanceAuthorizerPage financeAuthorizer= new FinanceAuthorizerPage(driver);
		
		login.login("dcfo_npo@gmail.com", "Pn!NskTNlvfJa8k~TRb$");
		
		financeAuthorizer.nonPoProcess_Option();
		
		financeAuthorizer.EyeIconbtnClick();
		
		financeAuthorizer.approveButton();
		
		financeAuthorizer.UpdateSatgeCMNTbox();
		
		petty.NextButton();
		
		petty.MenuButton();
		
		petty.LogOut();
		
	}
	
	// ,dependsOnMethods = "dcfoFlow"
	
	@Test(priority = 4,dependsOnMethods = "dcfoFlow")
	public void CFOFlow() throws AWTException, InterruptedException {
		

		LoginPage login = new LoginPage(driver);
		PettyCashPage petty= new PettyCashPage(driver);
		FinanceAuthorizerPage financeAuthorizer= new FinanceAuthorizerPage(driver);
		
		login.login("cfo_npo@gmail.com", "9JnmmenusfeIqPebx~m~");
		
	//	financeAuthorizer.nonPoProcess_Option();
		
		financeAuthorizer.EyeIconbtnClick();
		
		financeAuthorizer.approveButton();
		
		financeAuthorizer.UpdateSatgeCMNTbox();
		
		petty.NextButton();
		
		petty.MenuButton();
		
		petty.LogOut();
		
	}
	
	// ,dependsOnMethods = "CFOFlow"
	@Test(priority = 5,dependsOnMethods = "CFOFlow")
	public void DCEOFlow() throws AWTException, InterruptedException {
		
		
		LoginPage login = new LoginPage(driver);
		PettyCashPage petty= new PettyCashPage(driver);
		FinanceAuthorizerPage financeAuthorizer= new FinanceAuthorizerPage(driver);
		
		login.login("dceo_npo@gmail.com", "I4xKC2BBKV@5syekUwx7");
		
	//	financeAuthorizer.nonPoProcess_Option();
		
		financeAuthorizer.EyeIconbtnClick();
		
		financeAuthorizer.approveButton();
		
		financeAuthorizer.UpdateSatgeCMNTbox();
		
		petty.NextButton();
		
		petty.MenuButton();
		
		petty.LogOut();
		
	}
	
	
	
	@Test(priority = 6,dependsOnMethods = "DCEOFlow")
	public void CEOFlow() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		PettyCashPage petty= new PettyCashPage(driver);
		FinanceAuthorizerPage financeAuthorizer= new FinanceAuthorizerPage(driver);
		
		login.login("ceo_npo@gmail.com", "lBwHwJLyQX7qW#!OO~1A");
		
	//	financeAuthorizer.nonPoProcess_Option();
		
		financeAuthorizer.EyeIconbtnClick();
		
		financeAuthorizer.approveButton();
		
		financeAuthorizer.UpdateSatgeCMNTbox();
		
		petty.NextButton();
		
		petty.MenuButton();
		
		petty.LogOut();
		
	}
	
	// ,dependsOnMethods = "CEOFlow"
	@Test(priority = 7,dependsOnMethods = "CEOFlow")
	public void FinanceRenocileFlow() throws AWTException, InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		PettyCashPage petty= new PettyCashPage(driver);
		FinanceAuthorizerPage financeAuthorizer= new FinanceAuthorizerPage(driver);
		
		login.login("finance_reconcile_npo@gmail.com", "I9y0qsXlTx2u37ygJwis");
		
//		financeAuthorizer.nonPoProcess_Option();
		
		financeAuthorizer.EyeIconbtnClick();
		
		financeAuthorizer.rejectButton();
		
		financeAuthorizer.UpdateSatgeCMNTbox();
		
		petty.NextButton();
		
		petty.MenuButton();
		
		petty.LogOut();
		
	}
	

	// ,dependsOnMethods = "FinanceRenocileFlow"
	
	@Test(priority = 8 ,dependsOnMethods = "FinanceRenocileFlow" )
	public void branchFlow() throws InterruptedException, AWTException {
		
		LoginPage login = new LoginPage(driver);
		PettyCashPage petty= new PettyCashPage(driver);
		
		login.login("branch_npo@gmail.com", "P$2EorwK5cyc@Ar-8NOT");
		
		petty.EyeIconbtnClick();
		
		petty.MenuButton();
		
		petty.LogOut();
		
	
	}
}
