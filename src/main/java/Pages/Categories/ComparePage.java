package Pages.Categories;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparePage extends BasePage {
    public ComparePage(WebDriver driver) {
        super(driver);
    }

    /** Button add to cart **/
    public ComparePage addToCart() {
        driver.findElement(By.xpath("//a[@title = 'Add to cart']")).click();
        return this;
    }

    /** Button view **/
    public ComparePage view() {
        driver.findElement(By.xpath("//a[@title = 'View']")).click();
        return this;
    }

    /** Button remove **/
    public ComparePage remove(String number) {
        driver.findElement(By.xpath("//a[@title = 'Remove' and @data-id-product='" + number + "']")).click();
        return this;
    }
}
