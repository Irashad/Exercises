package TestNG.Listeners.ITestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerTest implements ITestListener {

    /**Invoked each time before a test will be invoked.*/
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName()+" test case started");
    }

    /**Invoked each time a test succeeds*/
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The name of the testcase passed is :"+result.getName());
    }

    /**Invoked each time a test fails*/
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The name of the testcase failed is :"+result.getName());

    }
    /**Invoked each time a test is skipped.*/
    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println("The name of the testcase skipped is :"+result.getName());
    }

    /**Invoked each time a method fails but has been
     *  annotated with successPercentage and this failure still keeps it within the success percentage requested.*/
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("The name of the testcase failed but witihn success percentage :"+result.getName());

    }

    /**Invoked each time a test fails due to a timeout.*/
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println(result.getName()+ " test case timeout ile bitdi");
    }
    /**
     Invoked before running all the test methods belonging to the
     classes inside the <test> tag and calling all their Configuration methods..*/
    @Override
    public void onStart(ITestContext context) {
        System.out.println("On Start methodu cagrildi: " + context.getName()+ " daha umumi basladi");
    }

    /** Called when all tests are executed*/
    @Override
    public void onFinish(ITestContext context) {
        System.out.println(context.getName()+ " daha umumi bitdi");
    }
}
