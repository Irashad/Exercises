package TestNG.Listeners.IAnnotationTransformer.ITransformer.IAnnotationChanger.example1;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase {
    WebDriver driver;
    int i=1;
    @Test(invocationCount = 6)
    public void verifyTitleGoogle()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
        driver.get("https://google.com");
        System.out.println("Test Case Executed: "+i+" Times.");
        Assert.assertEquals(driver.getTitle(),"Google");
        i++;
    }
}
