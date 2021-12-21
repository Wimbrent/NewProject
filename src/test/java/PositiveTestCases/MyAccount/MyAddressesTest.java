package PositiveTestCases.MyAccount;

import HelpClasses.BaseTest;
import HelpClasses.Information;
import HelpClasses.NewInfo;
import org.testng.annotations.Test;

public class MyAddressesTest extends BaseTest {

    @Test
    public void addNewAddress() {

        myAccountPage.linkToMyAddress();
        myAddressesPage.newAddress();

        field.clearFirstName();
        field.enterFirstName(Information.getProperty("firstName"));
        field.clearLastName();
        field.enterLastName(Information.getProperty("lastName"));
        field.enterFirstAddress(Information.getProperty("firstAddress"));
        field.enterCity(Information.getProperty("city"));
        field.state(Information.getProperty("state"));
        field.enterPostCode(Information.getProperty("postCode"));
        field.country(Information.getProperty("country"));
        field.enterMobilePhone(Information.getProperty("telephone"));
        field.clearMyAddress();
        field.enterMyAddress("FirstAddress");

        myAddressesPage.submit();
    }


    @Test
    public void updateAddress() {

            myAccountPage.linkToMyAddress();
            myAddressesPage.updateAddress();

            field.clearFirstName();
            field.enterFirstName(NewInfo.getProperty("firstName"));
            field.clearLastName();
            field.enterLastName(NewInfo.getProperty("lastName"));
            field.clearCompany();
            field.enterCompany(NewInfo.getProperty("company"));
            field.clearFirstAddress();
            field.enterFirstAddress(NewInfo.getProperty("firstAddress"));
            field.clearCity();
            field.enterCity(NewInfo.getProperty("city"));
            field.state(NewInfo.getProperty("state"));
            field.clearPostCode();
            field.enterPostCode(NewInfo.getProperty("postCode"));
            field.clearMobilePhone();
            field.enterMobilePhone(NewInfo.getProperty("telephone"));
            field.clearMyAddress();
            field.enterMyAddress("FirstAddress");

            myAddressesPage.submit();
    }

    @Test
    public void deleteAddress() {

        myAccountPage.linkToMyAddress();

        myAddressesPage.deleteAddress();
    }
}
