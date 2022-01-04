package TestNG.InvocationCount;

import Config.Base;
import org.testng.annotations.Test;

public class InvocationCounter extends Base {
    int i=1;
    @Test(invocationCount = 2)
    public void TC1()
    {
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        System.out.println(i+" Defe tekrarlandi");
        i++;
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
    }
//    @Test(alwaysRun = true)
//    public void TC2()
//    {
//        driver.get("http://demo.guru99.com/test/delete_customer.php");
//        System.out.println(i+" Defe tekrarlandi");
//        i++;
//        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
//    }

}
