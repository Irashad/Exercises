package TestCases;

import Drivers.DriversPath;
import Drivers.GetDriver;
import com.sun.xml.internal.bind.v2.TODO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.DriverManager;

public class DownloadFile {
    //TODO:

    WebDriver driver;
    @BeforeSuite
    public void before()
    {
        System.setProperty(DriversPath.chromeProperty, DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();

    }
    @Test
    public void getUrl() throws InterruptedException {
        driver.manage().window().maximize();
        String url = "http://demo.guru99.com/test/yahoo.html";
        driver.get(url);
        Thread.sleep(5000);
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");
        String wget_command = "cmd /c C:\\Wget\\wget.exe -P C:\\Wget " + sourceLocation;
        try {
            Process exec = Runtime.getRuntime().exec(wget_command);
            int exitVal = exec.waitFor();
            System.out.println("Exit vallue: " + exitVal);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }

        //filen movcud olmasini yoxlamaq
        boolean exists=false;
        String path = "C:\\Wget\\msgr11us.exe";
        try{
            FileReader fr = new FileReader(path);
            exists=true;
        } catch (FileNotFoundException e) {
        }

        if(exists)
        {
            System.out.println("File yuklenib");
        }
        else {
            System.out.println("File yuklenmeyib");
        }


    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}


