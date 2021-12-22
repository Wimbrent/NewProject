package HelpClasses;

import Elements.*;
import Pages.*;
import Pages.Categories.CategoriesPage;
import Pages.Categories.ComparePage;
import Pages.Categories.ProductPage;
import Pages.Categories.CategoriesMenu;
import Pages.MyAccount.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    protected static WebDriver driver;

    public static Alert alert;
    public static Field field;
    public static CheckBox checkBox;
    public static Footer footer;
    public static YourPersonalInformationPage yourPersonalInformationPage;
    public static OrderHistoryAndDetailsPage orderHistoryAndDetailsPage;
    public static AuthenticationPage authenticationPage;
    public static Element element;
    public static ForgottenPasswordPage forgottenPasswordPage;
    public static CategoriesMenu categoriesMenu;
    public static MyAccountPage myAccountPage;
    public static MyAddressesPage myAddressesPage;
    public static MyWishlistPage myWishlistPage;
    public static CategoriesPage categoriesPage;
    public static ProductPage productPage;
    public static CheckoutPage checkoutPage;
    public static ComparePage comparePage;
    public static QuickView quickView;

    @BeforeSuite
    public void setDriver() {
        //System.setProperty("webdriver.gecko.driver", "/Users/wimbrent/IdeaProjects/Project/src/main/resources/geckodriver2");
        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/wimbrent/IdeaProjects/Project/src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("http://automationpractice.com/index.php");
    }

    @BeforeClass
    public void setClass() {
        alert = new Alert(driver);
        checkBox = new CheckBox(driver);
        field = new Field(driver);
        authenticationPage = new AuthenticationPage(driver);
        element = new Element(driver);
        forgottenPasswordPage = new ForgottenPasswordPage(driver);
        categoriesMenu = new CategoriesMenu(driver);
        categoriesPage = new CategoriesPage(driver);
        myAccountPage = new MyAccountPage(driver);
        myAddressesPage = new MyAddressesPage(driver);
        yourPersonalInformationPage = new YourPersonalInformationPage(driver);
        orderHistoryAndDetailsPage = new OrderHistoryAndDetailsPage(driver);
        myWishlistPage = new MyWishlistPage(driver);
        productPage = new ProductPage(driver);
        checkoutPage = new CheckoutPage(driver);
        comparePage = new ComparePage(driver);
        quickView = new QuickView(driver);
        footer = new Footer(driver);
    }



    public void screenshot(String name) {
        Screenshot screenshot = new AShot().shootingStrategy
                (ShootingStrategies.viewportPasting(ShootingStrategies.scaling(2f), 1000)).takeScreenshot(driver);
        try {
            ImageIO.write(screenshot.getImage(),
                    "jpg", new File("/Users/wimbrent/IdeaProjects/NewProject/Screens/" + name +".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void close() {
        driver.quit();
    }
}