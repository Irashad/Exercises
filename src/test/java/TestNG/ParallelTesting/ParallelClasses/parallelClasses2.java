package TestNG.ParallelTesting.ParallelClasses;

import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class parallelClasses2 {
    @Test
    public void method2(){
        System.out.println("paralel 2");
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        WebDriver driver = GetDriver.getChromeDriver();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
    }
}
