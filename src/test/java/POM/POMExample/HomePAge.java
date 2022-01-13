package POM.POMExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePAge {

    WebDriver driver;
    public HomePAge(WebDriver driver){
        this.driver = driver;
    }

    By homePageUserName = By.xpath("//table//tr[@class='heading3']");
    //Get the User name from Home Page
    public String getHomePageDashboardUserName(){
        return    driver.findElement(homePageUserName).getText();
    }
}
