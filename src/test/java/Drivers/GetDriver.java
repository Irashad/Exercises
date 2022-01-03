package Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GetDriver {

    public static WebDriver getChromeDriver()
    {
        //BEFORE
        return new ChromeDriver();
    }


    public static WebDriver getFirefoxDriver()
    {
        return new FirefoxDriver();
    }









    /*AFTER
    *     public static WebDriver getChromeDriver()
    {
        return new ChromeDriver();
    }
    public static WebDriver getFirefoxDriver()
    {
        return new FirefoxDriver();
    }*/


}
