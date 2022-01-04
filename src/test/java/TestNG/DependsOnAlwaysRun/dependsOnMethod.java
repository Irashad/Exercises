package TestNG.DependsOnAlwaysRun;

import Config.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethod extends Base {

    int i=1;
    @Test()
    public void TC1()
    {
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        //System.out.println(i+" Defe tekrarlandi");
        i++;
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        Assert.assertFalse(true);
    }
    @Test(dependsOnMethods = {"TC1"} , alwaysRun = true)
    public void TC2()
    {
        driver.get("http://demo.guru99.com/test/delete_customer.php");
     //   System.out.println(i+" Defe tekrarlandi");
        System.out.println("TC2 methoduna girildi");
        i++;
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
    }
}
