package TestNG.ParallelTesting.ParallelGroups;

import Config.Base;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class dependsOnMethodWithXML  {

    @Test(groups = "TC1Group")
    public void TC_001() throws InterruptedException {

        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        WebDriver d1 = GetDriver.getChromeDriver();
        System.out.println("TC_001 has started");
        d1.get("http://demo.guru99.com/V4/");
        System.out.println("TC_001 has finished");
    }
    @Test(groups = "TC2Group")
    public void TC_002()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        WebDriver d2 = GetDriver.getChromeDriver();
        System.out.println("TC_002 has started");
        d2.get("http://demo.guru99.com/test/simple_context_menu.html");
        System.out.println("TC_002 has finished");
    }
}
