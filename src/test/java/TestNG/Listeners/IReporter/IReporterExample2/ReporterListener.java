package TestNG.Listeners.IReporter.IReporterExample2;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.reporters.IReporterConfig;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Map;

public class ReporterListener implements IReporter {
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        IReporter.super.generateReport(xmlSuites, suites, outputDirectory);
        for(ISuite isuite : suites)
        {
            Map<String, ISuiteResult> suiteResults= isuite.getResults();
            String sn = isuite.getName();

            for(ISuiteResult obj : suiteResults.values())
            {
                ITestContext tc = obj.getTestContext();

                System.out.println("Passed Tests of"  + sn + "=" +  tc.getPassedTests().getAllResults().size());

                System.out.println("Failed Tests of"  + sn + "=" +  tc.getFailedTests().getAllResults().size());

                System.out.println("Skipped Tests of"  + sn + "=" +  tc.getSkippedTests().getAllResults().size());
            }

        }
    }


}
