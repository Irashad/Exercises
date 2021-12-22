package compro;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class forthtest {

    String chromePath="C:\\Users\\resha\\IdeaProjects\\ders\\src\\test\\java\\compro\\chromedriver.exe";
    WebDriver driver;
    public static WebDriverWait wait;
    public static Wait waitFluent;
    @BeforeSuite
    public void before()
    {
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
    }
    @Test
    public void testcase1() throws InterruptedException {
        waitFluent = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(1))
                                .ignoring(NoSuchElementException.class);

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
