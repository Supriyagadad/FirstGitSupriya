package com.test.Newmavenprojetc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectwomen {
	
	@FindBy(xpath="//a[@title='Women']")
	WebElement selecttshirt;
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	WebElement tshirtselct;
	
	@FindBy(id="add_to_cart")
	WebElement addtocard;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedbutton;
	
	@FindBy(xpath="(//span[contains(text(),'Proceed to checkout')])[2]")
	WebElement secondcheckout;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement thirdcheckout;
	
	@FindBy(id="cgv")
	WebElement  agreebutton;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement fourthcheckout;
	
	
	
WebDriver driver;

	public selectwomen(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
}

	public void slection() throws InterruptedException
	{
		// WebElement selecttshirt =driver.findElement(By.xpath("//a[@title='Women']"));
		    selecttshirt.click();
		    
		  // WebElement tshirtselct= driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		   tshirtselct.click();
		    
		   //WebElement addtocard=driver.findElement(By.id("add_to_cart"));
		   addtocard.click();
		   
		   Thread.sleep(5000);
		 // WebElement proceedbutton =driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		  proceedbutton.click();
		  
		  Thread.sleep(5000);
		 // WebElement secondcheckout=driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		  secondcheckout.click();
		  
		  //WebElement thirdcheckout=driver.findElement(By.xpath("//button[@type='submit']"));
		  thirdcheckout.click();
		  
		  //WebElement agreebutton= driver.findElement(By.id("cgv"));
		  agreebutton.click();
		  
		  //WebElement fourthcheckout= driver.findElement(By.xpath("//*[@type='submit']"));
		  fourthcheckout .click();
	}
	

}
