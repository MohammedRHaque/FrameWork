package progress.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	public MainPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath = "(//p[contains(., 'Auto ')])[1]")
	public WebElement autoButton ;
	@FindBy (xpath = "//label[@for='zipCode_overlay']")
	public WebElement zipcodeText ;

}
