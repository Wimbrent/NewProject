package Elements;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox extends BasePage {
    public CheckBox(WebDriver driver) {
        super(driver);
    }

    /** Sign up for our newsletter **/
    public CheckBox newsletter() {
        driver.findElement(By.id("newsletter")).click();
        return this;
    }

    /** Receive special offers from our partners! **/
    public CheckBox specials() {
        driver.findElement(By.id("optin")).click();
        return this;
    }

    public CheckBox selectGenderMr() {
        driver.findElement(By.id("id_gender1")).click();
        return this;
    }

    public CheckBox selectGenderMrs() {
        driver.findElement(By.id("id_gender2")).click();
        return this;
    }
}
