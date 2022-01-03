package TestNG_XML;

import Drivers.DriversPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class testcasesforFail {
    WebDriver driver;
    @BeforeTest
    public void beforet()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = new ChromeDriver();

    }
    @Test
    public void m1() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Assert.assertTrue(false);

    }
    @Test
    public void ssm() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Assert.assertTrue(true);

    }
    @Test
    public void skipTestOnParticularCondition()
    {
        System.out.println("Asagidaki sert odenmedikde test skip edilsin");
        int a=0;
        if(a == 5)
        {
            Assert.assertEquals(a,5);
        }
        else {
            throw new SkipException("Bu test case skip edilir. Shert odenmedi");
        }
    }
    @AfterTest
    public void afterTest()
    {

    }
}
