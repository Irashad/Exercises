package TestNG.SkipTest;

import Drivers.DriversPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_Skip_Tests  {
    WebDriver driver;
    @BeforeTest
    public void beforet()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = new ChromeDriver();

    }
    @Test
    public void successTC1() throws InterruptedException {
        /**THIS TEST CASE WILL PASS*/
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Assert.assertTrue(true);

    }
    @Test
    public void failTC2() throws InterruptedException {
        /**THIS TEST CASE WILL FAIL*/
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Assert.assertTrue(false);

    }
    @Test
    public void skipTestOnParticularCondition()
    {
        /**THIS TEST CASE WILL SKIP*/
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
    @Test
    public void successTC5()
    {
        System.out.println("it will success");
    }



    @Test(enabled = false)
    public void skipTest()
    {
        /**THIS TEST CASE WILL SKIP*/
        System.out.println("Will skip");
    }
    @AfterTest
    public void afterTest()
    {

    }
}
