package TestNG.ParallelTesting.ParallelMethods;
import Drivers.DriversPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
    @Test()
    public void executSessionO() throws InterruptedException {
        //First session of WebDriver
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        WebDriver driver = new ChromeDriver();
        //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 1");

    }



    @Test
    public void executSessionB(){
        //Third session of WebDriver
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        WebDriver driver3 = new ChromeDriver();
        //Goto guru99 site
        driver3.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver3.findElement(By.name("uid")).sendKeys("Driver 3");
    }


}
