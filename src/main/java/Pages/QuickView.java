package Pages;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class QuickView extends BasePage {
    public QuickView(WebDriver driver) {
        super(driver);
    }

    /** Button add to cart **/
    public QuickView addToCart() {
        driver.findElement(By.className("exclusive")).click();
        return this;
    }

    /** Add to wishlist **/
    public QuickView addToWishlist() {
        driver.findElement(By.id("wishlist_button")).click();
        return this;
    }

    /** Select color by name **/
    public QuickView color(String color) {
        driver.findElement(By.name(color)).click();
        return this;
    }

    /** Enter qty **/
    public QuickView enterQty() {
        driver.findElement(By.xpath("//input[@id = 'quantity_wanted']")).sendKeys();
        return this;
    }

    /** Minus qty product **/
    public QuickView minusQty() {
        driver.findElement(By.className("btn btn-default button-minus product_quantity_down")).click();
        return this;
    }

    /** Plus qty product **/
    public QuickView plusQty() {
        driver.findElement(By.className("btn btn-default button-plus product_quantity_up")).click();
        return this;
    }

    /** Select Size **/
    public QuickView selectSize(String size) {
        Select select = new Select(driver.findElement(By.id("group_1")));
        select.selectByVisibleText(size);
        return this;
    }

    /** Button Proceed to Checkout **/
    public QuickView proceedToCheckout() {
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@title = 'Proceed to checkout']")).click();
        return this;
    }
}
