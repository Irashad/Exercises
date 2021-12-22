package compro;
import Drivers.DriversPath;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.Driver;
import java.time.Duration;

public class firstTestCase {
    //xpath
    String chromePath="C:\\Users\\resha\\IdeaProjects\\ders\\src\\test\\java\\compro\\chromedriver.exe";
    WebDriver driver;
    public static WebDriverWait wait;
    @BeforeSuite
    public void before()
    {


        System.setProperty("webdriver.chrome.driver", DriversPath.chromePath );
        driver = new ChromeDriver();
    }
    @Test
    public void testcase1() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div//input[@placeholder='Full Name']")).click();
        driver.findElement(By.xpath("//div//input[@placeholder='Full Name']")).sendKeys("Amil");
        //Assert.assertTrue(false,"sss");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(true,false);
        softAssert.assertAll();
        driver.get("https://demoqa.com/text-box");


    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}


}
