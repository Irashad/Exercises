package TestNG.Priority;

import Config.Base;
import org.testng.annotations.Test;

public class PriorityAfter extends Base {

    /** Before Priority Annotation*/
    @Test(priority = 1)
    public void priorOne() throws InterruptedException {
        driver.get("http://www.demo.guru99.com/V4/");
        System.out.println("ikinci Test Case");


    }
    @Test(priority = 2)
    public void priorTwo() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        System.out.println("Sonuncu Test Case");
    }
    @Test()
    public void priorThree() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        System.out.println("birinci Test Case");
    }
}
