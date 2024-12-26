package com.api.Listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListeners implements ITestListener {
    private static final Logger logger= LogManager.getLogger(TestListeners.class);
    public void onStart(ITestContext context) {
        logger.info("Test Suite started");
    }
   public void onTestStart(ITestResult result) {
       logger.info("Started !!"+ result.getMethod().getMethodName());

       logger.info("Description!! "+result.getMethod().getDescription());

   }

    public void onFinish(ITestContext context) {
        logger.info("Test Suite finished");
    }
    public void onTestSuccess(ITestResult result) {
        logger.info("passed!! "+ result.getMethod().getMethodName());
        logger.info("Description!! "+result.getMethod().getDescription());

    }

    public void onTestFailure(ITestResult result) {
        logger.error("failed- "+ result.getMethod().getMethodName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info("skipped!! "+ result.getMethod().getMethodName());

    }
}
