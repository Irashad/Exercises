
package TestCases;
import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;
import java.time.Duration;

public class keydown extends Base{
    WebDriverWait wait;
    @Test
    public void ff() throws InterruptedException {
       // wait = new WebDriverWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(2000);
        WebElement textbox = driver.findElement(By.id("userName"));
       // textbox.sendKeys("bsss");

        Actions builder = new Actions(driver);
        Action action =  builder.sendKeys(textbox,"MLL").build();
        action.perform();



    }
}
