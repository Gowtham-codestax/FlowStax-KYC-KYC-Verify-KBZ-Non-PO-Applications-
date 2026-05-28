package utilityPackage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	 public static ExtentReports extent;

	    public static ExtentReports getReportInstance() {

	        if (extent == null) {

	            String reportPath = System.getProperty("user.dir")
	                    + "/reports/ExtentReport.html";

	            ExtentSparkReporter spark =
	                    new ExtentSparkReporter(reportPath);

	            spark.config().setReportName("FlowStax Automation Report");

	            spark.config().setDocumentTitle("Parallel Execution of [ KBZPay Account Close Flow ] and [KYC Verify Cutomer Urgent Flow ]- Automation Results");

	            extent = new ExtentReports();

	            extent.attachReporter(spark);
	            
	            spark.config().setTheme(Theme.DARK);

	            extent.setSystemInfo("Tester", "Gowtham");

	            extent.setSystemInfo("Environment", "Staging");

	            extent.setSystemInfo("Browser", "Chrome");
	        }

	        return extent;
	    }

}
