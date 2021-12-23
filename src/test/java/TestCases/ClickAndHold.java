package TestCases;

import Drivers.DriversPath;
import com.sun.xml.internal.bind.v2.TODO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClickAndHold {
   //TODO:

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
        driver.manage().window().maximize();

        String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
        driver.get(url);

        WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));

        Actions builder = new Actions(driver);

        Action movetoElement = builder.moveToElement(titleC).build(); // Call clickAndHold() method to perform click and hold operation.
        movetoElement.perform();

        Action clickAndHold = builder.clickAndHold().build();
        clickAndHold.perform();

        Action moveToAnotherSide = builder.moveToElement(driver.findElement(By.xpath("//h3[contains(text(),'Click and Hold in')]"))).build();
        moveToAnotherSide.perform();
    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}
