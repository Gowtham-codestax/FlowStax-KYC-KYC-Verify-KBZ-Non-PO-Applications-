package testScriptNonPo;
import java.awt.AWTException;
import org.genricPackage.BaseClass;
import org.nonPoAppPages.PettyCashPage;
import org.pages.DashBoardPage;
import org.pages.LoginPage;
import org.testng.annotations.Test;

public class FuctionPettyCashFlowTest extends BaseClass{
	
	@Test
	public void FuctionPettyCashApproveTest() throws InterruptedException, AWTException {
		
		LoginPage login = new LoginPage(driver);
		DashBoardPage DashBoard= new DashBoardPage(driver);
		PettyCashPage petty= new PettyCashPage(driver);
		
		login.login("fuction_npo@gmail.com", "JS2!fjq#v~$RiHb1OcV~");
		
		petty.nonPoProcess_Option();
		
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
		
		petty.atMCR_CodePOPtion();;
		
		petty.QuantityField();
				
	//	petty.unitOPtion();
		
		petty.priceField();
		
		petty.showMenuButton();
		
		petty.duplicateRowButton();
		
		petty.uploadAttachments_Btn();
			
		petty.NextButton();
			
		petty.EyeIconbtnClick();
		
		petty.EditIconbtnClick();
		
		petty.lineItems_2ndRowEditing();
		
		petty.NextButton();
		
		petty.submitButton();
		
		petty.UpdateSatgeCMNTbox();
		
		petty.NextButton();
		
		petty.MenuButton();
		
		petty.LogOut();
		
		
	}

}
