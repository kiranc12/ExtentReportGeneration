package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver= new ChromeDriver();
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
