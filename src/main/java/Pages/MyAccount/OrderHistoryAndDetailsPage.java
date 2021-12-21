package Pages.MyAccount;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderHistoryAndDetailsPage extends BasePage {
    public OrderHistoryAndDetailsPage(WebDriver driver) {
        super(driver);
    }

    /** Button Reorder **/
    public OrderHistoryAndDetailsPage reorder() {
        driver.findElement(By.xpath("//a[@title = 'Reorder']")).click();
        return this;
    }

    /** Select product **/
    public OrderHistoryAndDetailsPage selectProduct(String value) {
        Select select = new Select(driver.findElement(By.id("id_product")));
        select.selectByValue(value);
        return this;
    }

    /** Add comment **/
    public OrderHistoryAndDetailsPage addComment(String comment) {
        driver.findElement(By.name("msgText")).sendKeys(comment);
        return this;
    }

    /** Button send **/
    public OrderHistoryAndDetailsPage send() {
        driver.findElement(By.name("submitMessage")).click();
        return this;
    }

    /** Button Details **/
    public OrderHistoryAndDetailsPage details() {
        driver.findElement(By.xpath("//td[@class = 'history_detail footable-last-column']/a[1]")).click();
        return this;
    }

    /** Download pdf **/
    public OrderHistoryAndDetailsPage downloadPDF() {
        driver.findElement(By.xpath("//a[@title = 'Invoice']")).click();
        return this;
    }
}