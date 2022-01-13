package POM.POMExampleFactory;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class LoginCase {

    WebDriver driver;
    Guru99Login objLogin;
    Guru99HomePage objHomePage;

    @BeforeSuite
    public void before()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
    }

    /**

     * This test go to http://demo.guru99.com/V4/

     * Verify login page title as guru99 bank

     * Login to application

     * Verify the home page using Dashboard message

     */

    @Test(priority=0)
    public void test_Home_Page_Appear_Correct(){
        //Create Login Page object
        objLogin = new Guru99Login(driver);
        //Verify login page title
        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        //login to application
        objLogin.loginToGuru99("mngr377286", "ydApAde");
        // go the next page
        objHomePage = new Guru99HomePage(driver);
        //Verify home page
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr377286"));

    }

}