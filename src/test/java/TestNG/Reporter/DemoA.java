package TestNG.Reporter;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.IReporter;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoA {

    WebDriver driver;

    @Test()
    public void TC_01()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
        Reporter.log("The browser is opened now");
        driver.manage().window().maximize();
        Reporter.log("The browser is maximized");
        driver.get("https://www.google.com");
        Reporter.log("The google website is opened");
        driver.findElement(By.name("q")).sendKeys("HI");
        Reporter.log("The data \"HI\" is Entered");
        Reporter.log("Log level 0: ",0);
        Reporter.log("Log level true: ",true);
        Reporter.log("Log level false: ",false);


    }


}
