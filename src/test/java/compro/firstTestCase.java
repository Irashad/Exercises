package compro;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class firstTestCase {
    String chromePath="C:\\Users\\resha\\chromedriver_win32";
    WebDriver driver;
    @BeforeSuite
    public void before()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\resha\\IdeaProjects\\ders\\src\\test\\java\\compro\\chromedriver.exe");

        driver = new ChromeDriver();
    }
    @Test
    public void testcase1()
    {
        driver.get("https://stackoverflow.com/questions/62732890/intellij-error-test-framework-quit-unexpectedly-intellij");
        System.out.println("sasd");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("Test Bitdi");
    }


}
