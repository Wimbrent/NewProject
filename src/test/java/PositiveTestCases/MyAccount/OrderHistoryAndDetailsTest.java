package PositiveTestCases.MyAccount;

import HelpClasses.BaseTest;
import org.testng.annotations.Test;

public class OrderHistoryAndDetailsTest extends BaseTest {

    @Test
    public void details() {

        myAccountPage.linkToOrderHistoryAndDetails();
        orderHistoryAndDetailsPage.details();
        screenshot("OrderDetails");
    }



    @Test
    public void reorder() {

        myAccountPage.linkToOrderHistoryAndDetails();
        orderHistoryAndDetailsPage.reorder();

        checkoutPage.summaryProceedToCheckout();
        checkoutPage.addComment("Comment");
        checkoutPage.addressProceedToCheckOut();
        checkoutPage.agreeTermsOfService();
        checkoutPage.shippingProceedToCheckout();
        checkoutPage.payByCheck();
        checkoutPage.iConfirmMyOrder();
        alert.success();
    }
}
