package compro;

import Drivers.DriversPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class movtoElement {

    WebDriver driver;
    @BeforeSuite
    public void before()
    {
        System.setProperty("webdriver.chrome.driver", DriversPath.chromePath);
        driver = new ChromeDriver();
    }
    @Test
    public void rightClick()
    {
     Actions builder = new Actions(driver);
     Action action = builder.contextClick().build();
     action.perform();

    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}
