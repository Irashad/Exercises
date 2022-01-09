package TestNG.Listeners.ISuiteListener.Suite1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteListenersTests1 {
    @BeforeSuite
    public void test1()
    {
        System.out.println("Suite1: test1");
    }


    @Test
    public void test2()
    {
        System.out.println("Suite1: test2");
    }

    @AfterSuite
    public void test3()
    {
        System.out.println("Suite1: test3");
    }
}
