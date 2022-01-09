package TestNG.Listeners.ISuiteListener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListeners  implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        ISuiteListener.super.onStart(suite);
        System.out.println("START(): " + suite.getName());
    }

    @Override
    public void onFinish(ISuite suite) {
        ISuiteListener.super.onFinish(suite);
        System.out.println("ONFINISH(): " + suite.getName());

    }
}
