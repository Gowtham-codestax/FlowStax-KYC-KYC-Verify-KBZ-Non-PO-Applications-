package utilityPackage;


import java.io.PrintWriter;
import java.io.StringWriter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenersClass implements ITestListener {

    ExtentTest test;

     @Override
    public void onStart(ITestContext context) {

        ExtentManager.getReportInstance();
    }
    
  

    @Override
    public void onTestStart(ITestResult result) {

        test = ExtentManager.getReportInstance()
                .createTest(result.getMethod().getMethodName());

        test.log(Status.INFO,
                "Test Execution Started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.log(Status.PASS,
                "Test Passed Successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.log(Status.FAIL,
                "Test Failed");

        test.log(Status.FAIL,
                result.getThrowable());

    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.log(Status.SKIP,
                "Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        ExtentManager.getReportInstance().flush();
    }
    
    
}