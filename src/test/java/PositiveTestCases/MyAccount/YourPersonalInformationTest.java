package PositiveTestCases.MyAccount;

import HelpClasses.BaseTest;
import HelpClasses.Information;
import HelpClasses.NewInfo;
import org.testng.annotations.Test;

public class YourPersonalInformationTest extends BaseTest {

    @Test
    public void editPersonalInformation() {

        myAccountPage.linkToMyPersonalInformation();

        checkBox.selectGenderMrs();
        field.clearFirstName();
        field.enterFirstName(NewInfo.getProperty("firstName"));
        field.clearLastName();
        field.enterLastName(NewInfo.getProperty("lastName"));
        field.clearEmail();
        field.enterEmail(NewInfo.getProperty("email"));
        field.day(NewInfo.getProperty("day"));
        field.month(NewInfo.getProperty("month"));
        field.year(NewInfo.getProperty("year"));
        yourPersonalInformationPage.enterCurrentPassword(Information.getProperty("password"));
        yourPersonalInformationPage.enterPassword(NewInfo.getProperty("password"));
        yourPersonalInformationPage.enterConfirmation(NewInfo.getProperty("password"));
        yourPersonalInformationPage.save();
    }
}
