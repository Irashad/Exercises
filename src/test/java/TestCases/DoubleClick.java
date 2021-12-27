package TestCases;

import Config.Base;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DoubleClick extends Base {

    @Test
    public void doubleClick() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        new Actions(driver).doubleClick(link).build().perform();
        ///Actions builder = new Actions(driver);
        //Action action =builder.doubleClick(link).build(); action.perform();
        //or
        // ---  Action action =builder.doubleClick(target WebElement).build();

        driver.switchTo().alert().accept();
        Thread.sleep(3000);

    }
}


