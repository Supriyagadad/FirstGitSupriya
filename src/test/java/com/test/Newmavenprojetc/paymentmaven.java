package com.test.Newmavenprojetc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class paymentmaven {
	
	@FindBy(xpath="//a[@title='title=\"Pay by bank wire\"]")
	WebElement paybybankwire;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement confirmorder;
	
	WebDriver driver;

  public paymentmaven(WebDriver driver2) {
   driver=driver2;
}

public void paymentprocess()
{
	 //WebElement paybybankwire= driver.findElement(By.xpath("//a[@title='title=\"Pay by bank wire\"]"));
	  paybybankwire.click();
	  
	// WebElement confirmorder= driver.findElement(By.xpath("//button[@type='submit']"));
	 confirmorder.click();
	
	}
	
}
