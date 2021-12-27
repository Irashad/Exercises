package TestCases;

import Config.Base;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.ThreadFactory;

public class rightClick extends Base {

    @Test
    public void rightClick() throws InterruptedException {
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        /*Actions builder = new Actions(driver);
        Action action =builder.contextClick().build();
        action.perform();*/


         new Actions(driver).contextClick().build().perform();


    }

}
