package Pages;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AuthenticationPage extends BasePage {
    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    /** Enter your Email to create account **/
    public AuthenticationPage enterEmailToCreateAccount(String email) {
        driver.findElement(By.id("email_create")).sendKeys(email);
        return this;
    }

    /** Click button Create an Account **/
    public AuthenticationPage submitCreateAnAccount() {
        driver.findElement(By.id("SubmitCreate")).click();
        Assert.assertEquals(driver.getTitle(), "Login - My Store");
        return this;
    }

    /** Click button submit Sign In **/
    public AuthenticationPage submitSignIn() {
        driver.findElement(By.id("SubmitLogin")).click();
        return this;
    }

    /** Link to Forgotten Password Page **/
    public AuthenticationPage linkToForgottenPassword() {
        driver.findElement(By.linkText("Forgot your password?")).click();
        Assert.assertEquals(driver.getTitle(), "Forgotten your password");
        return this;
    }
}