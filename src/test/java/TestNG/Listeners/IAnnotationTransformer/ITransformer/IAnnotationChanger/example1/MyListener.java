package TestNG.Listeners.IAnnotationTransformer.ITransformer.IAnnotationChanger.example1;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyListener implements IAnnotationTransformer {
    short invocationCounty=3;
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
        System.out.println("your method name is "+testMethod.getName());
        if (testMethod.getName().equals("verifyTitleGoogle")) {
            annotation.setInvocationCount(invocationCounty);
        }

    }
}
