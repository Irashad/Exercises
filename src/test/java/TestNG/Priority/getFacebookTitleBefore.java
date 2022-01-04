package TestNG.Priority;

import Config.Base;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static Config.Base.driver;

public class getFacebookTitleBefore  {

    @BeforeSuite
    public void before()
    {

    }
    // Method 1: Open Brower say Chrome
    @Test
    public void openBrowser() {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
    }

    // Method 2: Launch Google.com
    @Test
    public void launchGoogle() {
        driver.get("http://www.google.co.in");
    }

    // Method 3: Perform a search using "Facebook"
    @Test
    public void peformSeachAndClick1stLink() {
        driver.findElement(By.name("q")).sendKeys("Facebook");
    }

    // Method 4: Verify Google search page title.
    @Test
    public void FaceBookPageTitleVerification() throws Exception {
        driver.findElement(By.name("btnK")).submit();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle().contains("Facebook - Google"), true);
    }

    @AfterSuite
    public void after()
    {
        System.out.println("Test Finished");
    }
}
