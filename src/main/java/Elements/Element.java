package Elements;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Element extends BasePage {

    public Element(WebDriver driver) {
        super(driver);
    }

    /** Link to Sing Up page **/
    public Element linkToSignIn() {
        driver.findElement(By.className("login")).click();
        Assert.assertEquals(driver.getTitle(), "Login - My Store");
        return this;
    }

    /** Link to Sign Out **/
    public Element linkToSignOut() {
        driver.findElement(By.xpath("//*[@title = 'Log me out']")).click();
        return this;
    }

    /** Link to Contact US **/
    public Element ContactUS() {
        driver.findElement(By.linkText("Contact us")).click();
        return this;
    }

    /** Link to Account Page **/
    public Element linkToAccount() {
        driver.findElement(By.className("account")).click();
        return this;
    }

    /** Enter keyword in Search field **/
    public Element enterKeywordInSearch(String keyword) {
        driver.findElement(By.id("search_query_top")).sendKeys(keyword);
        return this;
    }

    /** click submit Search **/
    public Element submitSearch() {
        driver.findElement(By.name("submit_search")).click();
        return this;
    }

    /** Shopping Cart **/
    public Element shoppingCart() {
        driver.findElement(By.className("shopping_cart")).click();
        return this;
    }

    /** Link to Woman Category **/
    public Element linkToWomanCategory() {
        driver.findElement(By.linkText("Women")).click();
        Assert.assertEquals(driver.getTitle(), "Women");
        return this;
    }

    /** Link to Dress Category **/
    public Element linkToDressesCategory() {
        driver.findElement(By.linkText("Dresses")).click();
        Assert.assertEquals(driver.getTitle(), "Dresses");
        return this;
    }

    /** Link to T-Shirts Category **/
    public Element linkToTshirtsCategory() {
        driver.findElement(By.linkText("T-shirts")).click();
        Assert.assertEquals(driver.getTitle(), "T-shirts");
        return this;
    }

    /** click logo My Store **/
    public Element myStore() {
        driver.findElement(By.id("header_logo")).click();
        Assert.assertEquals(driver.getTitle(), "My Store");
        return this;
    }
}
