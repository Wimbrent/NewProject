package PositiveTestCases;

import HelpClasses.BaseTest;
import HelpClasses.Information;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void successfullyRegister() {

        homePage.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("email"));
        authenticationPage.submitCreateAnAccount();

        checkBox.selectGenderMr();
        field.enterCustomerFirstName(Information.getProperty("firstName"));
        field.enterCustomerLastName(Information.getProperty("lastName"));
        field.enterPassword(Information.getProperty("password"));
        field.day(Information.getProperty("day"));
        field.month(Information.getProperty("month"));
        field.year(Information.getProperty("year"));

        field.enterFirstName(Information.getProperty("firstName"));
        field.enterLastName(Information.getProperty("lastName"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress("Nohave");
        field.submitRegister();
        Assert.assertEquals(driver.getTitle(), "My Account - My Store");
    }
}
