package TestCases;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Table extends Base {

    @Test
    public void tableTesting() throws InterruptedException {
        String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
        driver.get(baseUrl);
        Thread.sleep(3000);
        String textOfTable = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println(textOfTable);



    }


}
