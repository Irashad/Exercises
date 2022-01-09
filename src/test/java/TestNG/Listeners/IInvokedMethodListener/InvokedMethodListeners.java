package TestNG.Listeners.IInvokedMethodListener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class InvokedMethodListeners implements IInvokedMethodListener {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        IInvokedMethodListener.super.beforeInvocation(method, testResult);
        if(method.isConfigurationMethod())
        {
            System.out.println("BEFORE INVOCATION: Config Method: "+ testResult.getName());
        }
        if(method.isTestMethod())
        {
            System.out.println("BEFORE INVOCATION: Test Method: "+ testResult.getName());
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        IInvokedMethodListener.super.afterInvocation(method, testResult);
        if(method.isConfigurationMethod())
        {
            System.out.println("AFTER INVOCATION: Config Method: "+ testResult.getName());
        }
        if(method.isTestMethod())
        {
            System.out.println("AFTER INVOCATION: Test Method: "+ testResult.getName());

        }
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        IInvokedMethodListener.super.beforeInvocation(method, testResult, context);
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        IInvokedMethodListener.super.afterInvocation(method, testResult, context);
    }
}
