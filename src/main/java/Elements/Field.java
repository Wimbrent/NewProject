package Elements;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class Field extends BasePage {
    public Field(WebDriver driver) {
        super(driver);
    }

    /** Select title **/

    /** Enter your First Name **/
    public Field enterCustomerFirstName(String firstName) {
        driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
        return this;
    }

    /** Clear your First Name **/
    public Field clearCustomerFirstName() {
        driver.findElement(By.id("customer_firstname")).clear();
        return this;
    }

    /** Enter your Last Name **/
    public Field enterCustomerLastName(String lastName) {
        driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
        return this;
    }

    /** Clear your Last Name **/
    public Field clearCustomerLastName() {
        driver.findElement(By.id("customer_lastname")).clear();
        return this;
    }

    /** Select Day **/
    public Field day(String day) {
        Select select = new Select(driver.findElement(By.id("days")));
        select.selectByValue(day);
        return this;
    }

    /** Select Month **/
    public Field month(String month) {
        Select select = new Select(driver.findElement(By.id("months")));
        select.selectByValue(month);
        return this;
    }

    /** Select Year **/
    public Field year(String  year) {
        Select select = new Select(driver.findElement(By.id("years")));
        select.selectByValue(year);
        return this;
    }

    /** Enter your Email to Sign In **/
    public Field enterEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
        return this;
    }

    /** Clear your Email to Sign In **/
    public Field clearEmail() {
        driver.findElement(By.id("email")).clear();
        return this;
    }

    /** Enter your password **/
    public Field enterPassword(String password) {
        driver.findElement(By.id("passwd")).sendKeys(password);
        return this;
    }

    /** Enter first name **/
    public Field enterFirstName(String firstName) {
        driver.findElement(By.id("firstname")).sendKeys(firstName);
        return this;
    }

    /** Clear first name **/
    public Field clearFirstName() {
        driver.findElement(By.id("firstname")).clear();
        return this;
    }

    /** Enter last name **/
    public Field enterLastName(String lastName) {
        driver.findElement(By.id("lastname")).sendKeys(lastName);
        return this;
    }

    /** Clear last name **/
    public Field clearLastName() {
        driver.findElement(By.id("lastname")).clear();
        return this;
    }

    /** Enter your Company name **/
    public Field enterCompany(String company) {
        driver.findElement(By.id("company")).sendKeys(company);
        return this;
    }

    /** Clear your Company name **/
    public Field clearCompany() {
        driver.findElement(By.id("company")).clear();
        return this;
    }

    /** Enter your first Address **/
    public Field enterFirstAddress(String firstAddress) {
        driver.findElement(By.id("address1")).sendKeys(firstAddress);
        return this;
    }

    /** Clear your first Address **/
    public Field clearFirstAddress() {
        driver.findElement(By.id("address1")).clear();
        return this;
    }

    /** Enter your second Address **/
    public Field enterSecondAddress(String secondAddress) {
        driver.findElement(By.id("address2")).sendKeys(secondAddress);
        return this;
    }

    /** Enter your City **/
    public Field enterCity(String city) {
        driver.findElement(By.id("city")).sendKeys(city);
        return this;
    }

    /** Clear your City **/
    public Field clearCity() {
        driver.findElement(By.id("city")).clear();
        return this;
    }

    /** Select State **/
    public Field state(String state) {
        Select select = new Select(driver.findElement(By.id("id_state")));
        select.selectByVisibleText(state);
        return this;
    }

    /** Enter your post code **/
    public Field enterPostCode(String postCode) {
        driver.findElement(By.id("postcode")).sendKeys(postCode);
        return this;
    }

    /** Enter your post code **/
    public Field clearPostCode() {
        driver.findElement(By.id("postcode")).clear();
        return this;
    }

    /** Select Country **/
    public Field country(String country) {
        Select select = new Select(driver.findElement(By.id("id_country")));
        select.selectByVisibleText(country);
        return this;
    }

    /** Enter Additional Information **/
    public Field enterAdditionalInformation(String additional) {
        driver.findElement(By.id("other")).sendKeys(additional);
        return this;
    }

    /** Enter your home phone **/
    public Field enterHomePhone(String homePhone) {
        driver.findElement(By.id("phone")).sendKeys(homePhone);
        return this;
    }

    /** Enter your mobile phone **/
    public Field enterMobilePhone(String mobilePhone) {
        driver.findElement(By.id("phone_mobile")).sendKeys(mobilePhone);
        return this;
    }

    /** Clear your mobile phone **/
    public Field clearMobilePhone() {
        driver.findElement(By.id("phone_mobile")).clear();
        return this;
    }

    /** Assign an address alias for future reference **/
    public Field enterMyAddress(String myAddress) {
        driver.findElement(By.id("alias")).sendKeys(myAddress);
        return this;
    }

    public Field clearMyAddress() {
        driver.findElement(By.id("alias")).clear();
        return this;
    }

    /** Click submit Register **/
    public Field submitRegister() {
        driver.findElement(By.id("submitAccount")).click();
        return this;
    }
}
