package com.test.Newmavenprojetc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.yaml.snakeyaml.events.Event.ID;

public class regmaven {
	
	
	
	@FindBy(name="id_gender")
	WebElement selecttitle;
	
	@FindBy(name="customer_firstname")
	WebElement firstname;
	
	@FindBy(id="customer_lastname")
	WebElement lastname;
	
	@FindBy(id="passwd")
	WebElement passwordmail;
	
	@FindBy(name="days")
	WebElement selectboxday;
	
	@FindBy(id="months")
	WebElement selectmonth;
	
	@FindBy(id="years")
	WebElement selctyear;
	
	@FindBy(id="newsletter")
	WebElement checkbox;
	
	@FindBy(name="company")
	WebElement companyname;
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(xpath="//*[@id='address2']")
	WebElement address2;
	
	@FindBy(id="city")
     WebElement cityname;
	
	@FindBy(id="id_state")
	WebElement selectstate;
	
	@FindBy(id="postcode")
	WebElement postcode;
	
	@FindBy(id="id_country")
	WebElement selectcountry;
	
	@FindBy(name="other")
	WebElement additionalinfo;
	
	@FindBy(xpath="//*[@id='phone']")
	WebElement  phoneno1;
	
	@FindBy(id="phone_mobile")
	WebElement phoneno2;
	
	@FindBy(name="alias")
    WebElement 	aliasaddress;
	
	@FindBy(id="submitAccount")
	WebElement registerbutton;
           
    
           
	WebDriver driver;

	public regmaven(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
}

	
	
	public void registergation()
	{
		//WebElement selecttitle=driver.findElement(By.name("id_gender"));
		selecttitle.click();
		
		//WebElement firstname=driver.findElement(By.name("customer_firstname"));
	    firstname.sendKeys("Supriya");
		
		//WebElement lastname=driver.findElement(By.id("customer_lastname"));
	    lastname.sendKeys("Gadad");
	    
	   // WebElement passwordmail=driver.findElement(By.id("passwd"));
	    passwordmail.sendKeys("er1@jkk");
	    
	    //WebElement selectboxday=driver.findElement(By.name("days"));
	    Select se=new Select(selectboxday);
	    se.selectByValue("28");
	    
	   // WebElement selectmonth=driver.findElement(By.id("months"));
	    Select se1=new Select(selectmonth);
	    se1.selectByValue("5");
	    
	   //WebElement selctyear=driver.findElement(By.id("years"));
	    Select se3=new Select(selctyear);
	    se3.selectByValue("1991");
	    
	    //WebElement checkbox=driver.findElement(By.id("newsletter"));
	    checkbox.click();
	    
	   //WebElement adfirstname= driver.findElement(By.name("firstname"));
	  // adfirstname.sendKeys("Supriya");
	   
	 //  WebElement adlastnam= driver.findElement(By.id("lastname"));
	   //adlastnam.sendKeys("Gadad");
	   
	    //WebElement companyname=driver.findElement(By.name("company"));
	    companyname.sendKeys("Net");
	    
	    //WebElement address1=driver.findElement(By.id("address1"));
	    address1.sendKeys("Rambaug colony");
	    
	   // WebElement address2=driver.findElement(By.xpath("//*[@id='address2']"));
	    address2.sendKeys("kothrud");
	 
	   // WebElement cityname=driver.findElement(By.id("city"));
	    cityname.sendKeys("Pune");
	    
	    System.out.println("welcome welcome to pune maharashtra india");
	    

	   // WebElement selectstate=driver.findElement(By.id("id_state"));
	     Select se4=new Select(selectstate);
	    se4.selectByVisibleText("Indiana");
	    
	    
	  //  WebElement postcode=driver.findElement(By.id("postcode"));
	    postcode.sendKeys("12345");
	    
	    
	    //WebElement selectcountry=driver.findElement(By.id("id_country"));
	    Select country=new Select(selectcountry);
	    country.selectByVisibleText("United States");
	    
	    
	    //WebElement additionalinfo=driver.findElement(By.name("other"));
	    additionalinfo.sendKeys("hello welcome");
	    
	  //  WebElement phoneno1=driver.findElement(By.xpath("//*[@id='phone']"));
	    phoneno1.sendKeys("9547386423");
	    
	    
	  //  WebElement phoneno2=driver.findElement(By.id("phone_mobile"));
	    phoneno2.sendKeys("9403831339");
	    
	    
	  //  WebElement aliasaddress=driver.findElement(By.name("alias"));
	    aliasaddress.sendKeys("Mumbai");
	    
	  //  WebElement registerbutton=driver.findElement(By.id("submitAccount"));
	    registerbutton.click();
	    


	}

}
