package TestCases;

import Config.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NestedTables extends Base {
    @Test
    public void NestedTableHandling() throws InterruptedException {
        String baseUrl = "http://demo.guru99.com/test/accessing-nested-table.html";
        driver.get(baseUrl);
        Thread.sleep(3000);
        String innerText = driver.findElement(
                By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText();
        System.out.println(innerText);



    }
}
