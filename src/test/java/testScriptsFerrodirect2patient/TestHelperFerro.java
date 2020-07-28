package testScriptsFerrodirect2patient;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class TestHelperFerro {
	public WebDriver driver;
	  
	@BeforeMethod
	  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\chromeDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://ferro.direct2patient.com/");
	  driver.manage().window().maximize();
	 
  }

	@AfterMethod
	   public void afterMethod() {
	  //driver.close();
	  }

}
