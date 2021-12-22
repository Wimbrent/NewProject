package PositiveTestCases;

import HelpClasses.BaseTest;
import org.testng.annotations.Test;

public class FooterTest extends BaseTest {

    @Test
    public void women() {
        footer.linkToWomen();
    }

    @Test
    public void specials() {
        footer.linkToSpecials();
    }

    @Test
    public void newProducts() {
        footer.linkToNewProducts();
    }

    @Test
    public void bestSellers() {
        footer.linkToBestSellers();
    }

    @Test
    public void ourStores() {
        footer.linkToOurStores();
    }

    @Test
    public void contactUS() {
        footer.linkToContactUS();
    }

    @Test
    public void termsAndConditionsOfUse() {
        footer.linkToTermsAndConditionsOfUse();
    }

    @Test
    public void aboutUS() {
        footer.linkToAboutUS();
    }

    @Test
    public void sitemap() {
        footer.linkToSiteMap();
    }

    @Test
    public void myAccount() {
        footer.linkToMyAccount();
    }

    @Test
    public void myOrders() {
        footer.linkToMyOrders();
    }

    @Test
    public void myCreditSlips() {
        footer.linkToMyCreditSlips();
    }

    @Test
    public void myAddress() {
        footer.linkToMyAddress();
    }

    @Test
    public void myPersonalInfo() {
        footer.linkToMyPersonalInfo();
    }

    @Test
    public void logout() {
        footer.logout();
    }
}
