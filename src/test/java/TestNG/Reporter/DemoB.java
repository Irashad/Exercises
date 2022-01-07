package TestNG.Reporter;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB {
    WebDriver driver;

    @Test
    public void TC_02()
    {
        System.setProperty(DriversPath.firefoxProperty,DriversPath.firefoxPath);
        driver = GetDriver.getFirefoxDriver();
        Reporter.log("The browser is opened now");

        driver.manage().window().maximize();
        Reporter.log("Window maximized");
        driver.get("https://www.google.co.in");
        Reporter.log("Navigated to google.co");
        driver.findElement(By.name("q")).sendKeys("BYE");
        Reporter.log("The data \"BYE\" ");
    }
}
