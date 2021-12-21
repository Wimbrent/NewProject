package Pages.Categories;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    /** Button add to cart **/
    public ProductPage addToCart() {
        driver.findElement(By.xpath("//p[@id = 'add_to_cart']/button")).click();
        return this;
    }

    /** Add to wishlist **/
    public ProductPage addToWishlist() {
        driver.findElement(By.id("wishlist_button")).click();
        return this;
    }

    /** Select Size **/
    public ProductPage selectSize(String size) {
        Select select = new Select(driver.findElement(By.id("group_1")));
        select.selectByVisibleText(size);
        return this;
    }

    /** Enter qty **/
    public ProductPage enterQty() {
        driver.findElement(By.xpath("//input[@id = 'quantity_wanted']")).sendKeys();
        return this;
    }

    /** Minus qty product **/
    public ProductPage minusQty() {
        driver.findElement(By.className("btn btn-default button-minus product_quantity_down")).click();
        return this;
    }

    /** Plus qty product **/
    public ProductPage plusQty() {
        driver.findElement(By.className("btn btn-default button-plus product_quantity_up")).click();
        return this;
    }

    /** Button Proceed to Checkout **/
    public ProductPage proceedToCheckout() {
        driver.findElement(By.xpath("//a[@title = 'Proceed to checkout']")).click();
        return this;
    }

    /** Select color **/
    public ProductPage color(String color) {
        driver.findElement(By.name("" + color + "")).click();
        return this;
    }

    /** Select color by id **/
    public ProductPage colorByID(String colorByID) {
        driver.findElement(By.id("" + colorByID + "")).click();
        return this;
    }

    /** Write a review **/
    public ProductPage review() {
        driver.findElement(By.className("open-comment-form")).click();
        return this;
    }

    /** Select criterion **/
    public ProductPage criterion(String value) {
        driver.findElement(By.xpath("//input[@name = 'criterion[1]' and @value = '" + value + "']")).click();
        return this;
    }

    /** Enter title **/
    public ProductPage enterTitle(String title) {
        driver.findElement(By.id("comment_title")).sendKeys(title);
        return this;
    }

    /** Enter Comment **/
    public ProductPage enterComment(String comment) {
        driver.findElement(By.id("content")).sendKeys(comment);
        return this;
    }

    /** Button send **/
    public ProductPage sendReview() {
        driver.findElement(By.id("submitNewMessage")).click();
        return this;
    }

    /** Button cancel **/
    public ProductPage cancelReview() {
        driver.findElement(By.className("closefb")).click();
        return this;
    }
}
