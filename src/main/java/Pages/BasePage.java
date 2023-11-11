package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage(String url) {
        driver.navigate().to(url);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    
    // Add more common methods as needed
}
