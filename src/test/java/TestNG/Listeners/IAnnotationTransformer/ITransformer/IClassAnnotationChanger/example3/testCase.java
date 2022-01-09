package TestNG.Listeners.IAnnotationTransformer.ITransformer.IClassAnnotationChanger.example3;
import org.testng.annotations.Test;

@Test(invocationCount = 2)
public class testCase {
    public  void verifyTitleGoogle()
    {
        System.out.println("I am usually two times called ");
    }
}
