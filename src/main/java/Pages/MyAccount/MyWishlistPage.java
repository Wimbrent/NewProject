package Pages.MyAccount;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyWishlistPage extends BasePage {
    public MyWishlistPage(WebDriver driver) {
        super(driver);
    }

    /** New Wishlist **/
    public MyWishlistPage enterWishListName(String nameWishList) {
        driver.findElement(By.id("name")).sendKeys(nameWishList);
        return this;
    }

    /** Button save **/
    public MyWishlistPage save() {
        driver.findElement(By.id("submitWishlist")).click();
        return this;
    }

    /** Direct link by name wishlist **/
    public MyWishlistPage directLinkByWishList() {
        driver.findElement(By.linkText("My wishlist")).click();
        return this;
    }

    /** Direct link **/
    public MyWishlistPage directLinkView() {
        driver.findElement(By.linkText("View")).click();
        return this;
    }

    /** Button delete **/
    public MyWishlistPage delete() {
        driver.findElement(By.xpath("//a[@title = 'Delete']")).click();
        return this;
    }

    /** Link to product page **/
    public MyWishlistPage linkToProductPage(String name) {
        driver.findElement(By.xpath("//img[@alt = '" + name + "']")).click();
        Assert.assertEquals(driver.getTitle(), "" + name + " - My Store");
        return this;
    }
}
