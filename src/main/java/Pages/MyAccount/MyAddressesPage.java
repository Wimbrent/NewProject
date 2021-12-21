package Pages.MyAccount;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAddressesPage extends BasePage {
    public MyAddressesPage(WebDriver driver) {
        super(driver);
    }

    /** Button Update Address **/
    public MyAddressesPage updateAddress() {
        driver.findElement(By.xpath("//a[@title = 'Update']")).click();
        return this;
    }

    /** Button Delete Address **/
    public MyAddressesPage deleteAddress() {
        driver.findElement(By.xpath("//a[@title = 'Delete']")).click();
        driver.switchTo().alert().accept();
        return this;
    }

    /** Button new Address **/
    public MyAddressesPage newAddress() {
        driver.findElement(By.xpath("//a[@title = 'Add an address']")).click();
        return this;
    }
    /** Button submit **/
    public MyAddressesPage submit() {
        driver.findElement(By.id("submitAddress")).click();
        return this;
    }
}
