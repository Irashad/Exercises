package TestNG.Annotation;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class annotations {
    public WebDriver driver;
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    public String expected = null;
    public String actual = null;





    @BeforeTest
    public void launchBrowser() {
        System.out.println(" \"BEFORE TEST\" METHOD CALLED");
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
        driver.get(baseUrl);
    }

    @BeforeMethod
    public void verifyHomepageTitle() {
        System.out.println(" \"BEFORE METHOD\" METHOD CALLED");

    }
    @Test(priority = 0)
    public void register(){
        driver.findElement(By.linkText("REGISTER")).click() ;
        expected = "Register: Mercury Tours";
        actual = driver.getTitle();

    }
    @Test(priority = 1)
    public void support() {
        driver.findElement(By.linkText("SUPPORT")).click() ;
        expected = "Under Construction: Mercury Tours";
        actual = driver.getTitle();
    }
    @AfterMethod
    public void goBackToHomepage(){
        System.out.println(" \"AFTER METHOD\" METHOD CALLED");
        driver.findElement(By.linkText("Home")).click();
    }

    @AfterTest
    public void terminateBrowser(){
        System.out.println(" \"AFTER TEST\" METHOD CALLED");
        driver.close();
    }


}
