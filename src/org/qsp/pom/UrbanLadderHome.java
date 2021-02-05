package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UrbanLadderHome 
{
	public UrbanLadderHome(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-gaaction='popup.auth.close']")
	private WebElement close;
	public void closeClick() 
	{   
		close.click();
	}	
	@FindBy(xpath="//li[@class='topnav_item livingunit']")
	private WebElement living;
	public void livingMouseOver(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(living).build().perform();
	}	
	@FindBy(xpath="//span[contains(.,'Fabric Sofa Sets')]")
	private WebElement FabricSofaSets;
	public void fabricSofaSetsClick() 
	{   
		FabricSofaSets.click();
	}
	@FindBy(xpath="//img[@alt='Chelsea Adjustable Sectional Sofa (Grey) (Grey, None Custom Set - Sofas, Left Aligned 3 seater + Chaise Standard Set - Sofas, Fabric Sofa Material, Regular Sofa Size, Sectional Sofa Type)']")
	private WebElement sofa;
	public void sofaClick() 
	{   
		sofa.click();
	}
	@FindBy(xpath="//a[@class='button']")
	private WebElement button;
	public void buttonClick() 
	{   
		button.click();
	}
}
