package Pages;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ForgottenPasswordPage extends BasePage {
    public ForgottenPasswordPage(WebDriver driver) {
        super(driver);
    }

    /** Enter your Email address **/
    public ForgottenPasswordPage enterEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
        return this;
    }

    /** Click Retrieve Password **/
    public ForgottenPasswordPage submitRetrievePassword() {
        driver.findElement(By.xpath("//button[@class = 'btn btn-default button button-medium']"));
        return this;
    }

    /** click Back to Login Page **/
    public ForgottenPasswordPage backToLoginPage() {
        driver.findElement(By.xpath("//a[@title = 'Back to Login']")).click();
        Assert.assertEquals(driver.getTitle(), "Login - My Store");
        return this;
    }
}
