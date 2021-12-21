package Elements;

import HelpClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Catalog extends BasePage {
    public Catalog(WebDriver driver) {
        super(driver);
    }

    /** Select product in Stock **/
    public Catalog availabilityInStock() {
        driver.findElement(By.id("layered_quantity_1")).click();
        return this;
    }

    /** Select fashion manufacture **/
    public Catalog manufactureFashion() {
        driver.findElement(By.id("layered_manufacturer_1")).click();
        return this;
    }

    /** Select new **/
    public Catalog conditionSelectNew() {
        driver.findElement(By.id("layered_condition_new")).click();
        return this;
    }

    /** Select product color Beige **/
    public Catalog colorBeige() {
        driver.findElement(By.name("layered_id_attribute_group_7")).click();
        return this;
    }

    /** Select product color White **/
    public Catalog colorWhite() {
        driver.findElement(By.name("layered_id_attribute_group_8")).click();
        return this;
    }

    /** Select product color Black **/
    public Catalog colorBlack() {
        driver.findElement(By.name("layered_id_attribute_group_11")).click();
        return this;
    }

    /** Select product color Orange **/
    public Catalog colorOrange() {
        driver.findElement(By.name("layered_id_attribute_group_13")).click();
        return this;
    }
    /** Select product color Blue **/
    public Catalog colorBlue() {
        driver.findElement(By.name("layered_id_attribute_group_14")).click();
        return this;
    }

    /** Select product color Green **/
    public Catalog colorGreen() {
        driver.findElement(By.name("layered_id_attribute_group_15")).click();
        return this;
    }

    /** Select product color Yellow **/
    public Catalog colorYellow() {
        driver.findElement(By.name("layered_id_attribute_group_16")).click();
        return this;
    }

    /** Select product color Pink **/
    public Catalog colorPink() {
        driver.findElement(By.name("layered_id_attribute_group_24")).click();
        return this;
    }

    /** Select product category T-Shirts **/
    public Catalog categoryTshirts() {
        driver.findElement(By.id("layered_category_5")).click();
        return this;
    }

    /** Select product category Blouses **/
    public Catalog categoryBlouses() {
        driver.findElement(By.id("layered_category_7")).click();
        return this;
    }

    /** Select product category Casual Dresses **/
    public Catalog categoryCasualDresses() {
        driver.findElement(By.id("layered_category_9")).click();
        return this;
    }

    /** Select product category Evening Dresses **/
    public Catalog categoryEveningDresses() {
        driver.findElement(By.id("layered_category_10")).click();
        return this;
    }

    /** Select product category Summer Dresses **/
    public Catalog categorySummerDresses() {
        driver.findElement(By.id("layered_category_11")).click();
        return this;
    }

    /** Select product composition Polyester **/
    public Catalog compositionPolyester() {
        driver.findElement(By.id("layered_id_feature_1")).click();
        return this;
    }

    /** Select Catalog composition Viscose **/
    public Catalog compositionViscose() {
        driver.findElement(By.id("layered_id_feature_3")).click();
        return this;
    }

    /** Select product composition Cotton **/
    public Catalog compositionCotton() {
        driver.findElement(By.id("layered_id_feature_5")).click();
        return this;
    }

    /** Select product style Casual **/
    public Catalog styleCasual() {
        driver.findElement(By.id("layered_id_feature_11")).click();
        return this;
    }

    /** Select product style Girly **/
    public Catalog styleGirly() {
        driver.findElement(By.id("layered_id_feature_13")).click();
        return this;
    }

    /** Select product style Dressy **/
    public Catalog styleDressy() {
        driver.findElement(By.id("layered_id_feature_16")).click();
        return this;
    }

    /** Select product size S **/
    public Catalog sizeS() {
        driver.findElement(By.id("layered_id_attribute_group_1")).click();
        return this;
    }

    /** Select product size M **/
    public Catalog sizeM() {
        driver.findElement(By.id("layered_id_attribute_group_2")).click();
        return this;
    }

    /** Select product size L **/
    public Catalog sizeL() {
        driver.findElement(By.id("layered_id_attribute_group_3")).click();
        return this;
    }

    /** Select property Colorful Dress **/
    public Catalog propertyColorfulDress() {
        driver.findElement(By.id("layered_id_feature_18")).click();
        return this;
    }

    /** Select product property Short Dress **/
    public Catalog propertyShortDress() {
        driver.findElement(By.id("layered_id_feature_19")).click();
        return this;
    }

    /** Select product property Midi Dress **/
    public Catalog propertyMidiDress() {
        driver.findElement(By.id("layered_id_feature_20")).click();
        return this;
    }

    /** Select product property Maxi Dress **/
    public Catalog propertyMaxiDress() {
        driver.findElement(By.id("layered_id_feature_21")).click();
        return this;
    }
}
