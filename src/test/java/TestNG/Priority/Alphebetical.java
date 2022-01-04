package TestNG.Priority;

import Config.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alphebetical extends Base {


    @Test
    public void c_method(){
        System.out.println("I'm in method C");
    }
    @Test
    public void b_method(){
        System.out.println("I'm in method B");
    }
    @Test
    public void a_method(){
        System.out.println("I'm in method A");
    }
    @Test
    public void e_method(){
        System.out.println("I'm in method E");
    }
    @Test
    public void d_method(){
        System.out.println("I'm in method D");
    }

}
