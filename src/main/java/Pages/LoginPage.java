package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("login");
    By errorMessage = By.id("error");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    
	public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void clearPasswordField() {
        driver.findElement(passwordField).clear();
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void verifyErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(errorMessage).getText();
        assert actualErrorMessage.equals(expectedErrorMessage) : "Error message not as expected";
    }


	public void enterPassword(String password) {
		// TODO Auto-generated method stub
		driver.findElement(passwordField).sendKeys(password);
		
	}


	public ForgotPasswordPage clickForgotPasswordLink() {
		// TODO Auto-generated method stub
		return null;
	}


	public void verifyUsernameField() {
		// TODO Auto-generated method stub
		
	}


	public void checkRememberMe() {
		// TODO Auto-generated method stub
		
	}


	public void verifyRememberMeChecked() {
		// TODO Auto-generated method stub
		
	}
    
    

}
