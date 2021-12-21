package Pages.MyAccount;

import Elements.Field;
import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourPersonalInformationPage extends BasePage {
    public YourPersonalInformationPage(WebDriver driver) {
        super(driver);
    }

    /** Enter old password **/
    public YourPersonalInformationPage enterCurrentPassword(String oldPassword) {
        driver.findElement(By.id("old_passwd")).sendKeys(oldPassword);
        return this;
    }

    /** Enter your password **/
    public YourPersonalInformationPage enterPassword(String password) {
        driver.findElement(By.id("passwd")).sendKeys(password);
        return this;
    }

    /** Enter password confirm **/
    public YourPersonalInformationPage enterConfirmation(String passwordConfirm) {
        driver.findElement(By.id("confirmation")).sendKeys(passwordConfirm);
        return this;
    }

    /** Button save **/
    public YourPersonalInformationPage save() {
        driver.findElement(By.name("submitIdentity")).click();
        return this;
    }
}
