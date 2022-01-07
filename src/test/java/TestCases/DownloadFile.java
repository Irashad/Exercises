package TestCases;

import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class DownloadFile {
    //TODO:
    boolean exists;
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

        String path = "C:\\Wget\\msgr11us.exe";
        try{
            FileReader fr = new FileReader(path);
            exists=true;
        } catch (FileNotFoundException e) {

        }
        if(exists)
        {
            System.out.println("file yuklenib");
        }
            Assert.assertTrue(exists);
    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}


