package PositiveTestCases;

import HelpClasses.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    /** Add to cart and buy **/
    @Test
    @Parameters ({"number"})
    public void addToCart(String number) {

        categoriesMenu.linkToWomanPage();
        categoriesPage.productFrame(number);
        categoriesPage.addToCart(number);
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

    /** 1) Add to wishlist
     *  2) Go to the wishlist page
     *  3) Select product from wishlist
     *  4) Buy product **/
    @Test
    @Parameters({"number", "name", "color"})
    public void addToWishList(String number, String name, String color) {

        categoriesMenu.linkToWomanPage();
        categoriesPage.productFrame(number);
        categoriesPage.addToWishList();
        element.linkToAccount();
        myAccountPage.linkToMyWishList();
        myWishlistPage.directLinkByWishList();
        myWishlistPage.linkToProductPage(name);
        productPage.color(color);
        productPage.addToCart();
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

    /** Remove product from wishlist **/
    @Test
    public void removeFromWishList() {
        element.linkToAccount();
        myAccountPage.linkToMyWishList();
        myWishlistPage.directLinkByWishList();
        myWishlistPage.delete();
    }

    /** 1) Add to compare
     *  2) Go to the compare page
     *  3) Add to cart from compare page
     *  4) Buy product **/
    @Test
    @Parameters({"number"})
    public void addToCompare(String number) {

        categoriesMenu.linkToWomanPage();
        categoriesPage.productFrame(number);
        categoriesPage.addToCompare();
        categoriesPage.compare();
        comparePage.addToCart();
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

    /** Remove from compare **/
    @Test
    @Parameters("number")
    public void removeFromCompare(String number) {

        categoriesMenu.linkToWomanPage();
        comparePage.remove(number);
    }

    /** 1) Select color and size
     * 2) Add to cart
     * 3) Buy product **/
    @Test
    @Parameters ({"number", "colorByID", "size"})
    public void SelectColorAndBuy(String number, String colorByID, String size) {

        categoriesMenu.linkToWomanPage();
        categoriesPage.productFrame(number);
        categoriesPage.colorByID(colorByID);
        productPage.selectSize(size);
        productPage.addToCart();
        productPage.proceedToCheckout();
        checkoutPage.summaryProceedToCheckout();
        checkoutPage.addComment("Comment");
        checkoutPage.addressProceedToCheckOut();
        checkoutPage.agreeTermsOfService();
        checkoutPage.shippingProceedToCheckout();
        checkoutPage.payByBankWire();
        checkoutPage.iConfirmMyOrder();
        alert.success();
    }

    /** 1) Click quick view
     * 2) Select color and size
     * 3) Add to cart
     * 4) Buy product **/

    @Test
    @Parameters ({"number", "color", "size"})
    public void quickView(String number, String color, String size) throws InterruptedException {

        categoriesMenu.linkToWomanPage();
        categoriesPage.productFrame(number);
        categoriesPage.quickView(number);
        quickView.color(color);
        quickView.selectSize(size);
        quickView.addToCart();
        Thread.sleep(2000);
        quickView.proceedToCheckout();
        checkoutPage.summaryProceedToCheckout();
        checkoutPage.addComment("Comment");
        checkoutPage.addressProceedToCheckOut();
        checkoutPage.agreeTermsOfService();
        checkoutPage.shippingProceedToCheckout();
        checkoutPage.payByBankWire();
        checkoutPage.iConfirmMyOrder();
        alert.success();
    }

}