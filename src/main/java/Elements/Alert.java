package Elements;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert extends BasePage {

    public Alert(WebDriver driver) {
        super(driver);
    }

    public Alert danger() {

        String actual = driver.findElement(By.xpath("//div[@class = 'alert alert-danger']")).getText();
        String firstName = " is required.";
        String lastName = " is required.";
        String telephone = "You must register at least one phone number.";
        String password = " is required.";
        String city = " is required.";
        String postCode = "The Zip/Postal code you've entered is invalid. It must follow this format: 00000";
        String regionOrState = "This country requires you to choose a State.";
        String firstAddress = " is required.";
        String loginPassword = "Password is required.";
        String loginEmail = "An email address required.";
        String emailCreateAccount = "Invalid email address.";

        if (actual.equals(firstName)) {
            System.out.println(actual);
        } else if (actual.equals(lastName)) {
            System.out.println(actual);
        } else if (actual.equals(telephone)) {
            System.out.println(actual);
        } else if (actual.equals(password)) {
            System.out.println(actual);
        } else if (actual.equals(city)) {
            System.out.println(actual);
        } else if (actual.equals(regionOrState)) {
            System.out.println(actual);
        } else if (actual.equals(postCode)) {
            System.out.println(actual);
        } else if (actual.equals(firstAddress)) {
            System.out.println(actual);
        } else if (actual.equals(loginPassword)) {
            System.out.println(actual);
        } else if (actual.equals(loginEmail)) {
            System.out.println(actual);
        } else if (actual.equals(emailCreateAccount)) {
            System.out.println(actual);
        }
        return this;
    }

    public Alert success() {
        String actualSuccess = driver.findElement(By.xpath("//div[@id = 'center_column']/p[1]")).getText();
        String actualSuccessOrder = "Your order on My Store is complete.";

        if (actualSuccess.equals(actualSuccessOrder)) {
            System.out.println("Done");
        }
        return this;
    }
}