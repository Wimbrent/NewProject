package Pages.Categories;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CategoriesPage extends BasePage {
    public CategoriesPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    /** Product Frame **/
    public CategoriesPage productFrame(String i) {
        WebElement frame =
                driver.findElement(By.xpath("//ul[@class = 'product_list grid row']/li[" + i + "]"));
        actions.moveToElement(frame).build().perform();
        return this;
    }

    /** Select color by id **/
    public CategoriesPage colorByID(String colorByID) {
        driver.findElement(By.id("" + colorByID + "")).click();
        return this;
    }

    /** Button Add to Cart **/
    public CategoriesPage addToCart(String number) {
        driver.findElement(By.xpath("//a[@title = 'Add to cart' and @data-id-product= " + number + "]")).click();
        return this;
    }

    /** Button Quick View **/
    public CategoriesPage quickView(String number) {
        driver.findElement(By.xpath("//ul[@class = 'product_list grid row']/li[" + number + "]/div/div/div/a[2]")).click();
        WebElement moveToFrame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
        driver.switchTo().frame(moveToFrame);
        return this;
    }

    /** Button View Product **/
    public CategoriesPage more() {
        driver.findElement(By.xpath("//a[@title = 'View']")).click();
        return this;
    }

    /** Button Add to Compare **/
    public CategoriesPage addToCompare() {
        driver.findElement(By.linkText("Add to Compare")).click();
        return this;
    }

    /** Button Compare **/
    public CategoriesPage compare() {
        driver.findElement(By.xpath("//div[@class = 'top-pagination-content clearfix']/form/button")).click();
        return this;
    }

    /** Button Add to Wish List **/
    public CategoriesPage addToWishList() {
        driver.findElement(By.linkText("Add to Wishlist")).click();
        return this;
    }

    /** Button Continue Shopping **/
    public CategoriesPage continueShopping() {
        driver.findElement(By.className("continue btn btn-default button exclusive-medium")).click();
        return this;
    }

    /** Button Proceed to Checkout **/
    public CategoriesPage proceedToCheckout() {
        driver.findElement(By.xpath("//a[@title = 'Proceed to checkout']")).click();
        return this;
    }

    /** View Grid **/
    public CategoriesPage viewGrid() {
        driver.findElement(By.id("grid")).click();
        return this;
    }

    /** View List **/
    public CategoriesPage viewList() {
        driver.findElement(By.id("list")).click();
        return this;
    }
}
