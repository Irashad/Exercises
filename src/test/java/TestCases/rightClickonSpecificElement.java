package TestCases;
import Drivers.DriversPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class rightClickonSpecificElement {
        WebDriver driver;
        @BeforeSuite
        public void before() {
            System.setProperty("webdriver.chrome.driver", DriversPath.chromePath);
            driver = new ChromeDriver();
        }





        @Test
        public void rightClickspecificelement() throws InterruptedException {
//Launch the Application Under Test (AUT)
            driver.get("http://demo.guru99.com/test/simple_context_menu.html");
            driver.manage().window().maximize();
// Right click the button to launch right click menu options
            Actions builder = new Actions(driver);
            WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
            Action action = builder.contextClick(link).build();
            action.perform();
// Click on Edit link on the displayed menu options
            WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
            element.click();
// Accept the alert displayed
            Thread.sleep(3000);
            driver.switchTo().alert().accept();
            Thread.sleep(3000);

// Closing the driver instance
//driver.quit();

        }









        @AfterTest
        public void afterTest() {
            System.out.println("Test Finished Successfully");
        }


    }