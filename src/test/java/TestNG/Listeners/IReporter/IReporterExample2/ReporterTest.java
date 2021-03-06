package TestNG.Listeners.IReporter.IReporterExample2;

import Config.Base;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReporterListener.class)
public class ReporterTest extends Base {

    @Test
    public void FirstTest()
    {
        System.out.println("The First Test Method");
        Assert.assertTrue(true);
    }

    @Test
    public void SecondTest()
    {
        System.out.println("The Second Test Method");
        Assert.fail("Failing this test case");
    }

    @Test
    public void ThirdTest()
    {
        System.out.println("The Third Test Method");
        throw new SkipException("Test Skipped");
    }
}
