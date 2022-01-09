package TestNG.Listeners.IAnnotationTransformer.ITransformer.IAnnotationChanger.example2;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyListener implements IAnnotationTransformer {
    int setPriorityforGoogleCase=1;
    int setPriorityforTC_02=0;
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        if (testMethod.getName().equals("verifyTitleGoogle")) {
            annotation.setPriority(setPriorityforGoogleCase);
        }
        if (testMethod.getName().equals("TC_02")) {
            annotation.setPriority(setPriorityforTC_02);
        }
    }
}
