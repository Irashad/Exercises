package TestNG.DataProvider.DataProvider.DataProviderInOneClass;
import java.util.concurrent.TimeUnit;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterByDataprovider {
WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }

    /** Test case to verify google search box
     * @param author
     * @param searchKey
     * @throws InterruptedException
     */

    @Test(dataProvider="SearchProvider")
    public void testMethod(String author,String searchKey) throws InterruptedException{
        {
            WebElement searchText = driver.findElement(By.name("q"));
            //search value in google searchbox
            searchText.sendKeys(searchKey);
            System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
            Thread.sleep(3000);
            String testValue = searchText.getAttribute("value");
            System.out.println(testValue +"::::"+searchKey);
            searchText.clear();
            //Verify if the value in google search box is correct
            Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
        }
    }
    /**
     * @return Object[][] where first column contains 'author'
     * and second column contains 'searchKey'
     */

    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
        return new Object[][]
                {
                        { "Guru99", "India" },
                        { "Krishna", "UK" },
                        { "Bhupesh", "USA" }
                };

    }


}

