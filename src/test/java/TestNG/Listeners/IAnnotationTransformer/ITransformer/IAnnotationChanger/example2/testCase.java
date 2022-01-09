package TestNG.Listeners.IAnnotationTransformer.ITransformer.IAnnotationChanger.example2;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testCase {
    WebDriver driver;
    int i=1;
    @Test(priority = 0)
    public void verifyTitleGoogle()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
        driver.get("https://google.com");
        System.out.println("Method: verifyTitleGoogle called");
        Assert.assertEquals(driver.getTitle(),"Google");
        i++;
    }

    @Test(priority = 1)
    public void TC_02()
    {
        System.out.println("Method: TC_02 called");
        Assert.assertTrue(true);

    }
}
