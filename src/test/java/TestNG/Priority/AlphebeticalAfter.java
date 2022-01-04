package TestNG.Priority;

import Config.Base;
import org.testng.annotations.Test;

public class AlphebeticalAfter extends Base {
    @Test
    public void c_method(){
        System.out.println("I'm in method C");
    }
    @Test(priority = 1)
    public void b_method(){
        System.out.println("I'm in method B");
    }
    @Test(priority = 2)
    public void a_method(){
        System.out.println("I'm in method A");
    }
    @Test(priority = 3)
    public void e_method(){
        System.out.println("I'm in method E");
    }
    @Test(priority = 4)
    public void d_method(){
        System.out.println("I'm in method D");
    }

}
