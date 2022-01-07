package TestNG.Listeners.ITestListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class SuccessPercentage {
    int i=0;
    /**Eger 6 defenin 50 faizi testden kecse test success kimi goturulur*/
    @Test(successPercentage = 50,invocationCount = 6)
    public void test()
    {
        i++;
        System.out.println("This method meant to be fail");
        if(i >3)
        {
            Assert.assertTrue(true);

        }
        if(i < 4) {
            Assert.assertTrue(false);
        }
    }


}
