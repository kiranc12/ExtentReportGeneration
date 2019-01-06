package extent;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//https://jar-download.com/artifacts/com.aventstack/extentreports/3.1.5/source-code
public class ExtentReportPro {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		//create object of date
		Date date = new Date();
		//replacing the : with _
		String time = date.toString().replaceAll(":", "_");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.guru99.com/selenium-tutorial.html");
		//Giving the path to store the report in the given location
		String reportPath = "E:\\TYSS\\Java_Basics\\Saturday\\report\\"+time+".html";
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(reportPath);
		//To create report
		ExtentReports extent = new ExtentReports();
		//to add the report to the report file
		extent.attachReporter(reporter);
		//to create the test report
		ExtentTest logg = extent.createTest("Main");
		//to display the info about the  test method
		logg.log(Status.INFO, "test is running");
		//to take screen shot for the given line
		String screenPath = "E:\\TYSS\\Java_Basics\\Saturday\\screenShots"+time+".png";
		logg.addScreenCaptureFromPath(screenPath);
		// to take the screen shot 
		logg.pass("failed due to some reason", MediaEntityBuilder.createScreenCaptureFromPath(screenPath).build());
		//to store the report into given folder
		extent.flush();
		
	}

}
