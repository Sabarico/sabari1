package com.ecommerceDomain.Wipro.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerceDomain.Wipro.genericlib.BaseClass;

public class CoreJavaPage extends BaseClass {
@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
private WebElement corejava;
public CoreJavaPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getCorejava() {
	return corejava;
}
public WishlistPage corejavaselenium(WebDriver driver) {
	corejava.click();
	return new WishlistPage(driver);
}
}