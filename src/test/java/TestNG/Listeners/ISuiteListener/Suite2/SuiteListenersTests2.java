package TestNG.Listeners.ISuiteListener.Suite2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteListenersTests2 {
    @BeforeSuite
    public void test1()
    {
        System.out.println("Suite2: test3");
    }


    @Test
    public void test2()
    {
        System.out.println("Suite2: test2");
    }

    @AfterSuite
    public void test3()
    {
        System.out.println("Suite2: test3");
    }
}
