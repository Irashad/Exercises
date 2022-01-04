package TestCases;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;

public class Alert extends Base {
    @Test
    private void Alert() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(2000);
        WebElement text = driver.findElement(By.name("cusid"));
        text.sendKeys("199");
        driver.findElement(By.name("submit")).submit();
        String msg = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(msg);

    }

}
