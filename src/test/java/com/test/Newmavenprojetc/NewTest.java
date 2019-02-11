package com.test.Newmavenprojetc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	

	
  @Test
  public void f() throws InterruptedException {
	  
	  signmavennew ref1= new signmavennew(driver);
	  ref1.signin();
	  
	  regmaven ref2= new regmaven(driver);
	  ref2.registergation();
	  
	  selectwomen ref3= new selectwomen(driver);
	  ref3.slection();
	  
	  paymentmaven ref4= new paymentmaven(driver);
	  ref4.paymentprocess();
  }
  @Parameters("brow")
  
  @BeforeTest
  public void beforeTest(String xyzabc) {
	 
	  String browser=xyzabc;
			  
	  if(browser.equalsIgnoreCase("Firefox"))
	  
	  {
		  System.setProperty("webdriver.gecko.driver","Resource/geckodriver.exe");
		  driver =new FirefoxDriver();
	  }
	  else if(browser.equalsIgnoreCase("IE"))
	  {
	  System.setProperty("webdriver.ie.driver","Resource/IEDriverServer.exe");
	  driver =new InternetExplorerDriver();
	  }
	  else
	  {
		  System.out.println("wrong browser");
	  }
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  driver.get("http://automationpractice.com/index.php?controller=order ");
	 
  }
  
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
