package PositiveTestCases;

import HelpClasses.BaseTest;
import HelpClasses.Information;
import org.testng.annotations.Test;

public class ForgottenPasswordTest extends BaseTest {

    @Test
    public void successfullyRetrievePassword() {
        element.linkToSignIn();
        authenticationPage.linkToForgottenPassword();
        forgottenPasswordPage.enterEmail(Information.getProperty("email"));
        forgottenPasswordPage.submitRetrievePassword();
    }
}
