package TestNG.ParallelTesting.ParallelClasses;

import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class parallelClasses {
    @Test
    public void method1()
    {
        System.out.println("paralel 1");
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        WebDriver driver = GetDriver.getChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
    }
    @Test
    public void method2()
    {
        System.out.println("paralel 1");
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        WebDriver driver = GetDriver.getChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
    }
}
