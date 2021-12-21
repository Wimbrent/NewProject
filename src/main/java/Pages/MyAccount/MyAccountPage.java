package Pages.MyAccount;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    /** Link to Order History and Details **/
    public MyAccountPage linkToOrderHistoryAndDetails() {
        driver.findElement(By.xpath("//a[@title = 'Orders']")).click();
        Assert.assertEquals(driver.getTitle(), "Order history - My Store");
        return this;
    }

    /** Link to My Credit Slips **/
    public MyAccountPage linkToCreditSlips() {
        driver.findElement(By.linkText("My credit slips")).click();
        Assert.assertEquals(driver.getTitle(), "Order slip - My Store");
        return this;
    }

    /** link to My Address **/
    public MyAccountPage linkToMyAddress() {
        driver.findElement(By.xpath("//a[@title = 'My addresses']")).click();
        Assert.assertEquals(driver.getTitle(), "Addresses - My Store");
        return this;
    }

    /** Link to My Personal Information **/
    public MyAccountPage linkToMyPersonalInformation() {
        driver.findElement(By.xpath("//a[@title = 'Information']")).click();
        Assert.assertEquals(driver.getTitle(), "Identity - My Store");
        return this;
    }

    /** Link to My Wish List **/
    public MyAccountPage linkToMyWishList() {
        driver.findElement(By.xpath("//a[@title = 'My wishlists']")).click();
        Assert.assertEquals(driver.getTitle(), "My Store");
        return this;
    }

    /** Click button Home **/
    public MyAccountPage buttonHome() {
        return this;
    }
}
