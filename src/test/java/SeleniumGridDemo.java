import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridDemo {

    @Test
    public void test1() {

        try {
            System.out.println("Test1 started...");
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.LINUX);

            WebDriver driver = new RemoteWebDriver(new URL("http://172.18.0.1:4444/wd/hub"), cap);
//            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            System.out.println("Title of the page is " + driver.getTitle());
            driver.quit();
            System.out.println("Test1 ended...");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {

        try {
            System.out.println("Test2 started...");
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.LINUX);

            WebDriver driver = new RemoteWebDriver(new URL("http://172.18.0.1:4444/wd/hub"), cap);
//            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            System.out.println("Title of the page is " + driver.getTitle());
            driver.quit();
            System.out.println("Test2 ended...");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
