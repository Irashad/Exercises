package TestCases;

import Config.Base;
import com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class HTTPResponse extends Base {
    @Test
    public void detectBrokenLinks() {
        String homePage = "https://www.zlti.com";
        String url = "";
        HttpURLConnection huc;

        //we think response code will be 200
        int responseCode = 200;

        //Expand window size
        driver.manage().window().maximize();

        //Go to URL
        driver.get(homePage);

        //handle all web elements that tagname ise equals to a
        List<WebElement> links = driver.findElements(By.tagName("a"));

        Iterator<WebElement> it = links.iterator();
        while (it.hasNext()) {
            url = it.next().getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println("URL is not defined in a Tag");
                continue;
            }
            if (!url.startsWith(homePage)) {
                System.out.println("URL is not start with the same domain name");
            }
            try {
                //try to connect given url
                huc = (HttpURLConnection) (new URL(url).openConnection());
                //try not to get documents body since we don't need body we only need head (because heads includes response codes
                huc.setRequestMethod("HEAD");
                //establish connectinh by calling connect()
                huc.connect();
                responseCode = huc.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println("not working: " + url);
                } else {
                    System.out.println("Working: " + url);
                }

            } catch (MalformedURLException e) {
                System.out.println("Exception atdi " + url);
            } catch (IOException e) {
                System.out.println("IO exception atdi" + url);
            } catch (ClassCastException classCastExceptions) {
                System.out.println("Class cast Exception atdi " + url);
            }
        }


    }
}