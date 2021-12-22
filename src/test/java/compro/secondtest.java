package compro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Set;

public class secondtest {
    String chromePath="C:\\Users\\resha\\IdeaProjects\\ders\\src\\test\\java\\compro\\chromedriver.exe";
    WebDriver driver;
    @BeforeSuite
    public void before()
    {
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
    }
    @Test
    public void testcase1() throws InterruptedException {
        // driver.get("https://demoqa.com/text-box");
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(3000);
        String ourFirstWindow=driver.getWindowHandle();
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(400);
        Set <String> allHandles =  driver.getWindowHandles();
        Thread.sleep(5000);
        driver.switchTo().window(ourFirstWindow);
        Thread.sleep(5000);
        for(String windowhandle : allHandles)
        {

            if(!windowhandle.equals(ourFirstWindow))
            {
                driver.switchTo().window(windowhandle);
            }
        }

    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}


}
