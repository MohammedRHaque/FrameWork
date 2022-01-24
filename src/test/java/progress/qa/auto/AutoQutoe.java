package progress.qa.auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;
import progress.qa.base.BaseClass;
import progress.qa.pages.MainPage;

public class AutoQutoe extends BaseClass {

	MainPage mainPage ;
	
	@BeforeMethod
	public void initElements () {
	 mainPage = new MainPage (driver) ;
			}
	
	@Test
	public void test() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
		
		
		wait.until(ExpectedConditions.elementToBeClickable(mainPage.autoButton));
		mainPage.autoButton.click();
		Thread.sleep(2000);
	
	
   wait.until(ExpectedConditions.visibilityOf(mainPage.zipcodeText));
	String outcome = mainPage.zipcodeText.getText();

	System.out.println("The code is :" + outcome);
		
	}
	
		
}
