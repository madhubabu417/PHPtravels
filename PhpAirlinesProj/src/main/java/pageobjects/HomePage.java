package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//strong[@class='m-0 text-dark']")
    private WebElement myAccountDropMenu;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
    private WebElement loginoption;
	

	
	public void clickonmyaccountdropmenu() {
		myAccountDropMenu.click();
	}
	public Loginpage selectLoginoption() {
		loginoption.click();
		return new Loginpage(driver);
	}
	
}
