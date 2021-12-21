package PositiveTestCases.MyAccount;

import HelpClasses.BaseTest;
import HelpClasses.Information;
import org.testng.annotations.Test;

public class OrderHistoryAndDetails extends BaseTest {

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
