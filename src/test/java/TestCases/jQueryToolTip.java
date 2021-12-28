package TestCases;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class jQueryToolTip extends Base {

    @Test
    public void jqueryTOOltip()
    {
        String baseUrl = "http://demo.guru99.com/test/tooltip.html";
        String expectedTooltip = "What's new in 3.2";
        driver.get(baseUrl);

        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
        Actions builder = new Actions (driver);
        Action moveToElement =  builder.clickAndHold().moveToElement(download).build();
        moveToElement.perform();

        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
        String actualTooltip = toolTipElement.getText();

        System.out.println("Actual Title of Tool Tip  "+actualTooltip);
        if(actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test Case Passed");
        }
        driver.close();

    }
}
