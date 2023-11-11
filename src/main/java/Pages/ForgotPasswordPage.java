package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BasePage {

    By forgotPasswordLink = By.id("forgotPasswordLink");
    By usernameField = By.id("username");
    By continueButton = By.id("continue");

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void clickForgotPassword() {
        driver.findElement(forgotPasswordLink).click();
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

	public void verifyResetMessage() {
		// TODO Auto-generated method stub
		
	}

	public void enterUsernameForReset(String string) {
		// TODO Auto-generated method stub
		
	}

	public void clickSubmit() {
		// TODO Auto-generated method stub
		
	}
}
