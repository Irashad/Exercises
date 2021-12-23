package TestCases;

import Drivers.DriversPath;
import Drivers.GetDriver;
import com.sun.xml.internal.bind.v2.TODO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.sql.DriverManager;

public class DriverAbstractionAfter {
    //TODO:

    WebDriver driver;
    @BeforeSuite
    public void before()
    {
        System.setProperty(DriversPath.firefoxProperty, DriversPath.firefoxPath);
        driver = GetDriver.getFirefoxDriver();

    }
    @Test
    public void getUrl(){
        driver.manage().window().maximize();
        String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
        driver.get(url);
    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}
