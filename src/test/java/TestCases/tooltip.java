package TestCases;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class tooltip extends Base {
    @Test
    public void tooltip() throws InterruptedException {

        String expectedTitle="This is a button";
        driver.get("https://akryum.github.io/v-tooltip/#/");
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.cssSelector("button.tooltip-target"));
        Actions builder = new Actions(driver);
        Action movetoElement = builder.moveToElement(element).build();
        movetoElement.perform();
        String actualTitle= element.getAttribute("data-original-title");
        System.out.println(element.getAttribute("data-original-title"));
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
