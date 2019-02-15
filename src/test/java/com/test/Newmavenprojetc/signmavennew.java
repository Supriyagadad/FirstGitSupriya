package com.test.Newmavenprojetc;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signmavennew {
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement signin;
	
	@FindBy(id="email_create")
	WebElement emailtext;
	
	@FindBy(id="SubmitCreate")
	WebElement clickcreate;
	
WebDriver driver;
	
	public signmavennew(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
}

	public void signin()
	{
		//WebElement signin=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		signin.click();

		//WebElement emailtext=driver.findElement(By.id("email_create"));
		emailtext.sendKeys("opi12@gmail.com");
		
		//WebElement clickcreate=driver.findElement(By.id("SubmitCreate"));
		clickcreate.click();
		

	}
	
}
