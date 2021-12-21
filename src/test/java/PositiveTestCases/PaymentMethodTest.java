package PositiveTestCases;

import HelpClasses.BaseTest;
import HelpClasses.NewInfo;
import org.testng.annotations.Test;

public class PaymentMethodTest extends BaseTest {

    @Test
    public void payByCheck() {

        categoriesMenu.linkToWomanPage();
        categoriesPage.productFrame("1");
        categoriesPage.addToCart("1");
        categoriesPage.proceedToCheckout();
        checkoutPage.summaryProceedToCheckout();
        checkoutPage.addComment("Comment");
        checkoutPage.addressProceedToCheckOut();
        checkoutPage.agreeTermsOfService();
        checkoutPage.shippingProceedToCheckout();
        checkoutPage.payByCheck();
        checkoutPage.iConfirmMyOrder();
        alert.success();
    }

    @Test
    public void payByBankWire() {

        categoriesMenu.linkToWomanPage();
        categoriesPage.productFrame("1");
        categoriesPage.addToCart("1");
        categoriesPage.proceedToCheckout();
        checkoutPage.summaryProceedToCheckout();
        checkoutPage.addComment("Comment");
        checkoutPage.addressProceedToCheckOut();
        checkoutPage.agreeTermsOfService();
        checkoutPage.shippingProceedToCheckout();
        checkoutPage.payByBankWire();
        checkoutPage.iConfirmMyOrder();
        alert.success();
    }

    @Test
    public void newBillingAddress() {

        categoriesMenu.linkToWomanPage();
        categoriesPage.productFrame("1");
        categoriesPage.addToCart("1");
        categoriesPage.proceedToCheckout();
        checkoutPage.summaryProceedToCheckout();

        checkoutPage.updateYourDeliveryAddress();
        field.clearFirstName();
        field.enterFirstName(NewInfo.getProperty("newFirstNameDA"));
        field.clearLastName();
        field.enterLastName(NewInfo.getProperty("newLastNameDA"));
        field.clearCompany();
        field.clearFirstAddress();
        field.enterFirstAddress(NewInfo.getProperty("newFirstAddressDA"));
        field.clearCity();
        field.enterCity(NewInfo.getProperty("newCityDA"));
        field.state(NewInfo.getProperty("newStatenDA"));
        field.clearPostCode();
        field.enterPostCode(NewInfo.getProperty("newPostCodeDA"));
        field.clearMobilePhone();
        field.enterMobilePhone(NewInfo.getProperty("newPhoneDA"));
        field.clearMyAddress();
        field.enterMyAddress("newMyAddressDA");
        myAddressesPage.submit();

        checkoutPage.addComment("Comment");
        checkoutPage.addressProceedToCheckOut();
        checkoutPage.agreeTermsOfService();
        checkoutPage.shippingProceedToCheckout();
        checkoutPage.payByBankWire();
        checkoutPage.iConfirmMyOrder();
        alert.success();
    }

    @Test
    public void newDeliveryAddress() {

        categoriesMenu.linkToWomanPage();
        categoriesPage.productFrame("1");
        categoriesPage.addToCart("1");
        categoriesPage.proceedToCheckout();
        checkoutPage.summaryProceedToCheckout();

        checkoutPage.updateYourBillingAddress();
        field.clearFirstName();
        field.enterFirstName(NewInfo.getProperty("newFirstNameBA"));
        field.clearLastName();
        field.enterLastName(NewInfo.getProperty("newLastNameBA"));
        field.clearCompany();
        field.clearFirstAddress();
        field.enterFirstAddress(NewInfo.getProperty("newFirstAddressBA"));
        field.clearCity();
        field.enterCity(NewInfo.getProperty("newCityBA"));
        field.state(NewInfo.getProperty("newStateBA"));
        field.clearPostCode();
        field.enterPostCode(NewInfo.getProperty("newPostCodeBA"));
        field.clearMobilePhone();
        field.enterMobilePhone(NewInfo.getProperty("newPhoneBA"));
        field.clearMyAddress();
        field.enterMyAddress("newMyAddressBA");
        myAddressesPage.submit();

        checkoutPage.addComment("Comment");
        checkoutPage.addressProceedToCheckOut();
        checkoutPage.agreeTermsOfService();
        checkoutPage.shippingProceedToCheckout();
        checkoutPage.payByBankWire();
        checkoutPage.iConfirmMyOrder();
        alert.success();
    }
}
