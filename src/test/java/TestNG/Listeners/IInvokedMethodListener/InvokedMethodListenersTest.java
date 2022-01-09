package TestNG.Listeners.IInvokedMethodListener;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value=InvokedMethodListeners.class)
public class InvokedMethodListenersTest {
    @Test
    public void test1()
    {
       // System.out.println("My first test");
    }

    @Test
    public void test2()
    {
     //   System.out.println("My second test");
    }

    @BeforeClass
    public void setUp() {
      //  System.out.println("Before Class method");
    }
    @AfterClass
    public void cleanUp() {
       // System.out.println("After Class method");
    }
}
