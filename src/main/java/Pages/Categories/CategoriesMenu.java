package Pages.Categories;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CategoriesMenu extends BasePage {
    public CategoriesMenu(WebDriver driver) {
        super(driver);
    }

    Actions action = new Actions(driver);

    /** Woman Category **/
    public CategoriesMenu womanCategories() {
        WebElement link = driver.findElement(By.className("sf-with-ul"));
        action.moveToElement(link).build().perform();
        return this;
    }

    /** Link to Woman Page **/
    public CategoriesMenu linkToWomanPage() {
        driver.findElement(By.xpath("//div[@id = 'block_top_menu']/ul/li[1]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Women - My Store");
        return this;
    }

    /** Link to T-Shirts Page **/
    public CategoriesMenu linkToTShirts() {
        driver.findElement(By.xpath("//ul[@class = 'submenu-container clearfix first-in-line-xs']/li[1]/ul/li[1]/a")).click();
        Assert.assertEquals(driver.getTitle(), "T-shirts - My Store");
        return this;
    }

    /** Link to Blouses Page **/
    public CategoriesMenu linkToBlouses() {
        driver.findElement(By.linkText("Blouses")).click();
        Assert.assertEquals(driver.getTitle(), "Blouses - My Store");
        return this;
    }

    /** Link to Casual Dresses Page **/
    public CategoriesMenu linkToCasualDresses() {
        driver.findElement(By.linkText("Casual Dresses"));
        Assert.assertEquals(driver.getTitle(), "Casual Dresses - My Store");
        return this;
    }

    /** Link to Evening Dresses Page **/
    public CategoriesMenu linkToEveningDresses() {
        driver.findElement(By.linkText("Evening Dresses")).click();
        Assert.assertEquals(driver.getTitle(), "Evening Dresses - My Store");
        return this;
    }

    /** Link to Summer Dresses **/
    public CategoriesMenu linkToSummerDresses() {
        driver.findElement(By.linkText("Summer Dresses")).click();
        Assert.assertEquals(driver.getTitle(), "Summer Dresses - My Store");
        return this;
    }
}
