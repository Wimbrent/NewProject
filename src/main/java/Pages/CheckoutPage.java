package Pages;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    /** Summary proceed to checkout **/
    public CheckoutPage summaryProceedToCheckout() {
        driver.findElement(By.xpath("//p[@class = 'cart_navigation clearfix']/a[1]")).click();
        return this;
    }

    /** Button continue shopping **/
    public CheckoutPage continueShopping() {
        driver.findElement(By.xpath("//a[@title = 'Continue shopping']")).click();
        return this;
    }

    /** Link to Product Page **/
    public CheckoutPage linkToProductPage() {
        driver.findElement(By.xpath("//div[@class = 'cart_last_product_content']/p/a")).click();
        return this;
    }

    /** field Qty **/
    public CheckoutPage enterQty(String qty) {
        driver.findElement(By.className("cart_quantity_input form-control grey")).sendKeys(qty);
        return this;
    }

    /** Button minus qty Product **/
    public CheckoutPage buttonMinus() {
        driver.findElement(By.className("cart_quantity_down btn btn-default button-minus")).click();
        return this;
    }

    /** Button plus qty Product **/
    public CheckoutPage buttonPlus() {
        driver.findElement(By.className("cart_quantity_up btn btn-default button-plus")).click();
        return this;
    }

    /** Button Remove **/
    public CheckoutPage remove() {
        driver.findElement(By.className("cart_quantity_up btn btn-default button-plus")).click();
        return this;
    }

    /** Proceed to Checkout **/
    public CheckoutPage signInProceedToCheckout() {
        driver.findElement(By.className("button-exclusive btn btn-default")).click();
        return this;
    }

    /** Update Your Delivery Address **/
    public CheckoutPage updateYourDeliveryAddress() {
        driver.findElement(By.xpath("//ul[@id = 'address_delivery']/li/a")).click();
        return this;
    }

    /** Update Your Billing Address **/
    public CheckoutPage updateYourBillingAddress() {
        driver.findElement(By.xpath("//ul[@id = 'address_invoice']/li/a")).click();
        return this;
    }

    /** Add a new Address **/
    public CheckoutPage addANewAddress() {
        driver.findElement(By.className("address_add submit")).click();
        return this;
    }

    /** Add Comment **/
    public CheckoutPage addComment(String comment) {
        driver.findElement(By.name("message")).sendKeys(comment);
        return this;
    }

    /** Proceed to Checkout **/
    public CheckoutPage addressProceedToCheckOut() {
        driver.findElement(By.name("processAddress")).click();
        return this;
    }

    /** Agree Terms of Service **/
    public CheckoutPage agreeTermsOfService() {
        driver.findElement(By.id("cgv")).click();
        return this;
    }

    /** Link to Terms of Service **/
    public CheckoutPage linkToTermsOfService() {
        driver.findElement(By.linkText("(Read the Terms of Service)")).click();
        return this;
    }

    /** Button Shipping Proceed to Checkout **/
    public CheckoutPage shippingProceedToCheckout() {
        driver.findElement(By.name("processCarrier")).click();
        return this;
    }

    /** Button Pay by bank wire **/
    public CheckoutPage payByBankWire() {
        driver.findElement(By.className("bankwire")).click();
        return this;
    }

    /** Button Pay by check **/
    public CheckoutPage payByCheck() {
        driver.findElement(By.className("cheque")).click();
        return this;
    }

    /** Button Other Payment Method **/
    public CheckoutPage otherPaymentMethod() {
        driver.findElement(By.className("button-exclusive btn btn-default")).click();
        return this;
    }

    /** Button I Confirm My Order **/
    public CheckoutPage iConfirmMyOrder() {
        driver.findElement(By.xpath("//p[@id = 'cart_navigation']/button")).click();
        return this;
    }
}