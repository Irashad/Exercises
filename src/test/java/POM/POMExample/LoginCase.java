package POM.POMExample;
import Drivers.DriversPath;
import Drivers.GetDriver;
import POM.POMExample.HomePAge;
import POM.POMExample.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginCase {
    LoginPage pgLogin;
    HomePAge pgHome;
    WebDriver driver;
    // password: ydApAde
    // username: mngr377286

    /**
     * This test case will login in http://demo.guru99.com/V4/
     * Verify login page title as guru99 bank
     * Login to application
     * Verify the home page using Dashboard message

     */
    @BeforeSuite
    public void before()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
    }


    @Test(priority=0)
    public void test_Home_Page_Appear_Correct() {
        //Create Login Page object
        pgLogin = new LoginPage(driver);
        //Verify login page title
        String loginPageTitle = pgLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        //login to application
        pgLogin.loginToGuru99("mngr377286", "ydApAde");
        // go the next page
        pgHome = new HomePAge(driver);
        //Verify home page
        Assert.assertTrue(pgHome.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr377286"));
    }
    @AfterSuite
    public void afterTest(){System.out.println("Test Finished Successfully");
      //  driver.quit();
    }

}
