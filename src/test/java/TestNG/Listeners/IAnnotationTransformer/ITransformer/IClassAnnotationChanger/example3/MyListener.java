package TestNG.Listeners.IAnnotationTransformer.ITransformer.IClassAnnotationChanger.example3;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyListener implements IAnnotationTransformer {
    boolean onetime=true;
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
      if(onetime) {
            if (testClass.getName().equals("TestNG.Listeners.IAnnotationTransformer.ITransformer.IClassAnnotationChanger.example3.testCase")) {
                annotation.setInvocationCount(5);
            }
            onetime=false;
        }
    }
}
