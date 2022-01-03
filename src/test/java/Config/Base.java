package Config;

import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Base {

    public WebDriver driver;
    @BeforeSuite
    public void before()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();


    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}
