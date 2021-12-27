package TestCases;

import Config.Base;
import org.testng.annotations.Test;

public class jQueryToolTip extends Base {

    @Test
    public void jqueryTOOltip()
    {
        String expectedTitle= "http://demo.guru99.com/release-notes";
        driver.get("http://demo.guru99.com/test/tooltip.html");

    }
}
