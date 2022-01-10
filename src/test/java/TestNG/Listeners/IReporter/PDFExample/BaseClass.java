package TestNG.Listeners.IReporter.PDFExample;

import java.io.File;

import Drivers.DriversPath;
import Drivers.GetDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    static WebDriver driver;

    public static WebDriver getDriver() {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
        return driver;
    }
/*    public static WebDriver getDriver(){

        if(driver==null){

            WebDriver driver ;
            System.setProperty("webdriver.chrome.driver","C:\\Users\\resha\\IdeaProjects\\Exercises\\src\\test\\java\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();


        }

        return driver;

    } */


    /**

     * This function will take screenshot

     * @param driver

     * @param fileWithPath

     * @throws Exception

     */

    public static void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);



    }

}
