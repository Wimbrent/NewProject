package Elements;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Footer extends BasePage {
    public Footer(WebDriver driver) {
        super(driver);
    }

    public Footer linkToWomen() {
        driver.findElement(By.xpath("//ul[@class = 'tree dynamized']/li/a")).click();
        Assert.assertEquals(driver.getTitle(), "Women - My Store");
        return this;
    }

    public Footer linkToSpecials() {
        driver.findElement(By.xpath("//section[@id = 'block_various_links_footer']/ul/li[1]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Prices drop - My Store");
        return this;
    }

    public Footer linkToNewProducts() {
        driver.findElement(By.xpath("//section[@id = 'block_various_links_footer']/ul/li[2]/a")).click();
        Assert.assertEquals(driver.getTitle(), "New products - My Store");
        return this;
    }

    public Footer linkToBestSellers() {
        driver.findElement(By.xpath("//section[@id = 'block_various_links_footer']/ul/li[3]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Best sales - My Store");
        return this;
    }

    public Footer linkToOurStores() {
        driver.findElement(By.xpath("//section[@id = 'block_various_links_footer']/ul/li[4]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Stores - My Store");
        return this;
    }

    public Footer linkToContactUS() {
        driver.findElement(By.xpath("//section[@id = 'block_various_links_footer']/ul/li[5]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Contact us - My Store");
        return this;
    }

    public Footer linkToTermsAndConditionsOfUse() {
        driver.findElement(By.xpath("//section[@id = 'block_various_links_footer']/ul/li[6]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Terms and conditions of use - My Store");
        return this;
    }

    public Footer linkToAboutUS() {
        driver.findElement(By.xpath("//section[@id = 'block_various_links_footer']/ul/li[7]/a")).click();
        Assert.assertEquals(driver.getTitle(), "About us - My Store");
        return this;
    }

    public Footer linkToSiteMap() {
        driver.findElement(By.xpath("//section[@id = 'block_various_links_footer']/ul/li[8]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Sitemap - My Store");
        return this;
    }

    public Footer linkToMyAccount() {
        driver.findElement(By.xpath("//a[@title = 'Manage my customer account']")).click();
        Assert.assertEquals(driver.getTitle(), "My account - My Store");
        return this;
    }

    public Footer linkToMyOrders() {
        driver.findElement(By.xpath("//ul[@class = 'bullet']/li[1]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Order history - My Store");
        return this;
    }

    public Footer linkToMyCreditSlips() {
        driver.findElement(By.xpath("//ul[@class = 'bullet']/li[2]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Order slip - My Store");
        return this;
    }

    public Footer linkToMyAddress() {
        driver.findElement(By.xpath("//ul[@class = 'bullet']/li[3]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Addresses - My Store");
        return this;
    }

    public Footer linkToMyPersonalInfo() {
        driver.findElement(By.xpath("//ul[@class = 'bullet']/li[4]/a")).click();
        Assert.assertEquals(driver.getTitle(), "Identity - My Store");
        return this;
    }

    public Footer logout() {
        driver.findElement(By.xpath("//ul[@class = 'bullet']/li[5]/a")).click();

        return this;
    }
}