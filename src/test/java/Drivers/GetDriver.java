package Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GetDriver {

    //BEFORE
    private static ChromeDriver chrome;
    private static FirefoxDriver firefox;
    public static WebDriver getChromeDriver()
    {
        chrome = new ChromeDriver();
        return chrome;
    }
    public static WebDriver getFirefoxDriver()
    {
        firefox = new FirefoxDriver();
        return firefox;
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
