package com.abc.magentoObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
	WebDriver driver;
	@FindBy(linkText="My Account")
	WebElement myacct;
	
	public Welcome(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);/* we are using page factory model in this type of */
	}
	public void ClickOnMyAccount()
	{
		myacct.click();
	}

}

