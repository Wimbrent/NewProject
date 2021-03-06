package PositiveTestCases;

import HelpClasses.BaseTest;
import HelpClasses.Information;
import HelpClasses.NewInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void successfullySignIn() {
        element.linkToSignIn();
        field.enterEmail(Information.getProperty("email"));
        field.enterPassword(Information.getProperty("password"));
        authenticationPage.submitSignIn();
        Assert.assertEquals(driver.getTitle(), "My account - My Store");
    }

    @Test (priority = 0)
    public void successfullySignInWithNewInfo() {
        element.linkToSignIn();
        field.enterFirstName(NewInfo.getProperty("email"));
        field.enterLastName(NewInfo.getProperty("password"));
        authenticationPage.submitSignIn();
        Assert.assertEquals(driver.getTitle(), "My account - My Store");
    }

    @Test
    public void successfullySignOut() {
        element.linkToSignOut();
    }
}
