package NegativeTestCases;

import HelpClasses.BaseTest;
import HelpClasses.Information;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    /** Not entered email **/
    @Test
    public void notEnteredEmail() {
        element.linkToSignIn();
        field.enterEmail("");
        field.enterPassword(Information.getProperty("password"));
        authenticationPage.submitSignIn();
        alert.danger();
    }

    /** Not entered password **/
    @Test
    public void notEnteredPassword() {
        element.linkToSignIn();
        field.enterEmail(Information.getProperty("email"));
        field.enterPassword("");
        authenticationPage.submitSignIn();
        alert.danger();
    }
}
