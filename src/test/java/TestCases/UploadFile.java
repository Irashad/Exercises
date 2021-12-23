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

import java.io.IOException;
import java.sql.DriverManager;

public class UploadFile {
    //TODO:

    WebDriver driver;
    @BeforeSuite
    public void before()
    {
        System.setProperty(DriversPath.chromeProperty, DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();

    }
    @Test
    public void getUrl() throws InterruptedException {
        driver.manage().window().maximize();
        String url = "http://demo.guru99.com/test/upload/";
        driver.get(url);
        Thread.sleep(5000);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Wget\\upo.txt");
        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();
        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();

    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}


