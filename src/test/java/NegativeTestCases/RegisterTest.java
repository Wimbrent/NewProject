package NegativeTestCases;

import HelpClasses.BaseTest;
import HelpClasses.Information;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    /** Not entered email **/
    @Test
    public void CreateAnAccount() {
        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount("");
        authenticationPage.submitCreateAnAccount();
        alert.danger();
    }


    @Test
    public void usedEmail() {
        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("usedEmail"));
        authenticationPage.submitCreateAnAccount();
        alert.danger();
    }

    @Test
    public void notEnteredFirstName() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
        authenticationPage.submitCreateAnAccount();

        checkBox.selectGenderMr();
        field.enterCustomerFirstName("");
        field.enterCustomerLastName(Information.getProperty("lastName"));
        field.enterPassword(Information.getProperty("password"));
        field.day(Information.getProperty("day"));
        field.month(Information.getProperty("month"));
        field.year(Information.getProperty("year"));

        field.enterFirstName(Information.getProperty("firstName"));
        field.enterLastName(Information.getProperty("lastName"));
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress(Information.getProperty("myAddress"));
        field.submitRegister();
        alert.danger();
    }

    @Test
    public void notEnteredLastName() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
        authenticationPage.submitCreateAnAccount();

        checkBox.selectGenderMr();
        field.enterCustomerFirstName(Information.getProperty("firstName"));
        field.enterCustomerLastName("");
        field.enterPassword(Information.getProperty("password"));
        field.day(Information.getProperty("day"));
        field.month(Information.getProperty("month"));
        field.year(Information.getProperty("year"));

        field.enterFirstName(Information.getProperty("firstName"));
        field.enterLastName(Information.getProperty("lastName"));
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress(Information.getProperty("myAddress"));
        field.submitRegister();
        alert.danger();
    }

    @Test
    public void notEnteredEmail() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
        authenticationPage.submitCreateAnAccount();

        checkBox.selectGenderMr();
        field.enterCustomerFirstName(Information.getProperty("firstName"));
        field.enterCustomerLastName(Information.getProperty("lastName"));
        field.clearEmail();
        field.enterPassword(Information.getProperty("password"));
        field.day(Information.getProperty("day"));
        field.month(Information.getProperty("month"));
        field.year(Information.getProperty("year"));

        field.enterFirstName(Information.getProperty("firstName"));
        field.enterLastName(Information.getProperty("lastName"));
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress(Information.getProperty("myAddress"));
        field.submitRegister();
        alert.danger();
    }

    @Test
    public void notEnteredPassword() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
        authenticationPage.submitCreateAnAccount();

        checkBox.selectGenderMr();
        field.enterCustomerFirstName(Information.getProperty("firstName"));
        field.enterCustomerLastName(Information.getProperty("lastName"));
        field.enterPassword("");
        field.day(Information.getProperty("day"));
        field.month(Information.getProperty("month"));
        field.year(Information.getProperty("year"));

        field.enterFirstName(Information.getProperty("firstName"));
        field.enterLastName(Information.getProperty("lastName"));
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress(Information.getProperty("myAddress"));
        field.submitRegister();
        alert.danger();
    }

    @Test
    public void yourAddress_notEnteredFirstName() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
        authenticationPage.submitCreateAnAccount();

        checkBox.selectGenderMr();
        field.clearCustomerFirstName();
        field.enterCustomerLastName(Information.getProperty("lastName"));
        field.enterPassword(Information.getProperty("password"));
        field.day(Information.getProperty("day"));
        field.month(Information.getProperty("month"));
        field.year(Information.getProperty("year"));

        field.enterFirstName("");
        field.enterLastName(Information.getProperty("lastName"));
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress(Information.getProperty("myAddress"));
        field.submitRegister();
        alert.danger();
    }

    @Test
    public void yourAddress_NotEnteredLastName() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
        authenticationPage.submitCreateAnAccount();

        checkBox.selectGenderMr();
        field.enterCustomerFirstName(Information.getProperty("firstName"));
        field.clearCustomerLastName();
        field.enterPassword(Information.getProperty("password"));
        field.day(Information.getProperty("day"));
        field.month(Information.getProperty("month"));
        field.year(Information.getProperty("year"));

        field.enterFirstName(Information.getProperty("firstName"));
        field.enterLastName("");
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress(Information.getProperty("myAddress"));
        field.submitRegister();
        alert.danger();
    }

    @Test
    public void notEnteredFirstAddress() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
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
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress("");
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress(Information.getProperty("myAddress"));
        field.submitRegister();
        alert.danger();
    }

    @Test
    public void notEnteredCity() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
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
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity("");
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress("Nohave");
        field.submitRegister();
        alert.danger();
    }

    @Test
    public void notEnteredState() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
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
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress(Information.getProperty("myAddress"));
        field.submitRegister();
        alert.danger();
    }

    @Test
    public void notEnteredPostCode() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
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
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode("");
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress(Information.getProperty("myAddress"));
        field.submitRegister();
        alert.danger();
    }

    @Test
    public void notSelectedCountry() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
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
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country("-");
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.enterMyAddress(Information.getProperty("myAddress"));
        field.submitRegister();
        alert.danger();
    }

    @Test
    public void notEnteredPhone() {

        element.linkToSignIn();
        authenticationPage.enterEmailToCreateAccount(Information.getProperty("TestEmail"));
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
        field.enterCompany(Information.getProperty("company"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone("telephone");
        field.enterMyAddress(Information.getProperty("myAddress"));
        field.submitRegister();
        alert.danger();
    }
}
