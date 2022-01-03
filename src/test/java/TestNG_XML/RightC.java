package TestNG_XML;

import Drivers.DriversPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightC {
    WebDriver driver;
    @BeforeTest
    public void beforet()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = new ChromeDriver();

    }
    @Test
    public void rightClick()
    {
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        /*Actions builder = new Actions(driver);
        Action action =builder.contextClick().build();
        action.perform();*/
        new Actions(driver).contextClick().build().perform();
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("Right Click testi bitdi");
    }
}
