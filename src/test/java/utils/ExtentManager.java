package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports getReportObject(){

        String path = "src/test/resources/reports/FlipkartExtentReport.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Flipkart Automation Report");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        extent.setSystemInfo("Tester", "Automation Team");

        return extent;
    }
}