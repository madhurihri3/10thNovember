package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    By userMenuDropdown = By.id("usermenu");
    By logoutLink = By.id("logout");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void logout() {
        driver.findElement(userMenuDropdown).click();
        driver.findElement(logoutLink).click();
    }

	public void verifyHomePageIsDisplayed() {
		// TODO Auto-generated method stub
		WebElement homeElement = driver.findElement(By.id("some_id")); // Replace "some_id" with the actual ID of the element

	    // Verify that the home element is displayed
	    if (homeElement.isDisplayed()) {
	        System.out.println("Home page is displayed");
	    } else {
	        System.out.println("Home page is not displayed");
	    }
		
	}

	public void verifyHomePage() {
		// TODO Auto-generated method stub
		
	}
}
