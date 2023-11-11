package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Pages.HomePage;
import Pages.ForgotPasswordPage;

public class StepDefinitions {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private ForgotPasswordPage forgotPasswordPage;

    @Given("User is on the Salesforce application page")
    public void userIsOnAppPage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage("https://login.salesforce.com/");
    }

    @When("User enters username as {string}")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("User clears the password field")
    public void clearPasswordField() {
        loginPage.clearPasswordField();
    }

    @And("User clicks on the login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("Error message {string} should be displayed")
    public void verifyErrorMessage(String errorMessage) {
        loginPage.verifyErrorMessage(errorMessage);
        driver.quit();
    }

    @When("User logs in with valid username and password")
    public void userLogsInWithValidCredentials() {
        loginPage.enterUsername("madhrui@tekarch.com");
        loginPage.enterPassword("Cowdogcat56");
        loginPage.clickLogin();
    }

    @Then("Home page should be displayed")
    public void verifyHomePageIsDisplayed() {
        homePage = new HomePage(driver);
        homePage.verifyHomePage();
        driver.quit();
    }

    @When("User logs in with valid username and password and checks the remember username checkbox")
    public void userLogsInAndChecksRememberMe() {
        loginPage.enterUsername("madhrui@tekarch.com");
        loginPage.enterPassword("Cowdogcat56");
        loginPage.checkRememberMe();
        loginPage.clickLogin();
    }

    @And("User logs out of Salesforce")
    public void userLogsOutOfSalesforce() {
        homePage.logout();
    }

    @Then("Salesforce login page should be displayed with the username populated and the remember username checked")
    public void verifyLoginPageAfterLogout() {
        loginPage.verifyRememberMeChecked();
        driver.quit();
    }

    @And("User checks for the username field")
    public void userChecksUsernameField() {
        loginPage.verifyUsernameField();
    }

    @When("User clicks on the \"Forgot password\" link")
    public void userClicksForgotPasswordLink() {
        forgotPasswordPage = loginPage.clickForgotPasswordLink();
    }

    @And("User provides the username for password reset")
    public void userProvidesUsernameForReset() {
        forgotPasswordPage.enterUsernameForReset("usernameForReset");
        forgotPasswordPage.clickSubmit();
    }

    @Then("Password reset message page should be displayed")
    public void verifyPasswordResetMessage() {
        forgotPasswordPage.verifyResetMessage();
        driver.quit();
    }

    @When("User enters an incorrect username and password")
    public void userEntersIncorrectUsernameAndPassword() {
        loginPage.enterUsername("invalidUsername");
        loginPage.enterPassword("invalidPassword");
        loginPage.clickLogin();
    }

    @Then("Error message {string} should be displayed")
    public void verifyErrorMessageForIncorrectLogin(String errorMessage) {
        loginPage.verifyErrorMessage(errorMessage);
        driver.quit();
    }
}
