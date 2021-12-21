package Pages;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    /** Link to Sing Up page **/
    public HomePage linkToSignIn() {
        driver.findElement(By.className("login")).click();
        Assert.assertEquals(driver.getTitle(), "Login - My Store");
        return this;
    }

    /** Link to Sign Out **/
    public HomePage linkToSignOut() {
        driver.findElement(By.xpath("//*[@title = 'Log me out']")).click();
        return this;
    }

    /** Link to Contact US **/
    public HomePage ContactUS() {
        driver.findElement(By.linkText("Contact us")).click();
        return this;
    }

    /** Link to Account Page **/
    public HomePage linkToAccount() {
        driver.findElement(By.className("account")).click();
        return this;
    }

    /** Enter keyword in Search field **/
    public HomePage enterSearchField() {
        driver.findElement(By.id("search_query_top")).sendKeys();
        return this;
    }

    /** click submit Search **/
    public HomePage submitSearch() {
        driver.findElement(By.name("submit_search")).click();
        return this;
    }

    /** Shopping Cart **/
    public HomePage shoppingCart() {
        driver.findElement(By.className("shopping_cart")).click();
        return this;
    }

    /** Link to Woman Category **/
    public HomePage linkToWomanCategory() {
        driver.findElement(By.linkText("Women")).click();
        Assert.assertEquals(driver.getTitle(), "Women");
        return this;
    }

    /** Link to Dress Category **/
    public HomePage linkToDressesCategory() {
        driver.findElement(By.linkText("Dresses")).click();
        Assert.assertEquals(driver.getTitle(), "Dresses");
        return this;
    }

    /** Link to T-Shirts Category **/
    public HomePage linkToTshirtsCategory() {
        driver.findElement(By.linkText("T-shirts")).click();
        Assert.assertEquals(driver.getTitle(), "T-shirts");
        return this;
    }

    /** click logo My Store **/
    public HomePage myStore() {
        driver.findElement(By.id("header_logo")).click();
        Assert.assertEquals(driver.getTitle(), "My Store");
        return this;
    }
}
